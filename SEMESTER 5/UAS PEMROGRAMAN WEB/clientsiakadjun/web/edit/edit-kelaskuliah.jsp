<%@page import="java.sql.SQLException"%>
<%@page import="siakad.koneksi.koneksi"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
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
            <h1>Edit Data Kelas Kuliah</h1>
            <hr>
            Silahkan edit data Kelas Kuliah yang sudah tersedia.
            <br><br>
            <form method="POST" action="../update/update-kelas.jsp" class="formmahasiswa">
                <table class="tabletambah">
                    <%
                        try {
                            siakad.kelas.Kelaskuliah_Service service = new siakad.kelas.Kelaskuliah_Service();
                            siakad.kelas.Kelaskuliah port = service.getKelaskuliahPort();
                             // TODO initialize WS operation arguments here
                            int idKelasKuliah = Integer.valueOf(request.getParameter("id_kelas_kuliah"));
                            java.util.List<java.lang.Object> result = port.getKelas(idKelasKuliah);
                            for (int i = 0; i < result.size(); i++) {
                                out.println(result.get(i));
                            }
                        } catch (Exception ex) {
                            // TODO handle custom exceptions here
                        }
                    %>
                    <tr>
                        <td>Mata Kuliah</td>
                        <td>:</td>
                        <td>
                            <select class="option" required name="kode_matakuliah">
                                <option disabled selected value>- Pilih Mata Kuliah -</option>
                                <%
                                    String id = request.getParameter("id_kelas_kuliah");
                                    Connection k = null;
                                    Statement stm = null;
                                    ResultSet rs1 = null;
                                    
                                    String editmatkul = "select * from kelas_kuliah where id_kelas_kuliah='"+id+"'";

                                    try{
                                        koneksi kon = new koneksi();
                                        k = kon.getKoneksi();
                                        stm = k.createStatement();
                                        rs1  = stm.executeQuery(editmatkul);
                                        while(rs1.next()){
                                            int kode_matakuliah = rs1.getInt("kode_matakuliah");

                                %>
                                
                                <%
                                    Statement stmt1 = k.createStatement();
                                    ResultSet rs = stmt1.executeQuery("SELECT * FROM master_matakuliah ORDER BY kode_matakuliah ASC");
                                    while (rs.next())
                                    {
                                        int item = rs.getInt("kode_matakuliah");
                                        String item1 = rs.getString("nama_matakuliah");
                                %>
                                        <option value ="<%=item %>" 
                                                <% if(item == kode_matakuliah){ 
                                                    out.print("selected"); 
                                                }else{
                                                    out.print("");
                                                } %>
                                        ><%= item1 %></option>
                                <%  } rs.close(); %>
                                <%  }
                                    } catch(SQLException e){
                                        out.println(e);
                                    }
                                    rs1.close();
                                %> 
                            </select>
                        </td>
                    </tr>
                    <tr>
                        <td>Program Studi</td>
                        <td>:</td>
                        <td>
                            <select class="option" required name="kode_prodi">
                                <option disabled selected value>- Pilih Program Studi -</option>
                                <%
                                    String edit = "select * from kelas_kuliah where id_kelas_kuliah='"+id+"'";

                                    try{
                                        koneksi kon = new koneksi();
                                        k = kon.getKoneksi();
                                        stm = k.createStatement();
                                        rs1  = stm.executeQuery(edit);
                                        while(rs1.next()){
                                            int kode_prodi = rs1.getInt("kode_prodi");

                                %>
                                
                                <%
                                    Statement stmt1 = k.createStatement();
                                    ResultSet rs = stmt1.executeQuery("SELECT * FROM master_prodi ORDER BY kode_prodi ASC");
                                    while (rs.next())
                                    {
                                        int item = rs.getInt("kode_prodi");
                                        String item1 = rs.getString("nama_prodi");
                                        String item2 = rs.getString("jenjang");
                                %>
                                        <option value ="<%=item %>" 
                                                <% if(item == kode_prodi){ 
                                                    out.print("selected"); 
                                                }else{
                                                    out.print("");
                                                } %>
                                        ><%= item1 %> - <%= item2 %></option>
                                <%  } rs.close(); %>
                                <%  }
                                    } catch(SQLException e){
                                        out.println(e);
                                    }
                                    rs1.close();
                                %> 
                            </select>
                        </td>
                    </tr>
                    <tr>
                        <td></td>
                        <td></td>
                        <td>
                            <br>
                            <input type="submit" value="Simpan"> &nbsp;&nbsp; <a href="../kelaskuliah.jsp" class="buttonred">Kembali</a>
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
