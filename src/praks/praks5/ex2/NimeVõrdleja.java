package praks.praks5.ex2;

import java.util.Comparator;

public class NimeVõrdleja implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        //return o1.compareTo(o2);
        return o2.compareTo(o1);
    }
}
