<%--
    Document   : mahasiswa
    Created on : Jun 23, 2019, 12:58:21 PM
    Author     : BENQ
--%>
<a href="mahasiswa.jsp"></a>
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
    <title>Mahasiswa</title>
    <link rel="stylesheet" type="text/css" href="../css/style.css">
    <script>
        var request;
        function database()
        {
            var v=document.vinform.search.value;
            var url="tablemahasiswa.jsp?search="+v;

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
      <h1>Daftar Mahasiswa</h1>
      <div class="search">
          <form id="formsearch" name="vinform">
              <input class="searchbox" type="text" placeholder=" Cari Data" name="search" onkeyup="database();">
          </form>
      </div>
      Berikut data Mahasiswa yang sudah disimpan di database.<br><br>
     
      <span id="tampil"> </span>
      
      <br><br>
      <hr>
      
        <% 
          Connection k = koneksi.getKoneksi();
          Statement sn = k.createStatement();
          ResultSet rs = null ;

          if( (request.getParameter("nim")!= null) )
          {
              String nim = request.getParameter("nim");
              String nama = request.getParameter("nama");
              String alamat = request.getParameter("alamat");
              String notelp = request.getParameter("notelp");
              String kelas = request.getParameter("kelas");
              int x =0;

              String tambah = "INSERT INTO mahasiswa (nim, nama, alamat, notelp, kelas) VALUES ('"+nim+"','"+nama+"', '"+alamat+"', '"+notelp+"', '"+kelas+"') ";

              try{
                  x = sn.executeUpdate(tambah);
              } catch(Exception e){
                  e.printStackTrace();
              }
          }
      %>
      
      <h1>Tambah Data Mahasiswa</h1>
      Jika ingin menambah data Mahasiswa silahkan isi form dibawah ini.<br><br>
      <form method="POST" class="formmahasiswa">
        <table class="tabletambah">
          <tr>
            <td>NIM</td>
            <td>:</td>
            <td><input type="text" name="nim" placeholder="Tulis NIM Anda"></td>
          </tr>
          <tr>
            <td>Nama</td>
            <td>:</td>
            <td><input type="text" name="nama" placeholder="Tulis Nama Anda"></td>
          </tr>
          <tr>
            <td>Alamat</td>
            <td>:</td>
            <td><input type="text" name="alamat" placeholder="Tulis Alamat Anda"></td>
          </tr>
          <tr>
            <td>No. Telp</td>
            <td>:</td>
            <td><input type="text" name="notelp" placeholder="Tulis No. Telp. Anda"></td>
          </tr>
          <tr>
            <td>Kelas</td>
            <td>:</td>
            <td><input type="text" name="kelas" placeholder="Tulis Kelas Anda"></td>
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