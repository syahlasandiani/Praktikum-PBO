/*  Nama File   : AngkaSial.java
 *  Deskripsi   : Program penggunaan exception buatan sendiri
 *                  Pengenalan klausa 'throw' dan 'throws'
 *  Pembuat     : Syahla Sandiani / 24060123130066
 *  Tanggal     : 06 Maret 2025
*/

public class AngkaSial {
    public void cobaAngka(int angka) throws AngkaSialException {
        if (angka == 13) {
            throw new AngkaSialException();
        }
        System.out.println(angka + " bukan angka sial");
    }

    public static void main(String[] args) {
        AngkaSial as = new AngkaSial();
        try {
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);
        } catch (AngkaSialException e) {
            System.out.println(e.getMessage());
            System.out.println("hati-hati memasukkan angka!!!");
        }
    }
}

// Pertanyaan: Ketika eksepsi terjadi, apakah baris 12 pada AngkaSial.java di atas dieksekusi?
// Jawaban: Tidak, baris 12 tidak akan di eksekusi, karena program akan di catch di main

// Pertanyan: Apakah baris 21 pada AngkaSial.java di atas dieksekusi?
// Jawaban: Iya, baris 21 akan di eksekusi, karena program akan di catch dan mengeluarkan output "hati-hati memasukan angka"
