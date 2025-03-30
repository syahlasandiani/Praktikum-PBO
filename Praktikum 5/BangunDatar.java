/*  Nama File   : BangunDatar.java
 *  Deskripsi   : Class BangunDatar
 *  Pembuat     : Syahla Sandiani / 24060123130066
 *  Tanggal     : 20 Maret 2025 */

public abstract class BangunDatar{
    private String warna;
    private String border;
    private static int counterBangunDatar = 0;

    public abstract double getLuas();
    public abstract double getKeliling();

    public BangunDatar(){
        counterBangunDatar++;
    }

    public BangunDatar(String warna, String border) {
        this.warna = warna;
        this.border = border;
        counterBangunDatar++;
    }

    public String getWarna(){
        return warna;
    }

    public void setWarna(String warna){
        this.warna = warna;
    }

    public String getBorder(){
        return border;
    }

    public void setBorder(String border){
        this.border = border;
    }

    public boolean isEqualLuas(BangunDatar X) {
        return this.getLuas() == X.getLuas();
    }
    
    public boolean isEqualKeliling(BangunDatar X) {
        return this.getKeliling() == X.getKeliling();
    }

    public void printInfo(){
        System.out.println("Warna: " + warna);
        System.out.println("Border: " + border);
    }

    public static void counterBangunDatar(){
        System.out.println("Jumlah Objek Bangun Datar: " + counterBangunDatar);
    }
}
