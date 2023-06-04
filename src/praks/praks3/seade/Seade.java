package praks.praks3.seade;

public class Seade {
    private int kood;
    private String nimetus;
    private double kaibemaksutaHind;
    private static double käibemaksuProtsent = 20;

    public Seade(int kood, String nimetus, double kaibeMaksutaHind) {
        this.kood = kood;
        this.nimetus = nimetus;
        this.kaibemaksutaHind = kaibeMaksutaHind;
    }

    public double getKaibemaksutaHind() {
        return kaibemaksutaHind;
    }

    public static double getKäibemaksuProtsent() {
        return käibemaksuProtsent;
    }

    public int getKood() {
        return kood;
    }

    public String getNimetus() {
        return nimetus;
    }

    public void setKaibemaksutaHind(double kaibemaksutaHind) {
        this.kaibemaksutaHind = kaibemaksutaHind;
    }

    public void setKood(int kood) {
        this.kood = kood;
    }

    public void setNimetus(String nimetus) {
        this.nimetus = nimetus;
    }

    public static void setKäibemaksuProtsent(double käibemaksuProtsent) {
        Seade.käibemaksuProtsent = käibemaksuProtsent;
    }

    public double kmhind() {
        return getKaibemaksutaHind() + (getKaibemaksutaHind()/100)*getKäibemaksuProtsent();
    }

    @Override
    public String toString() {
        return "Kood: " + getKood() + "; Nimi: " + getNimetus() + "; Algne hind: " + getKaibemaksutaHind() + "; Lõpphind: " + kmhind();
    }
}
