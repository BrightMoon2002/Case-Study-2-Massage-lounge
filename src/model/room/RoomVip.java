package model.room;

import model.Customer;
import model.idol.Idol;

public class RoomVip extends Room{
    public RoomVip(Customer customer, Idol idol, String code) {
        super(customer, idol, code);
    }
}
