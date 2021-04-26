--preparamos la BD con integridad referencial
PRAGMA foreign_keys = ON; 

--creamos las tablas
DROP TABLE IF EXISTS categoria; 
CREATE TABLE categoria ( 
        id INTEGER PRIMARY KEY AUTOINCREMENT, 
        nombre TEXT 
); 

DROP TABLE IF EXISTS libro; 
CREATE TABLE libro ( 
        id INTEGER PRIMARY KEY AUTOINCREMENT, 
        nombre TEXT, 
        autor TEXT,
        editorial TEXT,
        idCategoria INTEGER ,
        FOREIGN KEY(idCategoria) REFERENCES categoria(id) ON DELETE CASCADE
); 

DROP TABLE IF EXISTS usuario; 
CREATE TABLE usuario ( 
        id INTEGER PRIMARY KEY AUTOINCREMENT, 
        nombre TEXT, 
        apellidos  TEXT
); 

DROP TABLE IF EXISTS prestamo; 
CREATE TABLE prestamo ( 
        idLibro INTEGER, 
        idUsuario INTEGER, 
        fechaPrestamo TEXT, 
        PRIMARY KEY(idLibro,idUsuario,fechaPrestamo), 
        FOREIGN KEY(idLibro) REFERENCES libro(id) ON DELETE CASCADE, 
        FOREIGN KEY(idUsuario) REFERENCES usuario(id) ON DELETE CASCADE
   );

--insertamos datos
INSERT INTO categoria (nombre) VALUES ('Base de datos');
INSERT INTO categoria (nombre) VALUES ('Programación');
INSERT INTO categoria (nombre) VALUES ('Redes');
INSERT INTO categoria (nombre) VALUES ('Ofimática');
INSERT INTO categoria (nombre) VALUES ('Hardware');
INSERT INTO categoria (nombre) VALUES ('Seguridad');
INSERT INTO categoria (nombre) VALUES ('Aplicaciones Web');
INSERT INTO categoria (nombre) VALUES ('Sistemas Operativos');
INSERT INTO categoria (nombre) VALUES ('Miscelánea');


INSERT INTO libro (nombre, autor, editorial, idCategoria) VALUES ('Fundamentos BD','Morcillo','Everest',1);
INSERT INTO libro (nombre, autor, editorial, idCategoria) VALUES ('Teoría de BD','Steinher','Anaya',1);
INSERT INTO libro (nombre, autor, editorial, idCategoria) VALUES ('Java','Mainer','Prince',2);
INSERT INTO libro (nombre, autor, editorial, idCategoria) VALUES ('C','Kernhigan','OReylly',2);
INSERT INTO libro (nombre, autor, editorial, idCategoria) VALUES ('TCP/IP','Varios','Everest',3);
INSERT INTO libro (nombre, autor, editorial, idCategoria) VALUES ('Fundamento de Redes','Joahn','Austral',3);
INSERT INTO libro (nombre, autor, editorial, idCategoria) VALUES ('Office 2003','Gates','Anaya',4);
INSERT INTO libro (nombre, autor, editorial, idCategoria) VALUES ('LibreOffice','Varios','SM',4);
INSERT INTO libro (nombre, autor, editorial, idCategoria) VALUES ('Hardware en dispositivos móviles','Fund','SM',5);
INSERT INTO libro (nombre, autor, editorial, idCategoria) VALUES ('Fundamentes de Hardware','Steinh','Anaya',5);
INSERT INTO libro (nombre, autor, editorial, idCategoria) VALUES ('Seguridad wifi','Varios','Everes',6);
INSERT INTO libro (nombre, autor, editorial, idCategoria) VALUES ('Seguridad en dispositivos móviles','Deinh','Austral',6);
INSERT INTO libro (nombre, autor, editorial, idCategoria) VALUES ('Diseño de portales','Molina','SM',7);
INSERT INTO libro (nombre, autor, editorial, idCategoria) VALUES ('HTML5','Candido','Austral',7);
INSERT INTO libro (nombre, autor, editorial, idCategoria) VALUES ('Fundamentos de Android','Cabrera','SM',8);
INSERT INTO libro (nombre, autor, editorial, idCategoria) VALUES ('IOs','Varios','SM',8);
INSERT INTO libro (nombre, autor, editorial, idCategoria) VALUES ('Fundamentos de S0','Medina','SM',9);
INSERT INTO libro (nombre, autor, editorial, idCategoria) VALUES ('GNU/Linux','Varios','SM',9);

INSERT INTO usuario(nombre, apellidos) VALUES ('juan gabriel', '11111111');
INSERT INTO usuario(nombre, apellidos) VALUES ('pedro ramónl', '22222222');
INSERT INTO usuario(nombre, apellidos) VALUES ('luis felipe', '33333333');
INSERT INTO usuario(nombre, apellidos) VALUES ('remedios amayal', '44444444');
INSERT INTO usuario(nombre, apellidos) VALUES ('patricia conde', '55555555');
INSERT INTO usuario(nombre, apellidos) VALUES ('enrique luis', '66666666');

INSERT INTO prestamo(idLibro,idUsuario,fechaPrestamo) VALUES (1,1,date('now'));
INSERT INTO prestamo(idLibro,idUsuario,fechaPrestamo) VALUES (1,2,date('now'));
INSERT INTO prestamo(idLibro,idUsuario,fechaPrestamo) VALUES (2,1,date('now'));
INSERT INTO prestamo(idLibro,idUsuario,fechaPrestamo) VALUES (3,1,date('now'));
INSERT INTO prestamo(idLibro,idUsuario,fechaPrestamo) VALUES (4,1,date('now'));
INSERT INTO prestamo(idLibro,idUsuario,fechaPrestamo) VALUES (5,5,date('now'));
INSERT INTO prestamo(idLibro,idUsuario,fechaPrestamo) VALUES (6,1,date('now'));
INSERT INTO prestamo(idLibro,idUsuario,fechaPrestamo) VALUES (4,4,date('now'));
INSERT INTO prestamo(idLibro,idUsuario,fechaPrestamo) VALUES (3,3,date('now'));
INSERT INTO prestamo(idLibro,idUsuario,fechaPrestamo) VALUES (2,6,date('now'));
INSERT INTO prestamo(idLibro,idUsuario,fechaPrestamo) VALUES (3,6,date('now'));
INSERT INTO prestamo(idLibro,idUsuario,fechaPrestamo) VALUES (6,6,date('now'));

--creamos vistas
--numero de libros prestados
DROP VIEW IF EXISTS nLibrosPrestados;
CREATE VIEW nLibrosPrestados AS  SELECT COUNT (DISTINCT nombre) FROM libro WHERE id IN (SELECT idLibro FROM prestamo);
--todos los libros prestados
DROP VIEW IF EXISTS librosPrestados;
CREATE VIEW librosPrestados AS SELECT nombre, autor, editorial FROM libro WHERE id IN (SELECT idLibro FROM prestamo);
--libros por categorias
DROP VIEW IF EXISTS librosCategorias;
CREATE VIEW librosCategorias AS SELECT libro.nombre as nombre_libro, libro.autor, libro.editorial, categoria.nombre as nombre_categoria FROM libro, categoria WHERE libro.idCategoria=categoria.id;
--libros prestados por categorías
DROP VIEW IF EXISTS librosCategoriasPrestados;
CREATE VIEW librosCategoriasPrestados AS SELECT DISTINCT libro.nombre as nombre_libro, libro.autor, libro.editorial, categoria.nombre as categoria_nombre FROM libro, categoria, prestamo WHERE libro.idCategoria=categoria.id AND libro.id = prestamo.idLibro; 
--libros no prestados por categorías
DROP VIEW IF EXISTS librosNoPrestadosCategorias;
CREATE VIEW librosNoPrestadosCategorias AS SELECT libro.nombre as nombreLibro, autor, editorial, categoria.nombre as categoriaNombre FROM libro, categoria WHERE libro.id NOT IN (SELECT idLibro FROM prestamo) AND libro.idCategoria=categoria.id;
--libros prestados 
DROP VIEW IF EXISTS librosNoPrestados;
CREATE VIEW librosNoPrestados AS SELECT nombre, autor, editorial FROM libro WHERE id NOT IN (SELECT idLibro FROM prestamo);
--libros prestados a un usuario: 
DROP VIEW IF EXISTS librosPrestadosUsuario;
CREATE VIEW librosPrestadosUsuario AS SELECT libro.nombre as nombre_libro, autor, editorial, usuario.nombre as nombre_usuario FROM libro, usuario, prestamo WHERE libro.id=prestamo.idLibro AND usuario.id = prestamo.idUsuario;
--listado usuario: select * from usuario;

--creamos los triggers:
--borramos a un usuario
DROP TABLE IF EXISTS historial_usuario; 
CREATE TABLE historial_usuario(
id INTEGER PRIMARY KEY AUTOINCREMENT,
nombre TEXT,
apellidos TEXT,
fecha_baja TEXT
);
DROP TRIGGER IF EXISTS borrado_usuario;
CREATE TRIGGER borrado_usuario BEFORE DELETE
ON usuario
BEGIN
INSERT INTO historial_usuario (nombre, apellidos, fecha_baja)
VALUES (old.nombre, old.apellidos, datetime('now'));
END;

--borramos un libro
DROP TABLE IF EXISTS historial_libro; 
CREATE TABLE historial_libro(
id INTEGER PRIMARY KEY AUTOINCREMENT,
nombre TEXT,
autor TEXT,
editorial TEXT,
fecha_baja TEXT
);
DROP TRIGGER IF EXISTS borrado_libro;
CREATE TRIGGER borrado_libro BEFORE DELETE
ON libro
BEGIN
INSERT INTO historial_libro (nombre, autor, editorial, fecha_baja)
VALUES (old.nombre, old.autor, old.editorial, datetime('now'));
END;
