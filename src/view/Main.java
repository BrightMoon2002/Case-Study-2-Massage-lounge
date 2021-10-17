package view;

import control.BillManager;
import control.CustomerManager;
import control.IdolManager;
import control.RoomManager;
import model.Bill;
import model.Customer;
import model.idol.Idol;
import model.idol.IdolFactory;
import model.idol.IdolType;
import model.room.Room;
import model.room.RoomFactory;
import model.room.RoomType;
import storage.FileManagerBill;
import storage.FileManagerCustomer;
import storage.FileManagerIdol;
import storage.FileManagerRoom;

import java.io.IOException;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;


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


        BillManager billManager = new BillManager();
        FileManagerBill fileManagerBill = FileManagerBill.getInstance();
        billManager.setFileManagerBill(fileManagerBill);
        List<Bill> billList = new ArrayList<>();
        billManager.setBillList(billList);
       fileManagerBill.readList();


        FileManagerCustomer fileManagerCustomer = FileManagerCustomer.getInstance();
        customerManager.setFileManagerCustomer(fileManagerCustomer);
        List<Customer> customerList = new ArrayList<>();
        customerManager.setCustomerList(customerList);

        FileManagerIdol fileManagerIdol =  FileManagerIdol.getInstance();
        idolManager.setFileManagerIdol(fileManagerIdol);
        List<Idol> idolList = new ArrayList<>();
        idolManager.setIdolList(idolList);

        FileManagerRoom fileManagerRoom = FileManagerRoom.getInstance();
        roomManager.set

        Bill bill = new Bill("12345", room1, idolA, LocalTime.now(), LocalTime.now());
        billManager.saveList(bill);


    }
}
