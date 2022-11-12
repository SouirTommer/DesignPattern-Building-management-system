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
        String UserCommandinput;

        // Declaring Command
        Command command;

        while (true) {
            System.out.println("");
            System.out.println("Building Management System (BMS)");
            System.out.println("Please enter command: [a|d|m|e|u|r|l|x]");
            System.out.println(
                    "a = add building, d = display buildings, m = modify building, e = edit rooms, u = undo, r = redo, l = list undo/redo, x = exit system");
            Userinput = sc.nextLine();

            switch (Userinput) {

                case "a": // Add Building Command
                    command = new CreateBuildingCommandFactory(sc, buildMap, commands).createCommand();
                    command.execute();
                    break;

                case "d": // Display Building Command
                    command = new DisplayCommand(sc, buildMap);
                    command.execute();
                    break;

                case "m": // Modify Building Command
                    command = new ModifyCommand(sc, buildMap);
                    command.execute();
                    break;

                case "e": // Edit Rooms Command
                    command = new EditroomsCommand(sc, buildMap);
                    command.execute();
                    break;

                case "u": // Undo Command
                    command = new UndoCommand(commands, redos);
                    command.execute();
                    break;

                case "r": // Redo Command
                    command = new RedoCommand(commands, redos);
                    command.execute();
                    break;

                case "l": // List Undo & Redo Command
                    System.out.println(commands.toString());
                    break;

                case "x": // Exit Command
                    command = new ExitCommand();
                    command.execute();
                    break;

                default:
                    System.out.println("input error");
                    break;
            }
        }
    }
}