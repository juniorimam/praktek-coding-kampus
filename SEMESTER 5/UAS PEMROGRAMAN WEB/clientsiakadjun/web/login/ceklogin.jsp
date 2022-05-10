<%@ page import ="java.sql.*" %>
 
<%
    String username = request.getParameter("username");    
    String password = request.getParameter("password");
    Class.forName("com.mysql.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/serversiakad",
            "root", "");
    Statement st = con.createStatement();
    ResultSet rs;
    rs = st.executeQuery("select * from history_pendidikan where nim='" + username + "' and nim='" + password + "'");
    if (rs.next()) {
        response.sendRedirect("../index.jsp");
    } else {
        response.sendRedirect("../errorlogin.jsp");
    }
%>