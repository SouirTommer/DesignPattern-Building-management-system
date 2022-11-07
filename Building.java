import java.util.*;

public abstract class Building{
    private int id;
    private ArrayList<Room> rooms;

    public Building(int id, int noOfRooms){
        this.id = id;
        this.rooms = new ArrayList<Room>(noOfRooms);
    }

    public int getId(){
        return this.id;
    }
    public ArrayList<Room> getRooms(){
        return this.rooms;
    }
    
    public Room addRoom(double length, double width){

        Room roomId = new Room(length, width);
        rooms.add(roomId);
        return roomId;
    }
    public void modifyRoom(int roomNo, double length, double width){
        rooms.get(roomNo-1).setLength(length);
        rooms.get(roomNo-1).setWidth(width);

    }
    public Room deleteRoom(int roomNo){
        return rooms.remove(roomNo-1);
    }
    public void printRooms(){
        
        for(int i = 1; i <= rooms.size(); i++){
            Room room = rooms.get(i-1);
            System.out.println("Room No.: " + i + room);

        }
        
    }
    public int getRoomQty(){
        return rooms.size();
    }
    public abstract void modifyBuilding(Scanner sc);
    public abstract void printBuilding();

}