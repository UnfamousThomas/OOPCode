package praks.praks10.ul1;

import java.util.Scanner;

public class ArvuLugejaTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArvuLugeja arvuLugeja = new ArvuLugeja();
        while(true) {
            String sisestatud = scanner.nextLine();
            try {
                arvuLugeja.tagastaMasiiv(sisestatud);
            } catch (NumberFormatException e) {
                if(e instanceof TühjaArvuErind) {
                   // so
                }
            }
        }
    }
}
