package praks.praks6;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

public abstract class Teos implements Comparable<Teos> {
    private String teoseKirjeldus;
    private String teoseTähis;
    private String laenutaja;
    private int päevadeArv;

    public Teos(String teoseKirjeldus, String teoseTähis, String laenutaja, int päevadeArv) {
        this.teoseKirjeldus = teoseKirjeldus;
        this.teoseTähis = teoseTähis;
        this.laenutaja = laenutaja;
        this.päevadeArv = päevadeArv;
    }

    public abstract boolean kasHoidlast();

    public int laenutusaeg() {
        if(teoseTähis.equals("roheline")) {
            return 1;
        }
        if(teoseTähis.equals("kollane")) {
            return 30;
        }
        if(teoseTähis.equals("sinine")) {
            return 60;
        }
        if(teoseTähis.equals("puudub")) {
            return 14;
        }

        return 0;

    }


    public double päevaneViivis() {
        int aeg = laenutusaeg();
        if(aeg == 30 || aeg==60) return 0.05;
        if(aeg == 14) return 0.15;
        if(aeg == 1) return 2;

        return 0;
    }

    public String getTeoseTähis() {
        return teoseTähis;
    }

    public void arvutaViivis(Kontrollija kontrollija) {
        if(päevadeArv > laenutusaeg()) kontrollija.salvestaViivis(laenutaja, teoseKirjeldus, päevaneViivis() * päevadeArv);
    }

    @Override
    public String toString() {
        return laenutaja + "; " + teoseTähis + "; " + teoseKirjeldus + "; " +kasHoidlast() + "; " + päevadeArv;
    }

    @Override
    public int compareTo(@NotNull Teos o) {
        return teoseKirjeldus.compareTo(o.teoseKirjeldus);
    }


}
