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

        // Memento
        String Userinput;

        Command command;
        //HasMap for open close
        HashMap<String, CommandFactory> f = new HashMap<>();

        f.put("a", new CreateBuildingCommandFactory(sc,buildMap,commands));
        f.put("d", new DisplayCommandFactory(sc,buildMap));
        // f.put("m", new ModifyCommandFactory());
        f.put("e", new RoomFactory(sc,buildMap,commands));
        f.put("u", new UndoCommandFactory(commands,redos));
        f.put("r", new RedoCommandFactory(commands,redos));
        f.put("l", new ListUndoRedoCommandFactory(commands,redos));
        f.put("x", new ExitCommandFactory());
        
        while (true) {
            System.out.println("");
            System.out.println("Building Management System (BMS)");
            System.out.println("Please enter command: [a|d|m|e|u|r|l|x]");
            System.out.println(
                    "a = add building, d = display buildings, m = modify building, e = edit rooms, u = undo, r = redo, l = list undo/redo, x = exit system");
            Userinput = sc.nextLine();

            switch (Userinput) {

                case "m": // Modify Building Command
                    command = new ModifyCommand(sc, buildMap);
                    command.execute();
                    break;

                // case "e": // Edit Rooms Command
                //     command = new EditroomsCommand(sc, buildMap);
                //     command.execute();
                //     break;

                default:
                    // System.out.println("input error");
                    break;
            }
            command = f.get(Userinput).createCommand();
            command.execute();
        }
    }
}