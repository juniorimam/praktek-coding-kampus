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
            data = "select * from mahasiswa where nim like '%"+query+"%'or nama like'%"+query+"%' or kelas like'%"+query+"%' or alamat like'%"+query+"%' ";
        }else{ 
            data = "select * from mahasiswa"; 
        }
        rs = sn.executeQuery(data);
        out.print("<table class='tabledata' id='tampil'><thead><tr><th>No.</th><th>NIM</th><th>Nama</th><th>Alamat</th><th>No. Telp</th><th>Kelas</th><th>Aksi</th></tr></thead><tbody>");
        while(rs.next()){
            out.print("<tr>"); 
            out.print("<td style='text-align : center;'>"+y+"</td>");
            out.print("<td>"+rs.getString(2)+"</td>");
            out.print("<td>"+rs.getString(3)+"</td>");
            out.print("<td>"+rs.getString(4)+"</td>");
            out.print("<td>"+rs.getString(5)+"</td>");
            out.print("<td style='text-align : center;'>"+rs.getString(6)+"</td>");

            out.print("<td style='text-align: center;'><a class='edit' href='editmahasiswa.jsp?id="+rs.getString(1)+"'> Edit </a>&nbsp; <a class='buttonred' href='deletemahasiswa.jsp?id="+rs.getString(1)+"&nim="+rs.getString(2)+"&nama="+rs.getString(3)+"&alamat="+rs.getString(4)+"&notelp="+rs.getString(5)+"&kelas="+rs.getString(6)+"'> Delete </a></td>"); 
            out.print("</tr>"); 
            y++;
        }
        out.print("</tbody></table>");
    
      %>