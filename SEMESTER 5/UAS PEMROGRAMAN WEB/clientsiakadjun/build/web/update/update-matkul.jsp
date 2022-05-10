    <%
    try {
	siakad.matakuliah.Matakuliah_Service service = new siakad.matakuliah.Matakuliah_Service();
	siakad.matakuliah.Matakuliah port = service.getMatakuliahPort();
	 // TODO initialize WS operation arguments here
	
        int kodeMatakuliah =Integer.valueOf(request.getParameter("kode_matakuliah"));
        java.lang.String namaMatakuliah = request.getParameter("nama_matakuliah");
        int kodeProdi =Integer.valueOf(request.getParameter("kode_prodi"));
        java.lang.String jenisMatakuliah = request.getParameter("jenis_matakuliah");
        int bobotMatakuliah =Integer.valueOf(request.getParameter("bobot_matakuliah"));
        int bobotTeori =Integer.valueOf(request.getParameter("bobot_teori"));
        int bobotPraktikum =Integer.valueOf(request.getParameter("bobot_praktikum"));
        
	port.editMatkul(kodeMatakuliah, namaMatakuliah, kodeProdi, jenisMatakuliah, bobotMatakuliah, bobotTeori, bobotPraktikum);
        response.sendRedirect("../matakuliah.jsp");
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>