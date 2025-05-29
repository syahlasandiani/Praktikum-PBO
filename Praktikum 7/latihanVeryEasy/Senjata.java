package latihanVeryEasy;

/*  Nama File   : Senjata.java
 *  Deskripsi   : Class Senjata
 *  Pembuat     : Syahla Sandiani / 24060123130066
 *  Tanggal     : 8 Mei 2025 */

public class Senjata {
    private String bunyi;
    private int peluru;

    public Senjata(String bunyi) {
        this.bunyi = bunyi;
        this.peluru = 0;
    }

    public String getBunyi() {
        return bunyi;
    }

    public int getPeluru() {
        return peluru;
    }

    public void setPeluru(int peluru) {
        this.peluru = peluru;
    }

    public void menembak() {
        if (peluru > 0) {
            System.out.println(getBunyi());
            peluru--;
            System.out.println("Sisa Peluru: " + peluru);
        } else {
            System.out.println("Peluru habis");
        }
    }
}
