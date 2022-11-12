package Command;

import java.util.*;
import Building.*;

public class RoomFactory implements CommandFactory {
    Stack commands;
    Scanner sc;
    HashMap<Integer, Building> buildMap;
    

    public RoomFactory(Scanner sc, HashMap<Integer, Building> buildMap, Stack commands) {
        this.sc = sc;
        this.buildMap = buildMap;
        this.commands = commands;
    }

    @Override
    public Command createCommand() {

        System.out.print("Building No.: ");
        int buildingNo = sc.nextInt();
        buildMap.get(buildingNo).printBuilding();

        System.out.println("");
        System.out.println("Please enter command: [a|d|m]");
        System.out.println("a = add room, d = delete room, m = modify room");
        String Userinput = sc.nextLine();


        
        Command c = null;
        if (Userinput.equals("a")){
            c = new AddroomsCommand(sc, buildMap, buildingNo);
        }
        if (Userinput.equals("d")){
            c = new DeleteroomsCommand(sc, buildMap, buildingNo);
        }
        if (Userinput.equals("m")){
            c = new ModifyroomsCommand(sc, buildMap, buildingNo);
        }
        commands.push(c);
        return c;
    }
}
