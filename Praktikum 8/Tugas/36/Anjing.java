package Tugas36;

/*  Nama File   : Anjing.java
 *  Deskripsi   : Class Anjing
 *  Pembuat     : Syahla Sandiani / 24060123130066
 *  Tanggal     : 10 Mei 2025 */

public class Anjing extends Anabul {

    public Anjing(String nama) {
        super(nama);
    }

    @Override
    public void bergerak() {
        System.out.println("bergerak dengan cara melata");
    }

    @Override
    public void bersuara() {
        System.out.println("bersuara: Guk-guk!");
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
