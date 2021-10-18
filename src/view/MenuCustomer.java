package view;

import control.*;
import login.Customer;
import login.User;
import login.UserFactory;
import login.UserType;
import model.Bill;
import model.idol.Idol;
import model.room.Room;
import storage.*;

import java.time.LocalTime;
import java.util.List;
import java.util.Scanner;

public class MenuCustomer {
    private MenuLogin menuLogin;


    public MenuCustomer() {
    }


    public static void menuCustomer() {
        IdolManager idolManager = new IdolManager();
        RoomManager roomManager = new RoomManager();
        CustomerManager customerManager = new CustomerManager();
        BillManager billManager = new BillManager();
        UserManager userManager = new UserManager();

        LoginManager loginManager = new LoginManager();
        FileManagerLogin fileManagerLogin = FileManagerLogin.getInstance();
        loginManager.setFileManagerLogin(fileManagerLogin);
        List<User> loginList = fileManagerLogin.readList();
        loginManager.setUserList(loginList);

        FileManagerBill fileManagerBill = FileManagerBill.getInstance();
        billManager.setFileManagerBill(fileManagerBill);
        List<Bill> billList = fileManagerBill.readList();
        billManager.setBillList(billList);

        FileManagerUser fileManagerUser = FileManagerUser.getInstance();
        userManager.setFileManagerUser(fileManagerUser);
        List<User> userList = fileManagerUser.readList();
        userManager.setUserList(userList);


        FileManagerIdol fileManagerIdol = FileManagerIdol.getInstance();
        idolManager.setFileManagerIdol(fileManagerIdol);
        List<Idol> idolList = fileManagerIdol.readList();
        idolManager.setIdolList(idolList);

        FileManagerRoom fileManagerRoom = FileManagerRoom.getInstance();
        roomManager.setFileManagerRoom(fileManagerRoom);
        List<Room> roomList = fileManagerRoom.readList();
        roomManager.setRoomList(roomList);

        while (true) {
            User user = userManager.searchByName(loginManager.getUserList().get(0).getUsername());
            System.out.println("Menu of Customer:");
            System.out.println("1. Change password:");
            System.out.println("2. Change information of account");
            System.out.println("3. display list idol");
            System.out.println("4. display list room");
            System.out.println("5. pick idol and room");
            System.out.println("0 . exit");
            Scanner inputChoice = new Scanner(System.in);
            int choice = inputChoice.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the password you want to change:");
                    Scanner inputPassword = new Scanner(System.in);
                    String password = inputPassword.nextLine();
                    userManager.changePassword(userList.indexOf(user),password);
                    break;
                case 2:
                    userManager.updateByIndex(userList.indexOf(user), creatNewUser());
                    break;
                case 3:
                    idolManager.showAllList();
                    break;
                case 4:
                    roomManager.showAllList();
                    break;
                case 5:
                    System.out.println("Enter the id of idol you want her to serve you");
                    Scanner inputId = new Scanner(System.in);
                    String id = inputId.nextLine();
                    Idol idol = idolManager.searchById(id);
                    System.out.println("Enter the id of room you want to use");
                    Scanner inputIdRoom = new Scanner(System.in);
                    String idRoom = inputIdRoom.nextLine();
                    Room room = roomManager.searchById(idRoom);
                    if (!idol.isStatus() && !room.isStatus()) {
                        Bill bill = new Bill("123", idol, room, user, LocalTime.now());
                        billManager.saveList(bill);
                        billManager.showAllList();
                    }
            }
        }


    }

    private static User creatNewUser() {
        System.out.println("Enter the new username: ");
        Scanner inputNewUserName = new Scanner(System.in);
        String userName = inputNewUserName.nextLine();
        System.out.println("Enter the new password: ");
        Scanner inputNewPassword = new Scanner(System.in);
        String newPassword = inputNewPassword.nextLine();
        System.out.println("Enter the new id: ");
        Scanner inputNewId = new Scanner(System.in);
        String newId = inputNewId.nextLine();
        System.out.println("Enter the new fullName");
        Scanner inputNewName = new Scanner(System.in);
        String fullName = inputNewName.nextLine();
        User newUser = UserFactory.getUser(UserType.CUSTOMER, userName, newPassword, newId, fullName);
        return newUser;
    }
}

