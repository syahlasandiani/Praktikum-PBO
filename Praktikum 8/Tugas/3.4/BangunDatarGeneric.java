package Tugas34;

/*  Nama File   : BangunDatarGeneric.java
 *  Deskripsi   : Class Bangun Datar Generic
 *  Pembuat     : Syahla Sandiani / 24060123130066
 *  Tanggal     : 10 Mei 2025 */

public class BangunDatarGeneric<T extends BangunDatar>{
    private T bangunDatar;
    
   public  void set(T tipeBangunDatar){
       bangunDatar = tipeBangunDatar;
    }
    
    public T get(){
        return bangunDatar;
    }
    
    public double hitungKeliling(){
        return bangunDatar.hitungKeliling();
    }
    
    public double hitungluas(){
        return bangunDatar.hitungLuas();
    }
    
    public void printInfo(){
        System.out.println("luas : " + bangunDatar.hitungLuas());
        System.out.println("keliling : " + bangunDatar.hitungKeliling());
    }
}
