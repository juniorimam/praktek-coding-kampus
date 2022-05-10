
package siakad.nilai;

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

@WebService(serviceName = "Nilai")
public class Nilai {
    
    koneksi kon = new koneksi();
    Connection con;
    PreparedStatement q;

    @WebMethod(operationName = "tampilNilai")
    public List tampilNilai() {
        List tampilNilai = new ArrayList();

        String query = "SELECT a.id_history_nilai, b.nim, c.nama, d.nama_matakuliah, a.nilai_angka, a.nilai_huruf, a.ips FROM history_nilai a JOIN history_pendidikan b ON a.nim = b.nim JOIN master_mahasiswa c ON a.nik = c.nik JOIN master_matakuliah d ON a.kode_matakuliah = d.kode_matakuliah";
        int y = 1;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/serversiakad", "root", "");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                tampilNilai.add("<td style='text-align : center; font-weight : bold;'>"+y+"</td>"
                        + "<td>" + rs.getInt("nim") + "</td>"
                        + "<td>" + rs.getString("nama") + "</td>"
                        + "<td>" + rs.getString("nama_matakuliah") + "</td>"
                        + "<td style='text-align : center'>" + rs.getInt("nilai_angka") + "</td>"
                        + "<td style='text-align : center'>" + rs.getString("nilai_huruf") + "</td>"
                        + "<td style='text-align : center'>" + rs.getString("ips") + "</td>"
                        + "<td style='text-align : center;' width='150'><a class='edit' href='edit/edit-nilai.jsp?id_history_nilai="+rs.getInt("id_history_nilai")+"'> Edit </a>&nbsp; <a class='buttonred' href='delete/delete-nilai.jsp?id_history_nilai="+rs.getInt("id_history_nilai")+"'> Delete </a></td>"
                        + "<tr></tr>"
                        + y++);
            }
            con.close();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return tampilNilai;
    }
    
    

}
