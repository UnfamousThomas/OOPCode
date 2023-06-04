package kodu.kodu9;

import java.io.*;
import java.util.Scanner;

public class SalafraasiLeidmine {

    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new FileWriter("salafraasid.txt"));

        while (true) {
            System.out.println("Sisesta faili nimi!");
            String nimi = scanner.nextLine();
            if(nimi.equals("")) {
                bw.flush();
                bw.close();
                break;
            }
            String leitud = leiaEluUniversumiJaKõigeSalafraas(nimi);
            if(leitud == null) {
                System.out.println("'Salafraasi ei leidnud.");
            } else {
                bw.write(leitud);
                bw.newLine();

            }
        }
    }
    public static String leiaEluUniversumiJaKõigeSalafraas(String fileName) throws Exception{
        String salafraas = null;

        try (RandomAccessFile raf = new RandomAccessFile(fileName, "r")) {

            raf.seek(42);

            StringBuilder sb = new StringBuilder();
            int bait = -5000;
            while (raf.getFilePointer()<raf.length() && (bait = raf.read()) != 0) {
                sb.append((char) bait);
            }

            if(bait == 0) salafraas = sb.toString();

        }

        return salafraas;
    }
    
}
