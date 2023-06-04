package praks.praks3.staatilinesegadus;

public class Isik {
    private String nimi;
    private double pikkus;

    public Isik(String isikuNimi, double isikuPikkus) {
        nimi = isikuNimi;
        pikkus = isikuPikkus;
    }

    public int suusakepiPikkus() {
        return (int) Math.round(0.85 * pikkus * 100);
    }

    public static void main(String[] args) {
        Isik isik = new Isik("Mari", 2.83);
        System.out.println("suusakepi pikkus on " + isik.suusakepiPikkus());
    }
}