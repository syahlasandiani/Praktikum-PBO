/*  Nama File   : Petani.java
 *  Deskripsi   : Class Petani
 *  Pembuat     : Syahla Sandiani / 24060123130066
 *  Tanggal     : 23 Maret 2025 */

package Tugas;

class Petani extends Manusia implements Pajak {
    private int pendapatan;
    private static int counterPetani = 0;
    private int tahunMulaiKerja;
    
    public Petani(String nama, int tahunMulaiKerja, String alamat, int pendapatan, String id) {
        super(nama, alamat, id);
        this.tahunMulaiKerja = tahunMulaiKerja;
        this.pendapatan = pendapatan;
        counterPetani++;
    }
    
    public static int getCounterPetani(){ 
        return counterPetani; 
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
        return 0;
    }
    
    public int hitungMasaKerja(){
        return 2025 - tahunMulaiKerja + 0;
    }
    
    public void cetakInfo(){
        System.out.println("Petani: " + nama + ", " + alamat + ", " + id + ", " + pendapatan);
    }

}
