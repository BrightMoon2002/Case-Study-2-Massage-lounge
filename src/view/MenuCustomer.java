package view;

import java.util.Scanner;

public class MenuCustomer {
    private MenuLogin menuLogin;


   public MenuCustomer() {}


    public static void menuCustomer() {
        while (true) {
            System.out.println("Menu of Customer:");
            System.out.println("1. Change password:");
            System.out.println("2. Change information of account");
            System.out.println("3. display list idol");
            System.out.println("4. display list room");
            System.out.println("5. pick idol and room");
            System.out.println("0 . exit");
            Scanner inputChoice =  new Scanner(System.in);
            int choice = inputChoice.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the password you want to change:");
                    Scanner inputPassword =  new Scanner(System.in);
                    String password = inputPassword.nextLine();

            }
    }


        }
    }

