package jdbc.utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MysqlUtility {
    private static final String URL = "jdbc:mysql://localhost:3306/db_mahasiswa";
    private static final String USER = "root";
    private static final String PASSWORD = "woO0tamelon";

    public static Connection getConnection() throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // driver MySQL versi 8+
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("Driver tidak ditemukan", e);
        }

        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
