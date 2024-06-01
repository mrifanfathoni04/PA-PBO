package model;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.swing.JOptionPane;
import static model.Database.rs;

public class Pakaian {

    String id;
    String jenis;
    String model;
    String desain;
    String bahan;
    String warna;
    String ukuran;
    String harga;
    String status;
    public static String idUbahData;

    public static final int getLastId() {
        Database.connect();
        try {
            String query = "SELECT * FROM pakaian";
            Database.pst = Database.conn.prepareStatement(query);
            Database.rs = Database.pst.executeQuery();
            ArrayList<Integer> pakIdArrs = new ArrayList<>();
            while (Database.rs.next()) {
                String pakIdStr = Database.rs.getString("id");
                int custId = Integer.parseInt(pakIdStr.replaceAll("[^0-9]", ""));
                pakIdArrs.add(custId);
            }
            if (pakIdArrs.isEmpty()) {
                System.out.println("Id Pakaian Terakhir = 0");
                Database.disconnect();
                return 0;
            } else {
                System.out.println("Id Pakaian Terakhir = " + Collections.max(pakIdArrs));
                Database.disconnect();
                return Collections.max(pakIdArrs);
            }
        } catch (NumberFormatException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Terjadi Error Saat Mengecek id pakaian terakhir");
            Database.disconnect();
            return -1;
        }
    }

    public static boolean TambahPakaian(int id, String Jenis, String model, String desain, String bahan, String warna, String ukuran, String harga) {
        Database.connect();
        try {
            String query = "INSERT INTO pakaian VALUES (?, ?, ?, ?, ?, ?, ?, ?, '')";
            Database.pst = Database.conn.prepareStatement(query);
            Database.pst.setString(1, (id + 1) + "-BRG");
            Database.pst.setString(2, Jenis);
            Database.pst.setString(3, model);
            Database.pst.setString(4, desain);
            Database.pst.setString(5, bahan);
            Database.pst.setString(6, warna);
            Database.pst.setString(7, ukuran);
            Database.pst.setString(8, harga);

            int rowsAffected = Database.pst.executeUpdate();

            if (rowsAffected > 0) {
                Database.disconnect();
                return true;
            }
        } catch (NumberFormatException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Pakaian gagal ditambahkan! " + e.getMessage());
            Database.disconnect();
        }
        return false;
    }

    public static boolean UbahPakaian(String id, String Jenis, String model, String desain, String bahan, String warna, String ukuran, String harga) {
        Database.connect();
        try {
            String query = "UPDATE pakaian SET jenis=?,model=?,desain=?,bahan=?,warna=?,ukuran=?,harga=?  WHERE id=?";
            Database.pst = Database.conn.prepareStatement(query);
            Database.pst.setString(1, Jenis);
            Database.pst.setString(2, model);
            Database.pst.setString(3, desain);
            Database.pst.setString(4, bahan);
            Database.pst.setString(5, warna);
            Database.pst.setString(6, ukuran);
            Database.pst.setString(7, harga);
            Database.pst.setString(8, id);

            int rowsAffected = Database.pst.executeUpdate();

            if (rowsAffected > 0) {
                Database.disconnect();
                return true;
            }
        } catch (NumberFormatException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Pakaian gagal diubah! " + e.getMessage());
            Database.disconnect();
        }
        return false;
    }

    public static boolean HapusPakaian(String id) {
        Database.connect();
        try {
            String query = "DELETE FROM pakaian WHERE id = ?";
            Database.pst = Database.conn.prepareStatement(query);
            Database.pst.setString(1, id);

            int rowsAffected = Database.pst.executeUpdate();

            if (rowsAffected > 0) {
                Database.disconnect();
                return true;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Pakaian gagal dihapus! " + e.getMessage());
        }
        Database.disconnect();
        return false;
    }

    public static boolean BeliPakainan(String id, String nama) {
        Database.connect();
        try {
            String query = "UPDATE pakaian SET status=? WHERE id = ?";
            Database.pst = Database.conn.prepareStatement(query);
            Database.pst.setString(2, id);
            Database.pst.setString(1, nama);

            int rowsAffected = Database.pst.executeUpdate();

            if (rowsAffected > 0) {
                Database.disconnect();
                return true;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Pakaian gagal dibeli! " + e.getMessage());
        }
        Database.disconnect();
        return false;
    }

    public static List<List<String>> getDataPakaian() {
        List<List<String>> data = new ArrayList<>();
        Database.connect();
        try {
            String query = "SELECT * FROM pakaian where status=''";
            Database.pst = Database.conn.prepareStatement(query);
            Database.rs = Database.pst.executeQuery();

            while (rs.next()) {
                List<String> row = new ArrayList<>();
                row.add(rs.getString("id"));
                row.add(rs.getString("jenis"));
                row.add(rs.getString("model"));
                row.add(rs.getString("desain"));
                row.add(rs.getString("bahan"));
                row.add(rs.getString("warna"));
                row.add(rs.getString("ukuran"));
                row.add(rs.getString("harga"));
                data.add(row);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "gagal mengambil data pakaian! " + e.getMessage());
        }
        Database.disconnect();
        return data;
    }

    public static List<String> getDataPakaianUbah(String Id) {
        List<String> data = new ArrayList<>();
        Database.connect();
        try {
            String query = "SELECT * FROM pakaian where id=?";
            Database.pst = Database.conn.prepareStatement(query);
            Database.pst.setString(1, Id);
            Database.rs = Database.pst.executeQuery();

            while (rs.next()) {
                data.add(rs.getString("id"));
                data.add(rs.getString("jenis"));
                data.add(rs.getString("model"));
                data.add(rs.getString("desain"));
                data.add(rs.getString("bahan"));
                data.add(rs.getString("warna"));
                data.add(rs.getString("ukuran"));
                data.add(rs.getString("harga"));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "gagal mengambil data pakaian! " + e.getMessage());
        }
        Database.disconnect();
        return data;
    }

    public static List<List<String>> getDataPakaianHistoryPegawai() {
        List<List<String>> data = new ArrayList<>();
        Database.connect();
        try {
            String query = "SELECT * FROM pakaian where status!=''";
            Database.pst = Database.conn.prepareStatement(query);
            Database.rs = Database.pst.executeQuery();

            while (rs.next()) {
                List<String> row = new ArrayList<>();
                row.add(rs.getString("id"));
                row.add(rs.getString("jenis"));
                row.add(rs.getString("model"));
                row.add(rs.getString("desain"));
                row.add(rs.getString("bahan"));
                row.add(rs.getString("warna"));
                row.add(rs.getString("ukuran"));
                row.add(rs.getString("harga"));
                row.add(rs.getString("status"));
                data.add(row);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "gagal mengambil data pakaian! " + e.getMessage());
        }
        Database.disconnect();
        return data;
    }

    public static List<List<String>> getDataPakaianHistoryCustomer(String idCust) {
        List<List<String>> data = new ArrayList<>();
        Database.connect();
        try {
            String query = "SELECT * FROM pakaian where status=?";
            Database.pst = Database.conn.prepareStatement(query);
            Database.pst.setString(1, idCust);
            Database.rs = Database.pst.executeQuery();

            while (rs.next()) {
                List<String> row = new ArrayList<>();
                row.add(rs.getString("id"));
                row.add(rs.getString("jenis"));
                row.add(rs.getString("model"));
                row.add(rs.getString("desain"));
                row.add(rs.getString("bahan"));
                row.add(rs.getString("warna"));
                row.add(rs.getString("ukuran"));
                row.add(rs.getString("harga"));
                data.add(row);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "gagal mengambil data pakaian! " + e.getMessage());
        }
        Database.disconnect();
        return data;
    }

    public static List<List<String>> getDataPakaianFavorit(List<String> dataID) {
        List<List<String>> data = new ArrayList<>();
        Database.connect();
        try {
            for (String id : dataID) {
                String query = "SELECT * FROM pakaian where id=?";
                Database.pst = Database.conn.prepareStatement(query);
                Database.pst.setString(1, id);
                Database.rs = Database.pst.executeQuery();

                while (rs.next()) {
                    List<String> row = new ArrayList<>();
                    row.add(rs.getString("id"));
                    row.add(rs.getString("jenis"));
                    row.add(rs.getString("model"));
                    row.add(rs.getString("desain"));
                    row.add(rs.getString("bahan"));
                    row.add(rs.getString("warna"));
                    row.add(rs.getString("ukuran"));
                    row.add(rs.getString("harga"));
                    data.add(row);
                }

            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "gagal mengambil data pakaian! " + e.getMessage());
        }
        Database.disconnect();
        return data;
    }
}
