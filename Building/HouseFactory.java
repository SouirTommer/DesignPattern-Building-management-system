package Building;
import java.util.*;

public class HouseFactory implements BuildingFactory {

    public Building createBuilding(Scanner sc) {
        System.out.print("Building No.: ");
       int buildingNo = sc.nextInt();

        System.out.print("No. of Floors: ");
        int numberOfFloors = sc.nextInt();

        System.out.print("Number of rooms: ");
        int numberOfRooms = sc.nextInt();

        Building HouseBuilding = new House(buildingNo, numberOfRooms, numberOfFloors);
        

        for (int i = 1; i <= numberOfRooms; i++) {
            System.out.println("Room No. " + i + " :");

            System.out.print("Length: ");
            double roomLength = sc.nextDouble();

            System.out.print("Width: ");
            double roomWidth = sc.nextDouble();

            HouseBuilding.addRoom(roomLength, roomWidth);
        }

        System.out.println("New Building Added:");
        HouseBuilding.printBuilding();
        sc.nextLine();
        return HouseBuilding;
    }
}
