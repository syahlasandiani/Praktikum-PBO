package Tugas36;

/*  Nama File   : Burung.java
 *  Deskripsi   : Class Burung
 *  Pembuat     : Syahla Sandiani / 24060123130066
 *  Tanggal     : 10 Mei 2025 */

public class Burung extends Anabul {

    public Burung(String nama) {
        super(nama);
    }

    @Override
    public void bergerak() {
        System.out.println("bergerak dengan cara terbang");
    }

    @Override
    public void bersuara() {
        System.out.println("bersuara: Cuit!");
    }

    @Override
    public String getNama() {
        return super.getNama();
    }

    @Override
    public void setNama(String nama) {
        super.setNama(nama);
    }
}
