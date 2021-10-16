package model.idol;

public class IdolC extends Idol{
    public IdolC() {
        super();
    }

    public IdolC(String stageName, String dOB, double height, String bodyMeasurements, String service, double price, boolean status, int countChecker) {
        super(stageName, dOB, height, bodyMeasurements, service, price, status, countChecker);
    }

    public IdolC(String stageName, String dOB, double height, String bodyMeasurement) {
        super(stageName, dOB, height, bodyMeasurement);
        this.setPrice(200);
        this.setService("Hj");
        super.setCountChecker(0);
        super.setStatus(false);
    }

    @Override
    public String getStageName() {
        return super.getStageName();
    }

    @Override
    public void setStageName(String stageName) {
        super.setStageName(stageName);
    }

    @Override
    public String getdOB() {
        return super.getdOB();
    }

    @Override
    public void setdOB(String dOB) {
        super.setdOB(dOB);
    }

    @Override
    public double getHeight() {
        return super.getHeight();
    }

    @Override
    public void setHeight(double height) {
        super.setHeight(height);
    }

    @Override
    public String getBodyMeasurements() {
        return super.getBodyMeasurements();
    }

    @Override
    public void setBodyMeasurements(String bodyMeasurements) {
        super.setBodyMeasurements(bodyMeasurements);
    }

    @Override
    public String getService() {
        return super.getService();
    }

    @Override
    public void setService(String service) {
        super.setService(service);
    }

    @Override
    public double getPrice() {
        return super.getPrice();
    }

    @Override
    public void setPrice(double price) {
        super.setPrice(price);
    }

    @Override
    public boolean isStatus() {
        return super.isStatus();
    }

    @Override
    public void setStatus(boolean status) {
        super.setStatus(status);
    }

    @Override
    public int getCountChecker() {
        return super.getCountChecker();
    }

    @Override
    public void setCountChecker(int countChecker) {
        super.setCountChecker(countChecker);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
