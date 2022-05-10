<html>
<head>
    <title>SIAKAD 2020 - History Pendidikan</title>
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
            <h1>History Pendidikan</h1>
            <hr><br>
            Berikut History Pendidikan dari Mahasiswa yang dituju.
            <br>

            <table class="tabledata" id="tampil">
                <thead>
                    <tr>
                        <th colspan="4">Detail Mahasiswa</th>
                    </tr>
                    <tr>
                        <th>Nama</th>
                        <th>Tempat Lahir</th>
                        <th>Tanggal Lahir</th>
                        <th>Jenis Kelamin</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <%
                            try {
                                siakad.history.HistoryPendidikan_Service service = new siakad.history.HistoryPendidikan_Service();
                                siakad.history.HistoryPendidikan port = service.getHistoryPendidikanPort();
                                 // TODO initialize WS operation arguments here
                                int nik = Integer.valueOf(request.getParameter("nik"));
                                java.util.List<java.lang.Object> result = port.getDetailMhsPend(nik);
                                out.println(result);
                            } catch (Exception ex) {
                                // TODO handle custom exceptions here
                            }
                        %>
                    </tr>
                </tbody>
            </table>
            <br><br>
            <div class="search">
                <a class="edit" href="tambah/tambah-historypendidikan.jsp">Tambah Pendidikan</a>
            </div>
            <br>
            <table class="tabledata" id="tampil">
                <thead>
                    <tr>
                        <th colspan="5">History Pendidikan</th>
                    </tr>
                    <tr>
                        <th>No.</th>
                        <th>NIM</th>
                        <th>Jenis Pendaftaran</th>
                        <th>Tanggal Masuk</th>
                        <th>Prodi</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <%
                            try {
                                siakad.history.HistoryPendidikan_Service service = new siakad.history.HistoryPendidikan_Service();
                                siakad.history.HistoryPendidikan port = service.getHistoryPendidikanPort();
                                 // TODO initialize WS operation arguments here
                                int nim = Integer.valueOf(request.getParameter("nik"));
                                java.util.List<java.lang.Object> result = port.getHistoryPend(nim);
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
