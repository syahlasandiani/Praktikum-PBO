/*  Nama File   : Tendik.java
 *  Deskripsi   : Tendik subclass dari Pegawai
 *  Pembuat     : Syahla Sandiani / 24060123130066
 *  Tanggal     : 13 Maret 2025
*/

import java.time.LocalDate;

public class Tendik extends Pegawai {
    private String bidang;

    public Tendik(String NIP, String nama, LocalDate tglLahir, LocalDate TMT, double gajiPokok, String bidang) {
        super(NIP, nama, tglLahir, TMT, gajiPokok);
        this.bidang = bidang;
    }

    public String getBidang() { return bidang; }
    public void setBidang(String bidang) { this.bidang = bidang; }

    public void printInfo() {
        super.printInfo();
        System.out.println("Jabatan                 : Tendik");
        System.out.println("Bidang                  : " + bidang);
        System.out.println("Masa Kerja              : " + getMasaKerja() + " tahun");
        System.out.println("BUP                     : " + getTglLahir().plusYears(55));
        double tunjangan = 0.01 * getMasaKerja() * getGajiPokok();
        System.out.println("Tunjangan               : Rp " + String.format("%,.2f", tunjangan));
    }
}
