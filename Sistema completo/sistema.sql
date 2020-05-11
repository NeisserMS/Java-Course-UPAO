-- phpMyAdmin SQL Dump
-- version 4.7.9
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 10-05-2020 a las 02:50:03
-- Versión del servidor: 10.1.31-MariaDB
-- Versión de PHP: 7.2.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `sistema`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `computadoras`
--

CREATE TABLE `computadoras` (
  `conteo` int(11) NOT NULL,
  `codigo_maquina` varchar(253) NOT NULL,
  `usuario` varchar(253) NOT NULL,
  `direccion` varchar(253) NOT NULL,
  `ubicacion` varchar(253) NOT NULL,
  `departamento` varchar(253) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `computadoras`
--

INSERT INTO `computadoras` (`conteo`, `codigo_maquina`, `usuario`, `direccion`, `ubicacion`, `departamento`) VALUES
(3, '12', 'ij', 'bj', 'jb', 'jbjk'),
(1, '123', 'hoihoh', 'hoho', 'ho', 'hoho');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `impresoras`
--

CREATE TABLE `impresoras` (
  `conteo` int(11) NOT NULL,
  `codigo_impresora` varchar(253) NOT NULL,
  `nombre` varchar(253) NOT NULL,
  `existencia` varchar(253) NOT NULL,
  `ubicacion` varchar(253) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `impresoras`
--

INSERT INTO `impresoras` (`conteo`, `codigo_impresora`, `nombre`, `existencia`, `ubicacion`) VALUES
(2, '2', 'q', 'qq', 'qqq'),
(1, '3', 'ggg', 'gggg', 'ggggg');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `computadoras`
--
ALTER TABLE `computadoras`
  ADD PRIMARY KEY (`codigo_maquina`),
  ADD KEY `indice` (`conteo`);

--
-- Indices de la tabla `impresoras`
--
ALTER TABLE `impresoras`
  ADD PRIMARY KEY (`codigo_impresora`),
  ADD KEY `indice` (`conteo`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `computadoras`
--
ALTER TABLE `computadoras`
  MODIFY `conteo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de la tabla `impresoras`
--
ALTER TABLE `impresoras`
  MODIFY `conteo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
