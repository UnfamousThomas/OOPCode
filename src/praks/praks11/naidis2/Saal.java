package praks.praks11.naidis2;

public class Saal {
    private int number;
    private int kohtadeArv;

    public Saal(int number, int kohtadeArv) {
        this.number = number;
        this.kohtadeArv = kohtadeArv;
    }

    public int getKohtadeArv() {
        return kohtadeArv;
    }

    public int getNumber() {
        return number;
    }
}
