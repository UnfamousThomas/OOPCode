package kodu.kodu10;

import java.util.Scanner;

/**
 * @author thomp (17/04/2023)
 */
public class TestPilt {
    public static void main(String[] args) {
        Pilt pilt = new Pilt(10, 10);
        Scanner scanner = new Scanner(System.in);
        interaktiivneVestlus(pilt, scanner);
    }

    public static void interaktiivneVestlus(Pilt pilt, Scanner scanner) {
        System.out.println("Millist pikslid soovid vaadata (formaat:x,y)");
        String koordinaadid = scanner.nextLine();
        String[] koordinaadidSplit = koordinaadid.split(",");
        Integer x = Integer.parseInt(koordinaadidSplit[0]);
        Integer y = Integer.parseInt(koordinaadidSplit[1]);
        try {
            System.out.println("Piksel (" + x + ", " + y + ") on väärtuse/värviga " + pilt.annaPiksel(x, y));
        } catch (VigaseKoordinaadiErind e) {
            interaktiivneVestlus(pilt, scanner);
        }
        System.out.println("Kas soovid muuta pikslit? (jah / ei)");
        String jahEi = scanner.nextLine();
        if(jahEi.equals("jah")) muudaPikslit(pilt, scanner,x,y);
        else interaktiivneVestlus(pilt,scanner);

    }

    private static void muudaPikslit(Pilt pilt, Scanner scanner, int x, int y) {
        System.out.println("Sisesta uus värvi väärtus!");
        Integer varv = Integer.parseInt(scanner.nextLine());
        try {
            pilt.määraPiksel(x,y,varv);
            interaktiivneVestlus(pilt, scanner);
        } catch (VigaseKoordinaadiErind e) {
            interaktiivneVestlus(pilt, scanner);
        }
    }
}
