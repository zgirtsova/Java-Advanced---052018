package src.implementations;

import src.abstraction.AbstractHero;
import src.enums.LogType;
import src.interfaces.Handler;
import src.interfaces.Target;

public class Warrior extends AbstractHero {

  private static final String ATTACK_MESSAGE = "%s damages %s for %s";

  public Warrior(Handler handler, String id, int dmg) {
    super(handler, id, dmg);
  }

  @Override
  protected void executeClassSpecificAttack(Target target, int dmg) {
    super.getLogger().handle(LogType.ATTACK, String.format(ATTACK_MESSAGE, this, target, dmg));
    //System.out.println(String.format(ATTACK_MESSAGE, this, target, dmg));
    target.receiveDamage(dmg);
  }
}
