package Command;
import java.util.*;
import Building.*;

public class DisplayCommandFactory implements CommandFactory {
    Scanner sc;
    HashMap<Integer, Building> buildMap;

    public DisplayCommandFactory(Scanner sc,HashMap<Integer, Building> buildMap){
        this.sc = sc;
        this.buildMap = buildMap;
    }
    
    public Command createCommand(){
        
        return new DisplayCommand(sc,buildMap);
    }
    
}
