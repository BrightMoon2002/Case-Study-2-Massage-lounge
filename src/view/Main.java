package view;

import model.idol.Idol;
import model.idol.IdolA;
import model.idol.IdolFactory;
import model.idol.IdolType;

public class Main {
    public static void main(String[] args) {
        Idol idolA = IdolFactory.getIdol(IdolType.IDOLA);
        idolA.setStageName("Akira");
        idolA.setdOB("1992");
        idolA.setBodyMeasurements("90-60-90");
        System.out.println(idolA);
    }
}
