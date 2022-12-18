/*
Last Edit  13/11/2022
*/
package Building;
public class Apartment extends Building{
    private double monthlyRental;
    private String supportStaff;

    public Apartment(int id, int noOfRooms, double monthlyRental, String supportStaff){
        super(id, noOfRooms);
        this.monthlyRental = monthlyRental;
        this.supportStaff = supportStaff;
    }
    public void setMonthlyRental(double monthlyRental){
        this.monthlyRental = monthlyRental;
    }
    public double getMonthlyRental(){
        return this.monthlyRental;
    }
    public void setSupportStaff(String supportStaff){
        this.supportStaff = supportStaff;
    }
    public String getSupportStaff(){
        return this.supportStaff;
    }
    public void modifyBuilding(){
        //the code was move to factory
    }
    public void printBuilding(){   //print with room and \n (long)
        System.out.println("Building No: "+super.getId());
        System.out.println("Support Staff: "+supportStaff);
        System.out.println("Monthly Rental: "+monthlyRental);
        super.printRooms();

    }
    public String toString(){      //print without room (short)
        return "Building No.: "+super.getId()+", Support Staff: "+supportStaff+", Monthly Rental: "+monthlyRental;
    }

}