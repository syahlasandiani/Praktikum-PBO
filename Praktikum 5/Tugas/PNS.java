/*  Nama File   : PNS.java
 *  Deskripsi   : Class PNS
 *  Pembuat     : Syahla Sandiani / 24060123130066
 *  Tanggal     : 23 Maret 2025 */

package Tugas;

class PNS extends Manusia implements Pajak {
    private int pendapatan;
    private static int counterPNS = 0;
    private int tahunMulaiKerja;
    
    public PNS(String nama, int tahunMulaiKerja, String alamat, int pendapatan, String id) {
        super(nama, alamat, id);
        this.tahunMulaiKerja = tahunMulaiKerja;
        this.pendapatan = pendapatan;
        counterPNS++;
    }
    
    public static int getCounterPNS(){ 
        return counterPNS; 
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
        return 0.1 * pendapatan;
    }
    
    public int hitungMasaKerja(){
        return 2025 - tahunMulaiKerja + 0;
    }
    
    public void cetakInfo(){
        System.out.println("PNS: " + nama + ", " + alamat + ", " + id + ", " + pendapatan);
    }
}
