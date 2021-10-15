package model;

import model.idol.Idol;

import java.time.LocalDate;

public class Bill {
    private String code;
    private Idol idol;
    private double money;
    private LocalDate checkin;
    private LocalDate checkout;

    public Bill() {
    }

    public Bill(String code, Idol idol, double money, LocalDate checkin, LocalDate checkout) {
        this.code = code;
        this.idol = idol;
        this.money = money;
        this.checkin = checkin;
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

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public LocalDate getCheckin() {
        return checkin;
    }

    public void setCheckin(LocalDate checkin) {
        this.checkin = checkin;
    }

    public LocalDate getCheckout() {
        return checkout;
    }

    public void setCheckout(LocalDate checkout) {
        this.checkout = checkout;
    }

    @Override
    public String toString() {
        return "Bill{" +
                "code='" + code + '\'' +
                ", idol=" + idol +
                ", money=" + money +
                ", checkin=" + checkin +
                ", checkout=" + checkout +
                '}';
    }
}
