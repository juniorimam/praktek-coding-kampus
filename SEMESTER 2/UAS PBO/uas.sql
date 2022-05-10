-- phpMyAdmin SQL Dump
-- version 4.7.7
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Aug 09, 2018 at 12:02 PM
-- Server version: 10.1.30-MariaDB
-- PHP Version: 7.2.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `uas`
--

-- --------------------------------------------------------

--
-- Table structure for table `kereta`
--

CREATE TABLE `kereta` (
  `idkereta` int(5) NOT NULL,
  `kereta` varchar(50) NOT NULL,
  `jeniskereta` varchar(50) NOT NULL,
  `jurusan` varchar(20) NOT NULL,
  `tanggal` date NOT NULL,
  `jamdatang` varchar(5) NOT NULL,
  `jamberangkat` varchar(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `kereta`
--

INSERT INTO `kereta` (`idkereta`, `kereta`, `jeniskereta`, `jurusan`, `tanggal`, `jamdatang`, `jamberangkat`) VALUES
(1, 'Argo Lawu', 'Eksekutif', 'Jakarta', '2018-07-20', '07.55', '08.00'),
(2, 'Argo Dwipangga', 'Eksekutif', 'Yogyakarta', '2018-07-21', '20.52', '20.57'),
(3, 'Senja Utama', 'Bisnis', 'Bekasi', '2018-07-22', '02.10', '02.25'),
(4, 'Lodaya', 'Bisnis', 'Tasikmalaya', '2018-07-23', '12.55', '13.00');

-- --------------------------------------------------------

--
-- Table structure for table `pemesan`
--

CREATE TABLE `pemesan` (
  `idpemesan` int(5) NOT NULL,
  `nama` varchar(50) NOT NULL,
  `alamat` varchar(50) NOT NULL,
  `telepon` varchar(12) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `pemesan`
--

INSERT INTO `pemesan` (`idpemesan`, `nama`, `alamat`, `telepon`) VALUES
(1, 'Junior', 'Sukoharjo', '089643964169'),
(2, 'Yuni', 'Boyolali', '089786477868'),
(3, 'Dimas', 'Sragen', '081728499582'),
(4, 'Joko', 'Sukoharjo', '089378928472'),
(5, 'Rama', 'Karanganyar', '087463849745'),
(6, 'Reza', 'Surakarta', '087647294789'),
(7, 'Wiryo', 'Klaten', '082479848947'),
(8, 'Sukino', 'Surakarta', '089768378590'),
(9, 'Kirun', 'Sragen', '083457896826'),
(10, 'Tono', 'Sukoharjo', '085789372799');

-- --------------------------------------------------------

--
-- Table structure for table `petugas`
--

CREATE TABLE `petugas` (
  `idpetugas` int(5) NOT NULL,
  `username` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL,
  `nama` varchar(50) NOT NULL,
  `alamat` varchar(50) NOT NULL,
  `jabatan` varchar(20) NOT NULL,
  `telepon` varchar(12) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `petugas`
--

INSERT INTO `petugas` (`idpetugas`, `username`, `password`, `nama`, `alamat`, `jabatan`, `telepon`) VALUES
(1, 'kelompok4', 'kelompok4', 'Kelompok 4', 'STMIK Sinar Nusantara', 'Admin', '08123456789');

-- --------------------------------------------------------

--
-- Table structure for table `transaksi`
--

CREATE TABLE `transaksi` (
  `idtransaksi` int(5) NOT NULL,
  `idkereta` int(5) NOT NULL,
  `idpemesan` int(5) NOT NULL,
  `idpetugas` int(5) NOT NULL,
  `harga_tiket` int(10) NOT NULL,
  `jumlah_tiket` int(10) NOT NULL,
  `total_bayar` int(10) NOT NULL,
  `status` varchar(12) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `transaksi`
--

INSERT INTO `transaksi` (`idtransaksi`, `idkereta`, `idpemesan`, `idpetugas`, `harga_tiket`, `jumlah_tiket`, `total_bayar`, `status`) VALUES
(1, 1, 1, 1, 350000, 2, 700000, 'Lunas'),
(2, 1, 2, 1, 350000, 1, 350000, 'Lunas'),
(3, 1, 3, 1, 350000, 4, 1400000, 'Belum Lunas'),
(4, 2, 4, 1, 200000, 1, 200000, 'Belum Lunas'),
(5, 2, 5, 1, 200000, 5, 1000000, 'Lunas'),
(6, 2, 6, 1, 200000, 2, 400000, 'Lunas'),
(7, 3, 7, 1, 100000, 4, 400000, 'Belum Lunas'),
(8, 3, 8, 1, 100000, 1, 100000, 'Lunas'),
(9, 4, 9, 1, 150000, 4, 600000, 'Lunas'),
(10, 4, 10, 1, 150000, 1, 150000, 'Lunas');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `kereta`
--
ALTER TABLE `kereta`
  ADD PRIMARY KEY (`idkereta`);

--
-- Indexes for table `pemesan`
--
ALTER TABLE `pemesan`
  ADD PRIMARY KEY (`idpemesan`);

--
-- Indexes for table `petugas`
--
ALTER TABLE `petugas`
  ADD PRIMARY KEY (`idpetugas`),
  ADD UNIQUE KEY `Un_Username` (`username`);

--
-- Indexes for table `transaksi`
--
ALTER TABLE `transaksi`
  ADD PRIMARY KEY (`idtransaksi`),
  ADD KEY `id_anggota` (`idpemesan`),
  ADD KEY `id_petugas` (`idpetugas`),
  ADD KEY `id_pustaka` (`idkereta`) USING BTREE;

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `kereta`
--
ALTER TABLE `kereta`
  MODIFY `idkereta` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `pemesan`
--
ALTER TABLE `pemesan`
  MODIFY `idpemesan` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT for table `petugas`
--
ALTER TABLE `petugas`
  MODIFY `idpetugas` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `transaksi`
--
ALTER TABLE `transaksi`
  MODIFY `idtransaksi` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `transaksi`
--
ALTER TABLE `transaksi`
  ADD CONSTRAINT `transaksi_ibfk_1` FOREIGN KEY (`idpemesan`) REFERENCES `pemesan` (`idpemesan`),
  ADD CONSTRAINT `transaksi_ibfk_2` FOREIGN KEY (`idkereta`) REFERENCES `kereta` (`idkereta`),
  ADD CONSTRAINT `transaksi_ibfk_3` FOREIGN KEY (`idpetugas`) REFERENCES `petugas` (`idpetugas`),
  ADD CONSTRAINT `transaksi_ibfk_4` FOREIGN KEY (`idkereta`) REFERENCES `kereta` (`idkereta`),
  ADD CONSTRAINT `transaksi_ibfk_5` FOREIGN KEY (`idpetugas`) REFERENCES `petugas` (`idpetugas`),
  ADD CONSTRAINT `transaksi_ibfk_6` FOREIGN KEY (`idpemesan`) REFERENCES `pemesan` (`idpemesan`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
