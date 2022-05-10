    <%
    try {
	siakad.kelas.Kelaskuliah_Service service = new siakad.kelas.Kelaskuliah_Service();
	siakad.kelas.Kelaskuliah port = service.getKelaskuliahPort();
	 // TODO initialize WS operation arguments here
	int idKelasKuliah = Integer.valueOf(request.getParameter("id_kelas_kuliah"));
	port.delKelas(idKelasKuliah);
        response.sendRedirect("../kelaskuliah.jsp");
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>