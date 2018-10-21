package src.abstraction;

import src.enums.LogType;
import src.interfaces.Attacker;
import src.interfaces.Handler;
import src.interfaces.Observer;
import src.interfaces.Target;

public abstract class AbstractHero implements Attacker, Observer {

  private static final String TARGET_NULL_MESSAGE = "Target null";
  private static final String NO_TARGET_MESSAGE = "%s has no target";
  private static final String TARGET_DEAD_MESSAGE = "%s is dead";
  private static final String SET_TARGET_MESSAGE = "%s targets %s";

  private String id;
  private int dmg;
  private Target target;
  private Handler logger;

  public AbstractHero(Handler logger, String id, int dmg) {
    this.id = id;
    this.dmg = dmg;
    this.logger = logger;
  }

  public String getId() {
    return this.id;
  }

  protected Handler getLogger() {
    return this.logger;
  }

  public void setTarget(Target target) {
    if (target == null) {
      this.logger.handle(LogType.TARGET, TARGET_NULL_MESSAGE);
      //System.out.println(TARGET_NULL_MESSAGE);
    } else {
      this.target = target;
      this.logger.handle(LogType.TARGET, String.format(SET_TARGET_MESSAGE, this, target));
      //System.out.println(String.format(SET_TARGET_MESSAGE, this, target));
    }
  }

  public final void attack() {
    if (this.target == null) {
      this.logger.handle(LogType.ERROR, String.format(NO_TARGET_MESSAGE, this));
      //System.out.println(String.format(NO_TARGET_MESSAGE, this));
    } else if (this.target.isDead()) {
      logger.handle(LogType.ERROR, String.format(TARGET_DEAD_MESSAGE, target));
      //System.out.println(String.format(TARGET_DEAD_MESSAGE, target));
    } else {
      this.executeClassSpecificAttack(this.target, this.dmg);
    }
  }

  @Override
  public String toString() {
    return this.id;
  }

  protected abstract void executeClassSpecificAttack(Target target, int dmg);

  @Override
  public void update(int value) {
    this.dmg += value;
  }
}
