/*  Nama File   : MainAnabul.java
 *  Deskripsi   : Main Class Anabul
 *  Pembuat     : Syahla Sandiani / 24060123130066
 *  Tanggal     : 27 April 2025 */

 package Tugas;

import java.util.ArrayList;

public class MainAnabul {
    public static void main(String[] args) {
        Anabul kucing = new Kucing("Nino");
        Anabul anjing = new Anjing("Loki");
        Anabul burung = new Burung("Tuki");
        
        ArrayList<Anabul> hewanPeliharaan = new ArrayList<>();
        hewanPeliharaan.add(kucing);
        hewanPeliharaan.add(anjing);
        hewanPeliharaan.add(burung);
        
        for (Anabul hewan : hewanPeliharaan) {
            hewan.tampilkanInfo();
        }
    }
}
