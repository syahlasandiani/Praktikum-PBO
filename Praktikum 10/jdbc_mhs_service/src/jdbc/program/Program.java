/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc.program;

import jdbc.service.MysqlMahasiswaService;
import jdbc.model.Mahasiswa;
import java.util.List;
import java.util.ArrayList;


public class Program {

    static MysqlMahasiswaService service = new MysqlMahasiswaService();

    public static void main(String[] args) {
        List<Mahasiswa> listmhs = new ArrayList<>();
        System.out.println("");

        // insert
        System.out.println("===insert===");
        Mahasiswa mhsAdd = new Mahasiswa(5, "Haryo");
        service.addMahasiswa(mhsAdd);
        System.out.println("berhasil insert: " + mhsAdd);
        displayAll();

        // update
        System.out.println("===update===");
        Mahasiswa mhsUpdate = service.getById(5);
        System.out.println("Akan diupdate data lama: " + mhsUpdate);
        mhsUpdate.setNama("Dinaya");
        System.out.println("dengan data baru: " + mhsUpdate);
        service.updateMahasiswa(mhsUpdate);
        displayAll();

        // delete
        System.out.println("===delete===");
        System.out.println("akan di delete: " + service.getById(5));
        service.deleteMahasiswa(5);
        displayAll();
    }

    public static void displayAll() {
    List<Mahasiswa> list = service.getAllMahasiswa();
    for (Mahasiswa mhs : list) {
        System.out.println(mhs.getId() + " - " + mhs.getNama());
    }
}

}

