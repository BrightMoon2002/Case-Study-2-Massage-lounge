package view;

import model.idol.Idol;
import model.idol.IdolA;

public class Main {
    public static void main(String[] args) {
        Idol idolA = new IdolA("Akira", "1992", 175, "90-60-90", false, 0);
        System.out.println(idolA);
    }
}
