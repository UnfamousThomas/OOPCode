package kodu.kodu11;
/**
 * @author thomp (24/04/2023)
 */
public class Võrdleja<N extends Comparable<N>>{

    public N leiaSuurem(N esimene, N teine) {
        if(esimene.compareTo(teine) > 0) return esimene;

        return teine;
    }

    public static void main(String[] args) {
        Võrdleja<Integer> võrdleja = new Võrdleja<>();

        System.out.println(võrdleja.leiaSuurem(5,10));
    }
}
