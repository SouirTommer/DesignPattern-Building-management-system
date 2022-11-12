package Command;

public class ExitCommand implements Command {

    public void execute() {
        System.exit(0);
    };

    public void undo() {

    };

    public void redo() {

    };
}
