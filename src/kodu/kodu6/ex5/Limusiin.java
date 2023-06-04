package kodu.kodu6.ex5;

public class Limusiin extends Luksusauto{

    public Limusiin(String omanikuNimi, String autoMudel, boolean kasElektri, int tootmisAasta) {
        super(omanikuNimi, autoMudel, kasElektri, tootmisAasta);
    }

    @Override
    public double arvutaParanduseMaksumus(double aegTundides) {
        return super.arvutaParanduseMaksumus(aegTundides) * 1.5;
    }

    @Override
    public String autoliik() {
        return "Limusiin";
    }
}
