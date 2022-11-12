package Building;
import java.util.*;

public class RoomFactory {

    public Room createRoom(Scanner sc){
        System.out.print("Length: ");
            double roomLength = sc.nextDouble();

            System.out.print("Width: ");
            double roomWidth = sc.nextDouble();
            return new Room(roomLength,roomWidth);
    }
}
