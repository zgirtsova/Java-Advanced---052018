package src.implementations;

import src.abstraction.Logger;
import src.enums.LogType;

public class EventLogger extends Logger {

  public EventLogger() {
  }

  @Override
  public void handle(LogType logType, String message) {
    if (logType == LogType.EVENT) {
      System.out.println(logType.name() + ": " + message);
      return;
    }

    super.passToSuccessor(logType, message);
  }
}
