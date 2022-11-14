package Command;

import java.util.*;
import Building.*;
import Memento.Caretaker;

public class EditRoomCommandFactory implements CommandFactory {
    Stack commands;
    Scanner sc;
    HashMap<Integer, Building> buildMap;
    Caretaker caretaker;

    public EditRoomCommandFactory(Scanner sc, HashMap<Integer, Building> buildMap,
            Caretaker caretaker) {
        this.sc = sc;
        this.buildMap = buildMap;
        this.caretaker = caretaker;
    }

    @Override
    public Command createCommand() {
        System.out.print("Building No.: ");
        int buildingNo = sc.nextInt();
        return new EditRoomCommand(sc, buildMap,buildingNo,caretaker);
    }
}
