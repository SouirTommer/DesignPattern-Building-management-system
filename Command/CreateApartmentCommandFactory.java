package Command;

import java.util.*;
import Building.*;
import Memento.*;

public class CreateApartmentCommandFactory implements CommandFactory {
    Stack commands;
    Scanner sc;
    HashMap<Integer, Building> buildMap;
    Caretaker caretaker;

    public CreateApartmentCommandFactory(Scanner sc, HashMap<Integer, Building> buildMap, Stack commands,
            Caretaker caretaker) {
        this.sc = sc;
        this.buildMap = buildMap;
        this.commands = commands;
        this.caretaker = caretaker;
    }

    @Override
    public Command createCommand() {
        Command c = new CreateApartmentCommand(sc, buildMap, caretaker);
        // caretaker.saveCreateApartment(c);
        return c;
    }

}
