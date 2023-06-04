package praks.praks5.ex1;

public class VanuseKontrollija implements Lõbustus{
    private int nõutudVanus;
    Lõbustus delegaat;

    public VanuseKontrollija(int nõutudVanus, Lõbustus delegaat) {
        this.nõutudVanus = nõutudVanus;
        this.delegaat = delegaat;
    }
    @Override
    public void lõbusta(Külastaja külastaja) {
        if(külastaja.getVanus() < nõutudVanus) {
            külastaja.lisaKirjeldus("külastaja ei läbinud vanusekontrolli.");
            return;
        }
        delegaat.lõbusta(külastaja);
    }
}
