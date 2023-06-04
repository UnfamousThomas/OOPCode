package kodu.kodu6.ex5;

public class TestAuto {

    public static void main(String[] args) {
        Auto auto = new Auto("Peeter Paanika", "Audi A4 Avant", false);
        System.out.println(auto.arvutaParanduseMaksumus(2.5));
    }
}
