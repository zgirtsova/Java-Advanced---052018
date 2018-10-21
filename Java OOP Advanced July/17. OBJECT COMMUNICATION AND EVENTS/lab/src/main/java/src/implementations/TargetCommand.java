package src.implementations;

import src.interfaces.Attacker;
import src.interfaces.Command;
import src.interfaces.Target;

public class TargetCommand implements Command {
  private Attacker attacker;
  private Target target;

  public TargetCommand(Attacker attacker, Target target) {
    this.attacker = attacker;
    this.target = target;
  }

  public void execute() {
    attacker.setTarget(target);
  }
}
