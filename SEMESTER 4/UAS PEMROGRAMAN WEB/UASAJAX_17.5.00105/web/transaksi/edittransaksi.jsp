<%-- 
    Document   : editmahasiswa
    Created on : Jun 23, 2019, 5:02:20 PM
    Author     : BENQ
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.SQLException"%>
<%@page import="uas.koneksi.koneksi" %>
<!DOCTYPE html>
<html>
    <head>
        <title>Edit Jadwal</title>
        <link rel="stylesheet" type="text/css" href="../css/style.css">
    </head>
    <body>
        <header>
            <div class="banner">
              <a href="../index.html">
                <img src="../img/banner.png">
              </a>
            </div>
            <div class="menu">
              <ul>
                <a href="../index.html">
                    <li>Home</li>
                </a>
                <a href="../mahasiswa/mahasiswa.jsp">
                    <li>Mahasiswa</li>
                </a>
                <a href="../matakuliah/matakuliah.jsp">
                    <li>Mata Kuliah</li>
                </a>
                <a href="transaksi.jsp">
                    <li>Jadwal</li>
                </a>
               </ul>
            </div>
        </header>
        <img src="../img/sinus.jpg" class="sinus">
        <div class="isi">
        <h1>Edit Data Jadwal</h1>
        Silahkan edit data Jadwal yang sudah tersedia.<br><br>
        
        <%
            String id = request.getParameter("id");
            Connection k = null;
            Statement stm = null;
            ResultSet rs = null;
                        
            String edit = "select * from transaksi where id_transaksi='"+id+"'";
                        
            try{
                k = koneksi.getKoneksi();
                if( k != null){
                stm = k.createStatement();
                rs  = stm.executeQuery(edit);
                while(rs.next()){
                    String id_transaksi = rs.getString("id_transaksi");
                    int id_mhs = rs.getInt("id_mhs");
                    int id_matakuliah = rs.getInt("id_matakuliah");
                    String hari = rs.getString("hari");
                    String ruang = rs.getString("ruang");
                    String jam = rs.getString("jam");
        
        %>
        
        <form method="POST" action="updatetransaksi.jsp" class="formmahasiswa">
          <input type="hidden" value="<% out.println(id_transaksi);%>" name="id_data" />
          <table class="tabletambah">
          <tr>
            <td>Hari</td>
            <td>:</td>
            <td><input type="text" name="hari" value="<% out.print(hari); %>"></td>
          </tr>
          <tr>
            <td>Ruang</td>
            <td>:</td>
            <td><input type="text" name="ruang" value="<% out.print(ruang); %>"></td>
          </tr>
          <tr>
            <td>Jam</td>
            <td>:</td>
            <td><input type="text" name="jam" value="<% out.print(jam); %>"></td>
          </tr>
          <tr>
            <td>Mata Kuliah</td>
            <td>:</td>
            <td>
                <select class="option" name="id_matakuliah" required>
                    <option disabled selected value>- Pilih Mata Kuliah -</option>
                    <% 
                        Statement sn = k.createStatement();
                        ResultSet rs1 = sn.executeQuery("SELECT * FROM matakuliah ORDER BY matakuliah ASC"); 
                        while (rs1.next())
                        {
                            int item = rs1.getInt("id_matakuliah");
                            String item1 = rs1.getString("matakuliah");
                            int item2 = rs1.getInt("sks");
                    %>
                            <option value ="<%=item %>" 
                                    <% if(item == id_matakuliah){ 
                                        out.print("selected"); 
                                    }else{
                                        out.print("");
                                    } %>
                            ><%= item1 %> (<%= item2 %>)</option>
                    <%  } %>
                </select>
            </td>
          </tr>
          <tr>
            <td>Mahasiswa</td>
            <td>:</td>
            <td>
                <select class="option" name="id_mhs" required>
                    <option disabled selected value>- Pilih Mahasiswa -</option>
                    <% 
                        ResultSet rs2 = sn.executeQuery("SELECT * FROM mahasiswa ORDER BY nim ASC"); 
                        while (rs2.next())
                        {
                            int item = rs2.getInt("id_mhs");
                            String item1 = rs2.getString("nim");
                            String item2 = rs2.getString("nama");
                            
                    %>
                            <option value ="<%=item %>" 
                                    <% if(item == id_mhs){ 
                                        out.print("selected"); 
                                    }else{
                                        out.print("");
                                    } %>
                            ><%= item1 %> - <%= item2 %></option>
                    <%  } %>
                </select>
            </td>
          </tr>
          <tr>
              <td><br></td>
          </tr>
          <tr>
              <td></td>
              <td></td>
              <td><input type="submit" value="Simpan"> &nbsp;&nbsp; <a href="transaksi.jsp" class="buttonred">Kembali</a></td>
          </tr>
        </table>
        </form>
        </div>
        <%
        }
        }else{out.println("gagal konek database");}
        }catch(SQLException e){
        out.println(e);
        }
        rs.close();
        stm.close();
        %>
        <footer>
            © 2019 Junior Imam N. - 17.5.00105 All Rights Reserved
        </footer>
    </body>
</html>
