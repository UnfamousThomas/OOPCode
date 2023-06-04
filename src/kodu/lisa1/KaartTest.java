package kodu.lisa1;

import java.util.ArrayList;
import java.util.List;

public class KaartTest {

    public static void main(String[] args) {
        Kaart kaart = new Kaart("K♣");
        List<Kaart> karrdid = new ArrayList<>();
        karrdid.add(kaart);

        Pakk pakk = new Pakk(karrdid);
        pakk.võtaKaart();
        System.out.println(pakk.getKaardid());
    }
}
