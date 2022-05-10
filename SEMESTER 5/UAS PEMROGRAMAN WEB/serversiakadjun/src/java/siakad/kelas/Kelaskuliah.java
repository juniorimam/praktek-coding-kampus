
package siakad.kelas;

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

@WebService(serviceName = "Kelaskuliah")
public class Kelaskuliah {
    
    koneksi kon = new koneksi();
    Connection con;
    PreparedStatement q;

    @WebMethod(operationName = "tampilKelas")
    public List tampilKelas() {
        List tampilKelas = new ArrayList();

        String query = "SELECT a.id_kelas_kuliah, a.kode_matakuliah, b.nama_matakuliah, a.nama_kelas, a.dosen, a.jumlah_peserta FROM kelas_kuliah a JOIN master_matakuliah b ON a.kode_matakuliah = b.kode_matakuliah";
        int y = 1;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/serversiakad", "root", "");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                tampilKelas.add("<td style='text-align : center; font-weight : bold;'>"+y+"</td>"
                        + rs.getInt("id_kelas_kuliah")
                        + "</td><td>" + rs.getInt("kode_matakuliah")
                        + "</td><td>" + rs.getString("nama_matakuliah")
                        + "</td><td style='text-align : center;'>" + rs.getString("nama_kelas")
                        + "</td><td>" + rs.getString("dosen")
                        + "</td><td style='text-align : center;'>" + rs.getInt("jumlah_peserta")
                        + "</td><td style='text-align : center;' width='150'><a class='edit' href='edit/edit-kelaskuliah.jsp?id_kelas_kuliah="+rs.getInt("id_kelas_kuliah")+"'> Edit </a>&nbsp; <a class='buttonred' href='delete/delete-kelaskuliah.jsp?id_kelas_kuliah="+rs.getInt("id_kelas_kuliah")+"'> Delete </a></td>"
                        + "<tr></tr>"
                        + y++);
                }
            con.close();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return tampilKelas;
    }
    
    @WebMethod(operationName = "getKelas")
    public List getMatkul(
            @WebParam(name = "id_kelas_kuliah") int id_kelas_kuliah) {
        List getKelasKuliah = new ArrayList();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/serversiakad", "root", "");
            Statement st = conn.createStatement();
            con = kon.getCon();
            q = con.prepareStatement("SELECT * FROM kelas_kuliah WHERE id_kelas_kuliah=?");
            q.setInt(1, id_kelas_kuliah);
            ResultSet rst = q.executeQuery();
            while (rst.next()) {
                getKelasKuliah.add("<tr><td>Kode Kelas Kuliah</td><td>:</td>"
                        + "<td><input type=\"text\" name=\"id_kelas_kuliah\" value=\""+rst.getInt("id_kelas_kuliah")+"\"></tr>"
                        + "<tr><td>Semester</td><td>:</td>"
                        + "<td><input type=\"text\" name=\"semester\" value=\""+rst.getString("semester")+"\"></tr>"
                        + "<tr><td>Nama Kelas</td><td>:</td>"
                        + "<td><input type=\"text\" name=\"nama_kelas\" value=\""+rst.getString("nama_kelas")+"\"></tr>"
                        + "<tr><td>Dosen</td><td>:</td>"
                        + "<td><input type=\"text\" name=\"dosen\" value=\""+rst.getString("dosen")+"\"></tr>"
                        + "<tr><td>Jumlah Peserta</td><td>:</td>"
                        + "<td><input type=\"text\" name=\"jumlah_peserta\" value=\""+rst.getInt("jumlah_peserta")+"\"></tr>"
                );
            } 
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return getKelasKuliah;
    }
    
    @WebMethod(operationName = "addKelas")
    public void addProdi(
            @WebParam(name = "id_kelas_kuliah") int id_kelas_kuliah,
            @WebParam(name = "kode_prodi") int kode_prodi,
            @WebParam(name = "semester") String semester,
            @WebParam(name = "kode_matakuliah") int kode_matakuliah,
            @WebParam(name = "nama_kelas") String nama_kelas,
            @WebParam(name = "dosen") String dosen,
            @WebParam(name = "jumlah_peserta") int jumlah_peserta
    ) {
        try {
            con = kon.getCon();
            q = con.prepareStatement("insert into kelas_kuliah value (?,?,?,?,?,?,?)");
            q.setInt(1, id_kelas_kuliah);
            q.setInt(2, kode_prodi);
            q.setString(3, semester);
            q.setInt(4, kode_matakuliah);
            q.setString(5, nama_kelas);
            q.setString(6, dosen);
            q.setInt(7, jumlah_peserta);
            q.executeUpdate();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    @WebMethod(operationName = "delKelas")
    public void delMatkul(
            @WebParam(name = "id_kelas_kuliah") int id_kelas_kuliah) {
        try {
            con = kon.getCon();
            q = con.prepareStatement("delete from kelas_kuliah where id_kelas_kuliah = ?");
            q.setInt(1, id_kelas_kuliah);
            q.executeUpdate();
        } catch (Exception e) {
            System.out.println("Failed to remove because " + e.toString());
        }
    }
    
    @WebMethod(operationName = "editKelas")
    public void editMatkul(
            @WebParam(name = "id_kelas_kuliah") int id_kelas_kuliah,
            @WebParam(name = "kode_prodi") int kode_prodi,
            @WebParam(name = "semester") String semester,
            @WebParam(name = "kode_matakuliah") int kode_matakuliah,
            @WebParam(name = "nama_kelas") String nama_kelas,
            @WebParam(name = "dosen") String dosen,
            @WebParam(name = "jumlah_peserta") int jumlah_peserta
    ){
        try {
            con = kon.getCon();
            q = con.prepareStatement("update kelas_kuliah set kode_prodi=?, semester=?, kode_matakuliah=?,nama_kelas=?, dosen=?, jumlah_peserta=? where id_kelas_kuliah=?");
            
            q.setInt(1, kode_prodi);
            q.setString(2, semester);
            q.setInt(3, kode_matakuliah);
            q.setString(4, nama_kelas);
            q.setString(5, dosen);
            q.setInt(6, jumlah_peserta);
            q.setInt(7, id_kelas_kuliah);
            
            q.executeUpdate();
        }
        catch (Exception e) {
            System.out.println("Failed to edit because " + e.toString());
        }
    }
}
