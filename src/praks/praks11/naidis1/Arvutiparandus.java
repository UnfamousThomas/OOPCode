package praks.praks11.naidis1;

import java.io.*;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Arvutiparandus {

    public static void main(String[] args) throws IOException{
        String failVlink = args[0];
        List<Arvuti> arvutid = new ArrayList<>();
        if(failVlink.toLowerCase().startsWith("http://") || failVlink.toLowerCase().startsWith("https://")) {
            arvutid = loeArvutiInternetist(failVlink);
        } else {
            arvutid = loeArvutiFailist(failVlink);
        }
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Kas soovid parandada (P), uut tööd registreerida (R) või lõpetada (L) ?");
            String vastus = scanner.nextLine().toUpperCase();


        }

    }

    public static List<Arvuti> loeArvutiInternetist(String url) throws IOException {
        InputStream baidid = new URL(url).openStream();
        InputStreamReader tekst = new InputStreamReader(baidid, StandardCharsets.UTF_8);
        BufferedReader bufr = new BufferedReader(tekst);
        List<Arvuti> arvutid = new ArrayList<>();
        String rida = bufr.readLine();
        while(rida != null) {
            arvutid.add(loeArvuti(rida));
            rida = bufr.readLine();;
        }

        return arvutid;
    }

    public static List<Arvuti> loeArvutiFailist(String failiNimi) throws IOException {
        InputStream baidid = new FileInputStream(failiNimi);
        InputStreamReader tekst = new InputStreamReader(baidid, StandardCharsets.UTF_8);
        BufferedReader bufr = new BufferedReader(tekst);
        List<Arvuti> arvutid = new ArrayList<>();
        String rida = bufr.readLine();
        while(rida != null) {
            arvutid.add(loeArvuti(rida));
            rida = bufr.readLine();;
        }

        return arvutid;
    }

    public static Arvuti loeArvuti(String rida) {
        String[] arvutiDetailid = rida.split(";");
        if(arvutiDetailid.length < 2 || arvutiDetailid.length > 3) throw new FormaadiErind(rida);
        if(!arvutiDetailid[1].equalsIgnoreCase("kiirtöö") && !arvutiDetailid[1].equalsIgnoreCase("tavatöö")) throw new FormaadiErind(rida);
        if(arvutiDetailid.length == 3 && !arvutiDetailid[2].startsWith("monitoriga")) throw new FormaadiErind(rida);

        LocalDateTime ldt;
        if(arvutiDetailid[arvutiDetailid.length-1].contains("@")) {
            String[] ajaga = arvutiDetailid[arvutiDetailid.length-1].split("@");
            ldt = LocalDateTime.parse(ajaga[ajaga.length-1]);
        } else {
            ldt = LocalDateTime.now();
        }

        String tootja = arvutiDetailid[0];
        String tüüp = arvutiDetailid[1];
        boolean monitoriga = arvutiDetailid[2].equalsIgnoreCase("monitoriga");
        boolean kasKiirTöö;
        kasKiirTöö = tüüp.equalsIgnoreCase("kiirtöö");

        if(monitoriga) {
            return new VäliseMonitorigaArvuti(tootja, kasKiirTöö, ldt);
        } else {
            return new Arvuti(tootja, kasKiirTöö, ldt);
        }


    }


}
