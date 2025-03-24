/*  Nama File   : MBangunDatar.java
 *  Deskripsi   : 
 *  Pembuat     : Syahla Sandiani / 24060123130066
 *  Tanggal     : 13 Maret 2025
*/

public class MBangunDatar {
    public static void main(String[] args) {
        BangunDatar bangunDatar = new BangunDatar();
        bangunDatar.setJmlSisi(4);
        bangunDatar.setWarna("Biru");
        bangunDatar.setBorder("Hitam");
        System.out.println("Bangun Datar:");
        bangunDatar.printInfo();

        Persegi persegi = new Persegi(5, "Kuning", "Merah");
        System.out.println("\nPersegi:");
        System.out.println("Sisi: " + persegi.getSisi());
        System.out.println("Luas: " + persegi.getLuas());
        System.out.println("Keliling: " + persegi.getKeliling());
        System.out.println("Diagonal: " + persegi.getDiagonal());

        Lingkaran lingkaran = new Lingkaran(14, "Hijau", "Putih");
        System.out.println("\nLingkaran:");
        System.out.println("Jari-jari: " + lingkaran.getJari());
        System.out.println("Luas: " + lingkaran.getLuas());
        System.out.println("Keliling: " + lingkaran.getKeliling());
    }
}
