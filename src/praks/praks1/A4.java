package praks.praks1;

public class A4 {
  public static void main(String[] args) {
	System.out.println("For tsükkel:");
	int summa = 0;
	for(int a = 1; a < 6; a++) {
		summa = summa + a;
	}
	System.out.println(summa);
	
	
	System.out.println("Do-While tsükkel:");
	int a = 1;
	summa = 0;
	do {
		summa = summa + a;
		a = a + 1;
	}
	while(a < 6);
	System.out.println(summa);

	
	System.out.println("While tsükkel:");
	int b = 1;
	summa = 0;
	while(b < 6) {
		summa = summa + b;
		b = b + 1;
	}
	
	System.out.println(summa);
}
}