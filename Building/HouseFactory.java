package Building;
import java.util.*;
public class HouseFactory implements BuildingFactory{  

    public Building createBuilding(Scanner sc, RoomFactory rf) {

        System.out.print("Building No.: ");
        int buildingNo = sc.nextInt();

        System.out.print("No. of Floors: ");
        int numberOfFloors = sc.nextInt();

        System.out.print("Number of rooms: ");
        int numberOfRooms = sc.nextInt();

        for (int i = 1; i <= numberOfRooms; i++) {
            System.out.println("Room No. " + i + " :");

            rf.createRoom(sc);

            //HouseBuilding.addRoom(roomLength, roomWidth);
        }

        return new House(buildingNo, numberOfRooms, numberOfFloors);

    }
}