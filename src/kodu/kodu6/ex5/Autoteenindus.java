package kodu.kodu6.ex5;

public class Autoteenindus {
    private int parandatudArv;
    private double teenitudTulu;

    public void paranda(Auto auto, double aegTundides) {
        double maksumus = auto.arvutaParanduseMaksumus(aegTundides);
        System.out.println(auto + "; Aeg: " + aegTundides + "; Kulu: " + maksumus);
        teenitudTulu = teenitudTulu + maksumus;
        parandatudArv = parandatudArv + 1;
    }

    @Override
    public String toString() {
        return "Teenindatud autosid on " + parandatudArv + ". Selle eest teenisime " + teenitudTulu;
    }
}
