/*
Last Edit  13/11/2022
*/
package Command;

import Memento.*;

public class UndoCommand implements Command {
  private Caretaker ct;

  public UndoCommand(Caretaker ct) {
    this.ct = ct;
  }

  public void execute() {
    if (!ct.getUndoList().isEmpty()) {
      ct.undo();
    } else {
      System.out.println("Nothing to undo!");
    }
  };

}
