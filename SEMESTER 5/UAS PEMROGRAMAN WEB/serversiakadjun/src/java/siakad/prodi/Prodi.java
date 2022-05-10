
package siakad.prodi;

import siakad.koneksi.koneksi;
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

@WebService(serviceName = "Prodi")
public class Prodi {
    
    koneksi kon = new koneksi();
    Connection con;
    PreparedStatement q;
    
    @WebMethod(operationName = "tampilProdi")
    public List tampilProdi() {
        List tampilProdi = new ArrayList();

        String query = "select * from master_prodi";
        int y = 1;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/serversiakad", "root", "");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                tampilProdi.add("<td style='text-align : center; font-weight : bold;' width='30'>"+y+"</td>"
                        + "<td>" + rs.getString("nama_prodi")
                        + "</td><td style='text-align : center;'>" + rs.getString("jenjang")
                        + "</td><td style='text-align : center;'>" + rs.getString("akreditasi") 
                        + "</td><td>" + rs.getString("no_sk_prodi")
                        + "</td><td style='text-align : center;' width='150'><a class='edit' href='edit/edit-prodi.jsp?kode_prodi="+rs.getInt("kode_prodi")+"'> Edit </a>&nbsp; <a class='buttonred' href='delete/delete-prodi.jsp?kode_prodi="+rs.getInt("kode_prodi")+"'> Delete </a></td>"
                        + "<tr></tr>"
                        + y++);
                }
            con.close();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return tampilProdi;
    }
    
    @WebMethod(operationName = "getProdi")
    public List getProdi(
            @WebParam(name = "kode_prodi") int kode_prodi) {
        List prodi = new ArrayList();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/serversiakad", "root", "");
            Statement st = conn.createStatement();
            con = kon.getCon();
            q = con.prepareStatement("select * from master_prodi where kode_prodi=?");
            q.setInt(1, kode_prodi);
            ResultSet rst = q.executeQuery();
            while (rst.next()) {
                prodi.add("<tr><td>Kode Prodi</td><td>:</td>"
                        + "<td><input type=\"text\" name=\"kode_prodi\" value=\""+rst.getInt("kode_prodi")+"\"></tr>"
                        + "<tr><td>Nama Prodi</td><td>:</td>"
                        + "</td><td><input type=\"text\" name=\"nama_prodi\" value=\""+rst.getString("nama_prodi")+"\"></tr>"
                        + "<tr><td>Jenjang</td><td>:</td>"
                        + "</td><td><input type=\"text\" name=\"jenjang\" value=\""+rst.getString("jenjang")+"\"></tr>"
                        + "<tr><td>Akreditasi</td><td>:</td>"
                        + "</td><td><input type=\"text\" name=\"akreditasi\" value=\""+rst.getString("akreditasi")+"\"></tr>"
                        + "<tr><td>No SK Prodi</td><td>:</td>"
                        + "</td><td><input type=\"text\" name=\"no_sk_prodi\" value=\""+rst.getString("no_sk_prodi")+"\"></tr>");
                }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return prodi;
    }
     
    @WebMethod(operationName = "addProdi")
    public void addProdi(
            @WebParam(name = "kode_prodi") int kode_prodi,
            @WebParam(name = "nama_prodi") String nama_prodi,
            @WebParam(name = "jenjang") String jenjang,
            @WebParam(name = "akreditasi") String akreditasi,
            @WebParam(name = "no_sk_prodi") String no_sk_prodi
    ) {
        try {
            con = kon.getCon();
            q = con.prepareStatement("insert into master_prodi value (?,?,?,?,?)");
            q.setInt(1, kode_prodi);
            q.setString(2, nama_prodi);
            q.setString(3, jenjang);
            q.setString(4, akreditasi);
            q.setString(5, no_sk_prodi);
            q.executeUpdate();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    @WebMethod(operationName = "delProdi")
    public void delMahasiswa(
            @WebParam(name = "kode_prodi") int kode_prodi) {
        try {
            con = kon.getCon();
            q = con.prepareStatement("delete from master_prodi where kode_prodi = ?");
            q.setInt(1, kode_prodi);
            q.executeUpdate();
        } catch (Exception e) {
            System.out.println("Failed to remove because " + e.toString());
        }
    }
    
    @WebMethod(operationName = "editProdi")
    public void editProdi(
            @WebParam(name = "kode_prodi") int kode_prodi,
            @WebParam(name = "nama_prodi") String nama_prodi,
            @WebParam(name = "jenjang") String jenjang,
            @WebParam(name = "akreditasi") String akreditasi,
            @WebParam(name = "no_sk_prodi") String no_sk_prodi
    ){
        
        try {
            con = kon.getCon();
            
            q = con.prepareStatement("update master_prodi set nama_prodi=?,jenjang=?,akreditasi=?, no_sk_prodi=? where kode_prodi=?");
            
            q.setString(1, nama_prodi);
            q.setString(2, jenjang);
            q.setString(3, akreditasi);
            q.setString(4, no_sk_prodi);
            q.setInt(5, kode_prodi);
            
            q.executeUpdate();
        }
        catch (Exception e) {
            System.out.println("Failed to edit because " + e.toString());
        }
    }
}
