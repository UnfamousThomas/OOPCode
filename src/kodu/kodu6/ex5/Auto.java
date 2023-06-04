package kodu.kodu6.ex5;

public class Auto {
    private String omanikuNimi;
    private String autoMudel;
    private boolean kasElektri;

    public Auto(String omanikuNimi, String autoMudel, boolean kasElektri) {
        this.omanikuNimi = omanikuNimi;
        this.autoMudel = autoMudel;
        this.kasElektri = kasElektri;
    }

    public double arvutaParanduseMaksumus(double aegTundides) {
        if(kasElektri) {
            return aegTundides*36;
        } else {
            return aegTundides*40;
        }
    }

    public String autoliik() {
        return "Sõiduauto";
    }

    @Override
    public String toString() {
        return autoliik() + ". Mudel: " + autoMudel + "; Omanik: " + omanikuNimi;
    }
}
