package Command;

import java.util.*;
import Building.*;
import Memento.Caretaker;

public class EditRoomCommandFactory implements CommandFactory {
    Stack commands;
    Scanner sc;
    HashMap<Integer, Building> buildMap;
    Caretaker caretaker;

    public EditRoomCommandFactory(Scanner sc, HashMap<Integer, Building> buildMap, Stack commands,
            Caretaker caretaker) {
        this.sc = sc;
        this.buildMap = buildMap;
        this.commands = commands;
        this.caretaker = caretaker;
    }

    @Override
    public Command createCommand() {
<<<<<<< HEAD
        return new EditRoomCommand(sc, buildMap, commands, caretaker);
    }
}
=======
        System.out.print("Building No.: ");
        int buildingNo = sc.nextInt();
        return new EditRoomCommand(sc, buildMap, commands,buildingNo);
    }}
>>>>>>> 1b209cbe7108b28c5f6fe306eadcb987a07c3982
