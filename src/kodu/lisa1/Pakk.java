package kodu.lisa1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Pakk {
    
    private List<Kaart> kaardid = new ArrayList<>();
    
    public Pakk(List<Kaart> kaardid) {
        this.kaardid = new ArrayList<>(kaardid);
        for (int i = 0; i < kaardid.size(); i++) {
            for (int j = 0; j < kaardid.size(); j++) {
                if(j != i) {
                    Kaart kaartJ = kaardid.get(j);
                    Kaart kaartI = kaardid.get(i);
                    if(kaartJ.getTugevus().equals(kaartI.getTugevus())) {
                        if(kaartJ.getMast() == kaartI.getMast()) {
                            throw new RuntimeException("Mitu sama kaarti");
                        };
                    }
                }
            }
        }
    }

    public Pakk() {
        lisaMast('♥');//'♣', '♦', '♠' või '♥'
        lisaMast('♠');
        lisaMast('♦');
        lisaMast('♣');
    }

    private void lisaMast(char mast) {
        for (int i = 2; i <= 10; i++) {
            kaardid.add(new Kaart(String.valueOf(i),mast));
        }
        kaardid.add(new Kaart("A" + mast));
        kaardid.add(new Kaart("K" + mast));
        kaardid.add(new Kaart("Q" + mast));
        kaardid.add(new Kaart("J" + mast));

        //AKQJ
    }

    public List<Kaart> getKaardid() {
        return List.copyOf(kaardid);
    }

    public void sega() {
        Collections.shuffle(kaardid);
    }

    public Kaart võtaKaart() {
        if(kaardid.size() == 0) throw new RuntimeException("Tühjast pakist üritati võtta kaarte");
        Kaart kaart = kaardid.get(0);
        kaardid.remove(0);
        return kaart;
    }
}
