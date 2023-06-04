package kodu.kodu10;

import java.util.Scanner;

/**
 * @author thomp (17/04/2023)
 */
public class Korrutaja {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        kusiArv(scanner);
    }

    private static void kusiArv(Scanner scanner) {
        System.out.println("Sisesta uus arv (võib olla ka String)");
        try {
            Integer arv = Integer.parseInt(scanner.nextLine());
            System.out.println(arv * 2);
            scanner.close(); //Siin pole vaja aga teen et ära ei unustaks tulevikus. Muidu hoiab Java mälus seda.
        } catch (NumberFormatException e) {
            kusiArv(scanner);
        }
    }
}
