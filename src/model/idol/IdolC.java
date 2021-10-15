package model.idol;

public class IdolC extends Idol{
    public IdolC(String name, String dOB, double height, String bodyMeasurements, int rateService, double price, boolean status) {
        super(name, dOB, height, bodyMeasurements, rateService, price, status);
    }

    @Override
    public boolean isStatus() {
        return super.isStatus();
    }

    @Override
    public void setStatus(boolean status) {
        super.setStatus(status);
    }

    public IdolC() {
        super();
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
    public String getDOB() {
        return super.getDOB();
    }

    @Override
    public void setDOB(String dOB) {
        super.setDOB(dOB);
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
    public int getRateService() {
        return super.getRateService();
    }

    @Override
    public void setRateService(int rateService) {
        super.setRateService(rateService);
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
    public String toString() {
        return super.toString();
    }
}
