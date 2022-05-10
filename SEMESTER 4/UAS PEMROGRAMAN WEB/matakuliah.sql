-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jul 03, 2019 at 07:12 AM
-- Server version: 10.1.38-MariaDB
-- PHP Version: 7.3.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `matakuliah`
--

-- --------------------------------------------------------

--
-- Table structure for table `mahasiswa`
--

CREATE TABLE `mahasiswa` (
  `id_mhs` int(11) UNSIGNED NOT NULL,
  `nim` varchar(10) DEFAULT NULL,
  `nama` varchar(30) DEFAULT NULL,
  `alamat` varchar(30) DEFAULT NULL,
  `notelp` varchar(12) DEFAULT NULL,
  `kelas` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `mahasiswa`
--

INSERT INTO `mahasiswa` (`id_mhs`, `nim`, `nama`, `alamat`, `notelp`, `kelas`) VALUES
(1, '17.5.00102', 'Ratna Tria K.', 'Sukoharjo', '08344568272', '17C'),
(2, '17.5.00104', 'Mia Rahmanda S.', 'Solo', '08574928321', '17C'),
(3, '17.5.00105', 'Junior Imam Nugroho', 'Kartasura', '089643964169', '17C'),
(4, '17.5.00107', 'Muhammad Faiz', 'Kudus', '081472857234', '17C'),
(5, '17.5.00108', 'Heru Yulianto', 'Wonogiri', '08783172839', '17C'),
(6, '17.5.00109', 'Handika Dwi P.', 'Wonogiri', '08957284727', '17C'),
(7, '17.5.00111', 'Zidny Nuriyantoro', 'Sragen', '08192746212', '17C'),
(8, '17.5.00112', 'Deby Kurnia P.', 'Kartasura', '089747262123', '17C'),
(9, '17.5.00113', 'Rizki Agung', 'Kartasura', '0859274712', '17C'),
(10, '17.5.00114', 'Rohmat', 'Sragen', '08472819283', '17C'),
(11, '17.5.00115', 'Dicky Jordan P.', 'Sragen', '08224927412', '17C'),
(12, '17.5.00116', 'Ervina Yuliana', 'Sragen', '089572647242', '17C'),
(13, '17.5.00118', 'Jarot Bayu W.', 'Sukoharjo', '08527892852', '17C'),
(14, '17.5.00122', 'Yuni Pinileh', 'Boyolali', '08192847232', '17C'),
(15, '17.5.00123', 'Rahmat Maulana M.', 'Boyolali', '08475928582', '17C'),
(16, '17.5.00126', 'Edgar Ferariviva', 'Surakarta', '08128483723', '17C'),
(17, '17.5.00127', 'Alvinky Axl', 'Sukoharjo', '08192842345', '17C'),
(18, '17.5.00129', 'Jihan Oktamar', 'Surakarta', '08524782947', '17C'),
(19, '17.5.00130', 'Aditya Putra N,', 'Wonogiri', '08192237582', '17C'),
(20, '17.5.00131', 'Bela Septiana', 'Surakarta', '08327421234', '17C'),
(21, '17.5.00132', 'Panji Chandra B.', 'Surakarta', '08328198342', '17C'),
(22, '17.5.00133', 'Firdaus Adi D.', 'Surakarta', '08927481728', '17C'),
(23, '17.5.00134', 'Dimas Alfata', 'Sragen', '085128472823', '17C'),
(24, '17.5.00135', 'Niza Astri Rahayu', 'Kartasura', '08294782182', '17C'),
(25, '17.5.00136', 'Yusuf Fajar K.', 'Boyolali', '08927482732', '17C');

-- --------------------------------------------------------

--
-- Table structure for table `matakuliah`
--

CREATE TABLE `matakuliah` (
  `id_matakuliah` int(11) UNSIGNED NOT NULL,
  `matakuliah` varchar(30) DEFAULT NULL,
  `sks` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `matakuliah`
--

INSERT INTO `matakuliah` (`id_matakuliah`, `matakuliah`, `sks`) VALUES
(1, 'Pemrograman Web', 2),
(2, 'PKN', 3),
(3, 'Arsitektur Komputer', 2),
(4, 'Kewirausahaan', 2),
(5, 'Pemrograman Database', 4),
(6, 'Sistem Terdistribusi', 2),
(7, 'Statistik', 2),
(8, 'Keamanan Data', 2),
(9, 'Bahasa Inggris 1', 2),
(10, 'Bahasa Inggris 2', 2),
(11, 'Bahasa Inggris 3', 2),
(12, 'Bahasa Inggris 4', 2),
(13, 'Jaringan Komputer 1', 4),
(14, 'Jaringan Komputer 2', 4),
(15, 'Bahasa Indonesia', 2),
(16, 'Metode Numerik', 2),
(17, 'Aljabar', 2),
(18, 'Manajemen Bisnis', 2),
(19, 'APSI', 2),
(20, 'Pend. Agama Islam', 2),
(21, 'PSSI', 2),
(22, 'PBO', 4),
(23, 'SOPIK 1', 4),
(24, 'SOPIK 2', 4),
(25, 'Pemrograman Java', 2);

-- --------------------------------------------------------

--
-- Table structure for table `transaksi`
--

CREATE TABLE `transaksi` (
  `id_transaksi` int(11) UNSIGNED NOT NULL,
  `id_mhs` int(11) UNSIGNED DEFAULT NULL,
  `id_matakuliah` int(11) UNSIGNED DEFAULT NULL,
  `hari` varchar(10) DEFAULT NULL,
  `ruang` varchar(10) DEFAULT NULL,
  `jam` varchar(5) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `transaksi`
--

INSERT INTO `transaksi` (`id_transaksi`, `id_mhs`, `id_matakuliah`, `hari`, `ruang`, `jam`) VALUES
(1, 1, 1, 'Senin', 'C21', '08.00'),
(2, 2, 2, 'Senin', 'C22', '09.00'),
(3, 3, 3, 'Senin', 'C22', '10.00'),
(4, 4, 4, 'Selasa', 'C32', '14.00'),
(5, 5, 5, 'Rabu', 'C42', '12.00'),
(6, 6, 6, 'Kamis', 'C33', '09.00'),
(7, 7, 7, 'Rabu', 'C21', '12.00'),
(8, 8, 8, 'Kamis', 'C31', '15.00'),
(9, 9, 9, 'Kamis', 'C21', '08.00'),
(10, 10, 10, 'Rabu', 'Kamis', 'C33'),
(11, 11, 11, 'Selasa', 'C32', '12.00'),
(12, 12, 12, 'Kamis', 'C34', '09.00'),
(13, 13, 13, 'Selasa', 'Lab 8', '08.00'),
(14, 14, 14, 'Selasa', 'Lab 8', '10.00'),
(15, 15, 15, 'Kamis', 'C42', '09.00'),
(16, 16, 16, 'Rabu', 'Selasa', '10.00'),
(17, 17, 17, 'Jumat', 'C42', '10.00'),
(18, 18, 18, 'Jumat', 'C22', '09.00'),
(19, 19, 19, 'Senin', 'C33', '09.00'),
(20, 20, 20, 'Rabu', 'C42', '10.00'),
(21, 21, 21, 'Jumat', 'C42', '08.00'),
(22, 22, 22, 'Sabtu', 'C22', '08.00'),
(23, 23, 23, 'Sabtu', 'C31', '09.00'),
(24, 24, 24, 'Sabtu', 'C42', '12.00');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `mahasiswa`
--
ALTER TABLE `mahasiswa`
  ADD PRIMARY KEY (`id_mhs`);

--
-- Indexes for table `matakuliah`
--
ALTER TABLE `matakuliah`
  ADD PRIMARY KEY (`id_matakuliah`);

--
-- Indexes for table `transaksi`
--
ALTER TABLE `transaksi`
  ADD PRIMARY KEY (`id_transaksi`),
  ADD KEY `transaksi_id_mhs` (`id_mhs`) USING BTREE,
  ADD KEY `transaksi_id_matakuliah` (`id_matakuliah`) USING BTREE;

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `mahasiswa`
--
ALTER TABLE `mahasiswa`
  MODIFY `id_mhs` int(11) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=26;

--
-- AUTO_INCREMENT for table `matakuliah`
--
ALTER TABLE `matakuliah`
  MODIFY `id_matakuliah` int(11) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=26;

--
-- AUTO_INCREMENT for table `transaksi`
--
ALTER TABLE `transaksi`
  MODIFY `id_transaksi` int(11) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=25;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `transaksi`
--
ALTER TABLE `transaksi`
  ADD CONSTRAINT `transaksi_ibfk_1` FOREIGN KEY (`id_mhs`) REFERENCES `mahasiswa` (`id_mhs`),
  ADD CONSTRAINT `transaksi_ibfk_2` FOREIGN KEY (`id_matakuliah`) REFERENCES `matakuliah` (`id_matakuliah`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
