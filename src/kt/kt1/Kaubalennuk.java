package kt.kt1;

public class Kaubalennuk extends Lennuk{

    private double kaubaKaal;
    public Kaubalennuk(String registriNumber, double kaal) {
        super(registriNumber);
        this.kaubaKaal = kaal;
    }

    @Override
    public double lennujaamamaks() {
        return kaubaKaal * 250;
    }

    @Override
    public String toString() {
        return "Kauba Lennuk: " + super.toString();
    }
}
