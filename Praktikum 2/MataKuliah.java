public class MataKuliah {
    private String idMatKul;
    private String nama;
    private Integer sks;

    public MataKuliah(){
        this.idMatKul = " ";
        this.nama = " ";
        this.sks = 0;
    }

    public MataKuliah(String idMatKul, String nama, Integer sks){
        this.idMatKul = idMatKul;
        this.nama = nama;
        this.sks = sks;
    }

    public void setIdMatKul(String idMatKul){
        this.idMatKul = idMatKul;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public void setSKS(Integer sks){
        this.sks = sks;
    }

    public String getIdMatKul(){
        return idMatKul;
    }

    public String getNama(){
        return nama;
    }

    public Integer getSKS(){
        return sks;
    }
}
