package kodu.lisa1;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.List;

public class Kaart  {
    private char mast;

    private static final Character[] tähed = {'Q','K','J','A'};
    private static final Character[] mastid = {'♣', '♦', '♠','♥'};//'♣', '♦', '♠' või '♥'
    private static final List<Character> mastiList = Arrays.asList(mastid);
    private static final List<Character> täheList = Arrays.asList(tähed);

    private String tugevus;
    public Kaart(String tugevus, char mast) {
        kontrolliTugevust(tugevus);
        kontrolliMasti(mast);
        this.tugevus = tugevus;
        this.mast = mast;
    }

    public Kaart(String kaart) {
        this.tugevus = kaart.substring(0,kaart.length()-1);
        this.mast = kaart.charAt(kaart.length()-1);

        kontrolliTugevust(tugevus);
        kontrolliMasti(mast);
    }

    private void kontrolliMasti(char mast) {
        if(!mastiList.contains(mast)) throw new RuntimeException("Sellist masti ei ole");
    }
    private void kontrolliTugevust(String tugevus) {
        //A - äss
        // Q - emand
        // K - kuningas
        // J - poiss
        // 10-2
        if(isInteger(tugevus)) {
            int num = Integer.parseInt(tugevus);
            if(num > 10 || num < 2) throw new RuntimeException();
        } else {
            if(tugevus.length() > 1) throw new RuntimeException();
            Character tugevusCh = tugevus.charAt(0);

            if(!(täheList.contains(tugevusCh))) throw new RuntimeException();
        }


    }

    private boolean isInteger(String x) {
        try {
            int i = Integer.parseInt(x);
            return true;
        }catch (Exception e) {
            return false;
        }
    }
    public char getMast() {
        return mast;
    }

    public String getTugevus() {
        return tugevus;
    }

    @Override
    public boolean equals(@NotNull  Object obj) {
        if(!(obj instanceof Kaart kaart)) return false;

        return kaart.getMast() == getMast();
    }

    @Override
    public String toString() {
        return getTugevus() + getMast();
    }

}
