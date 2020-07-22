-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: 30-Nov-2018 às 14:08
-- Versão do servidor: 10.1.13-MariaDB
-- PHP Version: 5.6.20

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `pharmacia`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `categoria`
--

CREATE TABLE `categoria` (
  `id` int(11) NOT NULL,
  `nome` varchar(200) COLLATE utf8_croatian_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_croatian_ci;

--
-- Extraindo dados da tabela `categoria`
--


-- --------------------------------------------------------

--
-- Estrutura da tabela `cliente`
--

CREATE TABLE `cliente` (
  `id` int(11) NOT NULL,
  `nome` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL,
  `telefone` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL,
  `sexo` varchar(14) COLLATE utf8mb4_unicode_ci NOT NULL,
  `troco` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Extraindo dados da tabela `cliente`
--

INSERT INTO `cliente` (`id`, `nome`, `telefone`, `sexo`, `troco`) VALUES
(1, 'Desconhecido', '5764538885', 'FEMININO', '0');

-- --------------------------------------------------------

--
-- Estrutura da tabela `entradas`
--

CREATE TABLE `entradas` (
  `id` int(11) NOT NULL,
  `producto_id` int(11) NOT NULL,
  `stock` int(11) NOT NULL,
  `qtd` int(11) NOT NULL,
  `data` date NOT NULL,
  `caducidade` date NOT NULL,
  `funcionario_id` int(11) NOT NULL,
  `fornecedor_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Extraindo dados da tabela `entradas`
--



-- --------------------------------------------------------

--
-- Estrutura da tabela `fornecedor`
--

CREATE TABLE `fornecedor` (
  `id` int(11) NOT NULL,
  `nome` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL,
  `telefone` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL,
  `morada` text COLLATE utf8mb4_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Extraindo dados da tabela `fornecedor`
--

INSERT INTO `fornecedor` (`id`, `nome`, `telefone`, `morada`) VALUES
(1, 'Desconhecido', '576453666', 'FEMININO');

-- --------------------------------------------------------

--
-- Estrutura da tabela `funcionario`
--

CREATE TABLE `funcionario` (
  `id` int(11) NOT NULL,
  `nome` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL,
  `telefone` varchar(30) COLLATE utf8mb4_unicode_ci NOT NULL,
  `bi` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL,
  `senha` varchar(30) COLLATE utf8mb4_unicode_ci NOT NULL,
  `morada` text COLLATE utf8mb4_unicode_ci,
  `cargo` varchar(40) COLLATE utf8mb4_unicode_ci NOT NULL,
  `sexo` varchar(11) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `estado` varchar(14) COLLATE utf8mb4_unicode_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Extraindo dados da tabela `funcionario`
--

INSERT INTO `funcionario` (`id`, `nome`, `telefone`, `bi`, `senha`, `morada`, `cargo`, `sexo`, `estado`) VALUES
(1, 'HORACIO SAMUTACA', '936838113', '002731823BA037', 'horacio', 'KALOHOMBO', 'GERENTE', 'MASCULINO', 'ACTIVO')
;

-- --------------------------------------------------------

--
-- Estrutura da tabela `movimentosaida`
--
/*
CREATE TABLE `movimentosaida` (
  `id` int(11) NOT NULL,
  `estado` int(11) DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
*/
--
-- Extraindo dados da tabela `movimentosaida`
--



-- --------------------------------------------------------

--
-- Estrutura da tabela `produto`
--

CREATE TABLE `produto` (
  `id` int(11) NOT NULL,
  `nome` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL,
  `preco` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL,
  `tipo_medicamento` varchar(30) COLLATE utf8mb4_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Extraindo dados da tabela `produto`
--



-- --------------------------------------------------------

--
-- Estrutura da tabela `saidas`
--

CREATE TABLE `saidas` (
  `id` int(11) NOT NULL,
  `producto_id` int(11) NOT NULL,
  `qtdade` int(11) NOT NULL,
  `total` int(11) NOT NULL,
  `data` date NOT NULL,
  `funcionario_id` int(11) NOT NULL,
  `cliente_id` int(11) DEFAULT NULL,
  `idmovimento` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Extraindo dados da tabela `saidas`
--


--
-- Indexes for dumped tables
--

--
-- Indexes for table `categoria`
--
ALTER TABLE `categoria`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `entradas`
--
ALTER TABLE `entradas`
  ADD PRIMARY KEY (`id`),
  ADD KEY `fornecedor_id` (`fornecedor_id`),
  ADD KEY `producto_id` (`producto_id`);

--
-- Indexes for table `fornecedor`
--
ALTER TABLE `fornecedor`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `funcionario`
--
ALTER TABLE `funcionario`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `movimentosaida`
--
ALTER TABLE `movimentosaida`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `produto`
--
ALTER TABLE `produto`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `saidas`
--
ALTER TABLE `saidas`
  ADD PRIMARY KEY (`id`),
  ADD KEY `funcionario_id` (`funcionario_id`),
  ADD KEY `producto_i` (`producto_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `categoria`
--
ALTER TABLE `categoria`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `cliente`
--
ALTER TABLE `cliente`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `entradas`
--
ALTER TABLE `entradas`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `fornecedor`
--
ALTER TABLE `fornecedor`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `funcionario`
--
ALTER TABLE `funcionario`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `movimentosaida`
--
ALTER TABLE `movimentosaida`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `produto`
--
ALTER TABLE `produto`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `saidas`
--
ALTER TABLE `saidas`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
--
-- Constraints for dumped tables
--

--
-- Limitadores para a tabela `entradas`
--
ALTER TABLE `entradas`
  ADD CONSTRAINT `fornecedor_id` FOREIGN KEY (`fornecedor_id`) REFERENCES `fornecedor` (`id`),
  ADD CONSTRAINT `producto_id` FOREIGN KEY (`producto_id`) REFERENCES `produto` (`id`);

--
-- Limitadores para a tabela `saidas`
--
ALTER TABLE `saidas`
  ADD CONSTRAINT `producto_i` FOREIGN KEY (`producto_id`) REFERENCES `produto` (`id`),
  ADD CONSTRAINT `saidas_ibfk_1` FOREIGN KEY (`funcionario_id`) REFERENCES `funcionario` (`id`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
