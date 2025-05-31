/*  Nama File   : Person.java
 *  Deskripsi   : Person database model
 *  Pembuat     : Syahla Sandiani / 24060123130066
 *  Tanggal     : 15 Mei 2025 */

import java.io.Serializable;

public class Person implements Serializable {
    private static final long serialVersionUID = 1L;

    private String name;

    public Person(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }
}
