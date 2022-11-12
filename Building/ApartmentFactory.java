package Building;

import java.util.Scanner;

public class ApartmentFactory implements BuildingFactory {

    @Override
    public Building createBuilding(Scanner sc) {

        System.out.print("Building No.: ");
        int buildingNo = sc.nextInt();

        System.out.print("Monthly Rental: ");
        double monthlyRental = sc.nextDouble();

        System.out.print("Support Staff: ");
        sc.nextLine();
        String supportStaff = sc.nextLine();

        System.out.print("Number of rooms: ");
        int numberOfRooms = sc.nextInt();

        Building ap = new Apartment(buildingNo, numberOfRooms, monthlyRental, supportStaff);

        for (int i = 1; i <= numberOfRooms; i++) {
            System.out.println("Room No. " + i + " :");
            System.out.print("Length: ");
            double roomLength = sc.nextDouble();
            System.out.print("Width: ");
            double roomWidth = sc.nextDouble();
            ap.addRoom(roomWidth, roomLength);
        }

        System.out.println("New Building Added:");
        ap.printBuilding();
        sc.nextLine();

        return ap;

    }

    public void ModifyBuilding(Scanner sc, Apartment apartment) {
        System.out.print("Modify Monthly Rental.: ");
        apartment.setMonthlyRental(sc.nextDouble());
        System.out.print("Modify Support Staff.: ");
        sc.nextLine();
        apartment.setSupportStaff(sc.nextLine());
        System.out.println("Building is modified: ");
        System.out.println(toString());

    }
}
