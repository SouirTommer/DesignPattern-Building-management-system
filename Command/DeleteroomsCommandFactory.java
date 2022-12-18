/*
Student:   Ching Chun Hung 210020835 2B
Last Edit  13/11/2022
*/
package Command;

import java.util.*;
import Building.*;
import Memento.Caretaker;

public class DeleteroomsCommandFactory implements CommandFactory {

    private HashMap<Integer, Building> buildingList;
    private int buildNo;
    private Scanner sc;
    private Caretaker ct;
    private int roomNo;

    public DeleteroomsCommandFactory(HashMap<Integer, Building> buildingList, int buildNo, Scanner sc, Caretaker ct) {
        this.buildingList = buildingList;
        this.buildNo = buildNo;
        this.sc = sc;
        this.ct = ct;

    }

    public Command createCommand() {

        System.out.println("Room No.: ");
        roomNo = sc.nextInt();

        Command c = new DeleteroomsCommand(roomNo, buildingList, buildNo, sc, ct);
        return c;
    }
}