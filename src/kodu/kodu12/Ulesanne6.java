package kodu.kodu12;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Ulesanne6 {

    public static void main(String[] args) throws InterruptedException {
        BlockingQueue<Integer> summad = new ArrayBlockingQueue<>(3);
        BlockingQueue<String> tootlemistOotavadFailid = new ArrayBlockingQueue<>(3);
        tootlemistOotavadFailid.add("tekst.txt");
        tootlemistOotavadFailid.add("tekst1.txt");
        tootlemistOotavadFailid.add("tekst2.txt");

        Thread t1 = new Thread(new Ulesanne6Loim(summad, tootlemistOotavadFailid));
        Thread t2 = new Thread(new Ulesanne6Loim(summad, tootlemistOotavadFailid));
        Thread t3 = new Thread(new Ulesanne6Loim(summad, tootlemistOotavadFailid));

        t1.start();
        t2.start();
        t3.start();

        for (int i = 0; i < 3; i++) {
            System.out.println("Summa: " + summad.take());
        }

    }
}
