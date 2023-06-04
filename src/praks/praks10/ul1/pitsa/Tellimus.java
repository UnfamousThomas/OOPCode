package praks.praks10.ul1.pitsa;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class Tellimus implements Comparable<Tellimus> {
    private String tellija;
    private List<Pitsa> pitsad;
    private int ootamiseAeg;

    public Tellimus(String tellija, List<Pitsa> pitsad, int ootamiseAeg) {
        this.tellija = tellija;
        this.pitsad = pitsad;
        this.ootamiseAeg = ootamiseAeg;
    }

    public double maksumus() throws LiigaPikkOotamiseErind {
        double maksumus = 0;
        if(ootamiseAeg > 30) throw new LiigaPikkOotamiseErind();

        for (Pitsa pitsa : pitsad) {
            maksumus += pitsa.getHind();
        }

        return maksumus;
    }
    @Override
    public String toString() {
        return tellija + ootamiseAeg + pitsad.toString() + ";";
    }

    @Override
    public int compareTo(@NotNull Tellimus o) {
        return Integer.compare(ootamiseAeg, o.ootamiseAeg);
    }
}
