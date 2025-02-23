/* Nama File    : Garis.java 
 * Deskirpsi    : berisi atribut dalam class garis 
 * Pembuat      : Syahla Sandiani
 * Tanggal      : 20 Februari 2025 */

public class Garis {
    /******Atribut*******/
    Titik titikAwal;
    Titik titikAkhir;
    static int counterGaris = 0;
  
    /******Method******/
    // Konstruktor tanpa parameter
    Garis() {
      this.titikAwal = new Titik(0, 0);
      this.titikAkhir = new Titik(1, 1);
      counterGaris++;
    }
  
    // Konstruktor dengan parameter
    Garis(Titik titikAwal, Titik titikAkhir) {
      this.titikAwal = titikAwal;
      this.titikAkhir = titikAkhir;
      counterGaris++;
    }
  
    // Getter untuk counterGaris
    static int getCounterGaris() {
      return counterGaris;
    }
  
    // Method untuk mendapatkan panjang garis
    double getPanjang() {
        return Math.sqrt(Math.pow(titikAkhir.absis - titikAwal.absis, 2) + Math.pow(titikAkhir.ordinat - titikAwal.ordinat, 2));
    }
  
    // Method untuk mendapatkan gradien garis
    double getGradien() {
      if (titikAkhir.absis == titikAwal.absis) {
        throw new ArithmeticException("Gradien tak terdefinisi (garis vertikal)");
      }
        return (titikAkhir.ordinat - titikAwal.ordinat) / (titikAkhir.absis - titikAwal.absis);
    }
  
    // Method untuk mendapatkan titik tengah
    Titik getTitikTengah() {
      double tengahX = (titikAwal.absis + titikAkhir.absis) / 2;
      double tengahY = (titikAwal.ordinat + titikAkhir.ordinat) / 2;
      return new Titik(tengahX, tengahY);
    }
  
    // Method untuk mengecek apakah dua garis sejajar
    boolean isSejajar(Garis garisLain) {
      return this.getGradien() == garisLain.getGradien();
    }
  
    // Method untuk mencetak persamaan garis
    void printPersamaanGaris() {
      double gradien = getGradien();
      double intercept = titikAwal.ordinat - gradien * titikAwal.absis;
      System.out.println("Persamaan garis: y = " + gradien + "x + " + intercept);
    }
  }
