package kodu.kodu2;

public class A7 {

    public static void main(String[] args) {
        String eesnimi = args[0];
        int pikkus = Integer.valueOf(args[1]);
        int kehamass = Integer.valueOf(args[2]);

        float indeks = kehamass / (pikkus * pikkus);
        String prefix = eesnimi + ", ";
        if(indeks < 16) {
            System.out.println(prefix + "SÖÖ KIIRESTI. SA OLED SUREMAS.");
        }
        else if(indeks < 18.6) {
            System.out.println(prefix + "Söö, oled liiga kõhn!");
        }
        else if(indeks < 25.1) {
            System.out.println(prefix + "Hästi tehtud, normaalne kaal ja pikkus!");
        }
        else if(indeks < 40) {
            System.out.println(prefix + "Oled paks!");
        }
        else if(indeks > 40) {
            System.out.println(prefix + "Oled väga paks! Sa kiiresti kõhnemaks.");
        }

    }
}
