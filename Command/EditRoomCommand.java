/*
Last Edit  13/11/2022
*/
package Command;

import java.util.*;
import Building.*;
import Memento.*;

public class EditRoomCommand implements Command {
    private Scanner sc;
    private HashMap<Integer, Building> buildingList;
    private int buildNo;
    
    private HashMap<String, CommandFactory> tempHash = new HashMap<>();
    private String input;

    public EditRoomCommand(HashMap<Integer, Building> buildingList, int buildNo, Scanner sc, Caretaker ct) {
        this.sc = sc;
        this.buildingList = buildingList;
        this.buildNo = buildNo;

        tempHash.put("a",new AddroomsCommandFactory(buildingList, buildNo, sc, ct));
        tempHash.put("d",new DeleteroomsCommandFactory(buildingList, buildNo, sc, ct));
        tempHash.put("m",new ModifyroomsCommandFactory(buildingList, buildNo, sc, ct));
    }

    public void execute() {

        buildingList.get(buildNo).printBuilding();
        System.out.println("");
        System.out.println("Please enter command: [a|d|m]");
        System.out.println("a = add room, d = delete room, m = modify room");

        input = sc.next();
        sc.nextLine();

        
        while(!input.equals("a")&&!input.equals("d")&&!input.equals("m")){
            System.out.println("Wrong input");
            System.out.println("Please enter command: [a|d|m]");
            System.out.println("a = add room, d = delete room, m = modify room");
            input = sc.nextLine();
        }
        tempHash.get(input).createCommand().execute();
    }

}
