package view;

import control.CustomerManager;
import control.IdolManager;
import control.RoomManager;
import model.Customer;
import model.idol.Idol;
import model.idol.IdolFactory;
import model.idol.IdolType;
import model.room.Room;
import model.room.RoomFactory;
import model.room.RoomType;



public class Main {
    public static void main(String[] args) {
        Idol idolA = IdolFactory.getIdol(IdolType.IDOLA);
        Idol idolB = IdolFactory.getIdol(IdolType.IDOLB);
        Idol idolC = IdolFactory.getIdol(IdolType.IDOLC);
        IdolManager idolManager = new IdolManager();
        idolManager.saveList(idolA);
        idolManager.saveList(idolB);
        idolManager.saveList(idolC);
        idolManager.findAll();

        RoomManager roomManager = new RoomManager();
        Room room  = RoomFactory.getRoom(RoomType.KINGROOM);
        roomManager.saveList(room);
        Room room1  = RoomFactory.getRoom(RoomType.VIPROOM);
        roomManager.saveList(room1);

        Customer customer = new Customer("Jame", "999", "0986123456");
        CustomerManager customerManager = new CustomerManager();
        customerManager.saveList(customer);
        customerManager.showAllList();
        roomManager.showAllList();
        idolManager.showAllList();

    }
}
