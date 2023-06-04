package kt.kt1;


public abstract class Lennuk implements Comparable<Lennuk>{
    private String registriNumber;
    public Lennuk(String registriNumber) {
        this.registriNumber = registriNumber;
    }

    public abstract double lennujaamamaks();

    @Override
    public String toString() {
        return registriNumber + " - " + lennujaamamaks();
    }

    @Override
    public int compareTo(Lennuk o) {
        return Double.compare(lennujaamamaks(), o.lennujaamamaks());
    }
}
