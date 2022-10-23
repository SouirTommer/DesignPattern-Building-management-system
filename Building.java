import java.util.ArrayList;

import java.util.ArrayList;

public abstract class Building{
    private int id;
    private ArrayList<Room> rooms = new ArrayList<>();

    public Building(int id, int noOfRooms){
        this.id = id;
        noOfRooms = 10;
    }

    public int getId(){
        return id;
    }
    public ArrayList<Room> getRooms(){
        return rooms;
    }
    public room addRoom(double length, double width){

    }
    public void modifyRoom(int roomNo, double length, double width){

    }
    public deleteRoom(int roomNo){

    }
    public void printRooms(){

    }
    public int getRoomQty(){
        return 0;
    }
    public abstract void modifyBuilding();
    public abstract void printBuilding();

}