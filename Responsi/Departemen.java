/*  Nama File   : Departemen.java
 *  Deskripsi   : Class Departemen
 *  Pembuat     : Syahla Sandiani / 24060123130066
 *  Tanggal     : 27 Maret 2025 */

public class Departemen {
    private String namaDepartemen;
    private String ketuaDepartemen;
    private double tarifKebersihan;

    public Departemen(String namaDepartemen, String ketuaDepartemen, double tarifKebersihan) {
        this.namaDepartemen = namaDepartemen;
        this.ketuaDepartemen = ketuaDepartemen;
        this.tarifKebersihan = tarifKebersihan;
    }

    public String getNamaDepartemen(){ 
        return namaDepartemen; 
    }
    
    public void setNamaDepartemen(String namaDepartemen){ 
        this.namaDepartemen = namaDepartemen; 
    }

    public String getKetuaDepartemen(){ 
        return ketuaDepartemen; 
    }
    
    public void setKetuaDepartemen(String ketuaDepartemen){ 
        this.ketuaDepartemen = ketuaDepartemen; 
    }

    public double getTarifKebersihan(){ 
        return tarifKebersihan;
    }
    
    public void setTarifKebersihan(double tarifKebersihan){ 
        this.tarifKebersihan = tarifKebersihan;
    }

    public void printInfo() {
        System.out.println("Nama Departemen     : " + namaDepartemen);
        System.out.println("Ketua Departemen    : " + ketuaDepartemen);
        System.out.println("Tarif Kebersihan    : " + tarifKebersihan);
    }
}
