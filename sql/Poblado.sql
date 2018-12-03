/*INSERT*/

/*Tag*/
insert into Tag (Tag)
	values ('Infraestructura');	
insert into Tag (Tag)
	values ('Cursos');	
insert into Tag (Tag)
	values ('Profesores');	
insert into Tag (Tag)
	values ('Movilidad');	
insert into Tag (Tag)
	values ('Inclusión');	
insert into Tag (Tag)
	values ('Ocio/Recreacion');	
insert into Tag (Tag)
	values ('Becas');	
insert into Tag (Tag)
	values ('Intercambios');	
insert into Tag (Tag)
	values ('Apoyo Financiero');
insert into Tag (Tag)
	values ('Deporte');
insert into Tag (Tag)
	values ('Cultura');
insert into Tag (Tag)
	values ('Administración');
insert into Tag (Tag)
	values ('Educativo');
insert into Tag (Tag)
	values ('Tecnología');

/*Usuarios*/
/*Admin*/
insert into Users (Name, Email, Password, Area, Role) 
	values ('Administrator','admin@escuelaing.edu.co','admin','Administrativo','Administrador');
/*Others*/
insert into Users (Name, Email, Password, Area, Role) 
	values ('Nicolas Cardenas','nicolas.cardenas@escuelaing.edu.co','password','Estudiante','Usuarios de consulta');
insert into Users (Name, Email, Password, Area, Role) 
	values ('Jimmy Moya','jimmy.moya@escuelaing.edu.co','password','Estudiante','Usuarios de consulta');
insert into Users (Name, Email, Password, Area, Role)
	values ('Juan Mora','juan.mora@escuelaing.edu.co','password','Estudiante','Usuarios de consulta');
insert into Users (Name, Email, Password, Area, Role) 
	values ('Pedro Mayorga','pedro.mayorga@escuelaing.edu.co','password','Estudiante','Proponente de iniciativa o idea de proyecto'); 
insert into Users (Name, Email, Password, Area, Role) 
	values ('Fabian Heredia','fabian.heredia@escuelaing.edu.co','password','Estudiante','Usuarios de consulta');
insert into Users (Name, Email, Password, Area, Role)  
	values ('Luisa Callejon','luisa.callejon@escuelaing.edu.co','password','Estudiante','Proponente de iniciativa o idea de proyecto');
insert into Users (Name, Email, Password, Area, Role) 
	values ('Laura Bustos','laura.bustos@escuelaing.edu.co','password','Estudiante','Proponente de iniciativa o idea de proyecto');
insert into Users (Name, Email, Password, Area, Role) 
	values ('Diego Plata','diego.plata@escuelaing.edu.co','password','Estudiante','Proponente de iniciativa o idea de proyecto');
insert into Users (Name, Email, Password, Area, Role)  
	values ('Sebastian Delgado','sebastian.delgado@escuelaing.edu.co','password','Estudiante','Usuarios de consulta');
insert into Users (Name, Email, Password, Area, Role)  
	values ('Diana Torres','diana.torres@escuelaing.edu.co','password','Estudiante','Usuarios de consulta');
insert into Users (Name, Email, Password, Area, Role) 
	values ('Suly Jaimes','suly.jaimes@escuelaing.edu.co','password','Estudiante','Proponente de iniciativa o idea de proyecto'); 
insert into Users (Name, Email, Password, Area, Role) 
	values ('Dario Arango','dario.arango@escuelaing.edu.co','password','Administrativo','Proponente de iniciativa o idea de proyecto');
	
/*Initiative*/
insert into Initiative (Title, Description, Status, CreationDate, Field, KeyWords, Users_ID, Tag_ID)
	values ('Cambio de ingreso bicicletas', 'Seria bueno que quienes usamos cicla, podamos entrar por la entrada peatonal sin tener que dar la vuelta hasta la entrada vehicular y devolverse', 'En espera de revisión', TO_DATE('17/10/2018', 'DD/MM/YYYY'), 'Movilidad', '{"entrada peatonal","cicla","entrada"}', 3, 4);
insert into Initiative (Title, Description, Status, CreationDate, Field, KeyWords, Users_ID, Tag_ID)
	values ('Construir nuevo bloque de salones', 'Se necesita construir un nuevo bloque con salones, para la ampliacion de espacios de clase', 'Proyecto', TO_DATE('02/09/2018', 'DD/MM/YYYY'), 'Infraestructura', '{"salones","construir","ampliacion"}', 6, 1);
insert into Initiative (Title, Description, Status, CreationDate, Field, KeyWords, Users_ID, Tag_ID)
	values ('Crear nuevas salas de computo', 'Es necesario crear nuevas salas con computadores, ya que se evidencia que casi nunca hay un computador libre para hacer trabajos', 'En revisión', TO_DATE('04/11/2018', 'DD/MM/YYYY'), 'Tecnología', '{"salas","computadores"}', 7, 14);
insert into Initiative (Title, Description, Status, CreationDate, Field, KeyWords, Users_ID, Tag_ID)
	values ('Crear clase de pilates', 'Necesitamos cursos pilates en la escuela, para poder mantenernos en forma, no nos gusta el gimnasio', 'Solucionado', TO_DATE('20/02/2018', 'DD/MM/YYYY'), 'Cursos', '{"cursos","pilates"}', 8, 2);
insert into Initiative (Title, Description, Status, CreationDate, Field, KeyWords, Users_ID, Tag_ID)
	values ('Mejorar la velocidad del internet', 'Queremos que la velocidad del internet de la escuela sea mayor, es muy lento y no sirve para hacer trabajos ni para descargar nada', 'Solucionado', TO_DATE('15/09/2018', 'DD/MM/YYYY'), 'Tecnología', '{"internet","velocidad"}', 5, 2);
insert into Initiative (Title, Description, Status, CreationDate, Field, KeyWords, Users_ID, Tag_ID)
	values ('Mejora de Salon', 'Hay un salon en el bloque G, que en las mañanas siempre le entra todo el sol del día y enceguece a la hora de poner atención a clase, afecta la visibilidad y no se puede ver nada de lo que esta escrito en el tablero', 'En espera de revisión', TO_DATE('05/11/2018', 'DD/MM/YYYY'), 'Infraestructura', '{"salon","sol","visibilidad"}', 9, 1);
insert into Initiative (Title, Description, Status, CreationDate, Field, KeyWords, Users_ID, Tag_ID)
	values ('Construir Piscina', 'Sería genial tener una piscina para los estudiantes y que así pueda haber un equipo de natación en la escuela, así mismo para poder desestresarse de la carga de trabajos', 'En revisión', TO_DATE('31/10/2018', 'DD/MM/YYYY'), 'Deporte', '{"piscina","equipo natacion","natacion"}', 5, 10);

/*Comentario*/
insert into Comment (Description, CreationDate, Users_ID, InitiativeID)
	values('Buena idea compañero!, es un largo recorrido para nosotros los ciclistas', TO_DATE('22/11/2018', 'DD/MM/YYYY'), 11, 1);
insert into Comment (Description, CreationDate, Users_ID, InitiativeID)
	values('Genial! Ahorramos más tiempo', TO_DATE('25/11/2018', 'DD/MM/YYYY'), 12, 1);
insert into Comment (Description, CreationDate, Users_ID, InitiativeID)
	values('Por fin un internet decente', TO_DATE('28/11/2018', 'DD/MM/YYYY'), 10, 5);
insert into Comment (Description, CreationDate, Users_ID, InitiativeID)
	values('Esto si merece la pena, siempre están llenas esas salas', TO_DATE('29/11/2018', 'DD/MM/YYYY'), 3, 3);

/*Vote*/
insert into Vote (Vote, Users_ID, Initiative_ID)
	values(true, 11, 7);
insert into Vote (Vote, Users_ID, Initiative_ID)
	values(false, 11, 5);
insert into Vote (Vote, Users_ID, Initiative_ID)
	values(true, 2, 1);
insert into Vote (Vote, Users_ID, Initiative_ID)
	values(true, 4, 1);
insert into Vote (Vote, Users_ID, Initiative_ID)
	values(false, 6, 1);
insert into Vote (Vote, Users_ID, Initiative_ID)
	values(true, 7, 1);
insert into Vote (Vote, Users_ID, Initiative_ID)
	values(false, 6, 5);
insert into Vote (Vote, Users_ID, Initiative_ID)
	values(true, 5, 6);
insert into Vote (Vote, Users_ID, Initiative_ID)
	values(false, 5, 4);
insert into Vote (Vote, Users_ID, Initiative_ID)
	values(true, 8, 2);