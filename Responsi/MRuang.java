/*  Nama File   : MRuang.java
 *  Deskripsi   : Main untuk Class Ruang
 *  Pembuat     : Syahla Sandiani / 24060123130066
 *  Tanggal     : 27 Maret 2025 */

public class MRuang {
    public static void main(String[] args) {
        RuangKelas kelas1 = new RuangKelas("K001", 10, 8, 3, 40, 35, 5);
        RuangLaboratorium lab1 = new RuangLaboratorium("L001", 12, 10, 4, 30, "Lab Komputer", 500000);
        LabKomputer labKomputer1 = new LabKomputer("LK001", 14, 10, 4, 30, "Lab Multimedia", 600000, 20);
        LabNonKomputer labNonKomputer1 = new LabNonKomputer("LN001", 15, 10, 4, 30, "Lab Kimia", 550000, 15);
        RuangDosen dosen1 = new RuangDosen("D001", 5, 4, 3, 2, "Alex Dunphy", 2, 1);
        RuangDepartemen departemen1 = new RuangDepartemen("RD001", 8, 6, 3, 10, 5, 4, 2);
        Departemen dep1 = new Departemen("Informatika", "Jay Pritchett", 70000);


        System.out.println("\nInformasi Ruang Kelas");
        System.out.println("Kode Ruang          : " + kelas1.getKode());
        System.out.println("Dimensi             : " + kelas1.getPanjang() + " x " + kelas1.getLebar() + " x " + kelas1.getTinggi());
        System.out.println("Kapasitas           : " + kelas1.getKapasitas());
        System.out.println("Biaya Kebersihan    : " + kelas1.hitungBiayaKebersihan(1000) + "\n");
        System.out.println();

        System.out.println("Informasi Ruang Lab");
        System.out.println("Kode Ruang          : " + lab1.getKode());
        System.out.println("Dimensi             : " + lab1.getPanjang() + " x " + lab1.getLebar() + " x " + lab1.getTinggi());
        System.out.println("Kapasitas           : " + lab1.getKapasitas());
        System.out.println("Biaya Kebersihan    : " + lab1.hitungBiayaKebersihan(1000) + "\n");
        System.out.println();

        System.out.println("Informasi Ruang Lab Komputer");
        System.out.println("Kode Ruang          : " + labKomputer1.getKode());
        System.out.println("Dimensi             : " + labKomputer1.getPanjang() + " x " + labKomputer1.getLebar() + " x " + labKomputer1.getTinggi());
        System.out.println("Kapasitas           : " + labKomputer1.getKapasitas());
        System.out.println("Biaya Kebersihan    : " + labKomputer1.hitungBiayaKebersihan(1200) + "\n");
        System.out.println();

        System.out.println("Informasi Ruang Lab Non-Komputer");
        System.out.println("Kode Ruang          : " + labNonKomputer1.getKode());
        System.out.println("Dimensi             : " + labNonKomputer1.getPanjang() + " x " + labNonKomputer1.getLebar() + " x " + labNonKomputer1.getTinggi());
        System.out.println("Kapasitas           : " + labNonKomputer1.getKapasitas());
        System.out.println("Biaya Kebersihan    : " + labNonKomputer1.hitungBiayaKebersihan(1200) + "\n");
        System.out.println();

        System.out.println("Informasi Ruang Dosen");
        System.out.println("Kode Ruang          : " + dosen1.getKode());
        System.out.println("Dimensi             : " + dosen1.getPanjang() + " x " + dosen1.getLebar() + " x " + dosen1.getTinggi());
        System.out.println("Kapasitas           : " + dosen1.getKapasitas());
        System.out.println("Biaya Kebersihan    : " + dosen1.hitungBiayaKebersihan(1500) + "\n");
        System.out.println();

        System.out.println("Informasi Ruang Departemen");
        System.out.println("Kode Ruang          : " + departemen1.getKode());
        System.out.println("Dimensi             : " + departemen1.getPanjang() + " x " + departemen1.getLebar() + " x " + departemen1.getTinggi());
        System.out.println("Kapasitas           : " + departemen1.getKapasitas());
        System.out.println("Biaya Kebersihan    : " + departemen1.hitungBiayaKebersihan(1500) + "\n");
        System.out.println();

        System.out.println("Informasi Departemen");
        dep1.printInfo();
    }
}
