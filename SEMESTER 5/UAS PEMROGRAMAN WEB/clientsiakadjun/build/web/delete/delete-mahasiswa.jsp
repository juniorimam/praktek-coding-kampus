    <%
    try {
	siakad.mahasiswa.Mahasiswa_Service service = new siakad.mahasiswa.Mahasiswa_Service();
	siakad.mahasiswa.Mahasiswa port = service.getMahasiswaPort();
	 // TODO initialize WS operation arguments here
	int nik = Integer.valueOf(request.getParameter("nik"));
	port.delMahasiswa(nik);
        response.sendRedirect("../mahasiswa.jsp");
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>