package view;

import model.idol.Idol;
import model.idol.IdolFactory;
import model.idol.IdolType;
import model.room.Room;
import model.room.RoomFactory;
import model.room.RoomType;

public class Main {
    public static void main(String[] args) {
//        Idol idolA = IdolFactory.getIdol(IdolType.IDOLA);
//        Idol idolB = IdolFactory.getIdol(IdolType.IDOLB);
//        Idol idolC = IdolFactory.getIdol(IdolType.IDOLC);
//        System.out.println(idolA);
//        System.out.println(idolB);
//        System.out.println(idolC);
        Room room1 = RoomFactory.getRoom(RoomType.KINGROOM);
        System.out.println(room1);
    }
}
