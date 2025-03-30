/*  Nama File   : Lingkaran.java
 *  Deskripsi   : Class Lingkaran subclass BangunDatar
 *  Pembuat     : Syahla Sandiani / 24060123130066
 *  Tanggal     : 20 Maret 2025 */

public class Lingkaran extends BangunDatar implements IResize{
    private double jari;

    public Lingkaran(double jari, String warna, String border) {
        super(warna, border);
        this.jari = jari;
    }

    public double getJari(){
        return jari;
    }

    public void setJari(double jari){
        this.jari = jari;
    }

    public double getLuas(){
        return Math.PI*jari*jari;
    }

    public double getKeliling(){
        return 2*Math.PI*jari;
    }

    public void zoomIn(){ 
        jari *= 1.1; 
    }

    public void zoomOut(){ 
        jari *= 0.9; 
    }

    public void zoom(int percent){
        jari = jari * percent/100;
    }

    public void printInfo() {
        System.out.println("Warna Bangun Datar : " + getWarna());
        System.out.println("Border Bangun Datar : " + getBorder());
        System.out.println("Jari-jari : " + jari);
    }
}
