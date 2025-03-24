/*  Nama File   : DosenTetap.java
 *  Deskripsi   : DosenTetap subclass dari Dosen
 *  Pembuat     : Syahla Sandiani / 24060123130066
 *  Tanggal     : 13 Maret 2025
*/

import java.time.LocalDate;

public class DosenTetap extends Dosen {
    private String NIDN;

    public DosenTetap(String NIP, String nama, LocalDate tglLahir, LocalDate TMT, double gajiPokok, String NIDN, String fakultas) {
        super(NIP, nama, tglLahir, TMT, gajiPokok, fakultas);
        this.NIDN = NIDN;
    }

    public String getNIDN(){
        return NIDN; 
    }

    public void setNIDN(String NIDN){
        this.NIDN = NIDN; 
    }

    public void printInfo() {
        super.printInfo();
        System.out.println("Jabatan                 : Dosen Tetap");
        System.out.println("Fakultas                : " + getFakultas());
        System.out.println("Masa Kerja              : " + getMasaKerja() + " tahun");
        System.out.println("BUP                     : " + getTglLahir().plusYears(65));
        double tunjangan = 0.02 * getMasaKerja() * getGajiPokok();
        System.out.println("Tunjangan               : Rp " + String.format("%,.2f", tunjangan));
    }
}
