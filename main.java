import java.util.*;

import javax.print.event.PrintEvent;

import Building.*;
import Command.*;
import Memento.*;

public class main {

    public static Scanner sc = new Scanner(System.in);
    public static HashMap<Integer, Building> buildMap = new HashMap<>();

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {

        Stack commands = new Stack();
        Stack undos = new Stack();
        Stack redos = new Stack();

        // Memento

        String Userinput;
        String UserCommandinput;

        // Declaring Command
        Command command;
        // Declaring factory
        BuildingFactory apf = new ApartmentFactory();
        BuildingFactory hf = new HouseFactory();

        while (true) {
            System.out.println("");
            System.out.println("Building Management System (BMS)");
            System.out.println("Please enter command: [a|d|m|e|u|r|l|x]");
            System.out.println(
                    "a = add building, d = display buildings, m = modify building, e = edit rooms, u = undo, r = redo, l = list undo/redo, x = exit system");
            Userinput = sc.nextLine();

            switch (Userinput) {

                case "a":

                    System.out.println("Enter Building Type (a=Apartment/h=House):");
                    Userinput = sc.nextLine();

                    switch (Userinput) {
                        case "a":
                            Building apartment = apf.createBuilding(sc);
                            buildMap.put(apartment.getId(), apartment);
                            break;

                        case "h":
                            Building house = hf.createBuilding(sc);
                            buildMap.put(house.getId(), house);
                            break;
                    }
                    break;

                case "d":
                    command = new DisplayCommand(sc, buildMap);
                    command.execute();
                    break;

                case "m":
                    command = new ModifyCommand(sc, buildMap);
                    command.execute();
                    break;

                case "e":
                    command = new EditroomsCommand(sc, buildMap);
                    command.execute();

                    break;
                case "u":
                    break;
                case "r":
                    break;
                case "l":
                    break;
                case "x":
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