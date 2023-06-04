package praks.praks10.ul1;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

public class CSVLugeja implements AutoCloseable{

    private BufferedReader bufr;

    public CSVLugeja(String failiNimi) throws IOException {
        if(!failiNimi.toLowerCase().endsWith(".csv")) throw new IOException("Not a CSV file.");
        InputStream baidid = new FileInputStream(failiNimi);
        InputStreamReader tekst = new InputStreamReader(baidid, StandardCharsets.UTF_8);
        bufr = new BufferedReader(tekst);
    }

    public String[] loeCSV() throws IOException{
        String rida = bufr.readLine();
        if(rida != null) return rida.split(",");

        return null;
    }

    @Override
    public void close() throws Exception {
        bufr.close();
    }

}
