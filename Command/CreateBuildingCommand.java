/*
Last Edit  13/11/2022
*/
package Command;

import java.util.*;
import Building.*;
import Memento.*;

public class CreateBuildingCommand implements Command {
    private Scanner sc;
    private Caretaker ct;
    private HashMap<Integer, Building> buildingList;

    //local
    private Building building;
    private String input;
    private HashMap<String, BuildingFactory> tempHash;

    public CreateBuildingCommand(HashMap<String, BuildingFactory> tempHash, HashMap<Integer, Building> buildingList, Scanner sc, Caretaker ct, String input) {
        this.buildingList = buildingList;
        this.tempHash = tempHash;
        this.sc = sc;
        this.ct = ct;
        this.input = input;
    }

    public void execute() {

        building = tempHash.get(input).createBuilding(sc);
        buildingList.put(building.getId(), building);

        ct.saveBuidling(building, building.getId(), this.toString(), true);
    }

    public String toString(){
        return "Add Building: "+buildingList.get(building.getId()).toString();
    }  

}
