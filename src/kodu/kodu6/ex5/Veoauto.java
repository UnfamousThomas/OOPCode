package kodu.kodu6.ex5;


public class Veoauto extends Auto{
    private boolean onFüüsilineIsik;
    public Veoauto(String omanikuNimi, String autoMudel, boolean kasElektri, boolean onFüüsilineIsik) {
        super(omanikuNimi, autoMudel, kasElektri);
        this.onFüüsilineIsik = onFüüsilineIsik;
    }

    @Override
    public double arvutaParanduseMaksumus(double aegTundides) {
        if(onFüüsilineIsik) {
            return super.arvutaParanduseMaksumus(aegTundides) * 2;
        } else {
            return super.arvutaParanduseMaksumus(aegTundides) * 3;
        }
    }

    @Override
    public String autoliik() {
        return "Veoauto";
    }
}
