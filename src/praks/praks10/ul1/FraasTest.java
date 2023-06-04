package praks.praks10.ul1;

public class FraasTest {
    public static void main(String[] args) {
        try {
            Fraas fraas = new Fraas("Olen konn");
            System.out.println(fraas);

            Fraas fraas2 = new Fraas("aias sadas saia");
            System.out.println(fraas2);
        } catch (PalindroomiErind e) {
            System.out.println("Leiti palindroom!");
            System.out.println(e.getMessage());
        }
    }
}
