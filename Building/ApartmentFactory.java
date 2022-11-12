package Building;

import java.util.Scanner;

public class ApartmentFactory implements BuildingFactory {

    @Override
    public Building createBuilding(Scanner sc) {
        BuildingFactory bf = new BuildingFactory(sc);
        
        System.out.print("Building No.: ");
        int buildingNo = sc.nextInt();

        System.out.print("Monthly Rental: ");
        double monthlyRental = sc.nextDouble();

        System.out.print("Support Staff: ");
        sc.nextLine();
        String supportStaff = sc.nextLine();

        System.out.print("Number of rooms: ");
        int numberOfRooms = sc.nextInt();

        for (int i = 1; i <= numberOfRooms; i++) {
            System.out.println("Room No. " + i + " :");

            System.out.print("Length: ");
            double roomLength = sc.nextDouble();

            System.out.print("Width: ");
            double roomWidth = sc.nextDouble();

            room
        }

        System.out.println("New Building Added:");
        sc.nextLine();
        return new Apartment(buildingNo, numberOfRooms, monthlyRental, supportStaff);
    }
}
