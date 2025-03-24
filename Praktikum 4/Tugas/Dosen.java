/*  Nama File   : Dosen.java
 *  Deskripsi   : Dosen subclass dari Pegawai, Superclass dari DosenTamu dan DosenTetap
 *  Pembuat     : Syahla Sandiani / 24060123130066
 *  Tanggal     : 13 Maret 2025
*/

import java.time.LocalDate;

public class Dosen extends Pegawai {
    private String fakultas;

    public Dosen(String NIP, String nama, LocalDate tglLahir, LocalDate TMT, double gajiPokok, String fakultas) {
        super(NIP, nama, tglLahir, TMT, gajiPokok);
        this.fakultas = fakultas;
    }

    public String getFakultas(){
        return fakultas;
    }
    
    public void setFakultas(String fakultas){
        this.fakultas = fakultas;
    }
}
