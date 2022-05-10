    <%
    try {
	siakad.prodi.Prodi_Service service = new siakad.prodi.Prodi_Service();
	siakad.prodi.Prodi port = service.getProdiPort();
	 // TODO initialize WS operation arguments here
        
	int kodeProdi = Integer.valueOf(request.getParameter("kode_prodi"));
	java.lang.String namaProdi = request.getParameter("nama_prodi");
	java.lang.String jenjang = request.getParameter("jenjang");
	java.lang.String akreditasi = request.getParameter("akreditasi");
        java.lang.String noSkProdi = request.getParameter("no_sk_prodi");
        
        
	port.addProdi(kodeProdi, namaProdi, jenjang, akreditasi, noSkProdi);
        response.sendRedirect("../index.jsp");
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>