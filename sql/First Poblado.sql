-- INSERT

-- Tag
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

-- Users
-- Admin
insert into Users (Name, Email, Password, Area, Role) 
	values ('Administrator','admin@escuelaing.edu.co','admin','Administrativo','Administrador');
-- Others
insert into Users (Name, Email, Password, Area, Role) 
	values ('Pedro Mayorga','pedro.mayorga@escuelaing.edu.co','password','Estudiante','Personal PMO - ODI');
insert into Users (Name, Email, Password, Area, Role) 
	values ('Walter Blanco','walter.blanco@escuelaing.edu.co','password','Estudiante','Usuarios de consulta');
insert into Users (Name, Email, Password, Area, Role) 
	values ('Bruno Flores','bruno.flores@escuelaing.edu.co','password','Estudiante','Usuarios de consulta');
insert into Users (Name, Email, Password, Area, Role)
	values ('Kanye West','kanye.west@escuelaing.edu.co','password','Estudiante','Personal PMO - ODI'); 
insert into Users (Name, Email, Password, Area, Role) 
	values ('Fabian Heredia','fabian.heredia@escuelaing.edu.co','password','Estudiante','Usuarios de consulta');
insert into Users (Name, Email, Password, Area, Role)  
	values ('Luisa Callejon','luisa.callejon@escuelaing.edu.co','password','Estudiante','Proponente de iniciativa o idea de proyecto');
insert into Users (Name, Email, Password, Area, Role) 
	values ('Laura Bustos','laura.bustos@escuelaing.edu.co','password','Estudiante','Proponente de iniciativa o idea de proyecto');
insert into Users (Name, Email, Password, Area, Role) 
	values ('Diego Plata','diego.plata@escuelaing.edu.co','password','Estudiante','Personal PMO - ODI');
insert into Users (Name, Email, Password, Area, Role)  
	values ('Sebastian Delgado','sebastian.delgado@escuelaing.edu.co','password','Estudiante','Usuarios de consulta');
insert into Users (Name, Email, Password, Area, Role)  
	values ('Diana Torres','diana.torres@escuelaing.edu.co','password','Estudiante','Usuarios de consulta');
insert into Users (Name, Email, Password, Area, Role) 
	values ('Suly Jaimes','suly.jaimes@escuelaing.edu.co','password','Estudiante','Proponente de iniciativa o idea de proyecto'); 
insert into Users (Name, Email, Password, Area, Role) 
	values ('Dario Arango','dario.arango@escuelaing.edu.co','password','Administrativo','Personal PMO - ODI');
insert into Users (Name, Email, Password, Area, Role) 
	values ('Angelica Duran','angelica.duran@escuelaing.edu.co','password','Servicios generales','Usuarios de consulta');
insert into Users (Name, Email, Password, Area, Role) 
	values ('Alejandra Nivia','alejandra.nivia@escuelaing.edu.co','password','Seguridad','Personal PMO - ODI');
insert into Users (Name, Email, Password, Area, Role) 
	values ('Johan Avila','johan.avila@escuelaing.edu.co','password','Profesor','Proponente de iniciativa o idea de proyecto');
insert into Users (Name, Email, Password, Area, Role) 
	values ('Juan Pulido','juan.pulido@escuelaing.edu.co','password','Egresado','Proponente de iniciativa o idea de proyecto');
insert into Users (Name, Email, Password, Area, Role) 
	values ('Santiago Muñoz','santiago.muñoz@escuelaing.edu.co','password','Seguridad','Usuarios de consulta');
insert into Users (Name, Email, Password, Area, Role) 
	values ('Camila Cortez','camila.cortez@escuelaing.edu.co','password','Servicios generales','Proponente de iniciativa o idea de proyecto');
insert into Users (Name, Email, Password, Area, Role) 
	values ('Luis Naranjo','luis.naranjo@escuelaing.edu.co','password','Administrativo','Personal PMO - ODI');
insert into Users (Name, Email, Password, Area, Role) 
	values ('Andres Corredor','andres.corredor@escuelaing.edu.co','password','Profesor','Proponente de iniciativa o idea de proyecto');
insert into Users (Name, Email, Password, Area, Role) 
	values ('David Rojas','david.rojas@escuelaing.edu.co','password','Egresado','Usuarios de consulta');
insert into Users (Name, Email, Password, Area, Role) 
	values ('Paula Montoya','paula.montoya@escuelaing.edu.co','password','Profesor','Proponente de iniciativa o idea de proyecto');
insert into Users (Name, Email, Password, Area, Role) 
	values ('Tatiana Leon','tatiana.leon@escuelaing.edu.co','password','Seguridad','Usuarios de consulta');
insert into Users (Name, Email, Password, Area, Role) 
	values ('Fabio Garcia','fabio.garcia@escuelaing.edu.co','password','Administrativo','Personal PMO - ODI');
	
-- Initiative
insert into Initiative (Title, Description, Status, CreationDate, Field, KeyWords, Users_ID, Tag_ID)
	values ('Cambio de ingreso bicicletas', 'Seria bueno que quienes usamos cicla, podamos entrar por la entrada peatonal sin tener que dar la vuelta hasta la entrada vehicular y devolverse', 'En espera de revision', TO_DATE('17/10/2018', 'DD/MM/YYYY'), 'Movilidad', '{"entrada peatonal","cicla","entrada"}', 3, 4);
insert into Initiative (Title, Description, Status, CreationDate, Field, KeyWords, Users_ID, Tag_ID)
	values ('Construir nuevo bloque de salones', 'Se necesita construir un nuevo bloque con salones, para la ampliacion de espacios de clase', 'Proyecto', TO_DATE('02/09/2018', 'DD/MM/YYYY'), 'Infraestructura', '{"salones","construir","ampliacion"}', 6, 1);
insert into Initiative (Title, Description, Status, CreationDate, Field, KeyWords, Users_ID, Tag_ID)
	values ('Crear nuevas salas de computo', 'Es necesario crear nuevas salas con computadores, ya que se evidencia que casi nunca hay un computador libre para hacer trabajos', 'En revision', TO_DATE('04/11/2018', 'DD/MM/YYYY'), 'Tecnología', '{"salas","computadores"}', 7, 14);
insert into Initiative (Title, Description, Status, CreationDate, Field, KeyWords, Users_ID, Tag_ID)
	values ('Crear clase de pilates', 'Necesitamos cursos pilates en la escuela, para poder mantenernos en forma, no nos gusta el gimnasio', 'Solucionado', TO_DATE('20/02/2018', 'DD/MM/YYYY'), 'Cursos', '{"cursos","pilates"}', 8, 2);
insert into Initiative (Title, Description, Status, CreationDate, Field, KeyWords, Users_ID, Tag_ID)
	values ('Mejorar la velocidad del internet', 'Queremos que la velocidad del internet de la escuela sea mayor, es muy lento y no sirve para hacer trabajos ni para descargar nada', 'Solucionado', TO_DATE('15/09/2018', 'DD/MM/YYYY'), 'Tecnología', '{"internet","velocidad"}', 5, 2);
insert into Initiative (Title, Description, Status, CreationDate, Field, KeyWords, Users_ID, Tag_ID)
	values ('Mejora de Salon', 'Hay un salon en el bloque G, que en las mañanas siempre le entra todo el sol del día y enceguece a la hora de poner atención a clase, afecta la visibilidad y no se puede ver nada de lo que esta escrito en el tablero', 'En espera de revision', TO_DATE('05/11/2018', 'DD/MM/YYYY'), 'Infraestructura', '{"salon","sol","visibilidad"}', 9, 1);
insert into Initiative (Title, Description, Status, CreationDate, Field, KeyWords, Users_ID, Tag_ID)
	values ('Construir Piscina', 'Sería genial tener una piscina para los estudiantes y que así pueda haber un equipo de natación en la escuela, así mismo para poder desestresarse de la carga de trabajos', 'En revision', TO_DATE('31/05/2018', 'DD/MM/YYYY'), 'Deporte', '{"piscina","equipo natacion","natacion"}', 5, 10);
insert into Initiative (Title, Description, Status, CreationDate, Field, KeyWords, Users_ID, Tag_ID)
	values ('Chips de identificación', 'Recomendamos la instalación de chips en los materiales de la universidad para asi tener el mejor control y proteccion de los elementos valiosos de la universidad', 'En espera de revision', TO_DATE('17/09/2018', 'DD/MM/YYYY'), 'Movilidad', '{"chips","control","protección"}', 15, 4);
insert into Initiative (Title, Description, Status, CreationDate, Field, KeyWords, Users_ID, Tag_ID)
	values ('Mejora en oficinas', 'Es recomendable la ampliación de oficinas de administrativo que requieren mayor demanda, debido a la necesidad de reunion de mas de 10 estudiantes al mismo tiempo y no poseer el espacio necesario', 'Proyecto', TO_DATE('24/08/2018', 'DD/MM/YYYY'), 'Administración', '{"ampliación","oficina","demanda"}', 20, 12);
insert into Initiative (Title, Description, Status, CreationDate, Field, KeyWords, Users_ID, Tag_ID)
	values ('Lockers en laboratorios', 'Necesitamos locker para guardar nuestros elementos personales de valor en los laboratorios, por que uno se ocupa y se descuida.', 'Solucionado', TO_DATE('13/09/2018', 'DD/MM/YYYY'), 'Infraestructura', '{"lockers","guardar","personal"}', 9, 1);
insert into Initiative (Title, Description, Status, CreationDate, Field, KeyWords, Users_ID, Tag_ID)
	values ('Mobiliario en zonas verdes', 'Quisieramos que destinen una zona verde con mobiliario de descanso innovador para cualquier clase de usuario de la univerdidad', 'En espera de revision', TO_DATE('04/11/2018', 'DD/MM/YYYY'), 'Ocio/Recreación', '{"verde","mobiliario","descanso"}', 19, 6);
insert into Initiative (Title, Description, Status, CreationDate, Field, KeyWords, Users_ID, Tag_ID)
	values ('Reconstruir puente peatonal', 'Me siento realmente insegura con el paso del puente peatonal en la entrada de la universidad ya que su aspecto es preocupante y peligroso para todos, en cualquier momento se puede caer', 'Solucionado', TO_DATE('09/09/2018', 'DD/MM/YYYY'), 'Infraestructura', '{"insegura","puente","peligroso"}',23, 1);
insert into Initiative (Title, Description, Status, CreationDate, Field, KeyWords, Users_ID, Tag_ID)
	values ('Zonas de entretenimiento', 'Me encantaria disfrutas de espacios para ver peliculas, o divertirme con un juego de mesa para cambiar la rutina en la universidad', 'En revision', TO_DATE('31/05/2018', 'DD/MM/YYYY'), 'Ocio/Recreación', '{"peliculas","divertirme"}', 5, 6);
insert into Initiative (Title, Description, Status, CreationDate, Field, KeyWords, Users_ID, Tag_ID)
	values ('Construcción auditorio', 'Es realmente util y necesario tener un espacio donde ademas de grandes meritos y aportes encontremos la motivacion y el respeto de presentarnos en un auditorio principal', 'Solucionado', TO_DATE('16/01/2018', 'DD/MM/YYYY'), 'Infraestructura', '{"auditorio","espacio","presentación"}', 16, 1);
insert into Initiative (Title, Description, Status, CreationDate, Field, KeyWords, Users_ID, Tag_ID)
	values ('Rotación de profesores', 'Considero que unos de los profesores se encuentran dictando materias en las que no se desempeñan muy bien, deberiamos tener rotaciones de profesores para identificar que tema es su fuerte', 'Proyecto', TO_DATE('22/11/2018', 'DD/MM/YYYY'), 'Profesores', '{"materias","rotación","profesores"}', 7, 3);
insert into Initiative (Title, Description, Status, CreationDate, Field, KeyWords, Users_ID, Tag_ID)
	values ('Becas deportivas', 'Una gran parte de la universidad tiene un buen desempeño en areas deportivas y por lo tanto se deberia ofrecer un reconocimiento a esta labor que hace crecer el nombre de la universidad', 'Proyecto', TO_DATE('03/04/2018', 'DD/MM/YYYY'), 'Becas', '{"deportivo","reconocimiento","labor"}', 12, 7);
insert into Initiative (Title, Description, Status, CreationDate, Field, KeyWords, Users_ID, Tag_ID)
	values ('Informacion de intercambios', 'por lo general los intercambios no se pueden tomar ya que la informacion es tardia y se requiere un cierto tiempo para poder optar por esta opcion', 'En espera de revision', TO_DATE('16/07/2018', 'DD/MM/YYYY'), 'Intercambios', '{"intercambios","información","tardia"}', 17, 8);
insert into Initiative (Title, Description, Status, CreationDate, Field, KeyWords, Users_ID, Tag_ID)
	values ('Solicitudes a administración', 'en ocaciones se requiere de solicitudes de aprobación o cancelacion en menos de una semana por diferentes motivos es adecuado que la universidad tenga un limite de responder en maximo cinco dias habiles para tener mayor eficacia', 'En revision', TO_DATE('23/04/2018', 'DD/MM/YYYY'), 'Administración', '{"cancelación","semana","limite"}', 9, 12);
insert into Initiative (Title, Description, Status, CreationDate, Field, KeyWords, Users_ID, Tag_ID)
	values ('Reemplazar tableros', 'Seria de gran apoyo contar con tableros interactivos ya que constantemente trabajamos con medios digitales y asi el aprendizaje seria mucho mas rapido', 'Proyecto', TO_DATE('04/11/2018', 'DD/MM/YYYY'), 'Educación', '{"interactivo","reemplazar","aprendizaje"}', 23, 13);
insert into Initiative (Title, Description, Status, CreationDate, Field, KeyWords, Users_ID, Tag_ID)
	values ('Apoyo con fondo de iniciativas', 'Como innovadores requerimos de un fondo financiero que apoye las nuevas iniciativas de los estudiantes para de esta forma volver las realidad', 'En espera de revision', TO_DATE('19/08/2018', 'DD/MM/YYYY'), 'Apoyo financiero', '{"iniciativas","fondo","realidad"}', 17, 9);
insert into Initiative (Title, Description, Status, CreationDate, Field, KeyWords, Users_ID, Tag_ID)
	values ('Clases de teatro', 'Somos varios ya los que queremos otra opcion de entretenimiento como lo es el teatro, ademas es muy bueno para comunicación entre estudiantes', 'En revision', TO_DATE('26/05/2018', 'DD/MM/YYYY'), 'Cultura', '{"entretenimiento","teatro","comunicación"}', 7, 11);
insert into Initiative (Title, Description, Status, CreationDate, Field, KeyWords, Users_ID, Tag_ID)
	values ('Impresion 3D', 'Queremos tener un curso de impresion 3D para poder realizar nosotros mismos nuestro prototipos y asi comprender mas el tema de produccion y demas', 'Proyecto', TO_DATE('12/06/2018', 'DD/MM/YYYY'), 'Tecnología', '{"impresión","prototipo","producción"}', 17, 14);
insert into Initiative (Title, Description, Status, CreationDate, Field, KeyWords, Users_ID, Tag_ID)
	values ('Charlas de integración', 'Esto con el fin de que las personas que poseen alguna discapacidad puedan interactuar y relacionarse con toda la comunidad educativa en igualdad de condiciones', 'Solucionado', TO_DATE('16/11/2018', 'DD/MM/YYYY'), 'Inclusión', '{"discapacidad","interactuar","relacionarse"}', 8, 5);
insert into Initiative (Title, Description, Status, CreationDate, Field, KeyWords, Users_ID, Tag_ID)
	values ('Cursos a profesores', 'Esta iniciativa es en pro de que la educación continuada tambien se mantenga en el area del profesorado de la universidad y asi avanzar en las nuevas tecnologias existente', 'En espera de revision', TO_DATE('01/07/2018', 'DD/MM/YYYY'), 'Profesores', '{"estudio","profesores","avanzar"}', 16, 3);
insert into Initiative (Title, Description, Status, CreationDate, Field, KeyWords, Users_ID, Tag_ID)
	values ('Plataforma de trabajo a egresados', 'Como recien egresados quisieramos un poco mas de apoyo en el aspecto de ofertas de trabajo ya que la universidad tiene conexion con varias entidades y nos podrian ser de gran utilidad', 'Solucionado', TO_DATE('25/02/2018', 'DD/MM/YYYY'), 'Tecnología', '{"plataforma","oferta","trabajo"}', 17, 14);

-- Comentario
insert into Comment (Description, CreationDate, Users_ID, Initiative_ID)
	values('Buena idea compañero!, es un largo recorrido para nosotros los ciclistas', TO_DATE('22/11/2018', 'DD/MM/YYYY'), 11, 1);
insert into Comment (Description, CreationDate, Users_ID, Initiative_ID)
	values('Genial! Ahorramos más tiempo', TO_DATE('25/11/2018', 'DD/MM/YYYY'), 12, 1);
insert into Comment (Description, CreationDate, Users_ID, Initiative_ID)
	values('Por fin un internet decente', TO_DATE('28/11/2018', 'DD/MM/YYYY'), 10, 5);
insert into Comment (Description, CreationDate, Users_ID, Initiative_ID)
	values('Esto si merece la pena, siempre están llenas esas salas', TO_DATE('12/11/2018', 'DD/MM/YYYY'), 3, 3);
insert into Comment (Description, CreationDate, Users_ID, Initiative_ID)
	values('Apoyo totalmente esta iniciativa, es muy necesaria', TO_DATE('09/09/2018', 'DD/MM/YYYY'), 14, 12);
insert into Comment (Description, CreationDate, Users_ID, Initiative_ID)
	values('Me encanta! esto nos hace crecer como maestros', TO_DATE('04/07/2018', 'DD/MM/YYYY'), 23, 24);
insert into Comment (Description, CreationDate, Users_ID, Initiative_ID)
	values('Totalmente necesario, asi conservamos la seguridad', TO_DATE('26/09/2018', 'DD/MM/YYYY'), 24, 8);
insert into Comment (Description, CreationDate, Users_ID, Initiative_ID)
	values('Estas en todo lo cierto, tenemos que apoyar a los deportistas', TO_DATE('18/04/2018', 'DD/MM/YYYY'), 20, 16);
insert into Comment (Description, CreationDate, Users_ID, Initiative_ID)
	values('Si! necesitamos mas salones!', TO_DATE('09/09/2018', 'DD/MM/YYYY'), 3, 2);
insert into Comment (Description, CreationDate, Users_ID, Initiative_ID)
	values('Realmente si hay profesores que no conocen bien el tema', TO_DATE('30/11/2018', 'DD/MM/YYYY'), 11, 15);
insert into Comment (Description, CreationDate, Users_ID, Initiative_ID)
	values('Este salon es muy fatidioso tanto para estudiantes como para profesores', TO_DATE('22/11/2018', 'DD/MM/YYYY'), 16, 6);
insert into Comment (Description, CreationDate, Users_ID, Initiative_ID)
	values('Espectacular! en mi epoca eso era un martirio', TO_DATE('19/09/2018', 'DD/MM/YYYY'), 17, 10);
insert into Comment (Description, CreationDate, Users_ID, Initiative_ID)
	values('Si realmente la plataforma deberia ofrecer mayor cantidad de ofertas', TO_DATE('02/03/2018', 'DD/MM/YYYY'), 8, 25);
insert into Comment (Description, CreationDate, Users_ID, Initiative_ID)
	values('Buena idea! como estrategia de descanso', TO_DATE('14/06/2018', 'DD/MM/YYYY'), 21, 7);
insert into Comment (Description, CreationDate, Users_ID, Initiative_ID)
	values('Genial esto es innovación tecnologica', TO_DATE('12/11/2018', 'DD/MM/YYYY'), 20, 19);
insert into Comment (Description, CreationDate, Users_ID, Initiative_ID)
	values('Un espacio magnifico', TO_DATE('26/02/2018', 'DD/MM/YYYY'), 25, 14);
insert into Comment (Description, CreationDate, Users_ID, Initiative_ID)
	values('Yo tambien no lo puede hacer por eso', TO_DATE('17/07/2018', 'DD/MM/YYYY'), 10, 17);
insert into Comment (Description, CreationDate, Users_ID, Initiative_ID)
	values('A mi me pasa todo el tiempo', TO_DATE('29/08/2018', 'DD/MM/YYYY'), 21, 9);
insert into Comment (Description, CreationDate, Users_ID, Initiative_ID)
	values('La demora del tramite me hizo perder un viaje de trabajo', TO_DATE('26/04/2018', 'DD/MM/YYYY'), 6, 18);
insert into Comment (Description, CreationDate, Users_ID, Initiative_ID)
	values('Si! queremos mas cine', TO_DATE('06/06/2018', 'DD/MM/YYYY'), 11, 13);
insert into Comment (Description, CreationDate, Users_ID, Initiative_ID)
	values('Reduce tiempos de entrada en la universidad', TO_DATE('28/10/2018', 'DD/MM/YYYY'), 14, 1);
insert into Comment (Description, CreationDate, Users_ID, Initiative_ID)
	values('Es muy cierto siempre los rechazan', TO_DATE('26/11/2018', 'DD/MM/YYYY'), 15, 23);
insert into Comment (Description, CreationDate, Users_ID, Initiative_ID)
	values('Es realmente malo', TO_DATE('23/10/2018', 'DD/MM/YYYY'), 17, 5);
insert into Comment (Description, CreationDate, Users_ID, Initiative_ID)
	values('Geniales, utiles y espaciosos', TO_DATE('27/09/2018', 'DD/MM/YYYY'), 11, 10);
insert into Comment (Description, CreationDate, Users_ID, Initiative_ID)
	values('Ellos dan mucho esfuerzo y se debe recompensar', TO_DATE('11/05/2018', 'DD/MM/YYYY'), 16, 16);
insert into Comment (Description, CreationDate, Users_ID, Initiative_ID)
	values('Muy necesarios', TO_DATE('13/11/2018', 'DD/MM/YYYY'), 23, 19);
insert into Comment (Description, CreationDate, Users_ID, Initiative_ID)
	values('Asi sabemos quien es el culpable', TO_DATE('06/10/2018', 'DD/MM/YYYY'), 9, 8);
insert into Comment (Description, CreationDate, Users_ID, Initiative_ID)
	values('Que buena estrategia', TO_DATE('12/10/2018', 'DD/MM/YYYY'), 24, 10);
insert into Comment (Description, CreationDate, Users_ID, Initiative_ID)
	values('Debe ser memorable', TO_DATE('29/10/2018', 'DD/MM/YYYY'), 2, 14);
insert into Comment (Description, CreationDate, Users_ID, Initiative_ID)
	values('Si! buena idea becas al deporte', TO_DATE('08/04/2018', 'DD/MM/YYYY'), 3, 16);
insert into Comment (Description, CreationDate, Users_ID, Initiative_ID)
	values('El entretenimiento tambien es una materia', TO_DATE('01/07/2018', 'DD/MM/YYYY'), 7, 13);
insert into Comment (Description, CreationDate, Users_ID, Initiative_ID)
	values('Siempre hacen faltas mas instalaciones', TO_DATE('26/09/2018', 'DD/MM/YYYY'), 20, 2);
insert into Comment (Description, CreationDate, Users_ID, Initiative_ID)
	values('Hace crecer la iniciativa de los estudiantes', TO_DATE('08/06/2018', 'DD/MM/YYYY'), 16, 21);
insert into Comment (Description, CreationDate, Users_ID, Initiative_ID)
	values('Que terapia tan linda para el estes', TO_DATE('22/03/2018', 'DD/MM/YYYY'), 23, 4);
insert into Comment (Description, CreationDate, Users_ID, Initiative_ID)
	values('En serio realmente peligroso', TO_DATE('22/09/2018', 'DD/MM/YYYY'), 18, 12);
insert into Comment (Description, CreationDate, Users_ID, Initiative_ID)
	values('Imposible! sin utilidad', TO_DATE('16/10/2018', 'DD/MM/YYYY'), 2, 5);
insert into Comment (Description, CreationDate, Users_ID, Initiative_ID)
	values('Es un esfuerzo doble, apoyemos', TO_DATE('22/11/2018', 'DD/MM/YYYY'), 22, 16);
insert into Comment (Description, CreationDate, Users_ID, Initiative_ID)
	values('Pero si lo cambiamos generamos congestion en la entrada principal', TO_DATE('14/11/2018', 'DD/MM/YYYY'), 7, 1);
insert into Comment (Description, CreationDate, Users_ID, Initiative_ID)
	values('Pero que genere alertas en el correo para saber', TO_DATE('04/04/2018', 'DD/MM/YYYY'), 13, 25);
insert into Comment (Description, CreationDate, Users_ID, Initiative_ID)
	values('Deberian dejarlo en 3 dias habiles', TO_DATE('30/05/2018', 'DD/MM/YYYY'), 3, 18);
insert into Comment (Description, CreationDate, Users_ID, Initiative_ID)
	values('Genial un espacio para presentacion de grado', TO_DATE('22/03/2018', 'DD/MM/YYYY'), 19, 14);
insert into Comment (Description, CreationDate, Users_ID, Initiative_ID)
	values('Mejorenlo! no es propio para una universidad', TO_DATE('19/10/2018', 'DD/MM/YYYY'), 24, 5);
insert into Comment (Description, CreationDate, Users_ID, Initiative_ID)
	values('La mejor idea de la universidad', TO_DATE('06/06/2018', 'DD/MM/YYYY'), 25, 7);
insert into Comment (Description, CreationDate, Users_ID, Initiative_ID)
	values('Es verdad yo dure mas de 1 año planeandolo', TO_DATE('15/08/2018', 'DD/MM/YYYY'), 13, 17);
insert into Comment (Description, CreationDate, Users_ID, Initiative_ID)
	values('Es bueno cambiar y probar varias zonas de educación', TO_DATE('27/11/2018', 'DD/MM/YYYY'), 22, 15);
insert into Comment (Description, CreationDate, Users_ID, Initiative_ID)
	values('Deberia tener una entrada independiente', TO_DATE('20/11/2018', 'DD/MM/YYYY'), 13, 1);
insert into Comment (Description, CreationDate, Users_ID, Initiative_ID)
	values('Tambien deberian tenerlos en otros sitios', TO_DATE('18/10/2018', 'DD/MM/YYYY'), 16, 10);
insert into Comment (Description, CreationDate, Users_ID, Initiative_ID)
	values('Teatro! increible!', TO_DATE('30/07/2018', 'DD/MM/YYYY'), 19, 21);
insert into Comment (Description, CreationDate, Users_ID, Initiative_ID)
	values('Y tambien baños por favor', TO_DATE('09/10/2018', 'DD/MM/YYYY'), 5, 2);
insert into Comment (Description, CreationDate, Users_ID, Initiative_ID)
	values('Huy y que tenga buena capacidad', TO_DATE('05/02/2018', 'DD/MM/YYYY'), 16, 14);
insert into Comment (Description, CreationDate, Users_ID, Initiative_ID)
	values('Me encanta la idea', TO_DATE('02/06/2018', 'DD/MM/YYYY'), 25, 7);
insert into Comment (Description, CreationDate, Users_ID, Initiative_ID)
	values('O una sala de reuniones?', TO_DATE('26/08/2018', 'DD/MM/YYYY'), 12, 9);
insert into Comment (Description, CreationDate, Users_ID, Initiative_ID)
	values('Espectacular y se puede interactuar mas', TO_DATE('17/11/2018', 'DD/MM/YYYY'), 14, 19);
insert into Comment (Description, CreationDate, Users_ID, Initiative_ID)
	values('Radido y facil', TO_DATE('02/11/2018', 'DD/MM/YYYY'), 21, 1);
insert into Comment (Description, CreationDate, Users_ID, Initiative_ID)
	values('Aunque hay profes que no debemos cambiar', TO_DATE('30/11/2018', 'DD/MM/YYYY'), 10, 15);
insert into Comment (Description, CreationDate, Users_ID, Initiative_ID)
	values('Si! en cada edificio varias', TO_DATE('13/11/2018', 'DD/MM/YYYY'), 3, 3);
insert into Comment (Description, CreationDate, Users_ID, Initiative_ID)
	values('Teatro y guitarra por favor', TO_DATE('04/08/2018', 'DD/MM/YYYY'), 18, 21);
insert into Comment (Description, CreationDate, Users_ID, Initiative_ID)
	values('Que tengan un buen diseño tambien', TO_DATE('24/10/2018', 'DD/MM/YYYY'), 22, 10);
insert into Comment (Description, CreationDate, Users_ID, Initiative_ID)
	values('Es muy necesario y no es nada util', TO_DATE('26/10/2018', 'DD/MM/YYYY'), 6, 5);
insert into Comment (Description, CreationDate, Users_ID, Initiative_ID)
	values('Deberiamos tener un programa constante', TO_DATE('21/08/2018', 'DD/MM/YYYY'), 12, 17);
insert into Comment (Description, CreationDate, Users_ID, Initiative_ID)
	values('Apoyo total', TO_DATE('19/01/2018', 'DD/MM/YYYY'), 21, 14);
insert into Comment (Description, CreationDate, Users_ID, Initiative_ID)
	values('Total, salones con deficiencias', TO_DATE('10/11/2018', 'DD/MM/YYYY'), 7, 6);
insert into Comment (Description, CreationDate, Users_ID, Initiative_ID)
	values('Crecer es apoyar el talento de casa', TO_DATE('23/11/2018', 'DD/MM/YYYY'), 12, 20);
insert into Comment (Description, CreationDate, Users_ID, Initiative_ID)
	values('Lo necesitamos ya! que peligro', TO_DATE('10/09/2018', 'DD/MM/YYYY'), 9, 12);

-- Vote
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
insert into Vote (Vote, Users_ID, Initiative_ID)
	values(true, 15, 2);
insert into Vote (Vote, Users_ID, Initiative_ID)
	values(false, 21, 11);
insert into Vote (Vote, Users_ID, Initiative_ID)
	values(false, 25, 9);
insert into Vote (Vote, Users_ID, Initiative_ID)
	values(true, 22, 20);
insert into Vote (Vote, Users_ID, Initiative_ID)
	values(true, 4, 16);
insert into Vote (Vote, Users_ID, Initiative_ID)
	values(true, 13, 12);
insert into Vote (Vote, Users_ID, Initiative_ID)
	values(false, 16, 15);
insert into Vote (Vote, Users_ID, Initiative_ID)
	values(true, 19, 12);
insert into Vote (Vote, Users_ID, Initiative_ID)
	values(true, 10, 2);
insert into Vote (Vote, Users_ID, Initiative_ID)
	values(true, 18, 2);