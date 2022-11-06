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