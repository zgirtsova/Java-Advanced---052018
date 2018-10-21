package src.implementations;

import src.abstraction.Logger;
import src.enums.LogType;

public class CombatLogger extends Logger {

  @Override
  public void handle(LogType logType, String message) {
    if (logType == LogType.ATTACK || logType == LogType.MAGIC) {
      System.out.println(logType.name() + ": " + message);
      return;
    }

    super.passToSuccessor(logType, message);
  }
}
