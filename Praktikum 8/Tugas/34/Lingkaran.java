package Tugas34;

/*  Nama File   : Lingkaran.java
 *  Deskripsi   : Class Lingkaran
 *  Pembuat     : Syahla Sandiani / 24060123130066
 *  Tanggal     : 10 Mei 2025 */

public class Lingkaran extends BangunDatar{
    private double jejari;

    public Lingkaran(double jejari) {
        this.jejari = jejari;
    }
    @Override
    public double hitungKeliling(){
        return 2*jejari*3.14;
    }
    @Override 
    public double hitungLuas(){
        return 2*jejari*3.14;
    }
}
