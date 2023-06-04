package praks.praks10.ul1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class ArvuLugeja {

    public int[] tagastaMasiiv(String sone) throws NumberFormatException{
        String[] arvud = sone.split(",");
        int[] arvudUus = new int[arvud.length];
        for (int i = 0; i < arvud.length; i++) {
            String el = arvud[i];
            if(el.equals("") || el.equals(" ")) throw new TühjaArvuErind();
            arvudUus[i] = Integer.parseInt(el);
        }

        return arvudUus;

    }
}
