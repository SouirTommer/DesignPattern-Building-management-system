/*
Last Edit  13/11/2022
*/
package Command;

import Building.*;
import java.util.*;

public class DisplayCommand implements Command {
    private HashMap <Integer,Building> buildingList;
    private Scanner sc;
    private String input;

    public DisplayCommand(HashMap<Integer,Building> buildingList, Scanner sc) {
        this.buildingList = buildingList;
        this.sc = sc;
        this.input = "";
    }

    public void execute() {

        System.out.println("Enter Building No. (* to display all):");
        input = sc.nextLine();

        if (input.equals("*")) {
            //use Treemap to sort the hasmap by BuildingNo integer
            Map<Integer, Building> sorted = new TreeMap<>(buildingList);

            //use for each loop the hashmap
            for (Map.Entry i : sorted.entrySet()) {

                System.out.println(sorted.get(i.getKey()).toString());
            }
        } else {
            buildingList.get(Integer.parseInt(input)).printBuilding();
        }
    }

}
