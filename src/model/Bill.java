package model;

import model.idol.Idol;
import model.room.Room;

import java.time.LocalDate;
import java.time.LocalTime;

public class Bill {
    private String code;
    private Idol idol;
    private Room room;
    private Customer customer;
    private LocalTime checkin;
    private LocalTime expiryDate;
    private LocalTime checkout;

    public Bill() {
    }

    public Bill(String code, Idol idol, LocalTime checkin, LocalTime checkout) {
        this.code = code;
        this.idol = idol;
        this.checkin = checkin;
        this.expiryDate = checkin.plusHours(2);
        this.checkout = checkout;

    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Idol getIdol() {
        return idol;
    }

    public void setIdol(Idol idol) {
        this.idol = idol;
    }


    public LocalTime getCheckin() {
        return checkin;
    }

    public void setCheckin(LocalTime checkin) {
        this.checkin = checkin;
    }

    public LocalTime getCheckout() {
        return checkout;
    }

    public void setCheckout(LocalTime checkout) {
        this.checkout = checkout;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public double getMoneyOfRoomAndIdol() {
        return (room.getPrice() + idol.getPrice());
    }

    public long getTimeUseService() {
        long time = 0;
        time = checkout.compareTo(checkin);
        return time;
    }

    public double getMoneyToPay() {
        double money = 0;
        if (getTimeUseService() <= 2) {
            money = getMoneyOfRoomAndIdol();
        } else {
            money = getMoneyOfRoomAndIdol() +  getMoneyOfRoomAndIdol()/2 * (getTimeUseService() - 2);
        }
        return money;
    }

    @Override
    public String toString() {
        return "Bill{" +
                "code='" + code + '\'' +
                ", idol=" + idol +
                ", checkin=" + checkin +
                ", checkout=" + checkout +
                '}';
    }
}