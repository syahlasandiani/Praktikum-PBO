/*  Nama File   : LabNonKomputer.java
 *  Deskripsi   : Class LabNonKomputer subclass RuangLaboratorium
 *  Pembuat     : Syahla Sandiani / 24060123130066
 *  Tanggal     : 27 Maret 2025 */

public class LabNonKomputer extends RuangLaboratorium{
    private int jmlPeralatan;

    public LabNonKomputer(String kode, double panjang, double lebar, double tinggi, int kapasitas, String namaLab, double hargaSewa, int jmlPeralatan) {
        super(kode, panjang, lebar, tinggi, kapasitas, namaLab, hargaSewa);
        this.jmlPeralatan = jmlPeralatan;
    }

    public void printInfo() {
        System.out.println("Jumlah Peralatan    : " + jmlPeralatan);
    }
}
