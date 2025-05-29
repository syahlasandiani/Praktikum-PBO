package latihanMedium;

/*  Nama File   : KontrolSenjata.java
 *  Deskripsi   : Class Kontrol Senjata
 *  Pembuat     : Syahla Sandiani / 24060123130066
 *  Tanggal     : 8 Mei 2025 */

public class KontrolSenjata {
    private Senjata senjata;

    public KontrolSenjata(Senjata s) {
        this.senjata = s;
    }
    
    public boolean isAdaPeluru(){
        return senjata.getPeluru() > 0;
    }
    
    public void isiPeluru(int jumPeluru){
        senjata.setPeluru(senjata.getPeluru() + jumPeluru);
        System.out.println(">> Peluru berhasil ditambah: " + jumPeluru);
    }
        
    public void menembak(){
        System.out.println(">> Siap menembak " + 1 + " kali");
        if(senjata.getPeluru() > 0){
            System.out.println(senjata.getBunyi() + " ");
            senjata.setPeluru(senjata.getPeluru() - 1);
            System.out.println("Peluru sisa: " + senjata.getPeluru());
        }else{
            System.out.println("Peluru Habis");
        }
    }
    
    public void menembak(int jumlah){
        System.out.println(">> Siap menembak " + jumlah + " kali");
        if(senjata.getPeluru() > 0){
            for(int count = 0; count < jumlah; ++count){
                if(senjata.getPeluru() <= 0){
                    System.out.println("Gagal tembak, Peluru Habis");
                }else{
                    System.out.println(senjata.getBunyi());
                    senjata.setPeluru(senjata.getPeluru() - 1);
                }
            }
            System.out.println("Peluru sisa: " + senjata.getPeluru());
        }else{
            System.out.println("Peluru Habis");
        }
    }
    
    public String menusuk(){
        if(senjata.isMenusuk()){
            return "Jleb!";
        }else{
            return "Gagal, belum pasang bayonet";
        }
    }
    
    public void pasangBayonet(){
        senjata.setMenusuk(true);
    }
}
