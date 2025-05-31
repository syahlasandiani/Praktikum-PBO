/*  Nama File   : SerializePerson.java
 *  Deskripsi   : Program untuk serialisasi objek Person
 *  Pembuat     : Syahla Sandiani / 24060123130066
 *  Tanggal     : 15 Mei 2025 */

import java.io.*;

class Person implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private String name;

    public Person(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }
}

public class SerializePerson {
    public static void main(String[] args) {
        Person person = new Person("Panji");
        try {
            FileOutputStream f = new FileOutputStream("person.ser");
            ObjectOutputStream s = new ObjectOutputStream(f);
            s.writeObject(person);
            System.out.println("selesai menulis objek person");
            s.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
