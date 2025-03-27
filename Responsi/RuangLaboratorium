/*  Nama File   : RuangLaboratorium.java
 *  Deskripsi   : Class RuangLaboratorium subclass Ruang
 *  Pembuat     : Syahla Sandiani / 24060123130066
 *  Tanggal     : 27 Maret 2025 */

public class RuangLaboratorium extends Ruang {
    private String namaLab;
    private double hargaSewa;

    public RuangLaboratorium(String kode, double panjang, double lebar, double tinggi, int kapasitas, String namaLab, double hargaSewa) {
        super(kode, panjang, lebar, tinggi, kapasitas);
        this.namaLab = namaLab;
        this.hargaSewa = hargaSewa;
    }

    public String getNamaLab(){ 
        return namaLab; 
    }
    
    public void setNamaLab(String namaLab){ 
        this.namaLab = namaLab; 
    }

    public double getHargaSewa(){ 
        return hargaSewa; 
    }
    
    public void setHargaSewa(double hargaSewa){ 
        this.hargaSewa = hargaSewa; 
    }

    public void printInfo() {
        System.out.println("Nama Laboratorium   : " + namaLab);
        System.out.println("Harga Sewa          : " + hargaSewa);
    }
}
