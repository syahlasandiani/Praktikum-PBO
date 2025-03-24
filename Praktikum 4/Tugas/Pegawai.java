/*  Nama File   : Pegawai.java
 *  Deskripsi   : Superclass Pegawai
 *  Pembuat     : Syahla Sandiani / 24060123130066
 *  Tanggal     : 13 Maret 2025
*/

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Pegawai {
    private String NIP, nama;
    private double gajiPokok;
    private LocalDate tglLahir, TMT;


    public Pegawai(String NIP, String nama, LocalDate tglLahir, LocalDate TMT, double gajiPokok) {
        this.NIP = NIP;
        this.nama = nama;
        this.tglLahir = tglLahir;
        this.TMT = TMT;
        this.gajiPokok = gajiPokok;
    }

    public String getNIP(){
        return NIP;
    }

    public void setNIP(String NIP){
        this.NIP = NIP;
    }

    public String getNama(){
        return nama;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public LocalDate getTglLahir(){
        return tglLahir;
    }

    public void setTglLahir(LocalDate tglLahir){
        this.tglLahir = tglLahir;
    }

    public LocalDate getTMT(){
        return TMT;
    }

    public void setTMT(LocalDate TMT){
        this.TMT = TMT;
    }

    public double getGajiPokok(){ 
        return gajiPokok;
    }
    
    public void setGajiPokok(double gajiPokok){
        this.gajiPokok = gajiPokok; 
    }

    public long getMasaKerja() {
        return ChronoUnit.YEARS.between(TMT, LocalDate.now());
    }

    public void printInfo() {
        System.out.println("NIP                     : " + NIP);
        System.out.println("Nama                    : " + nama);
        System.out.println("Tanggal Lahir           : " + tglLahir);
        System.out.println("TMT                     : " + TMT);
        System.out.println("Gaji Pokok              : Rp " + String.format("%,.2f", gajiPokok));
    }
}
