<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>SIAKAD 2020 - Tambah History Pendidikan</title>
        <link rel="icon" type="image/png" href="../img/Logo Sinus.png">
        <link rel="stylesheet" type="text/css" href="../css/style.css">
        <script type="text/javascript">
            $(function () {
                $("#tanggal_masuk").datepicker({ dateFormat: 'yyyy/mm/dd' });
            });
        </script>
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
            <h1>Tambah Data History Pendidikan</h1>
            <hr>
            Jika ingin menambah data History Pendidikan silahkan isi form dibawah ini.
            <br><br>
            <form method="POST" class="formmahasiswa" action="../insert/insert-historypendidikan.jsp">
               <table class="tabletambah">
                    <tr>
                        <td>NIM</td>
                        <td>:</td>
                        <td><input type="text" name="nim" placeholder="Tulis NIM mahasiswa"></td>
                    </tr>
                    <tr>
                        <td>Nama Mahasiswa</td>
                        <td>:</td>
                        <td>
                            <select class="option" name="nik">
                                <option disabled selected value>- Pilih Mahasiswa -</option>
                                <% 
                                    Class.forName("com.mysql.jdbc.Driver");
                                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/serversiakad", "root", "");
                                    Statement stmt = con.createStatement();
                                    ResultSet rs = stmt.executeQuery("SELECT * FROM master_mahasiswa ORDER BY nik ASC");
                                    while (rs.next())
                                    {
                                        int item = rs.getInt("nik");
                                        String item1 = rs.getString("nama");
                                %>
                                        <option value ="<%= item %>"><%= item1 %></option>
                                <%  } %>
                            </select>
                        </td>
                    </tr>
                    <tr>
                        <td>Jenis Pendaftaran</td>
                        <td>:</td>
                        <td>
                            <select class="option" name="jenis_pendaftaran" required>
                                <option disabled selected value>- Pilih Jenis Pendaftaran -</option>
                                <option value="Baru">Baru</option>
                                <option value="Pindahan">Pindahan</option>
                                <option value="Transfer">Transfer</option>
                                <option value="Alit Jenjang">Alit Jenjang</option>
                            </select>
                        </td>
                    </tr>
                    <tr>
                        <td>Jalur Pendaftaran</td>
                        <td>:</td>
                        <td>
                            <select class="option" name="jalur_pendaftaran" required>
                                <option disabled selected value>- Pilih Jalur Pendaftaran -</option>
                                <option value="Mandiri">Mandiri</option>
                                <option value="Beasiswa">Beasiswa</option>
                            </select>
                        </td>
                    </tr>
                    <tr>
                        <td>Tanggal Masuk</td>
                        <td>:</td>
                        <td><input type="text" name="tanggal_masuk" placeholder="Tahun-Bulan-Hari" title="Masukkan tanggal dengan format Tahun/Bulan/Hari"/></td>
                    </tr>
                    <tr>
                        <td>Perguruan Tinggi</td>
                        <td>:</td>
                        <td><input type="text" name="perguruan_tinggi" placeholder="Tulis Perguruan Tinggi"></td>
                    </tr>
                    <tr>
                        <td>Program Studi</td>
                        <td>:</td>
                        <td>
                            <select class="option" name="kode_prodi" required>
                                <option disabled selected value>- Pilih Program Studi -</option>
                                <% 
                                    Class.forName("com.mysql.jdbc.Driver");
                                    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/serversiakad", "root", "");
                                    Statement stmt1 = conn.createStatement();
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
                      <td></td>
                      <td></td>
                      <td>
                          <br>
                          <input type="submit" value="Simpan"> &nbsp;&nbsp;<a href="../mahasiswa.jsp" class="buttonred">Kembali</a>
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
