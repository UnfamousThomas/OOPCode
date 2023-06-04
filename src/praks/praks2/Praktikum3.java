package praks.praks2;

import java.util.Arrays;

public class Praktikum3 {

    public static void main(String[] args) {

        int[] stardiNumbrid = {2, 1, 4, 5, 8, 7, 3, 6};
        double[] ajad = {148.2, 150.4, 165.7, 181.2, 226.0, 231.9, 0.0, 0.0};

        int[] startimisAjad = stardiAegadeKalkulaator(stardiNumbrid);

        double[] läbimisAjad = läbimisAegadeKalkulaator(startimisAjad, ajad);
        double[] läbimisAjadKoopia = new double[läbimisAjad.length];

        System.arraycopy(läbimisAjad, 0, läbimisAjadKoopia, 0,läbimisAjadKoopia.length);
        Arrays.sort(läbimisAjadKoopia);

        double vähim = 10000;
        for (int i = 0; i < läbimisAjadKoopia.length; i++) {
            System.out.println(läbimisAjadKoopia[i]);
            if(vähim >= läbimisAjadKoopia[i] && läbimisAjadKoopia[i] != 0.0) {
                vähim = läbimisAjadKoopia[i];
            }
        }

        int index = findIndex(läbimisAjad, vähim);
        System.out.println("Võitja stardinumber oli: " + stardiNumbrid[index] + " ja tema aeg oli: " + vähim);


        System.out.println("Katkestajaid oli: " + katkestajateArvuKalkulaator(ajad));
    }

    public static int stardiAjaKalkulaator(int stardiNumber) {
        return (stardiNumber -1) * 15;
    }

    public static int[] stardiAegadeKalkulaator(int[] stardiNumber) {
        int[] stardiAjad = new int[stardiNumber.length];

        for (int i = 0; i < stardiNumber.length; i++) {
            stardiAjad[i] = stardiAjaKalkulaator(stardiNumber[i]);
        }

        return stardiAjad;
    }

    public static int katkestajateArvuKalkulaator(double[] stopper) {
        int count = 0;
        for (int i = stopper.length-1; i >= 0; i--) {
            if(stopper[i] == 0) {
                count += 1;
        }
        }

        return count;
    }


    public static double[] läbimisAegadeKalkulaator(int[] stardiaeg, double[] stopper) {
        double[] läbimisAeg = new double[stopper.length];

        for (int i = 0; i < stopper.length - 1; i++) {
            läbimisAeg[i] = läbimisAjaKalkulaator(stardiaeg[i], stopper[i]);
        }

        return läbimisAeg;
    }

    public static double läbimisAjaKalkulaator(int stardiaeg, double stopper) {
        if(stopper == 0) return 0;

        return stopper-((double) stardiaeg);
    }

    public static int findIndex(double arr[], double t)
    {
        int index = -1;
        for (int i = 0; i <= arr.length; i++) {
            if(t == arr[i]) {
                index = i;
                break;
            }
        }

        return index;
    }
}
