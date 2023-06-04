package kodu.kodu10;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/**
 * @author thomp (17/04/2023)
 */
public class HelloWorldFaili {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sisesta failinimi!");
        String failiNimi = scanner.nextLine();
        scanner.close();

        try (OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(failiNimi), StandardCharsets.UTF_8);
             BufferedWriter bf = new BufferedWriter(osw)) {
            bf.write("Hello World!"); //Ei tööta ilma closei v try-with-resources sest et close() "flushib characterid" mis on Buffered puhul oluline, sest see hoiab neid selle hetkeni seal ja mitte failis kui kirjutatakse
        } catch (IOException e) {
            System.out.println("Midagi läks valesti!");
        }
    }
}
