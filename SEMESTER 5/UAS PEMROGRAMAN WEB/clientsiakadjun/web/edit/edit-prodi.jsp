<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Edit Program Studi</title>
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
            <h1>Edit Data Program Studi</h1>
            <hr>
            Silahkan edit data Program Studi yang sudah tersedia.
            <br><br>
            <form method="POST" action="../update/update-prodi.jsp" class="formmahasiswa">
                <table class="tabletambah">
                    <%
                        try {
                            siakad.prodi.Prodi_Service service = new siakad.prodi.Prodi_Service();
                            siakad.prodi.Prodi port = service.getProdiPort();
                             // TODO initialize WS operation arguments here
                            int kodeProdi = Integer.valueOf(request.getParameter("kode_prodi"));
                            java.util.List<java.lang.Object> result = port.getProdi(kodeProdi);
                            for (int i = 0; i < result.size(); i++) {
                                out.println(result.get(i));
                            }
                        } catch (Exception ex) {
                            // TODO handle custom exceptions here
                        }
                    %>
                    <tr>
                        <td></td>
                        <td></td>
                        <td>
                            <br>
                            <input type="submit" value="Simpan"> &nbsp;&nbsp; <a href="../index.jsp" class="buttonred">Kembali</a>
                        </td>
                    </tr>
                </table>
            </form>
        </div>
    <br><br>
    <footer>
        &copy; 2016-2019 PPD STMIK SiNus All Right Reserved
    </footer>
    </body>
</html>
