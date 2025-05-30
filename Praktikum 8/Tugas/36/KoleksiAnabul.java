package Tugas36;

/**
 *
 * @author macbook
 */

import java.util.ArrayList;
import java.util.Random;

public class KoleksiAnabul {
    private ArrayList<Anabul> koleksi;

    public KoleksiAnabul() {
        koleksi = new ArrayList<>();
        Random rand = new Random();
        String[] namaKucing = {"Nino", "Milo", "Luna"};
        String[] namaAnjing = {"Loki", "Buddy", "Max"};
        String[] namaBurung = {"Tuki", "Rio", "Cici"};

        for (int i = 0; i < 10; i++) {
            int pilihan = rand.nextInt(3); // 0 = Kucing, 1 = Anjing, 2 = Burung
            switch (pilihan) {
                case 0:
                    koleksi.add(new Kucing(namaKucing[rand.nextInt(namaKucing.length)]));
                    break;
                case 1:
                    koleksi.add(new Anjing(namaAnjing[rand.nextInt(namaAnjing.length)]));
                    break;
                case 2:
                    koleksi.add(new Burung(namaBurung[rand.nextInt(namaBurung.length)]));
                    break;
            }
        }
    }

    public void showAll() {
        for (Anabul anabul : koleksi) {
            anabul.tampilkanInfo();
        }
    }
}
