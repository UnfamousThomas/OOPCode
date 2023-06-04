package praks.praks1;

import java.util.Scanner;

public class A9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Mitme arvu summa?");
        int arvuHulk = scanner.nextInt();

        int count = 0;
        double up = 1;
        double sum = 0;
        while(count <= arvuHulk) {
            sum = sum + (up/(up + 2));
            up = up +2;
            count = count + 1;
        }

        System.out.println(sum);
    }
}
