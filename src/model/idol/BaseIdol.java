package model.idol;

public abstract class BaseIdol {

    abstract String getStageName();
    abstract void setStageName(String stageName);
    abstract String getdOB();
    abstract void setdOB(String dOB);
    abstract double getHeight();

    abstract void setHeight(double height);

    abstract String getBodyMeasurements();

    abstract void setBodyMeasurements(String bodyMeasurements);

    abstract String getService();

    abstract void setService(String service);

    abstract public double getPrice();

    abstract void setPrice(double price);

    abstract boolean isStatus();

    abstract void setStatus(boolean status);

    abstract int getCountChecker();

    abstract void setCountChecker(int countChecker);
}
