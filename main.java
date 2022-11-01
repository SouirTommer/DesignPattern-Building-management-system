
import java.util.*;

public class main{

    public static Scanner sc = new Scanner(System.in);
  
    public static void main(String [] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {

        Stack commands = new Stack();
        Stack redos = new Stack();
        Stack unredoList = new Stack();



        String input;

        while(true){
            System.out.println("Building Management System (BMS)");
            System.out.println("Please enter command: [a|d|m|e|u|r|l|x]");
            System.out.println("a = add building, d = display buildings, m = modify building, e = edit rooms, u = undo, r = redo, l = list undo/redo, x = exit system");
            input = sc.nextLine();

            switch (input){
                case "a":

                    System.out.println("Enter Building Type (a=Apartment/h=House):");
                    input = sc.nextLine();
                    switch (input){
                            case "a":

                                System.out.print("Building No.: ");
                                int bno = sc.nextInt();

                                System.out.print("Monthly Rental.: ");
                                double mr = sc.nextDouble();

                                System.out.print("Support Staff.: ");
                                String ss = sc.nextLine();

                                System.out.print("Number of rooms.: ");
                                int nor = sc.nextInt();

                                Building am = new Apartment(bno, nor, mr, ss);
                            break;
                            case "h":
                            break;
                        default:
                            System.out.print("input error");
                            break;
                    }
                    
                    break;


                case "d":
                break;
                case "m":
                break;
                case "e":
                break;
                case "u":
                break;
                case "r":
                break;
                case "l":
                break;
                case "x":
                System.exit(0);
                break;
            }


        }
    }
}