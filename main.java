import java.util.*;

import Building.*;
import Command.*;
import Memento.*;

public class main {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        
        //a hashmap to store all building, the key is building number
        HashMap<Integer, Building> buildingList = new HashMap<>();

        Caretaker ct = new Caretaker(buildingList);
        HashMap<String, CommandFactory> f = new HashMap<>();
        f.put("a", new CreateBuildingCommandFactory(buildingList, sc, ct));
        f.put("d", new DisplayCommandFactory(buildingList, sc));
        f.put("m", new ModifyBuildingCommandFactory(buildingList, sc, ct));
        f.put("e", new EditRoomCommandFactory(buildingList, sc, ct));
        f.put("u", new UndoCommandFactory(ct));
        f.put("r", new RedoCommandFactory(ct));
        f.put("l", new ListUndoRedoCommandFactory(ct));
        f.put("x", new ExitCommandFactory());

        Command com;
        String input;
        while (true) {
            try{

                System.out.println(
                "\nBuilding Management System (BMS) \n"+
                "Please enter command: [a|d|m|e|u|r|l|x] \n"+
                "a = add building, d = display buildings, m = modify building, e = edit rooms, u = undo, r = redo, l = list undo/redo, x = exit system"
                );
            
                input = sc.nextLine();
                com = f.get(input).createCommand();
                com.execute();

            } catch(Exception e){
                System.out.println("Your input is wrong, please try again!");
            }


        }
    }
}