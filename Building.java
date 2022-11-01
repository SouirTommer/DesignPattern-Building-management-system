import java.util.ArrayList;

public abstract class Building{
    private int id;
    private ArrayList<Room> rooms = new ArrayList<>(noOfRooms);

    public Building(int id, int noOfRooms){
        this.id = id;
        //noOfRooms=10;
    }

    public int getId(){
        return this.id;
    }
    public ArrayList<Room> getRooms(){
        return this.rooms;
    }
    public Room addRoom(double length, double width){
        for (int i = 1; i <= noOfRooms ; i++){
            Room roomId = new Room(length, width);
            rooms.add(roomId);
        }
        return rooms;
    }
    public void modifyRoom(int roomNo, double length, double width){

    }
    public Room deleteRoom(int roomNo){

    }
    public void printRooms(){
        System.out.print("Room No.: " + id);
    }
    public int getRoomQty(){
        return rooms.size();
    }
    public abstract void modifyBuilding();
    public abstract void printBuilding();

}