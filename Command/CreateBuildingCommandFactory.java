/*
Last Edit  13/11/2022
*/
package Command;
import java.util.*;
import Building.*;
import Memento.*;

public class CreateBuildingCommandFactory implements CommandFactory{

    private HashMap<Integer, Building> buildingList;
    private Scanner sc;
    private Caretaker ct;
    private String input;
    private HashMap<String, BuildingFactory> tempHash;

    public CreateBuildingCommandFactory(HashMap<Integer, Building> buildingList, Scanner sc, Caretaker ct) {
        this.sc = sc;
        this.buildingList = buildingList;
        this.ct = ct;
        this.tempHash = new HashMap<>();

        tempHash.put("a",new ApartmentFactory());
        tempHash.put("h",new HouseFactory());
    }

    @Override
    public Command createCommand() {

        System.out.println("Enter Building Type (a=Apartment/h=House):");
        input = sc.nextLine();

        while(!input.equals("a")&&!input.equals("h")){
            System.out.println("Wrong input");
            System.out.println("Enter Building Type (a=Apartment/h=House):");
            input = sc.nextLine();
        }

        Command c = new CreateBuildingCommand(tempHash, buildingList, sc, ct, input);
        return c;
    }
    
}
