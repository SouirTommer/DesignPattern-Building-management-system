/*
Student:   Ching Chun Hung 210020835 2B
Last Edit  13/11/2022
*/
package Building;
//import java.util.scanner;
public class House extends Building{
    private int noOfFloors;

    public House(int id, int noOfRooms, int noOfFloors){
        super(id, noOfRooms);
        this.noOfFloors = noOfFloors;
    }
    public void setFloors(int noOfFloors){
        this.noOfFloors = noOfFloors;
    }
    public int getFloors(){
        return noOfFloors;
    }
    public void modifyBuilding(){
        //the code was move to factory
    }
    public void printBuilding(){
        System.out.println("Building No: "+super.getId());
        System.out.println("No of Floors: "+noOfFloors);
        super.printRooms();
        
    }
    public String toString(){
        return "Building No.: "+super.getId()+", No. of Floors: "+noOfFloors;
    }

}