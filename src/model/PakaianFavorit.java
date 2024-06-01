/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import static model.Database.rs;

/**
 *
 * @author MSI Modern 14
 */
public class PakaianFavorit {

    String nama;
    String id;

    public static boolean TambahFavorit(String id, String nama) {
        Database.connect();
        try {
            String query = "INSERT INTO favorit VALUES (?, ?)";
            Database.pst = Database.conn.prepareStatement(query);
            Database.pst.setString(1, id);
            Database.pst.setString(2, nama);

            int rowsAffected = Database.pst.executeUpdate();

            if (rowsAffected > 0) {
                Database.disconnect();
                return true;
            }
        } catch (NumberFormatException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Pakaian Favorit gagal ditambahkan! " + e.getMessage());
            Database.disconnect();
        }
        return false;
    }

    public static boolean HapusSemuaFavorit(String id) {
        Database.connect();
        try {
            String query = "DELETE FROM favorit WHERE id = ?";
            Database.pst = Database.conn.prepareStatement(query);
            Database.pst.setString(1, id);

            int rowsAffected = Database.pst.executeUpdate();

            if (rowsAffected > 0) {
                Database.disconnect();
                return true;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Pakaian Favorit gagal dihapus! " + e.getMessage());
        }
        Database.disconnect();
        return false;
    }

    public static boolean HapusFavorit(String id, String nama) {
        Database.connect();
        try {
            String query = "DELETE FROM favorit WHERE id = ? AND nama=?";
            Database.pst = Database.conn.prepareStatement(query);
            Database.pst.setString(1, id);
            Database.pst.setString(2, nama);

            int rowsAffected = Database.pst.executeUpdate();

            if (rowsAffected > 0) {
                Database.disconnect();
                return true;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Pakaian Favorit gagal dihapus! " + e.getMessage());
        }
        Database.disconnect();
        return false;
    }

    public static List<String> getDataIDPakaianFavorit(String nama) {
        List<String> dataID = new ArrayList<>();
        Database.connect();
        try {
            String query = "SELECT * FROM favorit where nama=?";
            Database.pst = Database.conn.prepareStatement(query);
            Database.pst.setString(1, nama);
            Database.rs = Database.pst.executeQuery();

            while (rs.next()) {
                dataID.add(rs.getString("id"));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "gagal mengambil data pakaian! " + e.getMessage());
        }
        Database.disconnect();
        return dataID;
    }
     public static final int cekFavorit(String id, String nama) {
        Database.connect();
        try {
            String query = "SELECT * FROM favorit";
            Database.pst = Database.conn.prepareStatement(query);
            Database.rs = Database.pst.executeQuery();
            while (Database.rs.next()) {
                String namaDB = Database.rs.getString("nama");
                String idDB = Database.rs.getString("id");
                if (nama.equals(namaDB) && id.equals(idDB)) {
                    Database.disconnect();
                    return 1;
                }

            }
            Database.disconnect();
            return 0;
        } catch (NumberFormatException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Terjadi Error Saat Pengecekan Pakaian Favorit! ");

            Database.disconnect();
            return -1;
        }
    }
}
