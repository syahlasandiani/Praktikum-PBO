public class Kendaraan {
    private String noPlat;
    private String jenis;

    public Kendaraan(){
        this.noPlat = " ";
        this.jenis = " ";
    }

    public Kendaraan(String noPlat, String jenis){
        this.noPlat = noPlat;
        this.jenis = jenis;
    }

    public void setNoPlat(String noPlat){
        this.noPlat = noPlat;
    }

    public String getNoPlat(){
        return noPlat;
    }

    public void setJenis( String jenis){
        if (jenis.equalsIgnoreCase("motor") || jenis.equalsIgnoreCase("mobil")){
            this.jenis = jenis;
        }
        else{
            System.out.println("Jenis Kendaraan Harus Motor atau Mobil");
        }
    }
}
