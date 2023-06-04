package praks.praks5.ex1;

public class LõbustavKloun implements Lõbustus{
    private Kloun kloun;

    public LõbustavKloun(Kloun kloun) {
        this.kloun = kloun;
    }
    @Override
    public void lõbusta(Külastaja külastaja) {
        kloun.esine(külastaja);
    }
}
