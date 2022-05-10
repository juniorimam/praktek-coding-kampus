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
    <title>Mata Kuliah</title>
    <link rel="stylesheet" type="text/css" href="../css/style.css">
    <script>
        var request;
        function database()
        {
            var v=document.vinform.search.value;
            var url="tablematakuliah.jsp?search="+v;

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
      <h1>Daftar Mata Kuliah</h1>
      <div class="search">
          <form id="formsearch" name="vinform">
              <input class="searchbox" type="text" placeholder=" Cari Data" name="search" onkeyup="database();">
          </form>
      </div>
      Berikut data Mata Kuliah yang sudah disimpan di database.<br><br>
     
      <span id="tampil"> </span>
      
      <br><br>
      <hr>
      
        <% 
          Connection k = koneksi.getKoneksi();
          Statement sn = k.createStatement();
          ResultSet rs = null ;

          if( (request.getParameter("matakuliah")!= null) )
          {
              String matakuliah = request.getParameter("matakuliah");
              String sks = request.getParameter("sks");
              int x =0;

              String tambah = "INSERT INTO matakuliah (matakuliah, sks) VALUES ('"+matakuliah+"','"+sks+"') ";

              try{
                  x = sn.executeUpdate(tambah);
              } catch(Exception e){
                  e.printStackTrace();
              }
          }
      %>
      
      <h1>Tambah Data Mata Kuliah</h1>
      Jika ingin menambah data Mata Kuliah silahkan isi form dibawah ini.<br><br>
      <form method="POST" class="formmahasiswa">
        <table class="tabletambah">
          <tr>
            <td>Mata Kuliah</td>
            <td>:</td>
            <td><input type="text" name="matakuliah" placeholder="Tulis mata kuliah"></td>
          </tr>
          <tr>
            <td>SKS</td>
            <td>:</td>
            <td><input type="text" name="sks" placeholder="Tulis SKS"></td>
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