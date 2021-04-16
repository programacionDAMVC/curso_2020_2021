PRAGMA foreign_keys = ON;

DROP TABLE IF EXISTS categoria;
CREATE TABLE alumno (
        id INTEGER PRIMARY KEY AUTOINCREMENT,
        nombre TEXT
);

DROP TABLE IF EXISTS libro;
CREATE TABLE modulo (
        id INTEGER PRIMARY KEY AUTOINCREMENT,
        nombre TEXT,
        autor TEXT,
        editorial TEXT
);

DROP TABLE IF EXISTS usuario;
CREATE TABLE curso (
        id INTEGER PRIMARY KEY AUTOINCREMENT,
        nombre TEXT,
        dni  TEXT UNIQUE
);

DROP TABLE IF EXISTS prestamo;
CREATE TABLE evaluacion (
        idLibro INTEGER,
        idUsuario INTEGER,
        fechaPrestamo TEXT,
        PRIMARY KEY(idLibro,idUsuario,fechaPrestamo),
        FOREIGN KEY(idAlumno) REFERENCES alumno(id) ON DELETE CASCADE,
        FOREIGN KEY(idModulo) REFERENCES modulo(id) ON DELETE CASCADE,
        FOREIGN KEY(idCurso) REFERENCES curso(id) ON DELETE CASCADE
);
