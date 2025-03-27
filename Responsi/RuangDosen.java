/*  Nama File   : RuangDosen.java
 *  Deskripsi   : Class RuangDosen subclass Ruang
 *  Pembuat     : Syahla Sandiani / 24060123130066
 *  Tanggal     : 27 Maret 2025 */

public class RuangDosen extends Ruang {
    private String namaDosen;
    private int jmlMeja;
    private int jmlKursi;

    public RuangDosen(String kode, double panjang, double lebar, double tinggi, int kapasitas, String namaDosen, int jmlMeja, int jmlKursi) {
        super(kode, panjang, lebar, tinggi, kapasitas);
        this.namaDosen = namaDosen;
        this.jmlMeja = jmlMeja;
        this.jmlKursi = jmlKursi;
    }

    public String getNamaDosen(){
        return namaDosen;
    }

    public void setNamaDosen(String namaDosen){ 
        this.namaDosen = namaDosen; 
    }

    public int getJumlahMeja(){ 
        return jmlMeja; 
    }
    
    public void setJumlahMeja(int jmlMeja){ 
        this.jmlMeja = jmlMeja; 
    }

    public int getJumlahKursi(){ 
        return jmlKursi; 
    }
    
    public void setJumlahKursi(int jmlKursi){ 
        this.jmlKursi = jmlKursi; 
    }

    public void printInfo(){
        System.out.println("Nama Dosen          : " + namaDosen);
        System.out.println("Jumlah Meja         : " + jmlMeja);
        System.out.println("Jumlah Kursi        : " + jmlKursi);
    }
}
