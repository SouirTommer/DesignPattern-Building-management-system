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
        return new EditRoomCommand(sc, buildMap, commands, caretaker);
    }
}
