package praks.praks9;

import java.io.PrintWriter;
import java.io.RandomAccessFile;

public class PeidetudAndmed {

    public static void main(String[] args) throws Exception{
        int andmed;

        RandomAccessFile raf = new RandomAccessFile("andmetefail.txt", "r");
        long asukoht = raf.readLong();

        raf.seek(asukoht);

        andmed = raf.readInt();

        System.out.println(andmed);

        raf.close();

    }
}
