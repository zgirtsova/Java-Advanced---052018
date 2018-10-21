package src.implementations;

import src.interfaces.Attacker;
import src.interfaces.Command;

public class AttackCommand implements Command {
  private Attacker attacker;

  public AttackCommand(Attacker attacker) {
    this.attacker = attacker;
  }

  public void execute() {
    attacker.attack();
  }
}
