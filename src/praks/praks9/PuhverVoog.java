package praks.praks9;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class PuhverVoog {
    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sisesta sone: ");
        String sone = scanner.nextLine();
        scanner.close();

        OutputStream baidid = new FileOutputStream("sone.txt");
        OutputStreamWriter tekst = new OutputStreamWriter(baidid, StandardCharsets.UTF_8);
        BufferedWriter puhverdatudKirj = new BufferedWriter(tekst);
        puhverdatudKirj.write(sone);

        InputStream baidid2 = new FileInputStream("sone.txt");
        InputStreamReader tekst2 = new InputStreamReader(baidid2, StandardCharsets.UTF_8);
        BufferedReader puhverdatudLug = new BufferedReader(tekst2);
        String rida = puhverdatudLug.readLine();
        while(rida != null) {
            System.out.println(rida);
            rida = puhverdatudLug.readLine();
        }
        puhverdatudLug.close();
    }
}
