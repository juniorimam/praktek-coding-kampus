    <%
    try {
	siakad.mahasiswa.Mahasiswa_Service service = new siakad.mahasiswa.Mahasiswa_Service();
	siakad.mahasiswa.Mahasiswa port = service.getMahasiswaPort();
	 // TODO initialize WS operation arguments here
        
	int nik = Integer.valueOf(request.getParameter("nik"));
	int nim = Integer.valueOf(request.getParameter("nim"));
	int kodeProdi = Integer.valueOf(request.getParameter("kode_prodi"));
	int angkatan = Integer.valueOf(request.getParameter("angkatan"));
	java.lang.String nama = request.getParameter("nama");
	java.lang.String tempatLahir = request.getParameter("tempat_lahir");
	java.lang.String tanggalLahir = request.getParameter("tanggal_lahir");
	java.lang.String jenisKelamin = request.getParameter("jenis_kelamin");
	java.lang.String agama = request.getParameter("agama");
	java.lang.String namaIbuKandung = request.getParameter("nama_ibu_kandung");
	int nisn = Integer.valueOf(request.getParameter("nisn"));
	int npwp = Integer.valueOf(request.getParameter("npwp"));
	java.lang.String kewarganegaraan = request.getParameter("kewarganegaraan");
	java.lang.String jalan = request.getParameter("jalan");
	java.lang.String dusun = request.getParameter("dusun");
	java.lang.String rt = request.getParameter("rt");
	java.lang.String rw = request.getParameter("rw");
	java.lang.String kelurahan = request.getParameter("kelurahan");
	java.lang.String kecamatan = request.getParameter("kecamatan");
	int kodepos = Integer.valueOf(request.getParameter("kode_pos"));
	java.lang.String telepon = request.getParameter("telepon");
	java.lang.String hp = request.getParameter("hp");
	java.lang.String email = request.getParameter("email");
        
	port.addMahasiswa(nik, nim, kodeProdi, angkatan, nama, tempatLahir, tanggalLahir, jenisKelamin, agama, namaIbuKandung, nisn, npwp, kewarganegaraan, jalan, dusun, rt, rw, kelurahan, kecamatan, kodepos, telepon, hp, email);
        response.sendRedirect("../mahasiswa.jsp");
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>