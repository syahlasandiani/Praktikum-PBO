/* Nama File    : MainGaris.java 
 * Deskirpsi    : berisi main dalam class garis 
 * Pembuat      : Syahla Sandiani
 * Tanggal      : 20 Februari 2025 */

public class MainGaris {
    public static void main(String[] args) {
      Titik titikA = new Titik(0, 0);
      Titik titikB = new Titik(4, 4);
      Garis garis1 = new Garis(titikA, titikB);
      
      Titik titikC = new Titik(1, 2);
      Titik titikD = new Titik(5, 6);
      Garis garis2 = new Garis(titikC, titikD);
      
      // Menampilkan panjang garis
      System.out.println("Panjang garis 1: " + garis1.getPanjang());
      System.out.println("Panjang garis 2: " + garis2.getPanjang());
      
      // Menampilkan gradien garis
      System.out.println("Gradien garis 1: " + garis1.getGradien());
      System.out.println("Gradien garis 2: " + garis2.getGradien());
      
      // Menampilkan titik tengah
      Titik titikTengah = garis1.getTitikTengah();
      System.out.println("Titik tengah garis 1: (" + titikTengah.absis + ", " + titikTengah.ordinat + ")");
      
      // Mengecek apakah kedua garis sejajar
      System.out.println("Apakah garis 1 dan 2 sejajar? " + garis1.isSejajar(garis2));
      
      // Menampilkan persamaan garis
      garis1.printPersamaanGaris();
      
      // Menampilkan jumlah objek garis
      System.out.println("Jumlah garis yang dibuat: " + Garis.getCounterGaris());
    }
  }
