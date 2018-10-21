package src.implementations;

import src.interfaces.AttackGroup;
import src.interfaces.Command;
import src.interfaces.Target;

public class GroupTargetCommand implements Command {
  private AttackGroup attackGroup;
  private Target target;


  public GroupTargetCommand(AttackGroup attackGroup, Target target) {
    this.attackGroup = attackGroup;
    this.target = target;
  }

  @Override
  public void execute() {
this.attackGroup.groupTarget(this.target);
  }
}
