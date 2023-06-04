package praks.praks1;

public class A5 {
  public static void main(String[] args) {
	System.out.println("1. ülesanne: ");
	for(int a = 1; a < 6; a++) {
		System.out.println(a);
	}
	
	
	System.out.println("3. ülesanne:");
	int a = 0;
	do {
		System.out.println("Tuletan meelde, et varsti algab loeng!");
	}
	while(a < -1);
	
	
	System.out.println("2. ülesanne:");
	int summa = 0;
	int piir = 30;
	while(piir >= summa) {
		summa = summa + 2;
	}
	System.out.println(summa);

}
}