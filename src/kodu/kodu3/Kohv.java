package kodu.kodu3;

public class Kohv {

    public Kohv(String kohvisort, double hind) {
        this.kohvisort = kohvisort;
        this.hind = hind;
    }
    private String kohvisort;
    private double hind;

    public double getHind() {
        return hind;
    }

    public String getKohvisort() {
        return kohvisort;
    }

    public double tassideMaksumus(int tasside) {
        return tasside * getHind();
    }
}
