package view;

import model.idol.Idol;
import model.idol.IdolFactory;
import model.idol.IdolType;
import model.room.Room;
import model.room.RoomFactory;
import model.room.RoomType;

import java.time.LocalDate;
import java.time.LocalTime;


public class Main {
    public static void main(String[] args) {
//        Idol idolA = IdolFactory.getIdol(IdolType.IDOLA);
//        Idol idolB = IdolFactory.getIdol(IdolType.IDOLB);
//        Idol idolC = IdolFactory.getIdol(IdolType.IDOLC);
//        System.out.println(idolA);
//        System.out.println(idolB);
//        System.out.println(idolC);
//        Room room1 = RoomFactory.getRoom(RoomType.KINGROOM);
//        System.out.println(room1);

      LocalTime localTime = LocalTime.now();
      LocalTime localTime1 = localTime.plusHours(2);
        System.out.println(localTime1);
        System.out.println(localTime);
        long time = localTime1.getHour() - (localTime.getHour());
        System.out.println(time);
    }
}
