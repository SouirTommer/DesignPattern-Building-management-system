import java.util.*;

import javax.print.event.PrintEvent;

import Building.*;
import Command.*;
import Memento.*;

public class main {

    public static Scanner sc = new Scanner(System.in);
    public static HashMap<Integer, Building> buildMap = new HashMap<>();

    public static void main(String[] args)
            throws ClassNotFoundException, InstantiationException, IllegalAccessException {

        Stack commands = new Stack();
        Stack undos = new Stack();
        Stack redos = new Stack();
        Caretaker ct = new Caretaker(buildMap);

        // Memento
        String Userinput;
        Command command;
<<<<<<< HEAD
        // HasMap for open close
        HashMap<String, CommandFactory> f = new HashMap<>();

        f.put("a", new CreateBuildingCommandFactory(sc, buildMap, commands, ct));
        f.put("d", new DisplayCommandFactory(sc, buildMap));
        f.put("m", new ModifyBuildingCommandFactory(sc, buildMap, commands));
        f.put("e", new RoomFactory(sc, buildMap, commands));
        f.put("u", new UndoCommandFactory(commands, redos, ct));
        f.put("r", new RedoCommandFactory(commands, redos));
        f.put("l", new ListUndoRedoCommandFactory(commands, redos, ct));
=======

        // HasMap for open close
        HashMap<String, CommandFactory> f = new HashMap<>();

        f.put("a", new CreateBuildingCommandFactory(sc, buildMap, commands));
        f.put("d", new DisplayCommandFactory(sc, buildMap));
        f.put("m", new ModifyBuildingCommandFactory(sc, buildMap, commands));
        f.put("e", new EditRoomCommandFactory(sc, buildMap, commands));
        f.put("u", new UndoCommandFactory(commands, redos));
        f.put("r", new RedoCommandFactory(commands, redos));
        f.put("l", new ListUndoRedoCommandFactory(commands, redos));
>>>>>>> cc44774567e21b7c1989585a0651e161d5d9e70f
        f.put("x", new ExitCommandFactory());

        while (true) {
            System.out.println("");
            System.out.println("Building Management System (BMS)");
            System.out.println("Please enter command: [a|d|m|e|u|r|l|x]");
            System.out.println(
                    "a = add building, d = display buildings, m = modify building, e = edit rooms, u = undo, r = redo, l = list undo/redo, x = exit system");
            Userinput = sc.nextLine();

<<<<<<< HEAD
            // switch (Userinput) {

            // case "m": // Modify Building Command
            // command = new ModifyBuildingCommand(sc, buildMap);
            // command.execute();
            // break;

            // // case "e": // Edit Rooms Command
            // // command = new EditroomsCommand(sc, buildMap);
            // // command.execute();
            // // break;

            // default:
            // // System.out.println("input error");
            // break;
            // }

=======
>>>>>>> cc44774567e21b7c1989585a0651e161d5d9e70f
            command = f.get(Userinput).createCommand();
            command.execute();
            // try {
            //     command = f.get(Userinput).createCommand();
            //     command.execute();
            // } catch (Exception e) {
            //     System.out.println("Wrong input");
            // }

        }
    }
}