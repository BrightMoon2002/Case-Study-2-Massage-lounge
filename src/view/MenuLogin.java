package view;

import control.*;
import login.*;
import model.Bill;
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


public class MenuLogin {
    private static MenuAdmin menuAdmin;
    private static MenuCustomer menuCustomer;


    public static void loginMenu() {
        IdolManager idolManager = new IdolManager();
        RoomManager roomManager = new RoomManager();
        CustomerManager customerManager = new CustomerManager();
        BillManager billManager = new BillManager();
        AdminManager adminManager = new AdminManager();
        UserManager userManager = new UserManager();
        LoginManager loginManager = new LoginManager();


//            FileManagerBill fileManagerBill = FileManagerBill.getInstance();
//            billManager.setFileManagerBill(fileManagerBill);
//            List<Bill> billList = fileManagerBill.readList();
//            billManager.setBillList(billList);


//            FileManagerCustomer fileManagerCustomer = FileManagerCustomer.getInstance();
//            customerManager.setFileManagerCustomer(fileManagerCustomer);
//            List<Customer> customerList = fileManagerCustomer.readList();
//            customerManager.setCustomerList(customerList);

//            FileManagerIdol fileManagerIdol = FileManagerIdol.getInstance();
//            idolManager.setFileManagerIdol(fileManagerIdol);
//            List<Idol> idolList = fileManagerIdol.readList();
//            idolManager.setIdolList(idolList);

//            FileManagerRoom fileManagerRoom = FileManagerRoom.getInstance();
//            roomManager.setFileManagerRoom(fileManagerRoom);
//            List<Room> roomList = fileManagerRoom.readList();
//            roomManager.setRoomList(roomList);

//            customerManager.showAllList();
//            roomManager.showAllList();
//            idolManager.showAllList();


//            FileManagerAdmin fileManagerAdmin = FileManagerAdmin.getInstance();
//            adminManager.setFileManagerAdmin(fileManagerAdmin);
//            List<Admin> adminList = fileManagerAdmin.readList();
//            adminManager.setAdminList(adminList);

        FileManagerUser fileManagerUser = FileManagerUser.getInstance();
        userManager.setFileManagerUser(fileManagerUser);
        List<User> userList = fileManagerUser.readList();
        userManager.setUserList(userList);
        User userC = UserFactory.getUser(UserType.CUSTOMER, "John", "123", "345", "John Wick");
        userManager.saveList(userC);

        FileManagerLogin fileManagerLogin = FileManagerLogin.getInstance();
        loginManager.setFileManagerLogin(fileManagerLogin);
        List<User> loginList = fileManagerLogin.readList();
        loginManager.setUserList(loginList);


        while (true) {
            System.out.println("Enter the username:");
            Scanner inputUsername = new Scanner(System.in);
            String username = inputUsername.nextLine();
            User user = userManager.searchByName(username);
            if (user != null) {
                System.out.println("Enter the password:");
                Scanner inputPassword = new Scanner(System.in);
                String password = inputPassword.nextLine();
                if (user.getPassword().equals(password)) {
                    System.out.println("go to the menu");
                    if (user.getRole().equalsIgnoreCase("Admin")) {
                        System.out.println("go menu admin");
                        loginManager.saveUser(user);
                        menuAdmin.menuAdmin();

                    } else {
                        loginManager.saveUser(user);
                        menuCustomer.menuCustomer();
                    }
                } else {
                    System.out.println("wrong password");
                }
            } else {
                System.out.println("wrong user");
            }

//                System.out.println("Your are the Customer or Manager?");
//                System.out.println("1. Customer");
//                System.out.println("2. Manager");
//                System.out.println("3. Creat New Account for Customer");
//                System.out.println("0. Exit");
//                Scanner inputChoice = new Scanner(System.in);
//                int choice = inputChoice.nextInt();
//
//                switch (choice) {
//                    case 1:
//                        System.out.println("Enter your username:");
//                        Scanner inputUsername = new Scanner(System.in);
//                        String username = inputUsername.nextLine();
//                        Customer customer1 = customerManager.searchByName(username);
//                        if (customer1 != null) {
//                            System.out.println("Enter the password:");
//                            Scanner inputPassword = new Scanner(System.in);
//                            String password = inputPassword.nextLine();
//                            if (customer1.getPassword().equals(password)) {
//                                System.out.println("Go to the menu for customer");
//                            } else {
//                                System.out.println("wrong password!");
//                            }
//                        } else {
//                            System.out.println("Wrong username, please enter again or creat new account");
//                        }
//                        break;
//                    case 2:
//                        System.out.println("Enter your username:");
//                        Scanner inputUsername1 = new Scanner(System.in);
//                        String username1 = inputUsername1.nextLine();
//                        Admin admin1 = adminManager.searchByName(username1);
//                        if (admin1 != null) {
//                            System.out.println("Enter the password:");
//                            Scanner inputPassword = new Scanner(System.in);
//                            String password = inputPassword.nextLine();
//                            if (admin1.getPassword().equals(password)) {
//                                System.out.println("Go to the menu for admin");
//                            } else {
//                                System.out.println("wrong password!");
//                            }
//                        } else {
//                            System.out.println("Wrong username, please enter again or creat new account");
//                        }
//                        break;
//                    case 3:
//                        System.out.println("Enter the username:");
//                        Scanner inputNewUsername = new Scanner(System.in);
//                        String newUsername = inputNewUsername.nextLine();
//                        System.out.println("Enter the password:");
//                        Scanner inputPassword = new Scanner(System.in);
//                        String password = inputPassword.nextLine();
//                        System.out.println("Enter the id");
//                        Scanner inputId = new Scanner(System.in);
//                        String id = inputId.nextLine();
//                        System.out.println("Enter your Full name:");
//                        Scanner inputFullName = new Scanner(System.in);
//                        String fullName = inputFullName.nextLine();
//                        System.out.println("Enter your mobile:");
//                        Scanner inputMobile = new Scanner(System.in);
//                        String mobile = inputMobile.nextLine();
//                        Customer newCustomer = new Customer(newUsername, password, id, fullName, mobile);
//                        customerManager.saveList(newCustomer);
//                        break;
//                    case 0:
//                        System.exit(0);
//                        break;
//                    default:
//                        System.out.println("no support this choice");
//                        break;

        }
    }
}

