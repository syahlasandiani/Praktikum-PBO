/*  Nama File   : AnabulGeneric.java
 *  Deskripsi   : Class Anabul Generic
 *  Pembuat     : Syahla Sandiani / 24060123130066
 *  Tanggal     : 8 Mei 2025 */

public class AnabulGeneric {
    public static <T extends Anabul> void tampilkanPerilaku(Datum<T> datum) {
        datum.getIsi().suara();
        datum.getIsi().gerak();
    }
}
