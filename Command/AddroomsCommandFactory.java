/*
Student:   Ching Chun Hung 210020835 2B
Last Edit  13/11/2022
*/
package Command;

import java.util.*;
import Building.*;
import Memento.Caretaker;

public class AddroomsCommandFactory implements CommandFactory {
    private HashMap<Integer, Building> buildingList;
    private int buildNo;
    private Scanner sc;
    private Caretaker ct;
    
    //local
    private double roomLength;
    private double roomWidth;

    public AddroomsCommandFactory(HashMap<Integer, Building> buildingList, int buildNo, Scanner sc, Caretaker ct) {
        this.sc = sc;
        this.buildingList = buildingList;
        this.buildNo = buildNo;
        this.ct = ct;
    }

    public Command createCommand() {
        System.out.print("Length: ");
        roomLength = sc.nextDouble();

        System.out.print("Width: ");
        roomWidth = sc.nextDouble();
        Command c = new AddroomsCommand(roomLength, roomWidth, buildingList, buildNo, sc, ct);
        return c;
    }


}
