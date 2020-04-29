DROP database IF EXISTS panaderia_db;
create database IF NOT EXISTS panaderia_db;
create user 'Admin_Panaderia'@'%' identified by 'password';
grant all privileges on panaderia_db.* to 'Admin_Panaderia'@'%';
use panaderia_db;

create table IF NOT EXISTS `producto`(
	`id` int(4) NOT NULL,
	`nombre` VARCHAR(45) NOT NULL,
    `marca` VARCHAR(45) NOT NULL,
    `fechaDeVencimiento` VARCHAR(45) NOT NULL,
    `precio` DOUBLE NOT NULL,
    UNIQUE (id),
    PRIMARY KEY (`id`)
);

create table IF NOT EXISTS `venta`(
	`fechaDeVencimiento` VARCHAR(45) NOT NULL,
	`id` int(4) NOT NULL,
    `total` DOUBLE NOT NULL,
    UNIQUE (id),
    PRIMARY KEY (`id`)
);
