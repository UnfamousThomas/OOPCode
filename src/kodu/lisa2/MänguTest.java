package kodu.lisa2;

public class MänguTest {

    public static void main(String[] args) {
        Ruudumäng ruuduMäng = new Ruudumäng(4,3);
        ruuduMäng.paigutaTegelane(0,0);

        ruuduMäng.paigutaRuut(1, 0, new VäikeKivi());
        ruuduMäng.paigutaRuut(1,1, new Vesi());
        ruuduMäng.paigutaRuut(1,2, new Tee("kirka"));

        ruuduMäng.paigutaRuut(2,1, new Vesi());
        ruuduMäng.paigutaRuut(2,2, new SuurKivi());
        ruuduMäng.paigutaRuut(3,1,new Vesi());
        ruuduMäng.paigutaRuut(3,2, new Tee("kirka"));

        ruuduMäng.joonista();

    }
}
