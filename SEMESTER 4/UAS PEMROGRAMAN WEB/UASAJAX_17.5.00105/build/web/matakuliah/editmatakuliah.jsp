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
        <title>Edit Mata Kuliah</title>
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
                <a href="matakuliah.jsp">
                    <li>Mata Kuliah</li>
                </a>
                <a href="../transaksi/transaksi.jsp">
                    <li>Jadwal</li>
                </a>
              </ul>
            </div>
        </header>
        <img src="../img/sinus.jpg" class="sinus">
        <div class="isi">
        <h1>Edit Data Mata Kuliah</h1>
        Silahkan edit data Mata Kuliah yang sudah tersedia.<br><br>
        
        <%
            String id = request.getParameter("id");
            Connection k = null;
            Statement stm = null;
            ResultSet rs = null;
                        
            String edit = "select * from matakuliah where id_matakuliah='"+id+"'";
                        
            try{
                k = koneksi.getKoneksi();
                if( k != null){
                stm = k.createStatement();
                rs  = stm.executeQuery(edit);
                while(rs.next()){
                    String id_matakuliah = rs.getString("id_matakuliah");
                    String matakuliah = rs.getString("matakuliah");
                    String sks = rs.getString("sks");
        
        %>
        
        <form method="POST" action="updatematakuliah.jsp" class="formmahasiswa">
          <input type="hidden" value="<% out.println(id_matakuliah);%>" name="id_data" />
          <table class="tabletambah">
            <tr>
              <td>Mata Kuliah</td>
              <td>:</td>
              <td><input type="text" name="matakuliah" value="<% out.println(matakuliah); %>"></td>
            </tr>
            <tr>
              <td>SKS</td>
              <td>:</td>
              <td><input type="text" name="sks" value="<% out.println(sks); %>"></td>
            </tr>
            <tr>
              <td><br></td>
            </tr>
            <tr>
                <td></td>
                <td></td>
                <td><input type="submit" value="Simpan"> &nbsp;&nbsp; <a href="matakuliah.jsp" class="buttonred">Kembali</a></td>
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
