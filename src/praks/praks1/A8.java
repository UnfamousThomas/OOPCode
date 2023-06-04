package praks.praks1;

import java.util.Scanner;

public class A8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Sisesta algus kg:");
        int algusKg = scanner.nextInt();

        System.out.println("Sisesta kg samm: ");
        int sammKg = scanner.nextInt();

        System.out.println("Sisesta lõpp kg:");
        int loppKg = scanner.nextInt();
        System.out.println("Kg"+"\t"+"Nael");
        while(algusKg <= loppKg) {
            System.out.print(algusKg +"\t");
            double nael = algusKg * 2.2;
            System.out.printf("%.1f", nael);
            System.out.println("");
            algusKg = algusKg + sammKg;
        }
    }
}
