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
        <title>SIAKAD 2020 - Tambah Mahasiswa</title>
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
            <h1>Tambah Data Mahasiswa</h1>
            <hr>
            Jika ingin menambah data Mahasiswa silahkan isi form dibawah ini.
            <br><br>
            <form method="POST" class="formmahasiswa" action="../insert/insert-mahasiswa.jsp">
                 <table class="tabletambah">
                    <tr>
                        <td>NIK</td>
                        <td>:</td>
                        <td><input type="text" name="nik" placeholder="Tulis NIK"></td>
                    </tr>
                    <tr>
                        <td>Nama</td>
                        <td>:</td>
                        <td><input type="text" name="nama" placeholder="Tulis Nama"></td>
                    </tr>
                    <tr>
                        <td>NIM</td>
                        <td>:</td>
                        <td>
                            <input type="text" name="nim" placeholder="Tulis NIM tanpa titik"><br>
                        </td>
                    </tr>
                    <tr>
                        <td>Jenis Kelamin</td>
                        <td>:</td>
                        <td>
                            <input type="text" name="jenis_kelamin" placeholder="Tulis L/P"><br>
                        </td>
                    </tr>
                    <tr>
                        <td>Agama</td>
                        <td>:</td>
                        <td><input type="text" name="agama" placeholder="Tulis Agama"></td>
                    </tr>
                    <tr>
                        <td>Tempat Lahir</td>
                        <td>:</td>
                        <td><input type="text" name="tempat_lahir" placeholder="Tulis Tempat Lahir"></td>
                    </tr>
                    <tr>
                        <td>Tanggal Lahir</td>
                        <td>:</td>
                        <td><input type="text" name="tanggal_lahir" placeholder="Tahun-Bulan-Hari" title="Masukkan tanggal dengan format Tahun-Bulan-Hari"/></td>
                    </tr>
                    <tr>
                        <td>Program Studi</td>
                        <td>:</td>
                        <td>
                            <select class="option" name="kode_prodi" required>
                                <option disabled selected value>- Pilih Program Studi -</option>
                                <% 
                                    Class.forName("com.mysql.jdbc.Driver");
                                    Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/serversiakad", "root", "");
                                    Statement stmt1 = con1.createStatement();
                                    ResultSet rst = stmt1.executeQuery("SELECT * FROM master_prodi ORDER BY kode_prodi ASC");
                                    while (rst.next())
                                    {
                                        int item = rst.getInt("kode_prodi");
                                        String item1 = rst.getString("nama_prodi");
                                        String item2 = rst.getString("jenjang");
                                %>
                                        <option value ="<%= item %>"><%= item1 %> - <%= item2 %></option>
                                <%  } %>
                            </select>
                        </td>
                    </tr>
                    <tr>
                        <td>Angkatan</td>
                        <td>:</td>
                        <td><input type="text" name="angkatan" placeholder="Tulis Angkatan"></td>
                    </tr>
                    <tr>
                        <td>Nama Ibu Kandung</td>
                        <td>:</td>
                        <td><input type="text" name="nama_ibu_kandung" placeholder="Tulis Nama Ibu Kandung"></td>
                    </tr>
                    <tr>
                        <td>NISN</td>
                        <td>:</td>
                        <td><input type="text" name="nisn" placeholder="Tulis NISN"></td>
                    </tr>
                    <tr>
                        <td>NPWP</td>
                        <td>:</td>
                        <td><input type="text" name="npwp" placeholder="Tulis NPWP"></td>
                    </tr>
                    <tr>
                        <td>Kewarganegaraan</td>
                        <td>:</td>
                        <td><input type="text" name="kewarganegaraan" placeholder="Tulis Kewarganegaraan"></td>
                    </tr>
                    <tr>
                        <td>Alamat</td>
                        <td>:</td>
                        <td>
                            <input type="text" name="jalan" placeholder="Tulis Jalan"><br>
                        </td>
                    </tr>
                    <tr>
                      <td></td>
                      <td></td>
                      <td>
                          <input type="text" name="dusun" placeholder="Tulis Dusun"><br>
                      </td>
                    </tr>
                    <tr>
                      <td></td>
                      <td></td>
                      <td>
                          <input type="text" name="rt" placeholder="Tulis RT"><br>
                      </td>
                    </tr>
                    <tr>
                      <td></td>
                      <td></td>
                      <td>
                          <input type="text" name="rw" placeholder="Tulis RW"><br>
                      </td>
                    </tr>
                    <tr>
                      <td></td>
                      <td></td>
                      <td>
                          <input type="text" name="kelurahan" placeholder="Tulis Kelurahan"><br>
                      </td>
                    </tr>
                    <tr>
                      <td></td>
                      <td></td>
                      <td>
                          <input type="text" name="kecamatan" placeholder="Tulis Kecamatan"><br>
                      </td>
                    </tr>
                    <tr>
                      <td></td>
                      <td></td>
                      <td>
                          <input type="text" name="kodepos" placeholder="Tulis Kode Pos"><br>
                      </td>
                    </tr>
                    <tr>
                        <td>Telepon</td>
                        <td>:</td>
                        <td><input type="text" name="telepon" placeholder="Tulis Nomor Telepon"></td>
                    </tr>
                    <tr>
                        <td>HP</td>
                        <td>:</td>
                        <td><input type="text" name="hp" placeholder="Tulis Nomor HP"></td>
                    </tr>
                    <tr>
                        <td>E-Mail</td>
                        <td>:</td>
                        <td><input type="email" name="email" placeholder="Tulis Email"></td>
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

