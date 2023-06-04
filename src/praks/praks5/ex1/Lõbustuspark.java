package praks.praks5.ex1;

import java.util.List;

public class Lõbustuspark {
    private List<Lõbustus> lõbustused;


    public Lõbustuspark(List<Lõbustus> lõbustused) {
        this.lõbustused = lõbustused;
    }

    public void alustaSeiklust(Külastaja külastaja) {
        System.out.println("Alustan seiklust.");
        for (Lõbustus lõbustus : lõbustused) {
            lõbustus.lõbusta(külastaja);
        }
        for (String s : külastaja.kõikKirjeldused()) {
            System.out.println(s);
        }
        System.out.println("Rahaline kulu: " + külastaja.kuludeSumma());
    }
}
