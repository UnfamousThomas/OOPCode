package kodu.kodu11;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author thomp (24/04/2023)
 */
public class Pidu {
    public static void main(String[] args) throws IOException {

        File file = new File(args[0]);
        Scanner scanner = new Scanner(file);
        Map<String, String> nimed = new HashMap<>();
        while(scanner.hasNext()) {
            String rida = scanner.nextLine();
            String[] sonad = rida.split(" ");
            //kõigepealt kes kutsuti siis kes kutsus
            nimed.put(sonad[1], sonad[0]);
        }
        String otsitav = args[1];

        while(true) {
            if(nimed.containsKey(otsitav)) {
                otsitav = nimed.get(otsitav);
            } else break;
        }
        System.out.println(otsitav);
    }
}
