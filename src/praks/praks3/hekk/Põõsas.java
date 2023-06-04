package praks.praks3.hekk;

public class Põõsas {
    private double kõrgus;
    private double laius;

    public Põõsas(double kõrgus, double laius) {
        this.kõrgus = kõrgus;
        this.laius = laius;
    }

    public double getKõrgus() {
        return kõrgus;
    }

    public void setKõrgus(double kõrgus) {
        this.kõrgus = kõrgus;
    }

    public double getLaius() {
        return laius;
    }

    public void setLaius(double laius) {
        this.laius = laius;
    }

    public double kõrgusPrognoos() {
        double rand = Math.random() + (0.1-0) + 0;
        return getKõrgus()*rand;
    }

    @Override
    public String toString() {
        return "Põõsas{" +
                "kõrgus=" + kõrgus +
                ", laius=" + laius + ", Juurdekasv: " + kõrgusPrognoos()
                + "};";
    }
}
