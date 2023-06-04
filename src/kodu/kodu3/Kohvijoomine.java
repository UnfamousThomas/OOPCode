package kodu.kodu3;

public class Kohvijoomine {

    public static void main(String[] args) {
        Kohv kohv1 = new Kohv("Capucino", 1.78);
        Kohv kohv2 = new Kohv("Americana", 2.67);

        Programmeerija programmeerija1 = new Programmeerija("Madis", 10);
        Programmeerija programmeerija2 = new Programmeerija("Thomas", 100, 1, kohv1);
        Programmeerija programmeerija3 = new Programmeerija("Karl", 10000, 10, kohv2);

        prindiProge(programmeerija1);
        prindiProge(programmeerija2);
        prindiProge(programmeerija3);

        updateProge(programmeerija1);
        updateProge(programmeerija2);
        updateProge(programmeerija3);

        prindiProge(programmeerija1);
        prindiProge(programmeerija2);
        prindiProge(programmeerija3);
    }

    private static void prindiProge(Programmeerija programmeerija) {
        System.out.println(programmeerija);
    }

    private static void updateProge(Programmeerija programmeerija) {
        if(programmeerija.kasJoobKohvi()) {
            programmeerija.setTasseKohvi(programmeerija.getTasseKohvi() + 3);
            programmeerija.setRiduKoodi(programmeerija.getRiduKoodi() * 2);
        } else {
            programmeerija.setTasseKohvi(0);
            programmeerija.setRiduKoodi(programmeerija.getRiduKoodi() + 100);
        }
    }
}
