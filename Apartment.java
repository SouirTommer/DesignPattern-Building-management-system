public class Apartment extends Building{
    private double monthlyRental;
    private String supportStaff;

    public Apartment(int id, int noOfRooms, double monthlyRental, String supportStaff){
        super(id, noOfRooms);
        this.monthlyRental = monthlyRental;
        this.supportStaff = supportStaff;
    }
    public void setMonthlyRental(double monthlyRental){

    }
    public double getMonthlyRental(){
        return this.monthlyRental;
    }
    public void setSupportStaff(String supperStaff){
        
    }
    public String getSupportStaff(){
        return this.supportStaff;
    }
    public void modifyBuilding(){

    }
    public void printBuilding(){

    }
    public String toString(){
        return "Apartment";
    }

}