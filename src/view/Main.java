package view;

import control.IdolManager;
import model.idol.Idol;
import model.idol.IdolFactory;
import model.idol.IdolType;
import model.room.Room;
import model.room.RoomFactory;
import model.room.RoomType;

import java.util.ArrayList;
import java.util.List;


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

        List<Idol> idolList = new ArrayList<>();
        IdolManager idolManager = new IdolManager();
        Idol idol = IdolFactory.getIdol(IdolType.IDOLA);
        idolManager.saveList(idol);
        Idol idol1 = IdolFactory.getIdol(IdolType.IDOLB);
        idolManager.saveList(idol1);
        idolManager.showAllList();

    }
}
