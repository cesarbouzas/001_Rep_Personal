SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

CREATE DATABASE IF NOT EXISTS `agenda` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE `agenda`;

DROP TABLE IF EXISTS `contactos`;
CREATE TABLE IF NOT EXISTS `contactos` (
  `ID` int(11) NOT NULL,
  `Nombre` text NOT NULL,
  `Ciudad` text NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

INSERT INTO `contactos` (`ID`, `Nombre`, `Ciudad`) VALUES
(1, 'PABLO', 'ALMERIA'),
(2, 'MARIO', 'GRANADA'),
(3, 'LUCIA', 'MADRID');

DROP TABLE IF EXISTS `correos`;
CREATE TABLE IF NOT EXISTS `correos` (
  `CORREO_ID` int(11) NOT NULL,
  `ID_CONTACTO` int(11) NOT NULL,
  `CORREO` varchar(100) NOT NULL,
  PRIMARY KEY (`CORREO_ID`),
  KEY `ID_CONTACTO` (`ID_CONTACTO`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

INSERT INTO `correos` (`CORREO_ID`, `ID_CONTACTO`, `CORREO`) VALUES
(1, 1, 'pablo@yahoo.com'),
(2, 1, 'pablo@gmail.com'),
(3, 2, 'mario@yahoo.com'),
(4, 2, 'mario@empresa.com'),
(5, 2, 'mario@jaspersoft.com'),
(6, 3, 'lmc@dominio.es'),
(7, 3, 'lucy@algunemail.com'),
(8, 3, 'luciamartos@organizacion.org');

DROP TABLE IF EXISTS `telefonos`;
CREATE TABLE IF NOT EXISTS `telefonos` (
  `TELEFONO_ID` int(11) NOT NULL,
  `ID_CONTACTO` int(11) NOT NULL,
  `TELEFONO` varchar(10) NOT NULL,
  PRIMARY KEY (`TELEFONO_ID`),
  KEY `ID_CONTACTO` (`ID_CONTACTO`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

INSERT INTO `telefonos` (`TELEFONO_ID`, `ID_CONTACTO`, `TELEFONO`) VALUES
(1, 1, '111111111'),
(2, 1, '222222222'),
(3, 1, '333333333'),
(4, 2, '444444444'),
(5, 3, '555555555'),
(6, 3, '666666666');


ALTER TABLE `correos`
  ADD CONSTRAINT `correos_ibfk_1` FOREIGN KEY (`ID_CONTACTO`) REFERENCES `contactos` (`ID`);

ALTER TABLE `telefonos`
  ADD CONSTRAINT `telefonos_ibfk_1` FOREIGN KEY (`ID_CONTACTO`) REFERENCES `contactos` (`ID`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
