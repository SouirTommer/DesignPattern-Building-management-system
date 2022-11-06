
import java.util.*;

public class main {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {

        Stack commands = new Stack();
        Stack redos = new Stack();
        Stack unredoList = new Stack();

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

        String input;

        while (true) {
            System.out.println("");
            System.out.println("Building Management System (BMS)");
            System.out.println("Please enter command: [a|d|m|e|u|r|l|x]");
            System.out.println(
                    "a = add building, d = display buildings, m = modify building, e = edit rooms, u = undo, r = redo, l = list undo/redo, x = exit system");
            input = sc.nextLine();

            switch (input) {
                
                case "a":

                    System.out.println("Enter Building Type (a=Apartment/h=House):");
                    input = sc.nextLine();

                    switch (input) {
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
                            ApartmentBuilding.printRooms();
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
                            HouseBuilding.printRooms();
                            sc.nextLine();
                            break;
                    }
                    break;
                    

                case "d":
                    System.out.println("Enter Building No. (* to display all):");
                    input = sc.nextLine();

                        if(input.equals("*")){
                            for (Map.Entry i : buildMap.entrySet()) {
                                buildMap.get(i.getKey()).printBuilding();
                              }
                        } else{
                            buildMap.get(Integer.parseInt(input)).printBuilding();
                            buildMap.get(Integer.parseInt(input)).printRooms();
                        }


                    break;

                case "m":
                    break;
                case "e":
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