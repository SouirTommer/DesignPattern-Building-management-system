package Command;

import Building.*;

import java.util.*;

public class DisplayCommand implements Command {
    Scanner sc;
    HashMap<Integer, Building> buildMap;

    public DisplayCommand(Scanner sc, HashMap<Integer, Building> buildMap) {
        this.sc = sc;
        this.buildMap = buildMap;
    }

    public void execute() {
        System.out.println("Enter Building No. (* to display all):");
        String Userinput = sc.nextLine();

        if (Userinput.equals("*")) {

            Map<Integer, Building> sorted = new TreeMap<>(buildMap);

            for (Map.Entry i : sorted.entrySet()) {

                System.out.println(sorted.get(i.getKey()).toString());
            }
        } else {
            buildMap.get(Integer.parseInt(Userinput)).printBuilding();

        }
    };

    public void undo() {

    };

    public void redo() {

    };
}
