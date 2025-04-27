/*  Nama File   : Anabul.java
 *  Deskripsi   : Class Anabul
 *  Pembuat     : Syahla Sandiani / 24060123130066
 *  Tanggal     : 27 April 2025 */

package Tugas;

public class Anabul {
    private String nama;
    
    public Anabul(String nama) {
        this.nama = nama;
    }
    
    public String getNama() {
        return nama;
    }

    public void setNama(String nama){
        this.nama = nama;
    }
    
    public void bersuara() {
        System.out.println("Hewan bersuara");
    }
    
    public void bergerak() {
        System.out.println("Hewan bergerak");
    }
    
    public void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.print("Suara: ");
        bersuara();
        System.out.print("Gerakan: ");
        bergerak();
        System.out.println();
    }
}
