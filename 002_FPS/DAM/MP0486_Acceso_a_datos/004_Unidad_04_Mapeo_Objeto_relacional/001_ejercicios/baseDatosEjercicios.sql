drop database if exists ejemplo;
create schema ejemplo;

Use ejemplo;

create table departamentos (
  dept_no tinyint(2)not null primary key,
  dnombre varchar(15),
  loc varchar(15)
);

create table empleados (
  emp_no smallint(4) unsigned not null primary key,
  apellido varchar(10),
  oficio varchar(10),
  dir smallint,
  fecha_alt date,
  salario float(6,2),
  comision float(6,2),
  dept_no tinyint(2)not null references departamentos(dept_no)
);


ALTER TABLE `ejemplo`.`empleados` 

  ADD CONSTRAINT `fk_dept_no`

  FOREIGN KEY (`dept_no` )

  REFERENCES `ejemplo`.`departamentos` (`dept_no` )

  ON DELETE NO ACTION

  ON UPDATE NO ACTION

, ADD INDEX `fk_dept_no` (`dept_no` ASC) ;

insert into departamentos values 
(10,'Contabilidad','A Coruña'),
(20,'I+D','Santiago'),
(30,'Ventas','Ferrol'),
(40,'Produccion','As pontes');


insert into empleados values 
(7396,'Garcia','Adminis.',7902,'2014-02-01',800,null,20),
(7499,'Velazquez','Vendedor',7698,'2012-02-20',1600,300.00,30),
(7521,'Martinez','Vendedor',7698,'2015-02-22',1250,500.00,30),
(7566,'Nuñez','Director',7839,'2011-03-02',2975,null,20),
(7654,'Martin','Vendedor',7698,'2011-09-28',1250,1400,30),
(7698,'Fernandez','Director',7839,'2012-04-11',2850,null,30),
(7782,'Serantes','Director',7839,'2014-09-06',2450,null,10),
(7788,'Brion','Analista',7566,'2015-01-05',3000,null,20),
(7839,'Maroto','Presidente',null,'2011-09-28',5000,null,10),
(7844,'Diaz','Vendedor',7698,'2012-10-11',1500,0.00,30),
(7876,'Caballero','Adminis.',7788,'2013-09-16',1100,null,20),
(7900,'Vazquez','Adminis.',7698,'2014-09-22',950,null,30),
(7902,'Meizoso','Analista',7566,'2012-09-27',3000,null,20),
(7934,'Teira','Adminis.',7782,'2013-09-18',1300,null,10);



-- --------------------------------------------------------------------------------
-- Routine DDL
-- --------------------------------------------------------------------------------
DELIMITER $$

CREATE PROCEDURE `ejemplo`.`cuenta` (OUT salida int,IN  valor int)
BEGIN
 select count(*)  into salida from empleados where dept_no=valor;
END$$

-- --------------------------------------------------------------------------------
-- Routine DDL
-- --------------------------------------------------------------------------------
DELIMITER $$

CREATE PROCEDURE `ejemplo`.`subida` (IN ofi varchar(10),IN  porcentaje float)
BEGIN
update empleados set salario=salario*porcentaje where oficio=ofi; 
END$$


