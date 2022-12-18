/*
Last Edit  13/11/2022
*/
package Memento;

import java.util.*;
import Building.*;

public class Caretaker {

    private HashMap<Integer, Building> buildingList;

    private Stack undoList;
    private Stack redoList;

    private LinkedList<String> undoCommand;
    private LinkedList<String> redoCommand;

    private boolean IsCreate;


    public Caretaker(HashMap<Integer, Building> buildingList) {
        this.buildingList = buildingList;

        undoList = new Stack();
        redoList = new Stack();
        
        undoCommand = new LinkedList<String>();
        redoCommand = new LinkedList<String>();
    }

    public void saveBuidling(Building building, int buildingNo, String message, boolean IsCreate) {
        undoList.push(new BuildingMemento(building, buildingNo, IsCreate));
        undoCommand.push(message);
    }

    public void saveRoom(Room mroom, String message) {
        undoList.push(new ModifyRoomMemento(mroom));
        undoCommand.push(message);
    }

    public void undo() {
        if (!undoList.isEmpty()) {
            if (undoList.peek() instanceof BuildingMemento) {

                BuildingMemento undom = (BuildingMemento) undoList.pop();
                BuildingMemento remember = new BuildingMemento(undom.getmbuilding(), undom.getmbuildingNo(), IsCreate);

                if (undom.getIsCreate()) {
                    redoList.push(undom);
                    buildingList.remove(undom.getmbuildingNo());
                } else {
                    redoList.push(remember);
                    undom.restore();
                }
                if (!undoCommand.isEmpty()) {
                    String message = (String) undoCommand.pop();
                    redoCommand.push(message);
                }

            }

            else if (undoList.peek() instanceof ModifyRoomMemento) {

                ModifyRoomMemento undom = (ModifyRoomMemento) undoList.pop();
                ModifyRoomMemento remember = new ModifyRoomMemento(undom.getRoom());

                redoList.push(remember);
                undom.restore();

                if (!undoCommand.isEmpty()) {
                    String message = (String) undoCommand.pop();
                    redoCommand.push(message);
                }
            }

        } else {
            System.out.println("\nNothing to Undo");
        }

    }

    public void redo() {
        if (!redoList.isEmpty()) {
            if (redoList.peek() instanceof BuildingMemento) {
                BuildingMemento redom = (BuildingMemento) redoList.pop();
                BuildingMemento remember = new BuildingMemento(redom.getmbuilding(), redom.getmbuildingNo(),
                        IsCreate);
                if (redom.getIsCreate()) {
                    undoList.push(redom);
                    buildingList.put(redom.getmbuildingNo(), redom.getmbuilding());
                } else {
                    undoList.push(remember);
                    redom.restore();
                }
                if (!redoCommand.isEmpty()) {
                    String message = (String) redoCommand.pop();
                    undoCommand.push(message);
                }
            }

            else if (redoList.peek() instanceof ModifyRoomMemento) {
                ModifyRoomMemento redom = (ModifyRoomMemento) redoList.pop();
                ModifyRoomMemento remember = new ModifyRoomMemento(redom.getRoom());
                undoList.push(remember);
                redom.restore();

                if (!redoCommand.isEmpty()) {
                    String message = (String) redoCommand.pop();
                    undoCommand.push(message);
                }

            }
        } else {
            System.out.println("\nNothing to Redo");
        }
    }

    public LinkedList getundoCommand() {
        return (LinkedList) this.undoCommand.clone();
    }

    public LinkedList getredoCommand() {
        return (LinkedList) this.redoCommand.clone();
    }

    public Stack getRedoList() {
        return redoList;
    }

    public Stack getUndoList() {
        return undoList;
    }
}