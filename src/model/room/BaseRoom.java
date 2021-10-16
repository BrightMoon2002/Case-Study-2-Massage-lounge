package model.room;

import model.Customer;
import model.idol.Idol;

public abstract class BaseRoom {
    abstract Customer getCustomer();

    abstract void setCustomer(Customer customer);

    abstract Idol getIdol();

    abstract void setIdol(Idol idol);

    abstract String getCode();

    abstract void setCode(String code);

    abstract double getPrice();

    abstract void setPrice(double price);
}
