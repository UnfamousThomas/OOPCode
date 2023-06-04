package praks.praks10.ul1;

import java.util.Scanner;

public class TühikuTest {
    public static void main(String[] args) throws TühikuErind {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("Sisesta string!");
            String sisestatud = scanner.nextLine();

            if(kasOnValestiMidagi(sisestatud)) throw new TühikuErind(sisestatud);
        }
    }

    private static boolean kasOnValestiMidagi(String s) {
        if(s.contains(". ")) return true;
        if(s.contains("! ")) return true;
        return s.contains("? ");
    }
}
