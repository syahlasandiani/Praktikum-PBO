/*  Nama File   : Pengusaha.java
 *  Deskripsi   : Class Pengusaha
 *  Pembuat     : Syahla Sandiani / 24060123130066
 *  Tanggal     : 23 Maret 2025 */

package Tugas;

public class Pengusaha extends Manusia implements Pajak {
    private int pendapatan;
    private static int counterPengusaha = 0;
    private int tahunMulaiKerja;
    
    public Pengusaha(String nama, int tahunMulaiKerja, String alamat, int pendapatan, String id) {
        super(nama, alamat, id);
        this.tahunMulaiKerja = tahunMulaiKerja;
        this.pendapatan = pendapatan;
        counterPengusaha++;
    }
    
    public static int getCounterPengusaha(){ 
        return counterPengusaha; 
    }
    
    public int getPendapatan(){ 
        return pendapatan; 
    }
    
    public void setPendapatan(int pendapatan){ 
        this.pendapatan = pendapatan; 
    }
    
    public int getTahunMulaiKerja(){ 
        return tahunMulaiKerja; 
    }
    
    public void setTahunMulaiKerja(int tahunMulaiKerja){ 
        this.tahunMulaiKerja = tahunMulaiKerja; 
    }

    public double hitungPajak(){
        return 0.15 * pendapatan;
    }
    
    public int hitungMasaKerja(){
        return 2025 - tahunMulaiKerja + 5;
    }
    
    public void cetakInfo(){
        System.out.println("Pengusaha: " + nama + ", " + alamat + ", " + id + ", " + pendapatan);
    }

}
