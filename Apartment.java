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

    }
    public void printBuilding(){
        System.out.println("Building No: "+super.getId());
        System.out.println("Support Staff: "+supportStaff);
        System.out.println("Monthly Rental: "+monthlyRental);

    }
    public String toString(){
        return "Apartment";
    }

}