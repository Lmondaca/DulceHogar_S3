CREATE DATABASE dulcehogar;

USE dulcehogar;

CREATE TABLE socio (
    nombre VARCHAR(15) NOT NULL,
    apellidopaterno VARCHAR(15) NOT NULL,
    apellidomaterno VARCHAR(15),
    rut VARCHAR(12) NOT NULL,
    correo VARCHAR(30),
    telefono NUMERIC(9),
    domicilio VARCHAR(30),
    comuna VARCHAR(20),
    numerocuenta NUMERIC(9) PRIMARY KEY
);

CREATE TABLE cuenta_socio (
    numerocuenta NUMERIC(9) PRIMARY KEY,
    valorcuota NUMERIC(10) DEFAULT 58000,
    cantaportada NUMERIC(10) DEFAULT 0,
    numcuota NUMERIC(2) DEFAULT 12,
    CONSTRAINT fk_numerocuenta FOREIGN KEY (numerocuenta) REFERENCES socio(numerocuenta)
);
CREATE TABLE usuario (
    rut VARCHAR(12) PRIMARY KEY,
    contrasenna VARCHAR(30),
    nombre VARCHAR(15) NOT NULL,
    apellidopaterno VARCHAR(15) NOT NULL,
    apellidomaterno VARCHAR(15)
);

insert into usuario values ('12.123.123-1','hola123', 'Lucas', 'Mondaca', 'Huerta');
select * from usuario;
SELECT * FROM SOCIO NATURAL JOIN CUENTA_SOCIO;