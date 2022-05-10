<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="siakad.koneksi.koneksi" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>SIAKAD 2020 - Tambah Kelas Kuliah</title>
        <link rel="icon" type="image/png" href="../img/Logo Sinus.png">
        <link rel="stylesheet" type="text/css" href="../css/style.css">
    </head>
    <body>
        <header>
            <div class="banner">
              <a href="../index.jsp">
                <img src="../img/banner.png">
              </a>
            </div>
            <div class="menu">
              <ul>
                <a href="../index.jsp">
                    <li>Home</li>
                </a>
                <a href="../mahasiswa.jsp">
                    <li>Mahasiswa</li>
                </a>
                <a href="../matakuliah.jsp">
                    <li>Mata Kuliah</li>
                </a>
                <a href="../kelaskuliah.jsp">
                    <li>Kelas Kuliah</li>
                </a>
                  <a href="../nilai.jsp">
                    <li>Nilai</li>
                </a>
              </ul>
            </div>
          </header>
        <img src="../img/sinus.jpg" class="sinus">
        <div class="isi">
            <h1>Tambah Data Kelas Kuliah</h1>
            <hr>
            Jika ingin menambah data Kelas Kuliah silahkan isi form dibawah ini.
            <br><br>
            <form method="POST" class="formmahasiswa" action="../insert/insert-kelas.jsp">
                 <table class="tabletambah">
                    <tr>
                        <td>Kode Kelas Kuliah</td>
                        <td>:</td>
                        <td><input type="text" name="id_kelas_kuliah" placeholder="Tulis Kode Kelas Kuliah"></td>
                    </tr>
                    <tr>
                        <td>Program Studi</td>
                        <td>:</td>
                        <td>
                            <select class="option" name="kode_prodi" required>
                                <option disabled selected value>- Pilih Program Studi -</option>
                                <% 
                                    Class.forName("com.mysql.jdbc.Driver");
                                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/serversiakad", "root", "");
                                    Statement stmt = con.createStatement();
                                    ResultSet rs = stmt.executeQuery("SELECT * FROM master_prodi ORDER BY kode_prodi ASC");
                                    while (rs.next())
                                    {
                                        int item = rs.getInt("kode_prodi");
                                        String item1 = rs.getString("nama_prodi");
                                        String item2 = rs.getString("jenjang");
                                %>
                                        <option value ="<%= item %>"><%= item1 %> - <%= item2 %></option>
                                <%  } %>
                            </select>
                        </td>
                    </tr>
                    <tr>
                        <td>Semester</td>
                        <td>:</td>
                        <td><input type="text" name="semester" placeholder="Tulis Semester"></td>
                    </tr>
                    <tr>
                        <td>Mata Kuliah</td>
                        <td>:</td>
                        <td>
                            <select class="option" name="kode_matakuliah" required>
                                <option disabled selected value>- Pilih Mata Kuliah -</option>
                                <% 
                                    Statement stmt1 = con.createStatement();
                                    ResultSet rs1 = stmt1.executeQuery("SELECT * FROM master_matakuliah ORDER BY nama_matakuliah ASC");
                                    while (rs1.next())
                                    {
                                        int item = rs1.getInt("kode_matakuliah");
                                        String item1 = rs1.getString("nama_matakuliah");
                                %>
                                        <option value ="<%= item %>"><%= item1 %></option>
                                <%  } %>
                            </select>
                        </td>
                    </tr>
                    <tr>
                        <td>Nama Kelas</td>
                        <td>:</td>
                        <td><input type="text" name="nama_kelas" placeholder="Tulis Nama Kelas"></td>
                    </tr>
                    <tr>
                        <td>Dosen</td>
                        <td>:</td>
                        <td><input type="text" name="dosen" placeholder="Tulis Nama Dosen"></td>
                    </tr>
                    <tr>
                        <td>Jumlah Peserta</td>
                        <td>:</td>
                        <td><input type="text" name="jumlah_peserta" placeholder="Tulis Jumlah Peserta"></td>
                    </tr>
                    <tr>
                      <td></td>
                      <td></td>
                      <td>
                          <br>
                          <input type="submit" value="Simpan"> &nbsp;&nbsp;<a href="../kelaskuliah.jsp" class="buttonred">Kembali</a>
                      </td>
                    </tr>
                </table>
            </form>
        </div>
    <footer>
        &copy; 2016-2019 PPD STMIK SiNus All Right Reserved
    </footer>
    </body>
</html>
