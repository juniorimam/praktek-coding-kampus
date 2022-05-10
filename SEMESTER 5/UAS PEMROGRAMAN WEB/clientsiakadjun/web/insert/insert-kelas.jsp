    <%
    try {
	siakad.kelas.Kelaskuliah_Service service = new siakad.kelas.Kelaskuliah_Service();
	siakad.kelas.Kelaskuliah port = service.getKelaskuliahPort();
	 // TODO initialize WS operation arguments here
	
        int idKelasKuliah = Integer.valueOf(request.getParameter("id_kelas_kuliah"));
        int kodeProdi = Integer.valueOf(request.getParameter("kode_prodi"));
	java.lang.String semester = request.getParameter("semester");
        int kodeMatakuliah = Integer.valueOf(request.getParameter("kode_matakuliah"));
        java.lang.String namaKelas = request.getParameter("nama_kelas");
        java.lang.String dosen = request.getParameter("dosen");
        int jumlahPeserta = Integer.valueOf(request.getParameter("jumlah_peserta"));
        
	port.addKelas(idKelasKuliah, kodeProdi, semester, kodeMatakuliah, namaKelas, dosen, jumlahPeserta);
        response.sendRedirect("../kelaskuliah.jsp");
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>