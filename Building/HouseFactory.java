/*
Student:   Ching Chun Hung 210020835 2B
Last Edit  13/11/2022
*/
package Building;
import java.util.*;

public class HouseFactory implements BuildingFactory {

    private int buildNo;
    private int nOfRooms;
    private int nOfFloors;

    public Building createBuilding(Scanner sc) {
        System.out.print("Building No.: ");
        buildNo = sc.nextInt();

        System.out.print("No. of Floors: ");
        nOfFloors = sc.nextInt();

        System.out.print("Number of rooms: ");
        nOfRooms = sc.nextInt();

        Building houseBuilding = new House(buildNo, nOfRooms, nOfFloors);
        
        for (int i = 1; i <= nOfRooms; i++) {
            System.out.println("Room No. " + i + " :");

            System.out.print("Length: ");
            double roomLength = sc.nextDouble();

            System.out.print("Width: ");
            double roomWidth = sc.nextDouble();

            houseBuilding.addRoom(roomLength, roomWidth);
        }

        System.out.println("New Building Added:");

        houseBuilding.printBuilding();
        sc.nextLine();

        return houseBuilding;
    }

    //this factory provided modify building too (override the origin method)

    public void ModifyBuilding(Scanner sc, House h) {

        System.out.print("No. of Floors: ");
        h.setFloors(sc.nextInt());

        System.out.println("Building is modified: ");
        System.out.println(toString());
        
        sc.nextLine();

    }
}
