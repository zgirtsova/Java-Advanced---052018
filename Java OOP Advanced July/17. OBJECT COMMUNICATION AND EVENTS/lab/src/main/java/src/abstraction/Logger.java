package src.abstraction;

import src.enums.LogType;
import src.interfaces.Handler;

public abstract class Logger implements Handler {
  private Handler succesor;

  protected Logger() {
  }

  public abstract void handle(LogType logType, String message);

  public void setSuccessor(Handler successor) {
    this.succesor = successor;
  }

  protected void passToSuccessor(LogType logType, String message) {
    if (this.succesor != null) {
      this.succesor.handle(logType, message);
    }
  }
}
