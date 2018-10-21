package src;

import src.abstraction.Logger;
import src.implementations.*;
import src.interfaces.*;

public class Main {
  public static void main(String[] args) {
//    Handler combatLogger = new CombatLogger();
//    Handler eventLogger = new EventLogger();
//
//    combatLogger.setSuccessor(eventLogger);
//
//    Attacker warrier = new Warrior(combatLogger, "Pesho", 10);
//    Target target = new Dragon("Dragon", 5, 10, combatLogger);
//
//    //warrier.setTarget(target);
//    //warrier.attack();
//
//    Executor executor = new CommandExecutor();
//    Command targetCommand = new TargetCommand(warrier, target);
//    Command attackCommand = new AttackCommand(warrier);
//
//    executor.executeCommand(targetCommand);
//    executor.executeCommand(attackCommand);

    Handler combatLogger = new CombatLogger();
    Handler eventLogger = new EventLogger();
    combatLogger.setSuccessor(eventLogger);

    Attacker warrier = new Warrior(combatLogger, "Pesho", 10);
    Attacker warrier1 = new Warrior(combatLogger, "Ivan", 10);
    Attacker warrier2 = new Warrior(combatLogger, "Pavel", 10);
    Attacker warrier3 = new Warrior(combatLogger, "Toshko", 10);
    Attacker warrier4 = new Warrior(combatLogger, "Yavor", 10);
    Target target = new Dragon("Dragon", 40, 10, combatLogger);

    AttackGroup attackGroup = new Group();
    attackGroup.addMember(warrier);
    attackGroup.addMember(warrier1);
    attackGroup.addMember(warrier2);
    attackGroup.addMember(warrier3);
    attackGroup.addMember(warrier4);

    Command groupTargetCommand = new GroupTargetCommand(attackGroup, target);
    Command attackTargetCommand = new GroupAttackCommand(attackGroup);

    groupTargetCommand.execute();
    attackTargetCommand.execute();
  }
}
