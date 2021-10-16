package model.idol;

import java.util.Scanner;

public class IdolFactory {
    private IdolFactory() {}

    public static final Idol getIdol(IdolType idolType) {
        System.out.println("Enter the stage name of idol:");
        Scanner inputStageName = new Scanner(System.in);
        String stageName = inputStageName.nextLine();
        System.out.println("Enter the dob of idol:");
        Scanner inputDOB = new Scanner(System.in);
        String dOB = inputDOB.nextLine();
        System.out.println("Enter the idol height");
        Scanner inputHeight = new Scanner(System.in);
        double height = inputHeight.nextDouble();
        System.out.println("Enter the Body Measurements");
        Scanner inputBody = new Scanner(System.in);
        String body = inputBody.nextLine();
        switch (idolType) {
            case IDOLA:
                return  new IdolA(stageName, dOB, height, body);
            case IDOLB:
                return new IdolB();
            case IDOLC:
                return new IdolC();
            default:
                 throw new IllegalArgumentException("This idol type is unsupported");
        }
    }
}
