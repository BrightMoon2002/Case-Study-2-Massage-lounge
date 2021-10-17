package model.room;

import model.Customer;
import model.idol.Idol;

import java.io.Serializable;

public abstract class Room extends BaseRoom implements Serializable {

    private String code;
    private double price;
    private boolean status;

    public Room(String code, double price, boolean status) {
        this.code = code;
        this.price = price;
        this.status = status;
    }

    public Room() {
    }

    public Room(String code) {
        this.code = code;
    }

    @Override
    public String getCode() {
        return code;
    }

    @Override
    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isStatus() {
        return status;
    }

    @Override
    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Room{" +
                "code='" + code + '\'' +
                ", price=" + price +
                ", status=" + status +
                "} ";
    }
}
