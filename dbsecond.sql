-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 01, 2024 at 03:13 PM
-- Server version: 10.4.28-MariaDB
-- PHP Version: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `dbsecond`
--

-- --------------------------------------------------------

--
-- Table structure for table `customer`
--

CREATE TABLE `customer` (
  `nama` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `customer`
--

INSERT INTO `customer` (`nama`, `password`) VALUES
('duta', '123'),
('rafi', '123'),
('rifan', '123'),
('rifanff', '123'),
('user', '123');

-- --------------------------------------------------------

--
-- Table structure for table `favorit`
--

CREATE TABLE `favorit` (
  `id` varchar(255) NOT NULL,
  `nama` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `favorit`
--

INSERT INTO `favorit` (`id`, `nama`) VALUES
('3-BRG', 'rifan'),
('4-BRG', 'rifan'),
('6-BRG', 'duta');

-- --------------------------------------------------------

--
-- Table structure for table `pakaian`
--

CREATE TABLE `pakaian` (
  `id` varchar(255) NOT NULL,
  `jenis` varchar(255) NOT NULL,
  `model` varchar(255) NOT NULL,
  `desain` varchar(255) NOT NULL,
  `bahan` varchar(255) NOT NULL,
  `warna` varchar(255) NOT NULL,
  `ukuran` varchar(255) NOT NULL,
  `harga` varchar(255) NOT NULL,
  `status` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `pakaian`
--

INSERT INTO `pakaian` (`id`, `jenis`, `model`, `desain`, `bahan`, `warna`, `ukuran`, `harga`, `status`) VALUES
('1-BRG', 'Baju', 'lengan pendek', 'kristal', 'katun', 'hitam', 'XS', '700000', 'duta'),
('10-BRG', 'Jaket', 'hoodie', 'corak daun', 'wol', 'hijau', 'M', '700000', 'rifan'),
('2-BRG', 'Baju', 'lengan pendek', 'polos', 'katum', 'hitam', 'XS', '650000', 'duta'),
('3-BRG', 'Baju', 'lengan pendek', 'polos', 'katun', 'hijau muda', 'XS', '650000', ''),
('4-BRG', 'Baju', 'lengan pendek', 'polos', 'katun', 'abu-abu', 'XS', '650000', ''),
('5-BRG', 'Celana', 'panjang', 'polos', 'jeans', 'hitam', 'L', '800000', 'rifan'),
('6-BRG', 'Celana', 'pendek', 'polos', 'jeans', 'hitam', 'L', '500000', ''),
('7-BRG', 'Celana', 'bikers', 'polos', 'jeans', 'abu-abu', 'L', '900000', ''),
('8-BRG', 'Jaket', 'zipper', 'bunga mawar', 'wol', 'hitam', 'XL', '850000', '');

-- --------------------------------------------------------

--
-- Table structure for table `pegawai`
--

CREATE TABLE `pegawai` (
  `nama` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `pegawai`
--

INSERT INTO `pegawai` (`nama`, `password`) VALUES
('admin', 'admin');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `customer`
--
ALTER TABLE `customer`
  ADD PRIMARY KEY (`nama`);

--
-- Indexes for table `pakaian`
--
ALTER TABLE `pakaian`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `pegawai`
--
ALTER TABLE `pegawai`
  ADD PRIMARY KEY (`nama`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
