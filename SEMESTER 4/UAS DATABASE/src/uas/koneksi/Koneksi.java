package uas.koneksi;



// import yg kita perlukan untuk koneksi ke database
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.*;

public class Koneksi {
    
    private static Connection conn;
    public static Connection getKoneksi() {
        // mulai ambil koneksi
        if (conn == null) {
            try {
                String url = "jdbc:mysql://localhost:3306/perpustakaan";
                String usr = "root";
                String pas = "";
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                conn = DriverManager.getConnection(url,usr,pas);
            } catch (SQLException er) {
                JOptionPane.showMessageDialog(null, "Gagal"+er);
            }
        } return conn;
    }
    
}
