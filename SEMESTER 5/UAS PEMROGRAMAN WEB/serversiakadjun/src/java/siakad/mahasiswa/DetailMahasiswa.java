
package siakad.mahasiswa;

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

@WebService(serviceName = "DetailMahasiswa")
public class DetailMahasiswa {
    
    koneksi kon = new koneksi();
    Connection con;
    PreparedStatement q;

   @WebMethod(operationName = "getDetailMhs")
    public List getDetailMhs(
            @WebParam(name = "nik") int nik) {
        List getDetailMhs = new ArrayList();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/serversiakad", "root", "");
            Statement st = conn.createStatement();
            con = kon.getCon();
            q = con.prepareStatement("select * from master_mahasiswa where nik=?");
            q.setInt(1, nik);
            ResultSet rst = q.executeQuery();
            while (rst.next()) {
                getDetailMhs.add("<tr><td>NIK</td>"
                        + "<td>"+rst.getInt("nik")+"</td><td style='text-align : center;' rowspan='20' width='200'><a class='edit' href='historypendidikan.jsp?nik="+rst.getInt("nik")+"'>History Pendidikan</a><br><br><br><a class='edit' href='historynilai.jsp?nik="+rst.getInt("nik")+"'>History Nilai</a><br><br><br><a class='edit' href='nilai.jsp?nik="+rst.getInt("nik")+"'>Transkrip Nilai</a><br><br><br><br><br><a class='edit' href='edit/edit-mahasiswa.jsp?nik="+rst.getInt("nik")+"'> Edit </a>&nbsp; <a class='buttonred' href='delete/delete-mahasiswa.jsp?nik="+rst.getInt("nik")+"'> Delete </a></td></tr>"
                        + "<tr><td>Nama</td>"
                        + "<td>"+rst.getString("nama")+"</tr>"
                        + "<tr><td>Tempat Lahir</td>"
                        + "<td>"+rst.getString("tempat_lahir")+"</tr>"
                        + "<tr><td>Tanggal Lahir</td>"
                        + "<td>"+rst.getString("tanggal_lahir")+"</tr>"
                        + "<tr><td>Jenis Kelamin</td>"
                        + "<td>"+rst.getString("jenis_kelamin")+"</tr>"
                        + "<tr><td>Agama</td>"
                        + "<td>"+rst.getString("agama")+"</tr>"
                        + "<tr><td>Nama Ibu</td>"
                        + "<td>"+rst.getString("nama_ibu_kandung")+"</tr>"
                        + "<tr><td>NISN</td>"
                        + "<td>"+rst.getLong("nisn")+"</tr>"
                        + "<tr><td>NPWP</td>"
                        + "<td>"+rst.getLong("npwp")+"</tr>"
                        + "<tr><td>Kewarganegaraan</td>"
                        + "<td>"+rst.getString("kewarganegaraan")+"</tr>"
                        + "<tr><td>Jalan</td>"
                        + "<td>"+rst.getString("jalan")+"</tr>"
                        + "<tr><td>Dusun</td>"
                        + "<td>"+rst.getString("dusun")+"</tr>"
                        + "<tr><td>RT</td>"
                        + "<td>"+rst.getString("rt")+"</tr>"
                        + "<tr><td>RW</td>"
                        + "<td>"+rst.getString("rw")+"</tr>"
                        + "<tr><td>Kelurahan</td>"
                        + "<td>"+rst.getString("kelurahan")+"</tr>"
                        + "<tr><td>Kecamatan</td>"
                        + "<td>"+rst.getString("kecamatan")+"</tr>"
                        + "<tr><td>Kode Pos</td>"
                        + "<td>"+rst.getInt("kodepos")+"</tr>"
                        + "<tr><td>Telepon</td>"
                        + "<td>"+rst.getString("telepon")+"</tr>"
                        + "<tr><td>HP</td>"
                        + "<td>"+rst.getString("hp")+"</tr>"
                        + "<tr><td>E-Mail</td>"
                        + "<td>"+rst.getString("email")+"</tr>");
                }
            con.close();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return getDetailMhs;
    }
}
