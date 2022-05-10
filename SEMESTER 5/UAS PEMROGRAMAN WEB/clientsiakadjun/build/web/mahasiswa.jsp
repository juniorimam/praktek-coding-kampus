<html>
<head>
    <title>SIAKAD 2020 - Mahasiswa</title>
    <link rel="icon" type="image/png" href="img/Logo Sinus.png">
    <link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
  <header>
    <div class="banner">
      <a href="index.jsp">
        <img src="img/banner.png">
      </a>
    </div>
    <div class="menu">
      <ul>
        <a href="index.jsp">
            <li>Home</li>
        </a>
        <a href="mahasiswa.jsp">
            <li>Mahasiswa</li>
        </a>
        <a href="matakuliah.jsp">
            <li>Mata Kuliah</li>
        </a>
        <a href="kelaskuliah.jsp">
            <li>Kelas Kuliah</li>
        </a>
          <a href="nilai.jsp">
            <li>Nilai</li>
        </a>
      </ul>
    </div>
  </header>
  <img src="img/sinus.jpg" class="sinus">
  <div class="isi">
      <b><h1>SIAKAD 2020</h1></b>
      <hr>
      <p>
          Profil Perguruan Tinggi<br><br>
      </p>
          
      <table>
          <tr>
              <td>Kode Perguruan Tinggi</td>
              <td width="20px" rowspan="3"></td>
              <td>063040</td>
          </tr>
          <tr>
              <td>Nama Perguruan Tinggi</td>
              <td>STMIK Sinar Nusantara</td>
          </tr>
          <tr>
              <td>Alamat Perguruan Tinggi</td>
              <td>Jln. K.H. Samanhudi No. 84-86 Surakarta</td>
          </tr>
      </table>
      
      <br>
            <h1>Daftar Mahasiswa</h1>
            <hr><br>
            <div class="search">
                <a class="edit" href="tambah/tambah-mahasiswa.jsp">Tambah Mahasiswa</a>
            </div>
            Berikut Mahasiswa yang ada di STMIK Sinar Nusantara Surakarta.<br><i style="font-size: 10pt;" >(Klik nama mahasiswa untuk melihat detail mahasiswa)</i>
            <br>
            <table class="tabledata" id="tampil">
                <thead>
                    <tr>
                        <th>No.</th>
                        <th>Nama</th>
                        <th>NIM</th>
                        <th>L/P</th>
                        <th>Agama</th>
                        <th>Tempat Lahir</th>
                        <th>Tanggal Lahir</th>
                        <th>Prodi</th>
                        <th>Angkatan</th>
                        <th>Aksi</th
                    </tr>
                </thead>
                <tbody>
                    <tr>
                            <%
                                try {
                                    siakad.mahasiswa.Mahasiswa_Service service = new siakad.mahasiswa.Mahasiswa_Service();
                                    siakad.mahasiswa.Mahasiswa port = service.getMahasiswaPort();
                                    // TODO process result here
                                    java.util.List<java.lang.Object> result = port.tampilMahasiswa();
                                    out.println(result);
                                } catch (Exception ex) {
                                    // TODO handle custom exceptions here
                                }
                            %>
                    </tr>
                </tbody>
            </table>
  </div>
    <br><br><br>
    <footer>
        &copy; 2016-2019 PPD STMIK SiNus All Right Reserved
    </footer>
</body>
</html>
