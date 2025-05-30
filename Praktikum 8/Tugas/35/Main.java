package Tugas35;

/*  Nama File   : Main.java
 *  Deskripsi   : Class Main
 *  Pembuat     : Syahla Sandiani / 24060123130066
 *  Tanggal     : 10 Mei 2025 */

public class Main {
    public static void main(String[] args) {
        Koleksi<Character> KK = new Koleksi<>(10);
        
        // tambah elemen 
        KK.add('S');
        KK.add('Y');
        KK.add('A');
        KK.add('H');
        KK.add('L');
        KK.add('A');
        
        // menampilkan elemen
        System.out.println("Isi Koleksi: ");
        KK.showAll();
        
        // edit elemen pada index
        KK.setIsi(3, 'A');
        System.out.println("Setelah koleksi diedit: ");
        KK.showAll();
        
        // menghapus elemen 
        KK.delete(5);
        System.out.println("Setelah elemen dihapus: ");
        KK.showAll();
    }
}
