/*  Nama File   : MPegawai.java
 *  Deskripsi   : Main untuk class Pegawai
 *  Pembuat     : Syahla Sandiani / 24060123130066
 *  Tanggal     : 13 Maret 2025
*/

import java.time.LocalDate;

public class MPegawai {
    public static void main(String[] args) {
        DosenTetap dosenTetap = new DosenTetap("954647548", "Jake Peralta", LocalDate.of(1990, 5, 21), 
        LocalDate.of(2015, 1, 1), 5000000, "78647324", "Fakultas Sains dan Matematika");

        DosenTamu dosenTamu = new DosenTamu("927461038", "Rosa Diaz", LocalDate.of(1992, 9, 18), 
        LocalDate.of(2020, 3, 10), 4500000, "K1234567", LocalDate.of(2025, 3, 10));

        Tendik tendik = new Tendik("573839280", "Amy Santiago", LocalDate.of(1991, 12, 4), 
        LocalDate.of(2017, 4, 19), 3000000, "Kemahasiswaan");

        System.out.println("\n=== Data Dosen Tetap ===");
        dosenTetap.printInfo();

        System.out.println("\n=== Data Dosen Tamu ===");
        dosenTamu.printInfo();

        System.out.println("\n=== Data Tendik ===");
        tendik.printInfo();
    }
}
