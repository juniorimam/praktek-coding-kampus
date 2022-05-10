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
        <div class="success">
            <%
                Connection k = null;
                PreparedStatement ps= null;

                String id_transaksi = request.getParameter("id_data").trim();
                int id_mhs = Integer.parseInt(request.getParameter("id_mhs"));
                int id_matakuliah = Integer.parseInt(request.getParameter("id_matakuliah"));
                String hari = request.getParameter("hari");
                String ruang = request.getParameter("ruang");
                String jam = request.getParameter("jam");
                
                int idData= Integer.parseInt(id_transaksi);
                String update="update transaksi set id_mhs=?, id_matakuliah=?, hari=?, ruang=?, jam=? where id_transaksi=?";


                //koneksi = KoneksiDatabase.getKoneksi();

                //st = koneksi.prepareStatement("");

                try{
                k = koneksi.getKoneksi();
                ps = k.prepareStatement(update);
                ps.setInt(1, id_mhs);
                ps.setInt(2, id_matakuliah);
                ps.setString(3, hari);
                ps.setString(4, ruang);
                ps.setString(5, jam);
                ps.setInt(6, idData);

                ps.executeUpdate();

                out.println("<br><h1>Terima kasih.</h1><h2><br><br>Jadwal Hari : "+hari+", Ruang : "+ruang+", Jam : "+jam+",<br>telah berhasil di edit.<br><br> Silahkan klik tombol <b><i>Kembali</i></b> untuk melihat data yang sudah terupdate.</h2><br><br><br>");
                out.println("<a class='buttonred' href='transaksi.jsp'>Kembali</a><br><br><br><br>");

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
