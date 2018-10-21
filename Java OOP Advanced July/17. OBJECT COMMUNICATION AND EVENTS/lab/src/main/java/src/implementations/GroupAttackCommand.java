package src.implementations;

import src.interfaces.AttackGroup;
import src.interfaces.Command;

public class GroupAttackCommand implements Command {
  private AttackGroup attackGroup;

  public GroupAttackCommand(AttackGroup attackGroup) {
    this.attackGroup = attackGroup;
  }

  @Override
  public void execute() {
    this.attackGroup.groupAttack();
  }
}
