package praks.praks2;

import java.util.Arrays;

public class Praktikum1 {

    public static void main(String[] args) {
        int[] a = {0, 1, 2, 3, -1};
        int[] b = {0,1,2,3,-1};
        System.out.println("Ühildatud:");
        for (int el : joinArrays(a, b)) {
            System.out.print(el + " ");
        }
        System.out.println();
        System.out.println("Vastupidine:");

        for (int i : reverseAndOpposite(a)) {
            System.out.print(i + " ");
        }
    }

    private static int[] joinArrays(int[] array1, int[] array2) {
        int[] uus = new int[array2.length + array1.length];

        System.arraycopy(array1, 0, uus,0, array1.length);
        System.arraycopy(array2, 0, uus, array1.length, array2.length);
        Arrays.sort(uus);

        return uus;
    }

    private static int[] reverseAndOpposite(int[] array) {
        //Arrays.sort(array);
        // 0 1 2 3 -1 -> 1 -3 -2 -1 0
        int[] uus = new int[array.length];
        int uusIndeks = 0;

        for (int i = array.length - 1; i >= 0; i--) {
        uus[uusIndeks] = -1 * array[i];
        uusIndeks = uusIndeks + 1;

        }

        //reverse(uus);

        return uus;
    }

}
