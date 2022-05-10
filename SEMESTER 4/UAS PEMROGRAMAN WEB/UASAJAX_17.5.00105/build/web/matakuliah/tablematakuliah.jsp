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
            data = "select * from matakuliah where matakuliah like '%"+query+"%' ";
        }else{ 
            data = "select * from matakuliah"; 
        }
        rs = sn.executeQuery(data);
        out.print("<table class='tabledata' id='tampil'><thead><tr><th>No.</th><th>Mata Kuliah</th><th>SKS</th><th>Aksi</th></thead><tbody>");
        while(rs.next()){
            out.print("<tr>"); 
            out.print("<td style='text-align : center;'>"+y+"</td>");
            out.print("<td>"+rs.getString(2)+"</td>");
            out.print("<td style='text-align : center;'>"+rs.getString(3)+"</td>");

            out.print("<td style='text-align: center;'><a class='edit' href='editmatakuliah.jsp?id="+rs.getString(1)+"'> Edit </a>&nbsp; <a class='buttonred' href='deletematakuliah.jsp?id="+rs.getString(1)+"&matakuliah="+rs.getString(2)+"&sks="+rs.getString(3)+"'> Delete </a></td>"); 
            out.print("</tr>"); 
            y++;
        }
        out.print("</tbody></table>");
    
      %>