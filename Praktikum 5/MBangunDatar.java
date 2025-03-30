/*  Nama File   : MBangunDatar.java
 *  Deskripsi   : Main untuk class BangunDatar
 *  Pembuat     : Syahla Sandiani / 24060123130066
 *  Tanggal     : 20 Maret 2025 */

 public class MBangunDatar {
    public static void main(String[] args) {
        BangunDatar P1 = new Persegi(10, "Kuning", "Merah");
        Persegi P2 = new Persegi(5, "Biru", "Hitam");
        BangunDatar L1 = new Lingkaran(7, "Hijau", "Putih");
        Lingkaran L2 = new Lingkaran(14, "Ungu", "Biru");
        
        System.out.println("Luas Persegi 1      : " + P1.getLuas());
        System.out.println("Luas Lingkaran 1    : " + L1.getLuas());
        System.out.println("Persegi 1 sama luas dengan Lingkaran 1? " + P1.isEqualLuas(L1));
        
        P2.zoomIn();
        System.out.println("Sisi Persegi 2 setelah zoomIn: " + ((Persegi)P2).getSisi());
    }
}
