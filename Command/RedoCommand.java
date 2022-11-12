package Command;
import java.util.Stack;

public class RedoCommand implements Command{
  Stack commands;
  Stack redos;

  public RedoCommand(Stack commands, Stack redos) {
    this.commands = commands;
    this.redos = redos;
  }

  @Override
  public void execute() {
    if (!redos.isEmpty()){
      Command com = (Command) redos.pop();
      com.redo();
      commands.push(com);
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
