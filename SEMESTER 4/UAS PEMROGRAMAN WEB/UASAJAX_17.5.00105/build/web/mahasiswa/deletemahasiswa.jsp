<%-- 
    Document   : deletemahasiswa
    Created on : Jun 23, 2019, 7:59:06 PM
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
        <title>Success Delete</title>
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
        <div class="success">
            <%
                Connection k = null;
                PreparedStatement ps = null;

                String id = request.getParameter("id").trim();
                String nim =request.getParameter("nim");
                String nama =request.getParameter("nama");
                String alamat =request.getParameter("alamat");
                String notelp =request.getParameter("notelp");
                String kelas =request.getParameter("kelas");

                String idData= (id);
                String delete="DELETE FROM mahasiswa WHERE id_mhs=?";


                //koneksi = KoneksiDatabase.getKoneksi();

                //st = koneksi.prepareStatement("");

                try{
                k = koneksi.getKoneksi();
                ps = k.prepareStatement(delete);
                ps.setString(1, idData);

                ps.executeUpdate();

                out.println("<br><h1>Terima kasih.</h1><h2><br><br>Mahasiswa dengan NIM : "+nim+" dengan nama : "+nama+"&nbsp;telah berhasil di hapus.<br> Silahkan klik tombol <b><i>Kembali</i></b> untuk melihat data yang sudah terupdate.</h2><br><br><br>");
                out.println("<a class='buttonred' href='mahasiswa.jsp'>Kembali</a><br><br><br><br>");

                }catch(SQLException ex){
                out.println(ex);

                }finally{

                    if(ps != null){
                    ps.close();
                    }
                    if(k != null){

                    k.close();
                    }
                }
                %>
        </div>
        <footer>
            © 2019 Junior Imam N. - 17.5.00105 All Rights Reserved
        </footer>
    </body>
</html>
