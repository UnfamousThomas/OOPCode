package kodu.kodu9;

public class AineHinne {

    private String nimetus;
    private char hinne;

    public AineHinne(String nimetus, char hinne) {
        this.nimetus = nimetus;
        this.hinne = hinne;
    }

    public AineHinne(String nimetus, String[] punktid) {
        this.nimetus = nimetus;
        this.hinne = hinnePunktideMassiivist(punktid);
    }

    public String getNimetus() {
        return nimetus;
    }

    public char getHinne() {
        return hinne;
    }

    @Override
    public String toString() {
        return getNimetus() + ":" + getHinne();
    }

    private char hinnePunktideMassiivist(String[] punktid) {
        int summa = 0;
        for (String s : punktid) {
            summa += Double.parseDouble(s);
        }

        if(summa > 90) return 'A';
        if(summa > 80) return 'B';
        if(summa > 70) return 'C';
        if(summa > 60) return 'D';
        if (summa >= 51) return 'E';
        return 'F';
    }
}
