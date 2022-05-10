
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Tambah Program Studi</title>
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
            <h1>Tambah Data Program Studi</h1>
            <hr>
            Jika ingin menambah data Program Studi silahkan isi form dibawah ini.
            <br><br>
            <form method="POST" class="formmahasiswa" action="../insert/insert-prodi.jsp">
                <table class="tabletambah">
                    <tr>
                        <td>Kode Prodi</td>
                        <td>:</td>
                        <td><input type="text" name="kode_prodi" placeholder="Tulis Kode Prodi"></td>
                    </tr>
                    <tr>
                        <td>Nama Prodi</td>
                        <td>:</td>
                    <td><input type="text" name="nama_prodi" placeholder="Tulis Nama Prodi"></td>
                    </tr>
                    <tr>
                        <td>Jenjang</td>
                        <td>:</td>
                    <td><input type="text" name="jenjang" placeholder="Tulis Jenjang Prodi"></td>
                    </tr>
                    <tr>
                      <td>Akreditasi</td>
                      <td>:</td>
                      <td><input type="text" name="akreditasi" placeholder="Tulis Akreditasi Prodi"></td>
                    </tr>
                    <tr>
                      <td>No. SK Prodi</td>
                      <td>:</td>
                      <td><input type="text" name="no_sk_prodi" placeholder="Tulis No. SK Prodi"></td>
                    </tr>
                    <tr>
                      <td></td>
                      <td></td>
                      <td>
                          <br>
                          <input type="submit" value="Simpan"> &nbsp;&nbsp;<a href="../index.jsp" class="buttonred">Kembali</a>
                      </td>
                    </tr>
                </table>
            </form>
            <br>
        </div>
        <footer>
            &copy; 2016-2019 PPD STMIK SiNus All Right Reserved
        </footer>
    </body>
</html>
