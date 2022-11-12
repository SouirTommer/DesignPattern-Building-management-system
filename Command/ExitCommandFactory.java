package Command;

public class ExitCommandFactory implements CommandFactory{

    public ExitCommandFactory(){
        
    }
    public Command createCommand(){
        return new ExitCommand();
    }
    
}
