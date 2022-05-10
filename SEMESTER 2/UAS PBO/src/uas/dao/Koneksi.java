package uas.dao;

// import yg kita perlukan untuk koneksi ke database
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Koneksi {
    
    private static Connection conn;
    // untuk menyimpan setting koneksi database
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    // untuk menyimpan lokasi driver database
    private static final String URL = "jdbc:mysql://localhost:3306/uas";
    // untuk menyimpan lokasi server database
    private static final String USERNAME = "root";
    // untuk menyimpan username database
    private static final String PASSWORD = "";
    // untuk menyimpan password database
    
    public static Connection getKoneksi() {
        
        // cek apakah conn kosong
        if (conn == null) {
            
            // gunakan eksepsi untuk menangkap perkiraan error
            // try-catch bisa juga throw/s
            try {
                
                // panggil lokasi driver
                Class.forName(DRIVER);
                System.out.println("Driver ditemukan.");
                
                try {
                    
                    conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
                    System.out.println("Koneksi basis data berhasil.");
                    
                } catch(SQLException se) {
                    
                    System.out.println("Koneksi basis data gagal: " + se);
                    
                }
                
            } catch(ClassNotFoundException cnfe) {
                
                System.out.println("Driver tidak ditemukan: " + cnfe);                
                
            }
            
        }
        
        return conn;
        
    }
    
}
