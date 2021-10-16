package model.idol;

public class Idol extends BaseIdol {
    private String stageName;
    private String dOB;
    private double height;
    private String bodyMeasurements;
    private String service;
    private double tip;
    private boolean status;
    private int countChecker;

    public Idol() {
    }

    public Idol(String stageName, String dOB, double height, String bodyMeasurements, String service, double tip, boolean status, int countChecker) {
        this.stageName = stageName;
        this.dOB = dOB;
        this.height = height;
        this.bodyMeasurements = bodyMeasurements;
        this.service = service;
        this.tip = tip;
        this.status = status;
        this.countChecker = countChecker;
    }

    public Idol(String stageName, String dOB, double height, String bodyMeasurement) {
        this.stageName = stageName;
        this.dOB = dOB;
        this.height = height;
        this.bodyMeasurements = bodyMeasurement;

    }

    public String getStageName() {
        return stageName;
    }

    public void setStageName(String stageName) {
        this.stageName = stageName;
    }

    public String getdOB() {
        return dOB;
    }

    public void setdOB(String dOB) {
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

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public double getTip() {
        return tip;
    }

    public void setTip(double Tip) {
        this.tip = tip;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getCountChecker() {
        return countChecker;
    }

    public void setCountChecker(int countChecker) {
        this.countChecker = countChecker;
    }

    @Override
    public String toString() {
        return "Idol{" +
                "stageName='" + stageName + '\'' +
                ", dOB='" + dOB + '\'' +
                ", height=" + height +
                ", bodyMeasurements='" + bodyMeasurements + '\'' +
                ", service='" + service + '\'' +
                ", price=" + tip +
                ", status=" + status +
                ", countChecker=" + countChecker +
                '}';
    }
}
