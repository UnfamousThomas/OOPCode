package praks.praks10.ul1.pitsa;

public class Pitsa {
    private String nimetus;
    private double hind;
    public Pitsa(String nimetus, double hind) {
        this.nimetus = nimetus;
        this.hind = hind;
    }

    public double getHind() {
        return hind;
    }

    public String getNimetus() {
        return nimetus;
    }

    @Override
    public String toString() {
        return getNimetus() + ": " + getHind();
    }
}
