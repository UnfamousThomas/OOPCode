package kodu.kodu11;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.util.HashMap;
import java.util.Map;

/**
 * @author thomp (24/04/2023)
 */
public class TekstiAnalüsaator {

    private String tekst;
     public TekstiAnalüsaator(String tekst) {
        this.tekst = tekst.replace("\n", " ");
    }

    public TekstiAnalüsaator(File fail, String kodeering) throws IOException {
        this.tekst = Files.readString(fail.toPath(), Charset.forName(kodeering)).replace("\n", " ");
    }

    public Map<String, Integer> sõnadeSagedus() {
        Map<String, Integer> sagedus = new HashMap<>();
    
        if(tekst.length() < 1) return sagedus;


        String[] sonad = tekst.split(" ");
        for (String s : sonad) {
            int uusSagedus = sagedus.getOrDefault(s, 0);
            sagedus.put(s, uusSagedus+1);
        }

        return sagedus;
    }
        
        //Selles variandis ma vaatan neid sõnu mis on kõik peale hetkel olevat sõna. 
        public Map<String, Map<String, Integer>> sõnadeJärgnevus2() {
        Map<String, Map<String, Integer>> jargnevus = new HashMap<>();

        String[] sonadSplit = tekst.split(" ");
        for (int i = 0; i < sonadSplit.length - 1; i++) {
            String hetkel = sonadSplit[i];
            Map<String, Integer> sees;
            if(!jargnevus.containsKey(hetkel)) {
                sees = new HashMap<>();
            } else sees = jargnevus.get(hetkel);
            for (int j = i+1; j < sonadSplit.length; j++) {
                sees.put(sonadSplit[j], sees.getOrDefault(sonadSplit[j],0) + 1);
            }
            jargnevus.put(hetkel, sees);
        }

        return jargnevus;
    }
    
    //Selles variandis ma vaatan ainult kohe järgnevaid sõnu
    //Sselle ülessande puhul oli suht raske aru saada kumba taheti.
    public Map<String, Map<String, Integer>> sõnadeJärgnevus() {
        Map<String, Map<String, Integer>> jargnevus = new HashMap<>();

        String[] sonadSplit = tekst.split(" ");
        for (int i = 0; i < sonadSplit.length - 1; i++) {
            String hetkel = sonadSplit[i];
            String järgmine = sonadSplit[i+1];
            Map<String, Integer> sees;
            if(!jargnevus.containsKey(hetkel)) {
                sees = new HashMap<>();
            } else sees = jargnevus.get(hetkel);
            sees.put(järgmine, sees.getOrDefault(järgmine,0)+1);
            jargnevus.put(hetkel, sees);
        }

        return jargnevus;
    }

    public static void main(String[] args) {
        TekstiAnalüsaator tekstiAnalüsaator = new TekstiAnalüsaator("tere mina olen tere mees");
        tekstiAnalüsaator.sõnadeSagedus().forEach((s, integer) -> System.out.println(s + " - " + integer));
    }
}
