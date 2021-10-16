package model.room;

import model.Customer;
import model.idol.Idol;

public abstract class BaseRoom {

    abstract String getCode();

    abstract void setCode(String code);

    abstract double getPrice();

    abstract void setPrice(double price);

    abstract boolean getStatus();
    abstract void setStatus (boolean status);
}
