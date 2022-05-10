<%--
    Document   : mahasiswa
    Created on : Jun 23, 2019, 12:58:21 PM
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
    <title>Jadwal</title>
    <link rel="stylesheet" type="text/css" href="../css/style.css">
    <script>
        var request;
        function database()
        {
            var v=document.vinform.search.value;
            var url="tabletransaksi.jsp?search="+v;

            if(window.XMLHttpRequest){
                request=new XMLHttpRequest();
            } else if(window.ActiveXObject){
                request=new ActiveXObject("Microsoft.XMLHTTP");
            }

            try {
                request.onreadystatechange=tampilan;
                request.open("GET",url,true);
                request.send();
            }catch(e){
                alert("Unable to connect to server");
            }
        }

        function tampilan(){
            if(request.readyState ===4){
                var val=request.responseText;
                document.getElementById('tampil').innerHTML=val;
            }
        }

    </script>
</head>
<body onload="database()">
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
      <h1>Daftar Jadwal</h1>
      <div class="search">
          <form id="formsearch" name="vinform">
              <input class="searchbox" type="text" placeholder=" Cari Data" name="search" onkeyup="database();">
          </form>
      </div>
      Berikut data Jadwal yang sudah disimpan di database.<br><br>
     
      <span id="tampil"> </span>
      
      <br><br>
      <hr>
      
        <% 
          Connection k = koneksi.getKoneksi();
          Statement sn = k.createStatement();
          ResultSet rs = null ;

          if( (request.getParameter("id_mhs")!= null) && (request.getParameter("id_matakuliah")!= null) )
          {
              int id_mhs = Integer.parseInt(request.getParameter("id_mhs"));
              int id_matakuliah = Integer.parseInt(request.getParameter("id_matakuliah"));
              String hari = request.getParameter("hari");
              String ruang = request.getParameter("ruang");
              String jam = request.getParameter("jam");
              int x =0;

              String tambah = "INSERT INTO transaksi (id_mhs, id_matakuliah, hari, ruang, jam) VALUES ('"+id_mhs+"','"+id_matakuliah+"', '"+hari+"', '"+ruang+"', '"+jam+"') ";

              try{
                  x = sn.executeUpdate(tambah);
              } catch(Exception e){
                  e.printStackTrace();
              }
          }
      %>
      
      <h1>Tambah Data Jadwal</h1>
      Jika ingin menambah data jadwal silahkan isi form dibawah ini.<br><br>
      <form method="POST">
        <table class="tabletambah">
          <tr>
            <td>Hari</td>
            <td>:</td>
            <td><input type="text" name="hari" placeholder="Tulis Hari"></td>
          </tr>
          <tr>
            <td>Ruang</td>
            <td>:</td>
            <td><input type="text" name="ruang" placeholder="Tulis Ruang"></td>
          </tr>
          <tr>
            <td>Jam</td>
            <td>:</td>
            <td><input type="text" name="jam" placeholder="Tulis Jam"></td>
          </tr>
          <tr>
            <td>Mata Kuliah</td>
            <td>:</td>
            <td>
                <select class="option" name="id_matakuliah" required>
                    <option disabled selected value>- Pilih Mata Kuliah -</option>
                    <% 
                        ResultSet rs1 = sn.executeQuery("SELECT * FROM matakuliah ORDER BY matakuliah ASC"); 
                        while (rs1.next())
                        {
                            int item = rs1.getInt("id_matakuliah");
                            String item1 = rs1.getString("matakuliah");
                            int item2 = rs1.getInt("sks");
                    %>
                            <option value ="<%= item %>"><%= item1 %> (<%= item2 %>)</option>
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
                            <option value ="<%= item %>"><%= item1 %> - <%= item2 %></option>
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
              <td><input type="submit" value="Simpan"> &nbsp;&nbsp;<input type="reset" value="Reset"></td>
          </tr>
        </table>
      </form>
  </div>
  <footer>
    © 2019 Junior Imam N. - 17.5.00105 All Rights Reserved
  </footer>
</body>
</html>