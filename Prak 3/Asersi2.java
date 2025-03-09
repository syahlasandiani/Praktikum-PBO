/*  Nama File   : Asersi2.java
 *  Deskripsi   : Program untuk menunjukkan asersi
 *  Pembuat     : Syahla Sandiani / 24060123130066
 *  Tanggal     : 06 Maret 2025
*/

//class lingkaran
class lingkaran{
    private double jariJari;
    public lingkaran(double jariJari){
        this.jariJari = jariJari;
    }
    public double hitungKeliling(){
        double keliling = 2 * Math.PI * jariJari;
        return keliling;
    }
}

//class Asersi2
public class Asersi2 {
    public static void main(String[] args) {
        double jariJari = 0;
        assert(jariJari > 0): "jari-jari tidak boleh nol!!!";
        lingkaran l = new lingkaran(jariJari);
        double kelilingLingkaran = l.hitungKeliling();

        System.out.println("Keliling lingkaran = " + kelilingLingkaran);
    }
}

// Pertanyaan: secara konsep, ada yang kurang tepat pada program Asersi2 di atas.
// Jelaskan pada lembar laporan praktikum!

// Jawaban: Dalam program, perintah assert(jariJari > 0) tidak efektif karena nilai jariJari sudah ditetapkan sebelumnya sebagai 0. 
// Asersi digunakan untuk memeriksa kondisi yang tidak seharusnya terjadi dalam logika program. Karena nilai jariJari jelas 
// sudah didefinisikan sebagai 0, maka asersi ini akan selalu gagal jika dijalankan dengan java -enableassertions Asersi2.
