package Building;
import java.util.*;
public class ApartmentFactory implements BuildingFactory{  

    public Building createBuilding(Scanner sc) {

        String supportStaff = "";

        System.out.print("Building No.: ");
        int buildingNo = sc.nextInt();

        System.out.print("Monthly Rental: ");
        double monthlyRental = sc.nextDouble();

        System.out.print("Support Staff: ");
        sc.nextLine();
        supportStaff += sc.nextLine();

        System.out.print("Number of rooms: ");
        int numberOfRooms = sc.nextInt();

        return new Apartment(buildingNo, numberOfRooms, monthlyRental, supportStaff);

    }
}