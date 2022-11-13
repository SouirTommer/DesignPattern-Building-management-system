package Memento;

import java.util.*;

import Building.*;

public class Caretaker {
    private HashMap<Integer, Building> buildMap;
    private Stack undoList; // a stack to store the executed commands (for undo)
    private Stack redoList; // a stack to store the commands which were undid (for redo)
    private LinkedList unCommand; // a LinkedList to store the undo commands String
    private LinkedList reCommand; // a LinkedList to store the redo commands String

    public Caretaker(HashMap<Integer, Building> buildMap) {
        this.buildMap = buildMap;
        undoList = new Stack();
        redoList = new Stack();
        unCommand = new LinkedList<String>();
        reCommand = new LinkedList<String>();
    }

    // save the building state put commands message to list, check is it a create
    // commands
    public void saveBuidling(Building building, int buildingNo, String message) {
        undoList.push(new Memento(building, buildingNo));
        unCommand.push(message);
    }

    // undo commands
    public void undo() {
        if (!undoList.isEmpty()) {
            Memento undom = (Memento) undoList.pop();
            Memento remember = new Memento(undom.getmbuilding(), undom.getmbuildingNo()); // save
                                                                                          // toy
                                                                                          // for
                                                                                          // put in
                                                                                          // redo
            // if
            // this is not create commands
            if ((undoList).size() > 1) {
                redoList.push(undom); // pop undo list object to redo list
                buildMap.remove(undom.getmbuilding()); // remove the toy in vector
            } else {
                redoList.push(remember); // push a new memento to redolist
                undom.restore(); // restore memento
            }
            if (!unCommand.isEmpty()) {
                String message = (String) unCommand.pop();
                System.out.println("undo: " + message);
                reCommand.push(message);
            }
        } else {
            System.out.println("Nothing Undo");
        }

    }

    // redo commands
    public void redo() {
        if (!redoList.isEmpty()) {
            Memento redom = (Memento) redoList.pop();
            Memento remember = new Memento(redom.getmbuilding(), redom.getmbuildingNo());
            if (redoList.size() > 0) {
                System.out.println("redom");
                undoList.push(redom); // pop redo list object to undo list
                buildMap.put(redom.getmbuildingNo(), redom.getmbuilding()); // add back the toy in vector
            } else {
                undoList.push(remember); // push a new memento to undolist
                redom.restore(); // restore memento
            }

            if (!reCommand.isEmpty()) {
                String message = (String) reCommand.pop();
                System.out.println(message);
                unCommand.push(message);
            }

        } else {
            System.out.println("Nothing Redo");
        }
    }

    public LinkedList getunCommand() {
        return (LinkedList) this.unCommand.clone();
    }

    public LinkedList getreCommand() {
        return (LinkedList) this.reCommand.clone();

    }
}