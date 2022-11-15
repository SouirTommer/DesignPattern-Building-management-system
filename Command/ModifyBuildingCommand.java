package Command;

import Building.*;
import Memento.*;

import java.util.*;

public class ModifyBuildingCommand implements Command {
    HashMap<Integer, Building> buildMap;
    Scanner sc;
    Caretaker caretaker;

    int buildingNo;

    public ModifyBuildingCommand(Scanner sc, HashMap<Integer, Building> buildMap, Caretaker caretaker) {
        this.sc = sc;
        this.buildMap = buildMap;
        this.caretaker = caretaker;
    }

    public void execute() {

        System.out.print("Building No.: ");
        buildingNo = sc.nextInt();

        caretaker.saveBuidling(buildMap.get(buildingNo), buildingNo, this.toString(), false);

        if (buildMap.get(buildingNo) instanceof Apartment) {
            System.out.print("Modify Monthly Rental.: ");
            ((Apartment) buildMap.get(buildingNo)).setMonthlyRental(sc.nextDouble());
            System.out.print("Modify Support Staff.: ");
            sc.nextLine();
            ((Apartment) buildMap.get(buildingNo)).setSupportStaff(sc.nextLine());
            System.out.println("Building is modified: ");
            System.out.println(((Apartment) buildMap.get(buildingNo)).toString());

        } else if (buildMap.get(buildingNo) instanceof House) {
            System.out.print("No. of Floors: ");
            ((House) buildMap.get(buildingNo)).setFloors(sc.nextInt());
            System.out.println("Building is modified:");
            System.out.println(((House) buildMap.get(buildingNo)).toString());
            sc.nextLine();
        }
    }
    public String toString(){
        return "Modify Building: " +buildMap.get(buildingNo).toString();
    }

    public void undo() {

    }

    public void redo() {

    }
}
