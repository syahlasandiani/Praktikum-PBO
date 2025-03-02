public class Dosen {

    // atribut
    private String nip;
    private String nama;
    private String prodi;

    // method
    // konstruktor tanpa parameter
    public Dosen(){
        this.nip = " ";
        this.nama = " ";
        this.prodi = " ";
    } 

    // konstruktor dengan parameter
    public Dosen(String nip, String nama, String prodi){
        this.nip = nip;
        this.nama = nama;
        this.prodi = prodi;
    }

    // selektor
    public void setNama(String nama){
        this.nama = nama;
    }

    public String getNama(){
        return nama;
    }

    public void setNIP(String nip){
        this.nip = nip;
    }

    public String getNIP(){
        return nip;
    }

    public void setProdi(String prodi){
        this.prodi = prodi;
    }

    public String getProdi(){
        return prodi;
    }
}
