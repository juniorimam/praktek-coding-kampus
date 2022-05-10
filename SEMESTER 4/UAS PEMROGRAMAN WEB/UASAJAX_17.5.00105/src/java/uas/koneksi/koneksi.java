package uas.koneksi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author user
 */
public class koneksi {
        private static Connection koneksi;
    

    public static Connection getKoneksi(){
        try{
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            koneksi = DriverManager.getConnection("jdbc:mysql://localhost:3306/matakuliah","root","");
        }catch(SQLException e){
            System.out.println(e);
        }  
    
        return koneksi;
    }
}
