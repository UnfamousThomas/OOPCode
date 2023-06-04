package praks.praks5.ex1;

public class TasulineLõbustus implements Lõbustus{
    Lõbustus delegaat;
    double hind;
    public TasulineLõbustus(double hind, Lõbustus delegaat) {
        this.hind = hind;
        this.delegaat = delegaat;
    }
    @Override
    public void lõbusta(Külastaja külastaja) {
        delegaat.lõbusta(külastaja);
        külastaja.lisaKulu(hind);
        System.out.println("Tasusin külastuse eest " + hind);
    }
}
