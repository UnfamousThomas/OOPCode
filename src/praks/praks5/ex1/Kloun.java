package praks.praks5.ex1;


public class Kloun {
    private String nimi;
    public Kloun(String nimi) {
        this.nimi = nimi;
    }
    public void esine(Külastaja külastaja) {
        külastaja.lisaKirjeldus("nägin klouni nimega " + nimi);
    }
}
