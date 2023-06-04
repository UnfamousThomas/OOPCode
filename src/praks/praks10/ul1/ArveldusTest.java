package praks.praks10.ul1;

public class ArveldusTest {
    public static void main(String[] args) {
        Konto konto = new Konto("Peeter",30);

        try {
            System.out.println(konto);
            //konto.setRahaSumma(-30);
            System.out.println(konto);
            konto.osta(30);
            konto.osta(30);
        } catch (RahaEiJätkuErind e) {
            System.out.print("Raha ei jätkunud!");
        } catch (NegatiivneSummaErind e) {
            System.out.print("Vale summa.");
        }
    }
}
