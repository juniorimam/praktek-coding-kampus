
package siakad.matakuliah;

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

@WebService(serviceName = "Matakuliah")
public class Matakuliah {

    koneksi kon = new koneksi();
    Connection con;
    PreparedStatement q;
    
    @WebMethod(operationName = "tampilMatkul")
    public List tampilMatkul() {
        List tampilMatkul = new ArrayList();

        String query = "SELECT a.kode_matakuliah, a.nama_matakuliah, a.bobot_matakuliah, b.nama_prodi, b.jenjang, a.jenis_matakuliah FROM master_matakuliah a JOIN master_prodi b ON a.kode_prodi = b.kode_prodi ORDER BY a.kode_matakuliah ASC";
        int y = 1;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/serversiakad", "root", "");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while(rs.next()){
                tampilMatkul.add("<td style='text-align : center; font-weight : bold;'>"+y+"</td>"
                        + "<td>" + rs.getInt("kode_matakuliah") + "</td>"
                        + "<td>" + rs.getString("nama_matakuliah") + "</td>"
                        + "<td style='text-align : center;'>" + rs.getInt("bobot_matakuliah") + "</td>"
                        + "<td>" + rs.getString("nama_prodi") + " - " + rs.getString("jenjang") + "</td>"
                        + "<td style='text-align : center;'>" + rs.getString("jenis_matakuliah") + "</td>"
                        + "</td><td style='text-align : center;' width='150'><a class='edit' href='edit/edit-matkul.jsp?kode_matakuliah="+rs.getInt("kode_matakuliah")+"'> Edit </a>&nbsp; <a class='buttonred' href='delete/delete-matkul.jsp?kode_matakuliah="+rs.getInt("kode_matakuliah")+"'> Delete </a></td>"
                        + "<tr></tr>"
                        + y++);
            }
            con.close();
        } catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        return tampilMatkul;
    }
    
    @WebMethod(operationName = "getMatkul")
    public List getMatkul(
            @WebParam(name = "kode_matakuliah") int kode_matakuliah) {
        List matkul = new ArrayList();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/serversiakad", "root", "");
            Statement st = conn.createStatement();
            con = kon.getCon();
            q = con.prepareStatement("SELECT * FROM master_matakuliah WHERE kode_matakuliah=?");
            q.setInt(1, kode_matakuliah);
            ResultSet rst = q.executeQuery();
            while (rst.next()) {
                matkul.add("<tr><td>Kode Mata Kuliah</td><td>:</td>"
                        + "<td><input type=\"text\" name=\"kode_matakuliah\" value=\""+rst.getInt("kode_matakuliah")+"\"></tr>"
                        + "<tr><td>Nama Mata Kuliah</td><td>:</td>"
                        + "</td><td><input type=\"text\" name=\"nama_matakuliah\" value=\""+rst.getString("nama_matakuliah")+"\"></tr>"
                        + "<tr><td>Jenis Mata Kuliah</td><td>:</td>"
                        + "</td><td><input type=\"text\" name=\"jenis_matakuliah\" value=\""+rst.getString("jenis_matakuliah")+"\"></tr>"
                        + "<tr><td>Bobot Mata Kuliah</td><td>:</td>"
                        + "</td><td><input type=\"text\" name=\"bobot_matakuliah\" value=\""+rst.getInt("bobot_matakuliah")+"\"></tr>"
                        + "<tr><td>Bobot Teori</td><td>:</td>"
                        + "</td><td><input type=\"text\" name=\"bobot_teori\" value=\""+rst.getInt("bobot_teori")+"\"></tr>"
                        + "<tr><td>Bobot Praktikum</td><td>:</td>"
                        + "</td><td><input type=\"text\" name=\"bobot_praktikum\" value=\""+rst.getInt("bobot_praktikum")+"\"></tr>");
                }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return matkul;
    }
    
    @WebMethod(operationName = "addMatkul")
    public void addProdi(
            @WebParam(name = "kode_matakuliah") int kode_matakuliah,
            @WebParam(name = "nama_matakuliah") String nama_matakuliah,
            @WebParam(name = "kode_prodi") int kode_prodi,
            @WebParam(name = "jenis_matakuliah") String jenis_matakuliah,
            @WebParam(name = "bobot_matakuliah") int bobot_matakuliah,
            @WebParam(name = "bobot_teori") int bobot_teori,
            @WebParam(name = "bobot_praktikum") int bobot_praktikum
    ) {
        try {
            con = kon.getCon();
            q = con.prepareStatement("insert into master_matakuliah value (?,?,?,?,?,?,?)");
            q.setInt(1, kode_matakuliah);
            q.setString(2, nama_matakuliah);
            q.setInt(3, kode_prodi);
            q.setString(4, jenis_matakuliah);
            q.setInt(5, bobot_matakuliah);
            q.setInt(6, bobot_teori);
            q.setInt(7, bobot_praktikum);
            q.executeUpdate();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    @WebMethod(operationName = "delMatkul")
    public void delMatkul(
            @WebParam(name = "kode_matakuliah") int kode_matakuliah) {
        try {
            con = kon.getCon();
            q = con.prepareStatement("delete from master_matakuliah where kode_matakuliah = ?");
            q.setInt(1, kode_matakuliah);
            q.executeUpdate();
        } catch (Exception e) {
            System.out.println("Failed to remove because " + e.toString());
        }
    }
    
    @WebMethod(operationName = "editMatkul")
    public void editMatkul(
            @WebParam(name = "kode_matakuliah") int kode_matakuliah,
            @WebParam(name = "nama_matakuliah") String nama_matakuliah,
            @WebParam(name = "kode_prodi") int kode_prodi,
            @WebParam(name = "jenis_matakuliah") String jenis_matakuliah,
            @WebParam(name = "bobot_matakuliah") int bobot_matakuliah,
            @WebParam(name = "bobot_teori") int bobot_teori,
            @WebParam(name = "bobot_praktikum") int bobot_praktikum
    ){
        try {
            con = kon.getCon();
            q = con.prepareStatement("update master_matakuliah set nama_matakuliah=?, kode_prodi=?, jenis_matakuliah=?, bobot_matakuliah=?, bobot_teori=?, bobot_praktikum=? where kode_matakuliah=?");
            
            q.setString(1, nama_matakuliah);
            q.setInt(2, kode_prodi);
            q.setString(3, jenis_matakuliah);
            q.setInt(4, bobot_matakuliah);
            q.setInt(5, bobot_teori);
            q.setInt(6, bobot_praktikum);
            q.setInt(7, kode_matakuliah);
            
            q.executeUpdate();
        }
        catch (Exception e) {
            System.out.println("Failed to edit because " + e.toString());
        }
    }
}