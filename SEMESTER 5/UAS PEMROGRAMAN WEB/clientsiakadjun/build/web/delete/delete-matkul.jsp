    <%
    try {
	siakad.matakuliah.Matakuliah_Service service = new siakad.matakuliah.Matakuliah_Service();
	siakad.matakuliah.Matakuliah port = service.getMatakuliahPort();
	 // TODO initialize WS operation arguments here
	int kodeMatakuliah = Integer.valueOf(request.getParameter("kode_matakuliah"));
	port.delMatkul(kodeMatakuliah);
        response.sendRedirect("../matakuliah.jsp");
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>