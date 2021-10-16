package model.room;

import java.util.Scanner;

public class RoomFactory {
    private RoomFactory() {}
    public static final Room getRoom(RoomType roomType) {
        System.out.println("Enter the code of room:");
        Scanner inputCode = new Scanner(System.in);
        String code = inputCode.nextLine();
       switch (roomType) {
           case DELUXERROOM:
               return new RoomDeluxe(code);
           case VIPROOM:
               return new RoomVip(code);
           case KINGROOM:
               return new RoomKing(code);
           default:
               throw new IllegalArgumentException("This type of room is unsupported");
       }
    }

}
