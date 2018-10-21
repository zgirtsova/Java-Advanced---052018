package src.implementations;

import src.interfaces.AttackGroup;
import src.interfaces.Attacker;
import src.interfaces.Target;

import java.util.ArrayList;

public class Group implements AttackGroup {
  private ArrayList<Attacker> attackers;

  public Group() {
    this.attackers = new ArrayList<Attacker>();
  }

  public void addMember(Attacker attacker) {
    this.attackers.add(attacker);
  }

  public void groupTarget(final Target target) {
    attackers.forEach(a -> a.setTarget(target));
  }

  public void groupAttack() {
    attackers.forEach(a -> a.attack());
  }
}
