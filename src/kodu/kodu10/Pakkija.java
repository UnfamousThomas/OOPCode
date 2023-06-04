package kodu.kodu10;

/**
 * @author thomp (17/04/2023)
 */
import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class Pakkija {
    public static void main(String[] args) throws IOException {
        File lähtefail = new File(args[0]);
        File zipFail = new File(args[1]);
        paki(lähtefail, zipFail); //Kuna me ei saa midagi teha ikka selle Exceptioni vastu.


        System.out.println("Kena päeva!");
    }

    private static void paki(File lähtefail, File zipFail) throws IOException {
        try (FileInputStream sisendvoog = new FileInputStream(lähtefail);
             ZipOutputStream zipvoog = new ZipOutputStream(
                new BufferedOutputStream(new FileOutputStream(zipFail)))){

            zipvoog.putNextEntry(new ZipEntry(lähtefail.getName()));
            byte[] buffer = new byte[1024];
            int length;
            while ((length = sisendvoog.read(buffer)) > 0) {
                zipvoog.write(buffer, 0, length);
            }
            zipvoog.closeEntry();
            System.out.println("Varukoopia tehtud.");

            lähtefail.delete();
            System.out.println("Algne fail kustutatud.");

        }
    }
}