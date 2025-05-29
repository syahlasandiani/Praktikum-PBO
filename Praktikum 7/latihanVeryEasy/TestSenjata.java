package latihanVeryEasy;

/*  Nama File   : TestSenjata.java
 *  Deskripsi   : Class Test Senjata
 *  Pembuat     : Syahla Sandiani / 24060123130066
 *  Tanggal     : 8 Mei 2025 */

public class TestSenjata {
    public static void main (String [] args) {
        Senjata ak47 = new Senjata ("TAR");
        Senjata m16 = new Senjata ("DOR");
        
        System.out.println("Jumlah Peluru AK47: " + ak47.getPeluru());
        System.out.println("AK47 mengisi peluru ");
        ak47.setPeluru(5);
        System.out.println("Jumlah Peluru AK47: "+ ak47.getPeluru());
        
        System.out.println("AK47 menembak");
        ak47.menembak();
    }
}
