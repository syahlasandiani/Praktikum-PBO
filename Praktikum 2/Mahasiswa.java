import java.util.ArrayList;

public class Mahasiswa {
    private String nim;
    private String nama;
    private String prodi;
    ArrayList <MataKuliah> listMatKul;
    private Dosen dosenWali;
    private Kendaraan kendaraan;

    public Mahasiswa (String nim, String nama, String prodi){
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.listMatKul = new ArrayList<>();
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public String getNama(){
        return nama;
    }

    public void setNIM(String nim){
        this.nim = nim;
    }

    public String getNIM(){
        return nim;
    }

    public void setProdi(String prodi){
        this.prodi = prodi;
    }

    public String getProdi(){
        return prodi;
    }

    public Dosen getDosenWali(){
        return this.dosenWali;
    }
 
    public Kendaraan getKendaraan(){
        return this.kendaraan;
    }

    public void setDosenWali(Dosen dosenWali){
        this.dosenWali = dosenWali;
    }

    public void setKendaraan(Kendaraan kendaraan){
        this.kendaraan = kendaraan;
    }

    public void addMatkul(MataKuliah mataKuliah){
        if (this.listMatKul.size() < 50){
            this.listMatKul.add(mataKuliah);
        }
        else{
            System.out.println("List Mata Kuliah Sudah Penuh");
        }
    }

    public int getJumlahSKS(){
        int jumlah = 0;

        for (int i = 0; i < listMatKul.size(); i++){
            jumlah += listMatKul.get(i).getSKS();
        }
        return jumlah;
    }

    public int getJumlahMatKul(){
        return listMatKul.size();
    }

    public void printMhs(){
        System.out.println("Nim: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Prodi: " + prodi);
    }    

    public void printDetailMhs(){
        System.out.println("Nim: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Prodi: " + prodi);
        int i;
        for(i=0;i<listMatKul.size();i++){
            System.out.println(listMatKul.get(i).getNama());
        }
    }



}
