package src.implementations;

import src.enums.LogType;
import src.interfaces.Handler;
import src.interfaces.Observer;
import src.interfaces.Subject;
import src.interfaces.Target;

import java.util.ArrayList;
import java.util.List;

public class Dragon implements Target, Subject {

  private static final String THIS_DIED_EVENT = "%s dies";

  private String id;
  private int hp;
  private int reward;
  private boolean eventTriggered;
  private Handler logger;
  private List<Observer> observers;

  public Dragon(String id, int hp, int reward, Handler logger) {
    this.id = id;
    this.hp = hp;
    this.reward = reward;
    this.logger = logger;
    this.observers = new ArrayList<>();
  }

  public void receiveDamage(int dmg) {
    if (!this.isDead()) {
      this.hp -= dmg;
    }

    if (this.isDead() && !eventTriggered) {
      logger.handle(LogType.EVENT, String.format(THIS_DIED_EVENT, this));
      //System.out.println(String.format(THIS_DIED_EVENT, this));
      this.eventTriggered = true;
    }
  }

  public boolean isDead() {
    return this.hp <= 0;
  }

  @Override
  public String toString() {
    return this.id;
  }

  @Override
  public void register(Observer observer) {
    this.observers.add(observer);
  }

  @Override
  public void unregister(Observer observer) {
    this.observers.remove(observer);
  }

  @Override
  public void notifyObservers() {
    this.observers.forEach(o -> {
      logger.handle(LogType.EVENT, o.getId() + " gain " + this.reward);
    });
  }
}
