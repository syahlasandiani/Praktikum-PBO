public class Lingkaran extends BangunDatar{
    private double jari;

    public Lingkaran(){  
    }

    public Lingkaran(double jari, String warna, String Border){
        super();
        this.jari = jari;
    }

    public double getJari(){
        return jari;
    }

    public void setJari(double jari){
        this.jari = jari;
    }

    public double getLuas(){
        return Math.PI*jari*jari;
    }

    public double getKeliling(){
        return 2*Math.PI*jari;
    }

    public void printInfo() {
        System.out.println("Warna Bangun Datar : " + getWarna());
        System.out.println("Border Bangun Datar : " + getBorder());
        System.out.println("Jumlah Sisi Bangun Datar : " + getJmlSisi());
        System.out.println("Jari-jari : " + jari);
    }
}
