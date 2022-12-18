/*
Last Edit  13/11/2022
*/
package Command;
import java.util.*;
import Building.*;

public class DisplayCommandFactory implements CommandFactory {
    private Scanner sc;
    private HashMap<Integer, Building> buildingList;

    public DisplayCommandFactory( HashMap<Integer, Building> buildingList, Scanner sc){
        this.buildingList = buildingList;
        this.sc = sc;
    }
    
    public Command createCommand(){
        return new DisplayCommand(buildingList, sc);
    }
    
}
