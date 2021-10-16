package view;

import control.CustomerManager;
import control.IdolManager;
import model.Customer;
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

        List<Customer> idolList = new ArrayList<>();
        CustomerManager idolManager = new CustomerManager();
        Customer customer = new Customer("John", "12", "0986123456");
        idolManager.saveList(customer);
        Customer customer1 = new Customer("J3", "12", "0986123456");
        idolManager.saveList(customer);

        idolManager.showAllList();

    }
}
