
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

@WebService(serviceName = "Mahasiswa")
public class Mahasiswa {
    
    koneksi kon = new koneksi();
    Connection con;
    PreparedStatement q;

    @WebMethod(operationName = "tampilMahasiswa")
    public List tampilMahasiswa() {
        List tampilMahasiswa = new ArrayList();

        String query = "SELECT a.nik, a.nama, a.nim, a.jenis_kelamin, a.agama, a.tempat_lahir, a.tanggal_lahir, b.nama_prodi, a.angkatan FROM master_mahasiswa a JOIN master_prodi b ON a.kode_prodi = b.kode_prodi ORDER BY a.nim ASC";
        int y = 1;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/serversiakad", "root", "");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                tampilMahasiswa.add("<td style='text-align : center; font-weight : bold;' width='20'>"+y+"</td>"
                        + "<td width='150'><a href='detailmhs.jsp?nik="+rs.getInt("nik")+"' style='text-decoration : none; color : #6f7678'>" + rs.getString("nama")
                        + "</td><td style='text-align : center;'>" + rs.getInt("nim")
                        + "</td><td style='text-align : center;' width='20'>" + rs.getString("jenis_kelamin") 
                        + "</td><td style='text-align : center;' widtg='80'>" + rs.getString("agama")
                        + "</td><td>" + rs.getString("tempat_lahir")
                        + "</td><td style='text-align : center; font-size: 8pt;' width='100'>" + rs.getString("tanggal_lahir")
                        + "</td><td style='text-align : center;' width='130'>" + rs.getString("nama_prodi")
                        + "</td><td style='text-align : center;'>" + rs.getInt("angkatan")
                        + "</td><td style='text-align : center;' width='250'><a class='edit' href='edit/edit-mahasiswa.jsp?nik="+rs.getInt("nik")+"'> Edit </a>&nbsp; <a class='buttonred' href='delete/delete-mahasiswa.jsp?nik="+rs.getInt("nik")+"'> Delete </a></td>"
                        + "<tr></tr>"
                        + y++);
                }
            con.close();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return tampilMahasiswa;
    }
    
        @WebMethod(operationName = "addMahasiswa")
    public void addMahasiswa(
            @WebParam(name = "nik") int nik,
            @WebParam(name = "nim") int nim,
            @WebParam(name = "kode_prodi") int kode_prodi,
            @WebParam(name = "angkatan") int angkatan,
            @WebParam(name = "nama") String nama,
            @WebParam(name = "tempat_lahir") String tempat_lahir,
            @WebParam(name = "tanggal_lahir") String tanggal_lahir,
            @WebParam(name = "jenis_kelamin") String jenis_kelamin,
            @WebParam(name = "agama") String agama,
            @WebParam(name = "nama_ibu_kandung") String nama_ibu_kandung,
            @WebParam(name = "nisn") int nisn,
            @WebParam(name = "npwp") int npwp,
            @WebParam(name = "kewarganegaraan") String kewarganegaraan,
            @WebParam(name = "jalan") String jalan,
            @WebParam(name = "dusun") String dusun,
            @WebParam(name = "rt") String rt,
            @WebParam(name = "rw") String rw,
            @WebParam(name = "kelurahan") String kelurahan,
            @WebParam(name = "kecamatan") String kecamatan,
            @WebParam(name = "kodepos") int kodepos,
            @WebParam(name = "telepon") String telepon,
            @WebParam(name = "hp") String hp,
            @WebParam(name = "email") String email
    ) {
        try {
            con = kon.getCon();
            q = con.prepareStatement("insert into master_mahasiswa value (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            q.setInt(1, nik);
            q.setInt(2, nim);
            q.setInt(3, kode_prodi);
            q.setInt(4, angkatan);
            q.setString(5, nama);
            q.setString(6, tempat_lahir);
            q.setString(7, tanggal_lahir);
            q.setString(8, jenis_kelamin);
            q.setString(9, agama);
            q.setString(10, nama_ibu_kandung);
            q.setInt(11, nisn);
            q.setInt(12, npwp);
            q.setString(13, kewarganegaraan);
            q.setString(14, jalan);
            q.setString(15, dusun);
            q.setString(16, rt);
            q.setString(17, rw);
            q.setString(18, kelurahan);
            q.setString(19, kecamatan);
            q.setInt(20, kodepos);
            q.setString(21, telepon);
            q.setString(22, hp);
            q.setString(23, email);
            
            q.executeUpdate();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    @WebMethod(operationName = "delMahasiswa")
    public void delMahasiswa(
            @WebParam(name = "nik") int nik) {
        try {
            con = kon.getCon();
            q = con.prepareStatement("delete from master_mahasiswa where nik=?");
            q.setInt(1, nik);
            q.executeUpdate();
        } catch (Exception e) {
            System.out.println("Failed to remove because " + e.toString());
        }
    }
    
    @WebMethod(operationName = "editMahasiswa")
    public void editMahasiswa(
            @WebParam(name = "nik") int nik,
            @WebParam(name = "nim") int nim,
            @WebParam(name = "kode_prodi") int kode_prodi,
            @WebParam(name = "angkatan") int angkatan,
            @WebParam(name = "nama") String nama,
            @WebParam(name = "tempat_lahir") String tempat_lahir,
            @WebParam(name = "tanggal_lahir") String tanggal_lahir,
            @WebParam(name = "jenis_kelamin") String jenis_kelamin,
            @WebParam(name = "agama") String agama,
            @WebParam(name = "nama_ibu_kandung") String nama_ibu_kandung,
            @WebParam(name = "nisn") int nisn,
            @WebParam(name = "npwp") int npwp,
            @WebParam(name = "kewarganegaraan") String kewarganegaraan,
            @WebParam(name = "jalan") String jalan,
            @WebParam(name = "dusun") String dusun,
            @WebParam(name = "rt") String rt,
            @WebParam(name = "rw") String rw,
            @WebParam(name = "kelurahan") String kelurahan,
            @WebParam(name = "kecamatan") String kecamatan,
            @WebParam(name = "kodepos") int kodepos,
            @WebParam(name = "telepon") String telepon,
            @WebParam(name = "hp") String hp,
            @WebParam(name = "email") String email
    ) {
        try {
            con = kon.getCon();
            q = con.prepareStatement("update master_mahasiswa set nim=?, kode_prodi=?, angkatan=?, nama=?, tempat_lahir=?, tanggal_lahir=?, jenis_kelamin=?, agama=?, nama_ibu_kandung=?, nisn=?, npwp=?, kewarganegaraan=?, jalan=?, dusun=?, rt=?, rw=?, kelurahan=?, kecamatan=?, kodepos=?, telepon=?, hp=?, email=?  where nik=?");
            q.setInt(1, nik);
            q.setInt(2, nim);
            q.setInt(3, kode_prodi);
            q.setInt(4, angkatan);
            q.setString(5, nama);
            q.setString(6, tempat_lahir);
            q.setString(7, tanggal_lahir);
            q.setString(8, jenis_kelamin);
            q.setString(9, agama);
            q.setString(10, nama_ibu_kandung);
            q.setInt(11, nisn);
            q.setInt(12, npwp);
            q.setString(13, kewarganegaraan);
            q.setString(14, jalan);
            q.setString(15, dusun);
            q.setString(16, rt);
            q.setString(17, rw);
            q.setString(18, kelurahan);
            q.setString(19, kecamatan);
            q.setInt(20, kodepos);
            q.setString(21, telepon);
            q.setString(22, hp);
            q.setString(23, email);
            
            q.executeUpdate();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
