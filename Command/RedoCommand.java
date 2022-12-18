/*
Student:   Ching Chun Hung 210020835 2B
Last Edit  13/11/2022
*/
package Command;
import Memento.*;

public class RedoCommand implements Command {
  private Caretaker ct;

  public RedoCommand(Caretaker ct) {
    this.ct = ct;
  }

  public void execute() {
    if (!ct.getRedoList().isEmpty()) {
      ct.redo();
    } else {
      System.out.println("Nothing to redo!");
    }
  }

}
