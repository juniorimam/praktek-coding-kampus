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
        <title>SIAKAD 2020 - Tambah Mata Kuliah</title>
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
            <h1>Tambah Data Mata Kuliah</h1>
            <hr>
            Jika ingin menambah data Mata Kuliah silahkan isi form dibawah ini.
            <br><br>
            <form method="POST" class="formmahasiswa" action="../insert/insert-matkul.jsp">
                <table class="tabletambah">
                    <tr>
                        <td>Kode Mata Kuliah</td>
                        <td>:</td>
                        <td><input type="text" name="kode_matakuliah" placeholder="Tulis Kode Mata Kuliah"></td>
                    </tr>
                    <tr>
                        <td>Nama Mata Kuliah</td>
                        <td>:</td>
                        <td><input type="text" name="nama_matakuliah" placeholder="Tulis Nama Mata Kuliah"></td>
                    </tr>
                    <tr>
                        <td>Bobot SKS</td>
                        <td>:</td>
                        <td><input type="text" name="bobot_matakuliah" placeholder="Tulis Bobot SKS"></td>
                    </tr>
                    <tr>
                        <td>Bobot Teori</td>
                        <td>:</td>
                        <td><input type="text" name="bobot_teori" placeholder="Tulis Bobot SKS Teori"></td>
                    </tr>
                    <tr>
                        <td>Bobot Praktikum</td>
                        <td>:</td>
                        <td><input type="text" name="bobot_praktikum" placeholder="Tulis Bobot SKS Praktikum"></td>
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
                        <td>Jenis Mata Kuliah</td>
                        <td>:</td>
                        <td>
                            <select class="option" name="jenis_matakuliah" required>
                                <option disabled selected value>- Pilih Jenis Mata Kuliah -</option>
                                <option value="Wajib">Wajib</option>
                                <option value="Pilihan">Pilihan</option>
                            </select>
                        </td>
                    </tr>
                    <tr>
                      <td></td>
                      <td></td>
                      <td>
                          <br>
                          <input type="submit" value="Simpan"> &nbsp;&nbsp;<a href="../matakuliah.jsp" class="buttonred">Kembali</a>
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
