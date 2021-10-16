package model.idol;

public class IdolA extends Idol{



    public IdolA() {
    }

    public IdolA(String stageName, String dOB, double height, String bodyMeasurements, String service, double price, boolean status, int countChecker) {
        super(stageName, dOB, height, bodyMeasurements, service, price, status, countChecker);
    }

    public IdolA(String stageName, String dOB, double height, String bodyMeasurements) {
        super(stageName, dOB, height, bodyMeasurements);
        super.setService("Full Service");
        super.setTip(500);
        super.setStatus(false);
        super.setCountChecker(0);
    }


}
