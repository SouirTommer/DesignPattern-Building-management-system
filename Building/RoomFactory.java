package Building;

import java.util.Scanner;

public class RoomFactory {

    public Room createRoom(Scanner sc){
      System.out.print("Length: ");
      double length = sc.nextDouble();
      System.out.print("Width: ");
      double width = sc.nextDouble();
      return new Room(length, width);
    }

  }