package praks.praks10.ul1;//package kodu.kodu9;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class KopeeriFail {

    private static void kopeeri(String algne, String koopia) throws IOException {
        // sulgudes semikoolonit kasutades saab mitu faili avada
        InputStream sisse = null;
        OutputStream välja = null;
        try {
            sisse = new FileInputStream(algne);
            välja = new FileOutputStream(koopia);
            byte[] puhver = new byte[1024];
            int loetud = sisse.read(puhver);
            while (loetud > 0) {
                välja.write(puhver, 0, loetud); // ainult andmetega täidetud osa!
                loetud = sisse.read(puhver); // loeme järgmise tüki
            }
        } finally {
                sisse.close();
                välja.close();
        }
    }

    public static void main(String[] args) throws Exception {
        if (args.length != 1) {
            System.out.println("Kas sa andsid käsurealt faili nime?");
            System.exit(1);
        }
        File file = new File(args[0]);
        if(file.isDirectory()) {
            System.out.println("Tegu on kaustaga.");
            System.exit(1);
        } else {
            Date date = new Date(file.lastModified());
            SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
            System.out.println(args[0] + " : " + file.length() + " bytes  : " + format.format(date));
        }
        kopeeri(args[0], args[0] + ".copy");
    }
}