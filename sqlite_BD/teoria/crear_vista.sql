DROP VIEW IF EXISTS bd_2A;
CREATE VIEW bd_2A AS select alumno.nombre, alumno.apellidos, evaluacion.notas from alumno, curso, modulo, evaluacion where alumno.id=evaluacion.idAlumno and curso.id=evaluacion.idCurso and modulo.id=evaluacion.idModulo and modulo.nombre="Base de datos" and curso.nombre='Segundo A';
