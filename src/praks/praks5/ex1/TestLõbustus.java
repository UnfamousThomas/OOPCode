package praks.praks5.ex1;

import java.util.ArrayList;
import java.util.List;

public class TestLõbustus {


    public static void main(String[] args) {
        Vaateratas vaateratas = new Vaateratas();
        Lasketiir lasketiir = new Lasketiir();
        Kloun kloun = new Kloun("Peeter");
        LõbustavKloun lobKloun = new LõbustavKloun(kloun);
        List<Lõbustus> lõbustused = new ArrayList<>();
        TasulineLõbustus tasulineLõbustus1 = new TasulineLõbustus(1.5, lasketiir);
        VanuseKontrollija vanuseKontrollija = new VanuseKontrollija(10, tasulineLõbustus1);
        //Koodi jooksmis järjekord muutuks, hetkel me lisame kõigepealt kulud, siis kontrollime vanust.
        //Kui me muudaks mis delegeerib mida, siis (eeldades et me oleme kõike õigesti muutnud ja erroreid ei teki)
        //Muutuks järjekord kuidas lõbusta() ja teisi meetodeid jooksutame
        // Näiteks, hetkel on vanus-> tasu -> lasketiir aga kui oleks tasu -> vanus -> lasketiir siis me lisaks tasu ennem kui kontrolliks
        // vanust

        //ehk kokkuvõttes: Kui tasu on ennem vanust siis panna tasu juurde, isegi siis kui ei saa vanusekontrollist läbi.
        lõbustused.add(vanuseKontrollija);
        lõbustused.add(vaateratas);
        lõbustused.add(lobKloun);
        Lõbustuspark lõbustuspark = new Lõbustuspark(lõbustused);
        Külastaja külastaja = new Külastaja(9);
        Külastaja külastaja2 = new Külastaja(11);
        lõbustuspark.alustaSeiklust(külastaja);
        lõbustuspark.alustaSeiklust(külastaja2);
    }
}
