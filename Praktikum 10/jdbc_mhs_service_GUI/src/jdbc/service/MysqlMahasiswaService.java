package jdbc.service;

import jdbc.model.Mahasiswa;
import jdbc.utilities.MysqlUtility;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MysqlMahasiswaService {

    public void addMahasiswa(Mahasiswa m) {
        String sql = "INSERT INTO mahasiswa (id, nama) VALUES (?, ?)";
        try (Connection conn = MysqlUtility.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, m.getId());
            stmt.setString(2, m.getNama());
            stmt.executeUpdate();
            System.out.println("Berhasil insert");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Mahasiswa> getAllMahasiswa() {
        List<Mahasiswa> list = new ArrayList<>();
        String sql = "SELECT * FROM mahasiswa";

        try (Connection conn = MysqlUtility.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                Mahasiswa m = new Mahasiswa(
                    rs.getInt("id"),
                    rs.getString("nama")
                );
                list.add(m);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return list;
    }

    public Mahasiswa getById(int id) {
        String sql = "SELECT * FROM mahasiswa WHERE id=?";
        try (Connection conn = MysqlUtility.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                return new Mahasiswa(
                    rs.getInt("id"),
                    rs.getString("nama")
                );
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void updateMahasiswa(Mahasiswa m) {
        String sql = "UPDATE mahasiswa SET nama=? WHERE id=?";
        try (Connection conn = MysqlUtility.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, m.getNama());
            stmt.setInt(2, m.getId());
            stmt.executeUpdate();
            System.out.println("Berhasil update");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteMahasiswa(int id) {
        String sql = "DELETE FROM mahasiswa WHERE id=?";
        try (Connection conn = MysqlUtility.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);
            stmt.executeUpdate();
            System.out.println("Berhasil delete");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
