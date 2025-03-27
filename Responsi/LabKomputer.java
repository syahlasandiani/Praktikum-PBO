/*  Nama File   : LabKomputer.java
 *  Deskripsi   : Class LabKomputer subclass RuangLaboratorium
 *  Pembuat     : Syahla Sandiani / 24060123130066
 *  Tanggal     : 27 Maret 2025 */

public class LabKomputer extends RuangLaboratorium {
    private int jmlKomputer;

    public LabKomputer(String kode, double panjang, double lebar, double tinggi, int kapasitas, String namaLab, double hargaSewa, int jmlKomputer) {
        super(kode, panjang, lebar, tinggi, kapasitas, namaLab, hargaSewa);
        this.jmlKomputer = jmlKomputer;
    }

    public void printInfo() {
        System.out.println("Jumlah Komputer     : " + jmlKomputer);
    }
    
}
