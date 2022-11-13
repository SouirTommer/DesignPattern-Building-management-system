package Command;

import java.util.Stack;
import Memento.*;

public class RedoCommand implements Command {
  Stack commands;
  Stack redos;
  Caretaker caretaker;

  public RedoCommand(Stack commands, Stack redos, Caretaker caretaker) {
    this.commands = commands;
    this.redos = redos;
    this.caretaker = caretaker;
  }

  @Override
  public void execute() {
    if (!caretaker.getRedoList().isEmpty()) {
      // Command com = (Command) redos.pop();
      // com.redo();
      // commands.push(com);
      caretaker.redo();
    } else {
      System.out.println("Nothing to redo!");
    }
  }

  @Override
  public void undo() {
  }

  @Override
  public void redo() {
  }

}
