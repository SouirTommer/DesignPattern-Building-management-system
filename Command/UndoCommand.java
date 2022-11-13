package Command;

import Building.*;
import Memento.*;
import java.util.*;

public class UndoCommand implements Command {
  Stack commands;
  Stack redos;
  Caretaker caretaker;

  public UndoCommand(Stack commands, Stack redos, Caretaker caretaker) {
    this.commands = commands;
    this.redos = redos;
    this.caretaker = caretaker;
  }

  @Override
  public void execute() {
    if (!caretaker.getUndoList().isEmpty()) {
      // Command com = (Command) commands.pop();
      // com.undo();
      // redos.push(com);
      // } else {
      // System.out.println("Nothing to undo!");
      // }
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
