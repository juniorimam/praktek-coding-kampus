-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 30 Jan 2020 pada 06.36
-- Versi server: 10.1.38-MariaDB
-- Versi PHP: 7.3.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `serversiakad`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `history_nilai`
--

CREATE TABLE `history_nilai` (
  `id_history_nilai` int(11) NOT NULL,
  `nim` int(10) NOT NULL,
  `nik` int(10) NOT NULL,
  `periode` varchar(50) NOT NULL,
  `id_kelas_kuliah` int(11) NOT NULL,
  `kode_prodi` int(5) NOT NULL,
  `kode_matakuliah` int(5) NOT NULL,
  `nilai_angka` int(5) NOT NULL,
  `nilai_huruf` varchar(5) NOT NULL,
  `nilai_indek` int(5) NOT NULL,
  `ips` varchar(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `history_nilai`
--

INSERT INTO `history_nilai` (`id_history_nilai`, `nim`, `nik`, `periode`, `id_kelas_kuliah`, `kode_prodi`, `kode_matakuliah`, `nilai_angka`, `nilai_huruf`, `nilai_indek`, `ips`) VALUES
(11, 17500102, 102, '2019/2020', 31, 65, 51, 80, 'A', 3, '3.5');

-- --------------------------------------------------------

--
-- Struktur dari tabel `history_pendidikan`
--

CREATE TABLE `history_pendidikan` (
  `nim` int(10) NOT NULL,
  `nik` int(10) DEFAULT NULL,
  `jenis_pendaftaran` set('Baru','Pindahan','Transfer','Alit Jenjang') NOT NULL,
  `jalur_pendaftaran` set('Mandiri','Beasiswa') NOT NULL,
  `tanggal_masuk` date NOT NULL,
  `perguruan_tinggi` varchar(100) NOT NULL,
  `kode_prodi` int(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `history_pendidikan`
--

INSERT INTO `history_pendidikan` (`nim`, `nik`, `jenis_pendaftaran`, `jalur_pendaftaran`, `tanggal_masuk`, `perguruan_tinggi`, `kode_prodi`) VALUES
(17500105, 105, 'Baru', 'Mandiri', '2017-09-17', 'STMIK Sinar Nusantara', 65),
(17500107, 107, 'Baru', 'Mandiri', '2017-09-17', 'STMIK Sinar Nusantara', 65),
(17500112, 112, 'Baru', 'Mandiri', '2017-09-17', 'STMIK Sinar Nusantara', 65),
(17500135, 135, 'Baru', 'Mandiri', '2017-09-17', 'STMIK Sinar Nusantara', 65);

-- --------------------------------------------------------

--
-- Struktur dari tabel `kelas_kuliah`
--

CREATE TABLE `kelas_kuliah` (
  `id_kelas_kuliah` int(11) NOT NULL,
  `kode_prodi` int(5) NOT NULL,
  `semester` varchar(50) NOT NULL,
  `kode_matakuliah` int(5) NOT NULL,
  `nama_kelas` varchar(10) NOT NULL,
  `dosen` varchar(50) NOT NULL,
  `jumlah_peserta` int(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `kelas_kuliah`
--

INSERT INTO `kelas_kuliah` (`id_kelas_kuliah`, `kode_prodi`, `semester`, `kode_matakuliah`, `nama_kelas`, `dosen`, `jumlah_peserta`) VALUES
(31, 64, '5', 51, 'TI-M', 'Hendro Wijayanto', 30),
(32, 65, '5', 53, 'TI-A', 'Budi Hartanto', 30),
(33, 61, '5', 52, 'TI - C', 'Sri Tomo', 20);

-- --------------------------------------------------------

--
-- Struktur dari tabel `master_mahasiswa`
--

CREATE TABLE `master_mahasiswa` (
  `nik` int(10) NOT NULL,
  `nim` int(10) DEFAULT NULL,
  `kode_prodi` int(5) NOT NULL,
  `angkatan` int(5) NOT NULL,
  `nama` varchar(50) NOT NULL,
  `tempat_lahir` varchar(50) NOT NULL,
  `tanggal_lahir` date NOT NULL,
  `jenis_kelamin` set('L','P') NOT NULL,
  `agama` varchar(20) NOT NULL,
  `nama_ibu_kandung` varchar(50) NOT NULL,
  `nisn` int(25) NOT NULL,
  `npwp` int(25) NOT NULL,
  `kewarganegaraan` varchar(50) NOT NULL,
  `jalan` varchar(50) NOT NULL,
  `dusun` varchar(50) NOT NULL,
  `rt` varchar(5) NOT NULL,
  `rw` varchar(5) NOT NULL,
  `kelurahan` varchar(50) NOT NULL,
  `kecamatan` varchar(50) NOT NULL,
  `kodepos` int(5) NOT NULL,
  `telepon` varchar(16) NOT NULL,
  `hp` varchar(16) NOT NULL,
  `email` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `master_mahasiswa`
--

INSERT INTO `master_mahasiswa` (`nik`, `nim`, `kode_prodi`, `angkatan`, `nama`, `tempat_lahir`, `tanggal_lahir`, `jenis_kelamin`, `agama`, `nama_ibu_kandung`, `nisn`, `npwp`, `kewarganegaraan`, `jalan`, `dusun`, `rt`, `rw`, `kelurahan`, `kecamatan`, `kodepos`, `telepon`, `hp`, `email`) VALUES
(105, 17500105, 65, 2017, 'Junior Imam N.', 'Sukoharjo', '1999-06-24', 'L', 'Islam', 'Kristina', 123, 123, 'Indonesia', 'Gandekan', 'Gandekan', '02', '03', 'Kertonatan', 'Kartasura', 57164, '089643964169', '089643964169', 'juniorimam123@gmail.com'),
(107, 17500107, 65, 2017, 'Muhammad Faiz', 'Kudus', '1998-08-05', 'L', 'Islam', 'siti', 12345, 5678, 'Indonesia', 'jl.raya indah', 'mojo', '01', '04', 'getas', 'gebog', 78878, '089765675577', '098867765556', 'faiz@gmail.com'),
(112, 17500112, 65, 2017, 'Deby Kurnia Putra', 'Sukoharjo', '1998-03-01', 'L', 'islam', 'sri rukmini', 111199825, 119922888, 'indonesia', 'sedap malam', 'sadakan kidul', '03', '02', 'gumpang', 'kartasura', 57169, '08812928069', '08812928089', 'debykurnia@gmail.com'),
(135, 17500135, 65, 2017, 'Niza Astri Rahayu', 'Surakarta', '1998-12-15', 'P', 'Islam', 'Supartini', 12345, 123456, 'Indonesia', 'Sedahmirah', 'Sedahromo Lor', '2', '7', 'Kartasura', 'Kartasura', 12345, '089673301029', '089673301029', 'nizaastrirahayu@gmail.com');

-- --------------------------------------------------------

--
-- Struktur dari tabel `master_matakuliah`
--

CREATE TABLE `master_matakuliah` (
  `kode_matakuliah` int(5) NOT NULL,
  `nama_matakuliah` varchar(50) NOT NULL,
  `kode_prodi` int(5) NOT NULL,
  `jenis_matakuliah` set('Wajib','Pilihan') NOT NULL,
  `bobot_matakuliah` int(2) NOT NULL,
  `bobot_teori` int(2) NOT NULL,
  `bobot_praktikum` int(2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `master_matakuliah`
--

INSERT INTO `master_matakuliah` (`kode_matakuliah`, `nama_matakuliah`, `kode_prodi`, `jenis_matakuliah`, `bobot_matakuliah`, `bobot_teori`, `bobot_praktikum`) VALUES
(51, 'Pemrograman Web II', 65, 'Wajib', 4, 2, 2),
(52, 'Desain Web II', 63, 'Wajib', 4, 2, 2),
(53, 'Jaringan Komputer II', 64, 'Wajib', 4, 2, 2);

-- --------------------------------------------------------

--
-- Struktur dari tabel `master_prodi`
--

CREATE TABLE `master_prodi` (
  `kode_prodi` int(5) NOT NULL,
  `nama_prodi` varchar(50) NOT NULL,
  `jenjang` varchar(2) NOT NULL,
  `akreditasi` varchar(3) NOT NULL,
  `no_sk_prodi` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `master_prodi`
--

INSERT INTO `master_prodi` (`kode_prodi`, `nama_prodi`, `jenjang`, `akreditasi`, `no_sk_prodi`) VALUES
(61, 'Komputerisasi Akutansi', 'D3', 'B', '111'),
(62, 'Manajemen Informatika', 'D3', 'B', '222'),
(63, 'Teknik Informatika', 'D3', 'B', '333'),
(64, 'Sistem Informatika', 'S1', 'B', '444'),
(65, 'Teknik Informatika', 'S1', 'B', '555');

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `history_nilai`
--
ALTER TABLE `history_nilai`
  ADD PRIMARY KEY (`id_history_nilai`) USING BTREE,
  ADD KEY `id_kelas_kuliah` (`id_kelas_kuliah`),
  ADD KEY `nim` (`nim`),
  ADD KEY `kode_prodi` (`kode_prodi`),
  ADD KEY `nik` (`nik`),
  ADD KEY `kode_matakuliah` (`kode_matakuliah`);

--
-- Indeks untuk tabel `history_pendidikan`
--
ALTER TABLE `history_pendidikan`
  ADD PRIMARY KEY (`nim`) USING BTREE,
  ADD KEY `kode_prodi` (`kode_prodi`) USING BTREE,
  ADD KEY `nik` (`nik`) USING BTREE;

--
-- Indeks untuk tabel `kelas_kuliah`
--
ALTER TABLE `kelas_kuliah`
  ADD PRIMARY KEY (`id_kelas_kuliah`) USING BTREE,
  ADD KEY `kode_prodi` (`kode_prodi`) USING BTREE,
  ADD KEY `kode_matakuliah` (`kode_matakuliah`) USING BTREE;

--
-- Indeks untuk tabel `master_mahasiswa`
--
ALTER TABLE `master_mahasiswa`
  ADD PRIMARY KEY (`nik`),
  ADD KEY `kode_prodi` (`kode_prodi`),
  ADD KEY `nim` (`nim`);

--
-- Indeks untuk tabel `master_matakuliah`
--
ALTER TABLE `master_matakuliah`
  ADD PRIMARY KEY (`kode_matakuliah`),
  ADD KEY `kode_prodi` (`kode_prodi`) USING BTREE;

--
-- Indeks untuk tabel `master_prodi`
--
ALTER TABLE `master_prodi`
  ADD PRIMARY KEY (`kode_prodi`);

--
-- Ketidakleluasaan untuk tabel pelimpahan (Dumped Tables)
--

--
-- Ketidakleluasaan untuk tabel `history_nilai`
--
ALTER TABLE `history_nilai`
  ADD CONSTRAINT `history_nilai_ibfk_1` FOREIGN KEY (`id_kelas_kuliah`) REFERENCES `kelas_kuliah` (`id_kelas_kuliah`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `history_nilai_ibfk_4` FOREIGN KEY (`kode_prodi`) REFERENCES `master_prodi` (`kode_prodi`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `history_nilai_ibfk_5` FOREIGN KEY (`kode_matakuliah`) REFERENCES `master_matakuliah` (`kode_matakuliah`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `history_nilai_ibfk_6` FOREIGN KEY (`nik`) REFERENCES `master_mahasiswa` (`nik`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `history_nilai_ibfk_7` FOREIGN KEY (`nim`) REFERENCES `history_pendidikan` (`nim`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Ketidakleluasaan untuk tabel `history_pendidikan`
--
ALTER TABLE `history_pendidikan`
  ADD CONSTRAINT `history_pendidikan_ibfk_1` FOREIGN KEY (`nik`) REFERENCES `master_mahasiswa` (`nik`) ON DELETE SET NULL ON UPDATE SET NULL,
  ADD CONSTRAINT `history_pendidikan_ibfk_2` FOREIGN KEY (`kode_prodi`) REFERENCES `master_prodi` (`kode_prodi`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Ketidakleluasaan untuk tabel `kelas_kuliah`
--
ALTER TABLE `kelas_kuliah`
  ADD CONSTRAINT `kelas_kuliah_ibfk_1` FOREIGN KEY (`kode_prodi`) REFERENCES `master_prodi` (`kode_prodi`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `kelas_kuliah_ibfk_2` FOREIGN KEY (`kode_matakuliah`) REFERENCES `master_matakuliah` (`kode_matakuliah`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Ketidakleluasaan untuk tabel `master_mahasiswa`
--
ALTER TABLE `master_mahasiswa`
  ADD CONSTRAINT `master_mahasiswa_ibfk_1` FOREIGN KEY (`kode_prodi`) REFERENCES `master_prodi` (`kode_prodi`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `master_mahasiswa_ibfk_2` FOREIGN KEY (`nim`) REFERENCES `history_pendidikan` (`nim`) ON DELETE SET NULL ON UPDATE SET NULL;

--
-- Ketidakleluasaan untuk tabel `master_matakuliah`
--
ALTER TABLE `master_matakuliah`
  ADD CONSTRAINT `master_matakuliah_ibfk_1` FOREIGN KEY (`kode_prodi`) REFERENCES `master_prodi` (`kode_prodi`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
