package model.room;

import model.Customer;
import model.idol.Idol;

public abstract class Room extends BaseRoom {
    private Customer customer;
    private Idol idol;
    private String code;
    private double price;

    public Room(Customer customer, Idol idol, String code) {
        this.customer = customer;
        this.idol = idol;
        this.code = code;
    }

    public Room() {
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Idol getIdol() {
        return idol;
    }

    public void setIdol(Idol idol) {
        this.idol = idol;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    double getPrice() {
        return 0;
    }

    @Override
    void setPrice(double price) {

    }

    @Override
    public String toString() {
        return "Room{" +
                "customer=" + customer +
                ", idol=" + idol +
                ", code='" + code + '\'' +
                '}';
    }
}
