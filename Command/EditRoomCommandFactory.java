/*
Student:   Ching Chun Hung 210020835 2B
Last Edit  13/11/2022
*/
package Command;

import java.util.*;
import Building.*;
import Memento.Caretaker;

public class EditRoomCommandFactory implements CommandFactory {
    private HashMap<Integer, Building> buildingList;
    private Scanner sc;
    private Caretaker ct;

    private int buildNo;

    public EditRoomCommandFactory(HashMap<Integer, Building> buildingList, Scanner sc, Caretaker ct) {
        this.sc = sc;
        this.buildingList = buildingList;
        this.ct = ct;
    }

    @Override
    public Command createCommand() {
        System.out.print("Building No.: ");
        buildNo = sc.nextInt();

        return new EditRoomCommand(buildingList, buildNo, sc, ct);
    }
}
