import java.sql.Connection;
import java.sql.DriverManager;

/*  Nama File   : MySQLPersonDAO.java
 *  Deskripsi   : implementasi PersonDAO untuk MySQL
 *  Pembuat     : Syahla Sandiani / 24060123130066
 *  Tanggal     : 15 Mei 2025 */

import java.sql.*;

public class MySQLPersonDAO implements PersonDAO {
    public void savePerson(Person person) {
        try {
            String name = person.getName();
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/pbo", "root", "woO0tamelon");

            String query = "INSERT INTO person(name) VALUES('" + name + "')";
            System.out.println("Executing: " + query);

            Statement s = conn.createStatement();
            s.executeUpdate(query);
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
