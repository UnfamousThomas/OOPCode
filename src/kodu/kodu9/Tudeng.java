package kodu.kodu9;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Tudeng {
    private String nimi;
    private List<AineHinne> hinded;

    public Tudeng(String nimi, List<AineHinne> hinded) {
        this.hinded = hinded;
        this.nimi = nimi;
    }

    @Override
    public String toString() {
        return nimi + ":" + koostaHindedString();
    }

    private String koostaHindedString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < hinded.size(); i++) {
            AineHinne hinne = hinded.get(i);
            stringBuilder.append(hinne.toString());
            if(i != hinded.size()-1) stringBuilder.append(", ");
        }

        return stringBuilder.toString();
    }

    public void salvestaBinaarfaili(String failiNimi) throws Exception {
        DataOutputStream dos = new DataOutputStream(new FileOutputStream(failiNimi));
        dos.writeUTF(nimi);
        for (AineHinne hinne : hinded) {
            dos.writeUTF(hinne.toString());
        }
        dos.close();
    }

    public static Tudeng loeBinaarfailist(String failiNimi) throws IOException {
        DataInputStream dis = new DataInputStream(new FileInputStream(failiNimi));
        String nimi = dis.readUTF();
        List<AineHinne> hinded = new ArrayList<>();


        while (dis.available() > 0) {
            String hinneStr = dis.readUTF();
            String[] hinneSplit = hinneStr.split(":");
            AineHinne hinne = new AineHinne(hinneSplit[0], hinneSplit[1].charAt(0));
            hinded.add(hinne);
        }
        dis.close();
        return new Tudeng(nimi, hinded);
    }
}
