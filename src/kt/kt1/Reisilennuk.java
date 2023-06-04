package kt.kt1;

public class Reisilennuk extends Lennuk{

    private int saabunudReisijad;
    private int väljuvadReisijad;

    public Reisilennuk(String registriNumber, int saabunudReisijad, int väljuvadReisijad) {
        super(registriNumber);
        this.saabunudReisijad = saabunudReisijad;
        this.väljuvadReisijad = väljuvadReisijad;

    }

    @Override
    public double lennujaamamaks() {
        return (saabunudReisijad * 6.5) + (väljuvadReisijad * 5);
    }

    @Override
    public String toString() {
        return "Reisilennuk: " + super.toString();
    }
}
