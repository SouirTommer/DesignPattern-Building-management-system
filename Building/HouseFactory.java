package Building;
import java.util.*;
public class HouseFactory implements BuildingFactory{  

    public Building createBuilding(Scanner sc) {
        System.out.print("Building No.: ");
        int buildingNo = sc.nextInt();
        System.out.print("No. of Floors: ");
        int numberOfFloors = sc.nextInt();
        System.out.print("Number of rooms: ");
        int numberOfRooms = sc.nextInt();
        return new House(buildingNo, numberOfRooms, numberOfFloors);

    }
}