/*  Nama File   : DosenTamu.java
 *  Deskripsi   : DosenTamu subclass dari Dosen
 *  Pembuat     : Syahla Sandiani / 24060123130066
 *  Tanggal     : 13 Maret 2025
*/

import java.time.LocalDate;

public class DosenTamu extends Pegawai {
    private String NIDK;
    private LocalDate tglAkhirKontrak;

    public DosenTamu(String NIP, String nama, LocalDate tanggalLahir, LocalDate TMT, double gajiPokok, String NIDK, LocalDate tglAkhirKontrak) {
        super(NIP, nama, tanggalLahir, TMT, gajiPokok);
        this.NIDK = NIDK;
        this.tglAkhirKontrak = tglAkhirKontrak;
    }

    public String getNIDK(){ 
        return NIDK;
    }

    public void setNIDK(String NIDK){ 
        this.NIDK = NIDK;
    }

    public LocalDate getTglAkhirKontrak(){
        return tglAkhirKontrak;
    }

    public void setTglAkhirKontrak(LocalDate tglAkhirKontrak){ 
        this.tglAkhirKontrak = tglAkhirKontrak;
    }

    public void printInfo() {
        super.printInfo();
        System.out.println("Jabatan                 : Dosen Tamu");
        System.out.println("Masa Kontrak Berakhir   : " + tglAkhirKontrak);
        double tunjangan = 0.025 * getGajiPokok();
        System.out.println("Tunjangan               : Rp " + String.format("%,.2f", tunjangan));
    }
}
