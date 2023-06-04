package kodu.lisa2;

public class Ruudumäng {
    private int xSuurus;
    private int ySuurus;

    private int tegelaseX;
    private int tegelaseY;
    private Tegelane tegelane;

    private boolean paigutatud = false;
    private Ruut[][] ruudud;
    public Ruudumäng(int x, int y) {
        this.xSuurus = x;
        this.ySuurus = y;
        ruudud = new Ruut[x][y];
        vaikimisiTee();
    }

    public void paigutaRuut(int x, int y, Ruut ruut) {
        ruudud[x][y] = ruut;
    }

    private void vaikimisiTee() {
        for (int rida = 0; rida < ruudud.length; rida++) {
            for (int veerg = 0; veerg < ruudud[rida].length; veerg++) {
                ruudud[rida][veerg] = new Tee();
            }
        }
    }

    public void paigutaTegelane(int x, int y) {
        if(!paigutatud) {
            tegelaseX = x;
            tegelaseY = y;
            tegelane = new Tegelane();
            paigutatud=true;
        } else throw new RuntimeException("Tegelane on juba paigutatud");
    }

    public void reageeriSündmusele(String sündmus) {
        switch (sündmus.toLowerCase()) {
            case  "alla" -> {
                if (ySuurus - 1 >= tegelaseY + 1) {
                    tegelaseY += 1;
                } else {
                    throw new RuntimeException("Ebasobilik liikumine!");
                }
            }
            case "üles" -> {
                if (0 >= tegelaseY - 1) {
                    tegelaseY -= 1;
                } else {
                    throw new RuntimeException("Ebasobilik liikumine!");
                }
            }
            case "paremale" -> {
                if (xSuurus - 1 >= tegelaseX + 1) {
                    tegelaseX += 1;
                } else {
                    throw new RuntimeException("Ebasobilik liikumine!");
                }
            }
            case "vasakule" -> {
                if (0 >= tegelaseX - 1) {
                    tegelaseX -= 1;
                } else {
                    throw new RuntimeException("Ebasobilik liikumine!");
                }
            }
            default -> {
                throw new RuntimeException("Ei tea sellist liikumist");
            }
        }
    }

    public void joonista() {
        for (int rida = 0; rida < ruudud.length; rida++) {
            for (int veerg = 0; veerg < ruudud[rida].length; veerg++) {
                ruudud[rida][veerg].joonista(rida, veerg);
                if(tegelaseX == rida && tegelaseY == veerg) System.out.println("tegelane.png (" + rida + "," + veerg + ")");
            }
        }
    }
    public Tegelane getTegelane() {
        return tegelane;
    }

}
