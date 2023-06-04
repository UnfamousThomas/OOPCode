package kodu.kodu12;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Ulesanne6Loim implements Runnable {

    private BlockingQueue<Integer> summad;
    private BlockingQueue<String> failid;

    public Ulesanne6Loim(BlockingQueue<Integer> summad, BlockingQueue<String> failid) {
        this.summad = summad;
        this.failid = failid;
    }

    @Override
    public void run() {
        String failiNimi = failid.poll();
        while (failiNimi != null) {
            try (Scanner scanner = new Scanner(new File(failiNimi))) {
                int summa = 0;
                String rida = scanner.nextLine();
                for (String s : rida.split(" ")) {
                    summa += Integer.parseInt(s);
                }
                summad.put(summa);
            } catch (IOException | InterruptedException e) {
                throw new RuntimeException(e);
            }
            failiNimi = failid.poll();
        }
    }
}

