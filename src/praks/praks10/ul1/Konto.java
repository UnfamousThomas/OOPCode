package praks.praks10.ul1;

public class Konto {
    private String omanikuNimi;
    private double rahaSumma;
    public Konto(String nimi, double rahaSumma) {
        setRahaSumma(rahaSumma);
        setOmanikuNimi(nimi);
    }
    public void setRahaSumma(double rahaSumma) {
        if(rahaSumma < 0) throw new NegatiivneSummaErind(rahaSumma);
        this.rahaSumma = rahaSumma;
    }

    public void setOmanikuNimi(String omanikuNimi) {
        this.omanikuNimi = omanikuNimi;
    }

    public void osta(double maksumus) {
        if(rahaSumma < maksumus) throw new RahaEiJätkuErind();

        rahaSumma = rahaSumma-maksumus;
    }

    public void paneJuurde(double raha) {
        setRahaSumma(rahaSumma + raha);
    }
    @Override
    public String toString() {
        return omanikuNimi + ": " + rahaSumma;
    }
}
