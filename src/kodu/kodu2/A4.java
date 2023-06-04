package kodu.kodu2;

public class A4 {
    public static void main(String[] args) {
        meetod(5, "Tere.");
        System.out.println(meetod(2.5));
        System.out.println(meetod(1, 3));
    }

    private static int meetod(int a, int b) {
        return a + b;
    }

    private static double meetod(double a) {
        double sqr = a * a;
        return (int) sqr;
    }

    private static void meetod(int a, String msg) {

        for(int n = 0; a != n; n++) {
            System.out.println(msg);
        }
    }
}