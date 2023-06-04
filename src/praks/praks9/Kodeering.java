package praks.praks9;

import kodu.kodu9.AineHinne;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.util.Scanner;

public class Kodeering {
    public static void main(String[] args) throws Exception {
        System.out.println(Charset.defaultCharset());
        String txt = "Andje käsi väsis ärä, võtje käsi ei väsi kunagi";

        try {
            PrintWriter pw = new PrintWriter("fail.txt", Charset.forName("windows-1257"));
            pw.println(txt);
            pw.close();

            Scanner scanner = new Scanner(new File("fail.txt"));
            while(scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
