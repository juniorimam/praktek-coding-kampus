<%@ page import="java.sql.*"%>
<%@page import="uas.koneksi.koneksi" %>

<%
        int y =1;
        Connection k = koneksi.getKoneksi();
        Statement sn = k.createStatement();
        ResultSet rs = null ;
        String query = request.getParameter("search");
        String data ;
        if(query!=null){
            data = "SELECT a.id_transaksi, a.hari, a.ruang, a.jam, b.matakuliah, c.nim, c.nama, c.kelas "
                    + "FROM transaksi a JOIN matakuliah b on a.id_matakuliah = b.id_matakuliah JOIN mahasiswa c ON a.id_mhs = c.id_mhs WHERE nim like '%"+query+"%' or nama like'%"+query+"%' or matakuliah like'%"+query+"%' or kelas like'%"+query+"%'";
        }else{ 
            data = "SELECT a.id_transaksi, a.hari, a.ruang, a.jam, b.matakuliah, c.nim, c.nama, c.kelas"
                    + "FROM transaksi a JOIN matakuliah b on a.id_matakuliah = b.id_matakuliah JOIN mahasiswa c ON a.id_mhs = c.id_mhs ORDER BY a.id_transaksi ASC"; 
        }
        rs = sn.executeQuery(data);
        out.print("<table class='tabledata' id='tampil'>"
                + "<thead>"
                + "<tr>"
                + "<th>No.</th>"
                + "<th>Hari</th>"
                + "<th>Ruang</th>"
                + "<th>Jam</th>"
                + "<th>Mata Kuliah</th>"
                + "<th>NIM Mahasiswa</th>"
                + "<th>Nama</th>"
                + "<th>Kelas</th>"
                + "<th>Aksi</th>"
                + "</tr>"
                + "</thead>"
                + "<tbody>");
        while(rs.next()){
            out.print("<tr>"); 
            out.print("<td style='text-align : center;'>"+y+"</td>");
            out.print("<td>"+rs.getString(2)+"</td>");
            out.print("<td>"+rs.getString(3)+"</td>");
            out.print("<td>"+rs.getString(4)+"</td>");
            out.print("<td>"+rs.getString(5)+"</td>");
            out.print("<td>"+rs.getString(6)+"</td>");
            out.print("<td>"+rs.getString(7)+"</td>");
            out.print("<td>"+rs.getString(8)+"</td>");

            out.print("<td style='text-align: center;'><a class='edit' href='edittransaksi.jsp?id="+rs.getString(1)+"'> Edit </a>&nbsp; <a class='buttonred' href='deletetransaksi.jsp?id="+rs.getString(1)+"&hari="+rs.getString(2)+"&ruang="+rs.getString(3)+"&jam="+rs.getString(4)+"&matakuliah="+rs.getString(5)+"&nim="+rs.getString(6)+"&nama="+rs.getString(7)+"'> Delete </a></td>"); 
            out.print("</tr>"); 
            y++;
        }
        out.print("</tbody></table>");
    
      %>
      