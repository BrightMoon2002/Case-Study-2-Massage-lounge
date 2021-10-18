package view;

import control.*;
import login.Admin;
import model.Bill;
import login.Customer;
import model.idol.Idol;
import model.idol.IdolFactory;
import model.idol.IdolType;
import model.room.Room;
import model.room.RoomFactory;
import model.room.RoomType;
import storage.*;

import java.time.LocalTime;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {



        IdolManager idolManager = new IdolManager();
        RoomManager roomManager = new RoomManager();
        CustomerManager customerManager = new CustomerManager();
        BillManager billManager = new BillManager();
        AdminManager adminManager = new AdminManager();


        FileManagerBill fileManagerBill = FileManagerBill.getInstance();
        billManager.setFileManagerBill(fileManagerBill);
        List<Bill> billList = fileManagerBill.readList();
         billManager.setBillList(billList);


        FileManagerCustomer fileManagerCustomer = FileManagerCustomer.getInstance();
        customerManager.setFileManagerCustomer(fileManagerCustomer);
        List<Customer> customerList = fileManagerCustomer.readList();
        customerManager.setCustomerList(customerList);

        FileManagerIdol fileManagerIdol =  FileManagerIdol.getInstance();
        idolManager.setFileManagerIdol(fileManagerIdol);
        List<Idol> idolList =fileManagerIdol.readList();
        idolManager.setIdolList(idolList);

        FileManagerRoom fileManagerRoom = FileManagerRoom.getInstance();
        roomManager.setFileManagerRoom(fileManagerRoom);
        List<Room> roomList = fileManagerRoom.readList();
        roomManager.setRoomList(roomList);
        Idol idolA = IdolFactory.getIdol(IdolType.IDOLA);
        Idol idolB = IdolFactory.getIdol(IdolType.IDOLB);
        Idol idolC = IdolFactory.getIdol(IdolType.IDOLC);
        idolManager.saveList(idolA);
        idolManager.saveList(idolB);
        idolManager.saveList(idolC);
        idolManager.findAll();

        Room room  = RoomFactory.getRoom(RoomType.KINGROOM);
        roomManager.saveList(room);
        Room room1  = RoomFactory.getRoom(RoomType.VIPROOM);
        roomManager.saveList(room1);



        Customer customer = new Customer("Jame", "999", "0986123456");
        customerManager.saveList(customer);
        customerManager.showAllList();
        roomManager.showAllList();
        idolManager.showAllList();

        Bill bill = new Bill("12345", room1, idolA, LocalTime.now(), LocalTime.now());
        billManager.saveList(bill);

        FileManagerAdmin fileManagerAdmin = FileManagerAdmin.getInstance();
        adminManager.setFileManagerAdmin(fileManagerAdmin);
        List<Admin> adminList = fileManagerAdmin.readList();
        adminManager.setAdminList(adminList);

        Admin admin =  new Admin("John", "123", "123456");
        adminManager.saveList(admin);
        billManager.showAllList();
        adminManager.showAllList();

        while(true) {
            System.out.println("Your are the Customer or Manager?");
            Scanner inputChoice =  new Scanner(System.in);
            int choice =  inputChoice.nextInt();
            System.out.println("1. Customer");
            System.out.println("2. Manager");
            switch (choice) {
                case 1:
                    System.out.println("Enter your name:");
                    Scanner inputUsername = new Scanner(System.in);
                    String username =  inputUsername.nextLine();
                    if (customerManager.searchByName(username) != null)
            }
        }
    }
}
