/*  Nama File   : Manajer.java
 *  Deskripsi   : Class Manajer
 *  Pembuat     : Syahla Sandiani / 24060123130066
 *  Tanggal     : 24 April 2025 */

public class Manajer extends Pegawai {
    private int tunjangan = 700000;

    public Manajer(String nama) {
        super(nama);
    }

    @Override
    public void tampilData() {
        super.tampilData();
        System.out.println("Tunjangan : " + tunjangan);
    }
}
