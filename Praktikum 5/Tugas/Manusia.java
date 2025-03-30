/*  Nama File   : Manusia.java
 *  Deskripsi   : Class Manusia
 *  Pembuat     : Syahla Sandiani / 24060123130066
 *  Tanggal     : 23 Maret 2025 */

package Tugas;

public abstract class Manusia {
    protected String nama;
    protected String alamat;
    protected String id;
    protected static int counterMns = 0;
    
    public Manusia(String nama, String alamat, String id){
        this.nama = nama;
        this.alamat = alamat;
        this.id = id;
        counterMns++;
    }

    public abstract double hitungPajak();
    public abstract int hitungMasaKerja();
    public abstract void cetakInfo();
    
    public static int getCounterMns(){ 
        return counterMns; 
    }
    
    public String getNama(){ 
        return nama; 
    }

    public void setNama(String nama){ 
        this.nama = nama; 
    }
    
    public String getAlamat(){ 
        return alamat; 
    }
    
    public void setAlamat(String alamat){ 
        this.alamat = alamat; 
    }
    
    public String getId(){ 
        return id; 
    }
    
    public void setId(String id){ 
        this.id = id; 
    }

}
