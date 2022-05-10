<%-- 
    Document   : successmahasiswa
    Created on : Jun 23, 2019, 5:52:44 PM
    Author     : BENQ
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.SQLException"%>
<%@page import="uas.koneksi.koneksi" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Success Update</title>
        <link rel="stylesheet" type="text/css" href="../css/style.css">
    </head>
    <body>
        <header>
            <div class="banner">
              <a href="index.html">
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
        <div class="success">
            <%
                Connection k = null;
                PreparedStatement ps= null;

                String id_matakuliah = request.getParameter("id_data").trim();
                String matakuliah = request.getParameter("matakuliah");
                String sks = request.getParameter("sks");
                int idData= Integer.parseInt(id_matakuliah);
                String update="update matakuliah set matakuliah=?, sks=? where id_matakuliah=?";


                //koneksi = KoneksiDatabase.getKoneksi();

                //st = koneksi.prepareStatement("");

                try{
                k = koneksi.getKoneksi();
                ps = k.prepareStatement(update);
                ps.setString(1, matakuliah);
                ps.setString(2, sks);
                ps.setInt(3, idData);

                ps.executeUpdate();

                out.println("<br><h1>Terima kasih.</h1><h2><br><br>Mata Kuliah : "+matakuliah+" dengan sks : "+sks+"&nbsp;telah berhasil di edit.<br> Silahkan klik tombol <b><i>Kembali</i></b> untuk melihat data yang sudah terupdate.</h2><br><br><br>");
                out.println("<a class='buttonred' href='matakuliah.jsp'>Kembali</a><br><br><br><br>");

                }catch(SQLException ex){
                out.println(ex);
                }
                ps.close();
                k.close();
                %>	
        </div>
        <footer>
            © 2019 Junior Imam N. - 17.5.00105 All Rights Reserved
        </footer>
    </body>
</html>
