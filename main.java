
import java.util.*;
import Memento.Caretaker;

public class main {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {

        Stack commands = new Stack();
        Stack undos = new Stack();
        Stack redos = new Stack();


        //HashMap
        HashMap<Integer, Building> buildMap = new HashMap<>();

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

        //Memento

        String Userinput;
        String UserCommandinput;

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

                            System.out.print("Building No.: ");
                            buildingNo = sc.nextInt();

                            System.out.print("Monthly Rental: ");
                            monthlyRental = sc.nextDouble();

                            System.out.print("Support Staff: ");
                            sc.nextLine();
                            supportStaff += sc.nextLine();

                            System.out.print("Number of rooms: ");
                            numberOfRooms = sc.nextInt();

                            Building ApartmentBuilding = new Apartment(buildingNo, numberOfRooms, monthlyRental, supportStaff);
                            buildMap.put(buildingNo, ApartmentBuilding);

                            for (int i = 1; i <= numberOfRooms; i++) {
                                System.out.println("Room No. " + i + " :");

                                System.out.print("Length: ");
                                roomLength = sc.nextDouble();

                                System.out.print("Width: ");
                                roomWidth = sc.nextDouble();

                                ApartmentBuilding.addRoom(roomLength, roomWidth);
                            }

                            System.out.println("New Building Added:");
                            ApartmentBuilding.printBuilding();
                            sc.nextLine();
                            break;

                        case "h":
                            System.out.print("Building No.: ");
                            buildingNo = sc.nextInt();

                            System.out.print("No. of Floors: ");
                            numberOfFloors = sc.nextInt();

                            System.out.print("Number of rooms: ");
                            numberOfRooms = sc.nextInt();

                            Building HouseBuilding = new House(buildingNo, numberOfRooms, numberOfFloors);
                            buildMap.put(buildingNo, HouseBuilding);

                            for (int i = 1; i <= numberOfRooms; i++) {
                                System.out.println("Room No. " + i + " :");

                                System.out.print("Length: ");
                                roomLength = sc.nextDouble();

                                System.out.print("Width: ");
                                roomWidth = sc.nextDouble();

                                HouseBuilding.addRoom(roomLength, roomWidth);
                            }

                            System.out.println("New Building Added:");
                            HouseBuilding.printBuilding();
                            sc.nextLine();
                            break;
                    }
                    break;
                    

                case "d":
                    System.out.println("Enter Building No. (* to display all):");
                    Userinput = sc.nextLine();

                        if(Userinput.equals("*")){

                            Map<Integer, Building> sorted = new TreeMap<>(buildMap);
                            
                            for (Map.Entry i : sorted.entrySet()) {
                                
                                System.out.println(sorted.get(i.getKey()).toString());
                              }
                        } else{
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
                    
                        if(Userinput.equals("a")){

                            System.out.print("Length: ");
                            roomLength = sc.nextDouble();

                            System.out.print("Width: ");
                            roomWidth = sc.nextDouble();
                            System.out.println("Updated Building:");
                            buildMap.get(buildingNo).addRoom(roomLength, roomWidth);
                            buildMap.get(buildingNo).printBuilding();
                        }

                        if(Userinput.equals("d")){

                            System.out.print("Room No.: ");
                            roomNo = sc.nextInt();

                            System.out.println("Updated Building:");
                            buildMap.get(buildingNo).deleteRoom(roomNo);
                            buildMap.get(buildingNo).printBuilding();
                        }
                        if(Userinput.equals("m")){

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