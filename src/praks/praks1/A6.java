package praks.praks1;

import java.util.Scanner;

public class A6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sisesta arv1: ");
        double arv1 = scanner.nextDouble();
        System.out.println("Sisesta arv2: ");
        double arv2 = scanner.nextDouble();
        System.out.println("Sisesta arv3: ");
        double arv3 = scanner.nextDouble();
        boolean kolmnurk = false;
        if(arv1 + arv2 > arv3) {
            if(arv2 + arv3 > arv1) {
                if(arv1 + arv3 > arv2) {
                    System.out.println("Tegu on kolmnurgaga!");
                    kolmnurk = true;
                }
            }
        }

        if(!kolmnurk) System.out.println("Tegu ei ole kolmnurgaga.");
    }
}
