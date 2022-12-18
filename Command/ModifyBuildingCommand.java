/*
Student:   Ching Chun Hung 210020835 2B
Last Edit  13/11/2022
*/
package Command;

import Building.*;
import Memento.*;

import java.util.*;

public class ModifyBuildingCommand implements Command {
    private HashMap<Integer, Building> buildingList;
    private Scanner sc;
    private Caretaker ct;
    private String staff;
    private int buildNo;
    private double rent;
    private int floors;

    public ModifyBuildingCommand(HashMap<Integer, Building> buildingList, Scanner sc, Caretaker ct) {
        this.buildingList = buildingList;
        this.sc = sc;
        this.ct = ct;
    }

    public void execute() {

        System.out.print("Building No.: ");
        buildNo = sc.nextInt();

        if (buildingList.get(buildNo) instanceof Apartment) {

            System.out.println(buildingList.get(buildNo).toString());

            System.out.print("Modify Monthly Rental.: ");
            rent = sc.nextDouble();

            System.out.print("Modify Support Staff.: ");
            sc.nextLine();

            staff = sc.nextLine();

        } else if (buildingList.get(buildNo) instanceof House) {

            System.out.println(buildingList.get(buildNo).toString());
            System.out.print("No. of Floors: ");

            floors = sc.nextInt();
        }

        ct.saveBuidling(buildingList.get(buildNo), buildNo, this.toString(), false);

        // check building type to modify
        if (buildingList.get(buildNo) instanceof Apartment) {

            Apartment apartment = (Apartment) buildingList.get(buildNo);

            apartment.setMonthlyRental(rent);

            apartment.setSupportStaff(staff);

            System.out.println("Building is modified: ");
            System.out.println(apartment.toString());

        } else if (buildingList.get(buildNo) instanceof House) {

            House house = (House) buildingList.get(buildNo);

            house.setFloors(floors);

            System.out.println("Building is modified:");
            System.out.println(house.toString());

            sc.nextLine();
        }

    }

    public String toString() {
        if (buildingList.get(buildNo) instanceof Apartment) {
            return "Modify Building: " + "Building No.: " + buildNo + ", Support Staff: " + staff + ", Monthly Rental:"
                    + rent;
        } else {
            return "Modify Building: " + "Building No.: " + buildNo + ", No. of Floors: " + floors;
        }

    }
}
