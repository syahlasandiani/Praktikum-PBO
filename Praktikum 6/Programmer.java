/*  Nama File   : Programmer.java
 *  Deskripsi   : Class Programmer
 *  Pembuat     : Syahla Sandiani / 24060123130066
 *  Tanggal     : 24 April 2025 */

public class Programmer extends Pegawai {
    private int bonus = 450000;

    public Programmer(String nama) {
        super(nama);
    }

    @Override
    public void tampilData() {
        super.tampilData();
        System.out.println("Bonus : " + bonus);
    }
}
