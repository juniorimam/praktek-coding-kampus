package siakad.koneksi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class koneksi {
    String driver = "com.mysql.jdbc.Driver";
    String url = "jdbc:mysql://localhost:3306/serversiakad";
    String usern = "root";
    String passw = "";
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    public Connection getCon(){
        try{
            Class.forName(driver);
            con = DriverManager.getConnection(url, usern, passw);
        }catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
        return con;
    }
}
