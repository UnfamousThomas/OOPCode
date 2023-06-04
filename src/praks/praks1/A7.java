package praks.praks1;

import java.util.Scanner;

public class A7 {
  public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int sisestatud = 1;
	while(sisestatud != 0) {
		System.out.print("Sisesta täisarv.");
		sisestatud = scanner.nextInt();

		if(sisestatud != 0) {
			int jaak = sisestatud % 2;
			if (jaak == 0) {
				System.out.println("Tegu on paarisarvuga!");
			} else {
				System.out.println("Tegu on paarituarvuga!");
			}
		}
	}
	System.out.println("Tsauu!");
}
}