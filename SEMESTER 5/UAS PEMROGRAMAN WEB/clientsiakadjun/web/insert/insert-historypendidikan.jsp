    <%
    try {
	siakad.history.HistoryPendidikan_Service service = new siakad.history.HistoryPendidikan_Service();
	siakad.history.HistoryPendidikan port = service.getHistoryPendidikanPort();
	 // TODO initialize WS operation arguments here
	
        int nim = Integer.valueOf(request.getParameter("nim"));
        int nik = Integer.valueOf(request.getParameter("nik"));
        int kodeProdi = Integer.valueOf(request.getParameter("kode_prodi"));
	java.lang.String jenisPendaftaran = request.getParameter("jenis_pendaftaran");
        java.lang.String jalurPendaftaran = request.getParameter("jalur_pendaftaran");
        java.lang.String tanggalMasuk = request.getParameter("tanggal_masuk");
        java.lang.String perguruanTinggi = request.getParameter("perguruan_tinggi");
        
	port.addHistoryPendidikan(nim, nik, kodeProdi, jenisPendaftaran, jalurPendaftaran, tanggalMasuk, perguruanTinggi);
        response.sendRedirect("../historypendidikan.jsp?nik="+nik+"");
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>