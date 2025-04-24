/*  Nama File   : TestPolimorfisme.java
 *  Deskripsi   : Class Main
 *  Pembuat     : Syahla Sandiani / 24060123130066
 *  Tanggal     : 24 April 2025 */

import java.util.ArrayList;

public class TestPolimorfisme {
    public static void main(String[] args) {
        System.out.println("Nama: Syahla Sandiani");
        System.out.println("NIM: 24060123130066");
        System.out.println(); 
        
        Pegawai pegawai1 = new Programmer("Mira");
        Pegawai pegawai2 = new Manajer("Joko");
        Manajer pegawai3 = new Manajer("Argo");

        ArrayList<Pegawai> emps = new ArrayList<>();
        emps.add(pegawai1);
        emps.add(pegawai2);
        emps.add(pegawai3);

        for (Pegawai emp : emps) {
            emp.tampilData();
        }
    }
}

// nomor 2
// kode lebih fleksibel dan reusable, pegawai dapat dimasukan ke dalam list meskipun tipenya berbeda (manajer dan programer)
// pemanggilan metode yg tepat (dynamic binding)
// memudahkan pengelolaan banyak tipe objek

// nomor 3
// jika menambahkan pegawai4 dan pegawai5 tanpa polimorfisme, tidak bisa menyimpan dalam satu arraylist pegawai, harus dipisah menjadi
// arraylist manajer dan arraylist programmer, kode juga menjadi lebih rumit
