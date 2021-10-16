package view;

import model.idol.Idol;
import model.idol.IdolA;
import model.idol.IdolFactory;
import model.idol.IdolType;

public class Main {
    public static void main(String[] args) {
        Idol idolA = IdolFactory.getIdol(IdolType.IDOLA);
        Idol idolB = IdolFactory.getIdol(IdolType.IDOLB);
        Idol idolC = IdolFactory.getIdol(IdolType.IDOLC);
        System.out.println(idolA);
        System.out.println(idolB);
        System.out.println(idolC);
    }
}
