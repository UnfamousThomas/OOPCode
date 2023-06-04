package praks.praks9;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class VooSulg {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mis on faili nimi?");
        String failiNimi = scanner.nextLine();
        InputStream baidid = new FileInputStream(failiNimi);
        baidid.close();
        System.out.println("Sisesta nali!");
        System.out.println("haha");
        String nali = scanner.nextLine();

    }
}
