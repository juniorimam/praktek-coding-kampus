
package siakad.history;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import siakad.koneksi.koneksi;

@WebService(serviceName = "HistoryNilai")
public class HistoryNilai {

    koneksi kon = new koneksi();
    Connection con;
    PreparedStatement q;
    
    @WebMethod(operationName = "getDetailMhsNilai")
    public List getDetailMhsNilai(
            @WebParam(name = "nik") int nik) {
        List getDetailMhsNilai = new ArrayList();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/serversiakad", "root", "");
            Statement st = conn.createStatement();
            con = kon.getCon();
            q = con.prepareStatement("SELECT a.nim, b.nama, c.nama_prodi FROM history_nilai a JOIN master_mahasiswa b ON a.nik = b.nik JOIN master_prodi c ON a.kode_prodi = c.kode_prodi WHERE a.nik=?");
            q.setInt(1, nik);
            ResultSet rst = q.executeQuery();
            while (rst.next()) {
                getDetailMhsNilai.add("<td>"+rst.getInt("nim")+"</td>"
                        + "<td>"+rst.getString("nama")+"</td>"
                        + "<td>"+rst.getString("nama_prodi")+"</td>");
                }
            con.close();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return getDetailMhsNilai;
    }
    
    @WebMethod(operationName = "getHistoryNilai")
    public List getHistoryNilai(
            @WebParam(name = "nim") int nim) {
        List getHistoryNilai = new ArrayList();
        int y = 1;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/serversiakad", "root", "");
            Statement st = conn.createStatement();
            con = kon.getCon();
            q = con.prepareStatement("SELECT b.kode_matakuliah, b.nama_matakuliah, a.nilai_angka, a.nilai_huruf FROM history_nilai a JOIN master_matakuliah b ON a.kode_matakuliah = b.kode_matakuliah WHERE a.nik=?");
            q.setInt(1, nim);
            ResultSet rst = q.executeQuery();
            while (rst.next()) {
                getHistoryNilai.add("<td style='text-align : center; font-weight : bold;'>"+y+"</td>"
                        + "<td>"+rst.getInt("kode_matakuliah")+"</td>"
                        + "<td>"+rst.getString("nama_matakuliah")+"</td>"
                        + "<td style='text-align : center;'>"+rst.getInt("nilai_angka")+"</td>"
                        + "<td style='text-align : center;'>"+rst.getString("nilai_huruf")+"</td>"
                        + y++);
                }
            con.close();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return getHistoryNilai;
    }
}
