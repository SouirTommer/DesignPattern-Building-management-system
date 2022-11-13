package Command;

import java.util.Stack;
import Memento.*;

public class RedoCommand implements Command {
  Caretaker caretaker;

  public RedoCommand(Caretaker caretaker) {
    this.caretaker = caretaker;
  }

  @Override
  public void execute() {
    if (!caretaker.getRedoList().isEmpty()) {
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
