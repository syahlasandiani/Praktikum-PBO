package Tugas34;

/*  Nama File   : PersegiPanjang.java
 *  Deskripsi   : Class Persegi Panjang
 *  Pembuat     : Syahla Sandiani / 24060123130066
 *  Tanggal     : 10 Mei 2025 */

public class PersegiPanjang extends BangunDatar {
    private double panjang, lebar;

    public PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public double getPanjang() {
        return panjang;
    }

    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    public double getLebar() {
        return lebar;
    }

    public void setLebar(double lebar) {
        this.lebar = lebar;
    }
    
    @Override 
    public double hitungLuas(){
       return panjang*lebar;
    }
    
    @Override 
    public double hitungKeliling(){
        return 2*(panjang+lebar);
    } 
}
