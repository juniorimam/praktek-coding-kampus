
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

@WebService(serviceName = "HistoryPendidikan")
public class HistoryPendidikan {

    koneksi kon = new koneksi();
    Connection con;
    PreparedStatement q;
    
    @WebMethod(operationName = "getDetailMhsPend")
    public List getDetailMhsPend(
            @WebParam(name = "nik") int nik) {
        List getDetailMhsPend = new ArrayList();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/serversiakad", "root", "");
            Statement st = conn.createStatement();
            con = kon.getCon();
            q = con.prepareStatement("select * from master_mahasiswa where nik=?");
            q.setInt(1, nik);
            ResultSet rst = q.executeQuery();
            while (rst.next()) {
                getDetailMhsPend.add("<td>"+rst.getString("nama")+"</td>"
                        + "<td>"+rst.getString("tempat_lahir")+"</td>"
                        + "<td style='text-align : center;'>"+rst.getString("tanggal_lahir")+"</td>"
                        + "<td style='text-align : center;'>"+rst.getString("jenis_kelamin")+"</td>"
                        + "<tr></tr>");
                }
            con.close();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return getDetailMhsPend;
    }
    
    @WebMethod(operationName = "getHistoryPend")
    public List getHistoryPend(
            @WebParam(name = "nim") int nim) {
        List getHistoryPend = new ArrayList();
        int y = 1;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/serversiakad", "root", "");
            Statement st = conn.createStatement();
            con = kon.getCon();
            q = con.prepareStatement("select a.nim, a.jenis_pendaftaran, a.tanggal_masuk, b.nama_prodi FROM history_pendidikan a JOIN master_prodi b ON a.kode_prodi = b.kode_prodi WHERE a.nik=?");
            q.setInt(1, nim);
            ResultSet rst = q.executeQuery();
            while (rst.next()) {
                getHistoryPend.add("<td style='text-align : center; font-weight : bold;'>"+y+"</td>"
                        + "<td>"+rst.getInt("nim")+"</td>"
                        + "<td>"+rst.getString("jenis_pendaftaran")+"</td>"
                        + "<td style='text-align : center;'>"+rst.getString("tanggal_masuk")+"</td>"
                        + "<td>"+rst.getString("nama_prodi")+"</td>"
                        + "<tr></tr>"
                        + y++);
                }
            con.close();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return getHistoryPend;
    }
    
    @WebMethod(operationName = "addHistoryPendidikan")
    public void addHistoryPendidikan(
            @WebParam(name = "nim") int nim,
            @WebParam(name = "nik") int nik,
            @WebParam(name = "kode_prodi") int kode_prodi,
            @WebParam(name = "jenis_pendaftaran") String jenis_pendaftaran,
            @WebParam(name = "jalur_pendaftaran") String jalur_pendaftaran,
            @WebParam(name = "tanggal_masuk") String tanggal_masuk,
            @WebParam(name = "perguruan_tinggi") String perguruan_tinggi
    ) {
        try {
            con = kon.getCon();
            q = con.prepareStatement("insert into history_pendidikan value (?,?,?,?,?,?,?)");
            q.setInt(1, nim);
            q.setInt(2, nik);
            q.setInt(3, kode_prodi);
            q.setString(4, jenis_pendaftaran);
            q.setString(5, jalur_pendaftaran);
            q.setString(6, tanggal_masuk);
            q.setString(7, perguruan_tinggi);
            q.executeUpdate();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
