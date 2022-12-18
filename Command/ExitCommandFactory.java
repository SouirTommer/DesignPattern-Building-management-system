/*
Last Edit  13/11/2022
*/
package Command;

public class ExitCommandFactory implements CommandFactory{

    public Command createCommand(){
        return new ExitCommand();
    }
    
}
