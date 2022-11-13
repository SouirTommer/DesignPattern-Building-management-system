package Command;

import Memento.*;
import java.util.*;

public class UndoCommand implements Command {
  Caretaker caretaker;

  public UndoCommand(Caretaker caretaker) {
    this.caretaker = caretaker;
  }

  @Override
  public void execute() {
    if (!caretaker.getUndoList().isEmpty()) {
      caretaker.undo();
    } else {
      System.out.println("Nothing to undo!");
    }
  };

  @Override
  public void undo() {

  };

  @Override
  public void redo() {

  };

}
