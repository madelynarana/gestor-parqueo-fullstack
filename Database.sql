create database parqueo;

CREATE TABLE parqueo (
    id INT AUTO_INCREMENT PRIMARY KEY,
    hora_ingreso DATETIME NOT NULL,
    hora_salida DATETIME,
    tipo char(1),
    costo float
);


SELECT * FROM parqueo
