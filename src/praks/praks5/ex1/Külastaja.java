package praks.praks5.ex1;

import java.util.ArrayList;
import java.util.List;

public class Külastaja {

    private List<String> külastuseKirjeldused;
    private int vanus = 0;
    private double kulud = 0;
    public Külastaja() {
        this.külastuseKirjeldused = new ArrayList<>();
    }

    public Külastaja(int vanus) {
        this.külastuseKirjeldused = new ArrayList<>();
        this.vanus = vanus;
    }

    public int getVanus() {
        return vanus;
    }


    public void lisaKirjeldus(String kirjeldus) {
        külastuseKirjeldused.add(kirjeldus);
    }

    public List<String> kõikKirjeldused() {
        return this.külastuseKirjeldused;
    }

    public void lisaKulu(double kulu) {
        this.kulud = this.kulud + kulu;
    }

    public double kuludeSumma() {
        return this.kulud;
    }
}
