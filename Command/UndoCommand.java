package Command;
import Building.*;
import Memento.*;
import java.util.*;

public class UndoCommand implements Command {
    Stack commands;
    Stack redos;

    public UndoCommand(Stack commands, Stack redos) {
        this.commands = commands;
        this.redos = redos;
      }

    @Override
    public void execute() {
        if (!commands.isEmpty()){
            Command com = (Command) commands.pop();
            com.undo();  
            redos.push(com);
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
