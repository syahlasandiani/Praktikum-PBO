/*  Nama File   : RuangKelas.java
 *  Deskripsi   : Class RuangKelas subclass dari Ruang
 *  Pembuat     : Syahla Sandiani / 24060123130066
 *  Tanggal     : 27 Maret 2025 */

public class RuangKelas extends Ruang {
    private int jmlKursi;
    private int jmlKursiRusak;

    public RuangKelas(String kode, double panjang, double lebar, double tinggi, int kapasitas, int jmlKursi, int jmlKursiRusak) {
        super(kode, panjang, lebar, tinggi, kapasitas);
        this.jmlKursi = jmlKursi;
        this.jmlKursiRusak = jmlKursiRusak;
    }

    public int getJumlahKursi(){ 
        return jmlKursi;
    }

    public void setJumlahKursi(int jmlKursi){
        this.jmlKursi = jmlKursi;
    }

    public int getJumlahKursiRusak(){ 
        return jmlKursiRusak;
    }

    public void setJumlahKursiRusak(int jmlKursiRusak){ 
        this.jmlKursiRusak = jmlKursiRusak;
    }

    public void printInfo(){
        System.out.println("Jumlah Kursi        : " + jmlKursi);
        System.out.println("Jumlah Kursi Rusak  : " + jmlKursiRusak);
    }
}
