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
        <title>Edit Mahasiswa</title>
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
                <a href="mahasiswa.jsp">
                    <li>Mahasiswa</li>
                </a>
                <a href="../matakuliah/matakuliah.jsp">
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
        <h1>Edit Data Mahasiswa</h1>
        Silahkan edit data Mahasiswa yang sudah tersedia.<br><br>
        
        <%
            String id = request.getParameter("id");
            Connection k = null;
            Statement stm = null;
            ResultSet rs = null;
                        
            String edit = "select * from mahasiswa where id_mhs='"+id+"'";
                        
            try{
                k = koneksi.getKoneksi();
                if( k != null){
                stm = k.createStatement();
                rs  = stm.executeQuery(edit);
                while(rs.next()){
                    String id_mhs = rs.getString("id_mhs");
                    String nim = rs.getString("nim");
                    String nama = rs.getString("nama");
                    String alamat = rs.getString("alamat");
                    String notelp = rs.getString("notelp");
                    String kelas = rs.getString("kelas");
        
        %>
        
        <form method="POST" action="updatemahasiswa.jsp" class="formmahasiswa">
          <input type="hidden" value="<% out.println(id_mhs);%>" name="id_data" />
          <table class="tabletambah">
            <tr>
              <td>NIM</td>
              <td>:</td>
              <td><input type="text" name="nim" value="<% out.println(nim); %>"></td>
            </tr>
            <tr>
              <td>Nama</td>
              <td>:</td>
              <td><input type="text" name="nama" value="<% out.println(nama); %>"></td>
            </tr>
            <tr>
              <td>Alamat</td>
              <td>:</td>
              <td><input type="text" name="alamat" value="<% out.println(alamat); %>"></td>
            </tr>
            <tr>
              <td>No. Telp</td>
              <td>:</td>
              <td><input type="text" name="notelp" value="<% out.println(notelp); %>"></td>
            </tr>
            <tr>
              <td>Kelas</td>
              <td>:</td>
              <td><input type="text" name="kelas" value="<% out.println(kelas); %>"></td>
            </tr>
            <tr>
              <td><br></td>
            </tr>
            <tr>
                <td></td>
                <td></td>
                <td><input type="submit" value="Simpan"> &nbsp;&nbsp; <a href="mahasiswa.jsp" class="buttonred">Kembali</a></td>
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
