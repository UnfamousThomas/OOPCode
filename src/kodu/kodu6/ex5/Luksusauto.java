package kodu.kodu6.ex5;

import java.time.LocalDate;

public class Luksusauto extends Auto {
    private int tootmisAasta;

    public Luksusauto(String omanikuNimi, String autoMudel, boolean kasElektri, int tootmisAasta) {
        super(omanikuNimi, autoMudel, kasElektri);
        this.tootmisAasta = tootmisAasta;
    }
    private int autoVanus() {
        return LocalDate.now().getYear() - tootmisAasta;
    }

    private boolean onVanemKui(int max) {
        return autoVanus() > max;
    }
    @Override
    public double arvutaParanduseMaksumus(double aegTundides) {
        if(onVanemKui(15)) {
            return super.arvutaParanduseMaksumus(aegTundides) * 15;
        } else {
            return super.arvutaParanduseMaksumus(aegTundides) * 10;
        }
    }

    @Override
    public String autoliik() {
        return "Luksusauto";
    }
}
