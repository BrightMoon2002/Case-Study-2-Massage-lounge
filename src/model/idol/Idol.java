package model.idol;

public abstract class Idol {
    private String name;

    private String dOB;
    private double height;
    private String bodyMeasurements;
    private int rateService;
    private double price;
    private boolean status;

    public Idol(String name, String dOB, double height, String bodyMeasurements, int rateService, double price, boolean status) {
        this.name = name;
        this.dOB = dOB;
        this.height = height;
        this.bodyMeasurements = bodyMeasurements;
        this.rateService = rateService;
        this.price = price;
        this.status = status;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Idol() {
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDOB() {
        return dOB;
    }

    public void setDOB(String dOB) {
        this.dOB = dOB;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getBodyMeasurements() {
        return bodyMeasurements;
    }

    public void setBodyMeasurements(String bodyMeasurements) {
        this.bodyMeasurements = bodyMeasurements;
    }

    public int getRateService() {
        return rateService;
    }

    public void setRateService(int rateService) {
        this.rateService = rateService;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    @Override
    public String toString() {
        return "IdolManager{" +
                "name='" + name + '\'' +
                ", dOB='" + dOB + '\'' +
                ", height=" + height +
                ", bodyMeasurements='" + bodyMeasurements + '\'' +
                ", rateService=" + rateService +
                ", price=" + price +
                '}';
    }
}
