package src.implementations;

import src.interfaces.Command;
import src.interfaces.Executor;

public class CommandExecutor implements Executor {
  public void executeCommand(Command command) {
    command.execute();

  }
}
