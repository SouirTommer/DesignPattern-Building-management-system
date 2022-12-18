/*
Student:   Ching Chun Hung 210020835 2B
Last Edit  13/11/2022
*/
package Command;

import Building.*;
import Memento.*;

import java.util.*;

public class ModifyBuildingCommandFactory implements CommandFactory {
    private HashMap<Integer, Building> buildingList;
    private Scanner sc;
    private Caretaker ct;

    public ModifyBuildingCommandFactory(HashMap<Integer, Building> buildingList, Scanner sc, Caretaker ct) {
        this.buildingList = buildingList;
        this.sc = sc;
        this.ct = ct;
    }

    public Command createCommand() {
        Command c = new ModifyBuildingCommand(buildingList, sc, ct);
        return c;

    }
}
