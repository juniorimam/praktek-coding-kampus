
    <%
    try {
	siakad.prodi.Prodi_Service service = new siakad.prodi.Prodi_Service();
	siakad.prodi.Prodi port = service.getProdiPort();
	 // TODO initialize WS operation arguments here
	int kodeProdi = Integer.valueOf(request.getParameter("kode_prodi"));
	port.delProdi(kodeProdi);
        response.sendRedirect("../index.jsp");
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
