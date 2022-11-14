package Memento;

import java.util.*;

import Building.*;

public class Caretaker {
    private HashMap<Integer, Building> buildMap;
    private Stack undoList; // a stack to store the executed commands (for undo)
    private Stack redoList; // a stack to store the commands which were undid (for redo)
    private LinkedList unCommand; // a LinkedList to store the undo commands String
    private LinkedList reCommand; // a LinkedList to store the redo commands String
    private boolean IsCreate;

    public Caretaker(HashMap<Integer, Building> buildMap) {
        this.buildMap = buildMap;
        undoList = new Stack();
        redoList = new Stack();
        unCommand = new LinkedList<String>();
        reCommand = new LinkedList<String>();
    }

    // save the building state put commands message to list, check is it a create
    // commands
    public void saveBuidling(Building building, int buildingNo, String message, boolean IsCreate) {
        undoList.push(new BuildingMemento(building, buildingNo, IsCreate));
        unCommand.push(message);
    }

    public void saveRoom(Room room,String message,Boolean IsCreate){
        undoList.push(new RoomMemento(room,IsCreate));
        unCommand.push(message);
    }
    // public void saveBuidling(Building building, int buildingNo, String message,
    // boolean IsCreate) {
    // undoList.push(new Memento(building, buildingNo, IsCreate));
    // unCommand.push(message);
    // }

    // undo commands
    public void undo() {
        if (undoList.peek() instanceof BuildingMemento) {
            if (!undoList.isEmpty()) {
                BuildingMemento undom = (BuildingMemento) undoList.pop();
                BuildingMemento remember = new BuildingMemento(undom.getmbuilding(), undom.getmbuildingNo(), IsCreate); // save
                if (undom.getIsCreate()) {
                    redoList.push(undom);
                    buildMap.remove(undom.getmbuildingNo());

                } else {
                    redoList.push(remember); // push a new memento to redolist
                    undom.restore(); // restore memento
                }
                if (!unCommand.isEmpty()) {
                    String message = (String) unCommand.pop();
                    System.out.println("\nUndo: " + message);
                    reCommand.push(message);
                }
            } else {
                System.out.println("\nNothing to Undo");
            }
        }

        if (undoList.peek() instanceof RoomMemento) {
            // do room memento stuff
        }

    }

    // redo commands
    public void redo() {
        if (redoList.peek() instanceof BuildingMemento) {
            if (!redoList.isEmpty()) {
                BuildingMemento redom = (BuildingMemento) redoList.pop();
                BuildingMemento remember = new BuildingMemento(redom.getmbuilding(), redom.getmbuildingNo(), IsCreate);
                if (redom.getIsCreate()) {
                    undoList.push(redom); // pop redo list object to undo list
                    buildMap.put(redom.getmbuildingNo(), redom.getmbuilding()); // add back the toy in vector
                } else {
                    undoList.push(remember); // push a new memento to undolist
                    redom.restore(); // restore memento
                }
                if (!reCommand.isEmpty()) {
                    String message = (String) reCommand.pop();
                    System.out.println("\nRedo :" + message);
                    unCommand.push(message);
                }
            } else {
                System.out.println("\nNothing to Redo");
            }
        }

    }

    public LinkedList getunCommand() {
        return (LinkedList) this.unCommand.clone();
    }

    public LinkedList getreCommand() {
        return (LinkedList) this.reCommand.clone();
    }

    public Stack getRedoList() {
        return redoList;
    }

    public Stack getUndoList() {
        return undoList;
    }

    public void clearRedoList() {
        this.redoList.clear();
        this.reCommand.clear();
    }
}