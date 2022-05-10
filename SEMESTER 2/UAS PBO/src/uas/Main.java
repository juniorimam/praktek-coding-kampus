package uas;

import uas.view.FormLogin;
import uas.dao.Koneksi;
import java.sql.Connection;

public class Main {

    public static void main(String[] args) {
        
        Connection k = Koneksi.getKoneksi();
        
        FormLogin fl = new FormLogin();
        // tampilkan FormUtama
        fl.setVisible(true);
        // untuk menengahkan form
        fl.setLocationRelativeTo(null);
        
       
    }
    
}