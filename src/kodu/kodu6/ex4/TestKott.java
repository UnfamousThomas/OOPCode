package kodu.kodu6.ex4;

public class TestKott {

    public static void main(String[] args) {
        PeenSeljakott peenSeljakott = new PeenSeljakott("LTT", 10, "LTT-BACKPACK-1",300,300,300);
        //Dünaamiline seostamine
        peenSeljakott.kotiMathKuupDetsimeetrites();
        //Polümorfism
        Seljakott seljakott = (Seljakott) peenSeljakott;

    }
}
