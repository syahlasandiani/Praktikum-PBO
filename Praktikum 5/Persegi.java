/*  Nama File   : Persegi.java
 *  Deskripsi   : Class persegi subclass BangunDatar
 *  Pembuat     : Syahla Sandiani / 24060123130066
 *  Tanggal     : 20 Maret 2025 */

 public class Persegi extends BangunDatar implements IResize {
    private double sisi;

    public Persegi(double sisi, String warna, String border){
        super( warna, border);
        this.sisi = sisi;
    }
    public double getSisi(){
        return sisi; 
    }
    public void setSisi(double sisi){
        this.sisi = sisi;
    }

    public double getLuas(){
        return sisi*sisi;
    }

    public double getKeliling(){
        return 4*sisi;
    }

    public double getDiagonal() {
        return sisi * Math.sqrt(2);
    }

    public void zoomIn(){ 
        sisi *= 1.1; 
    }

    public void zoomOut(){ 
        sisi *= 0.9; 
    }

    public void zoom(int percent){
        sisi = sisi * percent/100;
    }
    
    public void printInfo(){
        System.out.println("Warna Bangun Datar : "+getWarna());
        System.out.println("Border Bangun Datar : "+getBorder());
        System.out.println("Sisi " + sisi);
    }
}
