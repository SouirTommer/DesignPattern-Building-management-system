import java.util.*;

import Building.*;
import Command.*;
import Memento.*;

public class main {

    public static Scanner sc = new Scanner(System.in);
    public static HashMap<Integer, Building> buildMap = new HashMap<>();

    public static void main(String[] args)
            throws ClassNotFoundException, InstantiationException, IllegalAccessException {

        // Memento
        Caretaker ct = new Caretaker(buildMap);

        // Declare Command
        Command command;
        
        // HasMap for open close
        HashMap<String, CommandFactory> f = new HashMap<>();

        f.put("a", new CreateBuildingCommandFactory(sc, buildMap, ct));
        f.put("d", new DisplayCommandFactory(sc, buildMap));
        f.put("m", new ModifyBuildingCommandFactory(sc, buildMap, ct));
        f.put("e", new EditRoomCommandFactory(sc, buildMap, ct));
        f.put("u", new UndoCommandFactory(ct));
        f.put("r", new RedoCommandFactory(ct));
        f.put("l", new ListUndoRedoCommandFactory(ct));
        f.put("x", new ExitCommandFactory());

        String Userinput;
        while (true) {
            System.out.println("");
            System.out.println("Building Management System (BMS)");
            System.out.println("Please enter command: [a|d|m|e|u|r|l|x]");
            System.out.println(
                    "a = add building, d = display buildings, m = modify building, e = edit rooms, u = undo, r = redo, l = list undo/redo, x = exit system");
            Userinput = sc.nextLine();
            command = f.get(Userinput).createCommand();
            command.execute();

            // try {
            // command = f.get(Userinput).createCommand();
            // command.execute();
            // } catch (Exception e) {
            // System.out.println("Wrong input");
            // }

        }
    }
}