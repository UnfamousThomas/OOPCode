package praks.praks6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class PeaKlass {

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("raamatud.txt");
        Scanner scanner = new Scanner(file);
        List<Teos> teosed = new ArrayList<>();
        while (scanner.hasNextLine()) {
            List<String> rida = Arrays.asList(scanner.nextLine().split("; "));
            String kirjeldus = rida.get(0);
            String tähis= rida.get(1);
            String laenutaja = rida.get(2);
            int päevadeArv = Integer.parseInt(rida.get(3));

            if(kasOnAjakiri(kirjeldus)) {
                String[] kirjeldusSplit = kirjeldus.split("/");
                String pealKiri = kirjeldusSplit[0];
                String[] numbridSplit = kirjeldusSplit[1].split(",");
                Integer aasta = Integer.parseInt(numbridSplit[0]);
                Integer ajakiriNum = Integer.parseInt(numbridSplit[1]);
                Ajakiri ajakiri = new Ajakiri(
                        kirjeldus,tähis, laenutaja, päevadeArv, aasta, ajakiriNum
                );
                teosed.add(ajakiri);
            } else {
                String[] kirjeldusSplit = kirjeldus.split(",");
                String autor = kirjeldusSplit[0];
                String pealKiri = kirjeldusSplit[1];
                Raamat raamat = new Raamat(kirjeldus, tähis, laenutaja, päevadeArv, autor, pealKiri);
                teosed.add(raamat);
            }

        }

        Collections.sort(teosed);
        ViiviseHoiataja viiviseHoiataja = new ViiviseHoiataja(0.2);
        SuurimaViiviseLeidja suurimaViiviseLeidja = new SuurimaViiviseLeidja();

        for (Teos teos : teosed) {
            teos.arvutaViivis(viiviseHoiataja);
        }
        for (String laenutaja : viiviseHoiataja.getHoiatatavadLaenutajad()) {
            System.out.println(laenutaja);
        }

        for (Teos teos : teosed) {
            teos.arvutaViivis(suurimaViiviseLeidja);
        }

        suurimaViiviseLeidja.saadaHoiatus();
    }

    private static boolean kasOnAjakiri(String kirjeldus) {
        if(kirjeldus.contains("/")) return true;

        return false;
    }
}
