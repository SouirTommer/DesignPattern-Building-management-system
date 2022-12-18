/*
Last Edit  13/11/2022
*/
package Building;

import java.util.Scanner;

public class ApartmentFactory implements BuildingFactory {

    private int buildNo;
    private double mRental;
    private String supportStaff;
    private int nOfRooms;

    @Override
    public Building createBuilding(Scanner sc) {

        System.out.print("Building No.: ");
        buildNo = sc.nextInt();

        System.out.print("Monthly Rental: ");
        mRental = sc.nextDouble();

        System.out.print("Support Staff: ");
        sc.nextLine();
        supportStaff = sc.nextLine();

        System.out.print("Number of rooms: ");
        nOfRooms = sc.nextInt();

        Building apartmentBuilding = new Apartment(buildNo, nOfRooms, mRental, supportStaff);

        //Since you need to addRoom immediately after creating a building, and the Building class has this one method

        for (int i = 1; i <= nOfRooms; i++) {

            System.out.println("Room No. " + i + " :");

            System.out.print("Length: ");
            double Length = sc.nextDouble();

            System.out.print("Width: ");
            double Width = sc.nextDouble();

            apartmentBuilding.addRoom(Length, Width);
        }

        System.out.println("New Building Added:");
        apartmentBuilding.printBuilding();
        sc.nextLine();

        return apartmentBuilding;

    }

    //this factory provided modify building too (override the origin method)

    public void ModifyBuilding(Scanner sc, Apartment ap) {

        System.out.print("Modify Monthly Rental.: ");
        ap.setMonthlyRental(sc.nextDouble());

        System.out.print("Modify Support Staff.: ");
        sc.nextLine();
        ap.setSupportStaff(sc.nextLine());

        System.out.println("Building is modified: ");
        System.out.println(toString());

    }
}
