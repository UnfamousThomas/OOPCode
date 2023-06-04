package praks.praks9;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Parool {
    public static void main(String[] args) throws Exception {
        leiaJaSalvestaParool("fail.txt", "parool.txt");
    }

    private static void leiaJaSalvestaParool(String otsinFailist, String salvestanFaili) throws Exception{
            InputStream baidid = new FileInputStream(otsinFailist);
            InputStreamReader tekst = new InputStreamReader(baidid, "UTF-8");
            BufferedReader puhverdatud = new BufferedReader(tekst);
            String rida = puhverdatud.readLine();
            List<String> paroolid = new ArrayList<>();
            while (rida != null) {
                if(rida.contains(" parool: ")) {
                    String[] osad = rida.split(" ");
                    paroolid.add(osad[2]);

                }
                rida = puhverdatud.readLine();
            }
            if(!paroolid.isEmpty()) {
                PrintWriter pw = new PrintWriter(salvestanFaili);
                for (String parool : paroolid) {
                    pw.println(parool);
                }
                pw.close();
            }
        }
    }
