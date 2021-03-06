package model;

import login.Customer;
import login.User;
import model.idol.Idol;
import model.room.Room;

import java.io.Serializable;
import java.time.LocalTime;

public class Bill implements Serializable {
    private String code;
    private Idol idol;
    private Room room;
    private User user;
    private LocalTime checkin;
    private LocalTime expiryDate;
    private LocalTime checkout;

    public Bill() {
    }

    public Bill(String code, Idol idol, Room room, User user, LocalTime checkin) {
        this.user = user;
        this.room = room;
        this.idol = idol;
        this.checkin = checkin;
        this.setExpiryDate(checkin.plusHours(2));
        this.code = code;
    }

    public Bill(Idol idol, Room room, User user, LocalTime checkin) {
        this.idol = idol;
        this.room = room;
        this.user = user;
        this.setExpiryDate(checkin.plusHours(2));
        this.checkin = checkin;
    }

    public String getCode() {
        return code;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public LocalTime getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(LocalTime expiryDate) {
        this.expiryDate = expiryDate;
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


    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public double getMoneyOfRoomAndIdol() {
        return (room.getPrice() + idol.getTip());
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
                ", checkout=" + checkout + getMoneyToPay() +
                '}';
    }
}