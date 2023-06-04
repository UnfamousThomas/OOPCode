package kt.kt1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lennujaam {

    private double tuludeSumma;
    private List<Lennuk> ootavadLennukid;
    public Lennujaam(){
        ootavadLennukid = new ArrayList<>();
    }

    public void lisaLennuk(Lennuk lennuk) {
        ootavadLennukid.add(lennuk);
    }

    public void lennukiLahkumine() {
        Collections.shuffle(ootavadLennukid);
        Lennuk viimane = ootavadLennukid.get(ootavadLennukid.size()-1);
        tuludeSumma = tuludeSumma + viimane.lennujaamamaks();

        System.out.println("Lennuk lahkus lennujaamast!");
        System.out.println(viimane);
        ootavadLennukid.remove(viimane);
    }

    @Override
    public String toString() {
        return "Lennujaam. Ootavate lennukite arv: " + ootavadLennukid.size() + "; Tulud: " + tuludeSumma;
    }
}
