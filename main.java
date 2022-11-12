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

        // For Building (Apartment + House)
        int buildingNo;
        int numberOfRooms;

        // For Apartment
        double monthlyRental;
        String supportStaff = "";

        // For House
        int numberOfFloors;

        // Room
        int roomNo;
        double roomLength;
        double roomWidth;

        // Memento

        String Userinput;
        String UserCommandinput;

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
                    System.out.println("Enter Building No. (* to display all):");
                    Userinput = sc.nextLine();

                    if (Userinput.equals("*")) {

                        Map<Integer, Building> sorted = new TreeMap<>(buildMap);

                        for (Map.Entry i : sorted.entrySet()) {

                            System.out.println(sorted.get(i.getKey()).toString());
                        }
                    } else {
                        buildMap.get(Integer.parseInt(Userinput)).printBuilding();
                    }

                    break;

                case "m":
                    System.out.print("Building No.: ");
                    buildingNo = sc.nextInt();
                    buildMap.get(buildingNo).toString();
                    buildMap.get(buildingNo).modifyBuilding(sc);

                    break;
                case "e":
                    System.out.print("Building No.: ");
                    buildingNo = sc.nextInt();
                    buildMap.get(buildingNo).printBuilding();

                    System.out.println("");
                    System.out.println("Please enter command: [a|d|m]");
                    System.out.println("a = add room, d = delete room, m = modify room");
                    sc.nextLine();
                    Userinput = sc.nextLine();

                    if (Userinput.equals("a")) {

                        System.out.print("Length: ");
                        roomLength = sc.nextDouble();

                        System.out.print("Width: ");
                        roomWidth = sc.nextDouble();
                        System.out.println("Updated Building:");
                        buildMap.get(buildingNo).addRoom(roomLength, roomWidth);
                        buildMap.get(buildingNo).printBuilding();
                    }

                    if (Userinput.equals("d")) {

                        System.out.print("Room No.: ");
                        roomNo = sc.nextInt();

                        System.out.println("Updated Building:");
                        buildMap.get(buildingNo).deleteRoom(roomNo);
                        buildMap.get(buildingNo).printBuilding();
                    }
                    if (Userinput.equals("m")) {

                        System.out.print("Room No.: ");
                        roomNo = sc.nextInt();

                        System.out.print("Length: ");
                        roomLength = sc.nextDouble();

                        System.out.print("Width: ");
                        roomWidth = sc.nextDouble();

                        System.out.println("Updated Building:");
                        buildMap.get(buildingNo).modifyRoom(roomNo, roomLength, roomWidth);
                        buildMap.get(buildingNo).printBuilding();

                    }
                    sc.nextLine();
                    break;
                case "u":
                    break;
                case "r":
                    break;
                case "l":
                    break;
                case "x":
                    System.exit(0);
                    break;
                default:
                    System.out.println("input error");
                    break;
            }
        }
    }
}