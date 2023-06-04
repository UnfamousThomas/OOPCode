package praks.praks3.reisid;

public class Lennuk {

    private String nimi;
    private double keskKiirus;
    private int maxReisjad;

    public Lennuk(String nimi, double keskKiirus, int maxReisjad) {
        this.nimi = nimi;
        this.keskKiirus = keskKiirus;
        this.maxReisjad = maxReisjad;
    }

    public String getNimi() {
        return nimi;
    }

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    public double getKeskKiirus() {
        return keskKiirus;
    }

    public void setKeskKiirus(double keskKiirus) {
        this.keskKiirus = keskKiirus;
    }

    public int getMaxReisjad() {
        return maxReisjad;
    }

    public void setMaxReisjad(int maxReisjad) {
        this.maxReisjad = maxReisjad;
    }

    @Override
    public String toString() {
        return "Nimi:'" + nimi + '\'' +
                ", keskKiirus: " + keskKiirus +
                ", maxReisjad:" + maxReisjad + ";";
    }
}
