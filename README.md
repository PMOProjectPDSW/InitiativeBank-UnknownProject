﻿# Proyecto Banco de Iniciativas
## PDSW - Procesos de Desarrollo de Software
### Team: Unknown Project
![Alt text](src/main/webapp/resources/img/tools/InitiativeBankLogo.png?raw=true "Logo")


## About Us
+ **Periodo Académico:** 2018 - 2
+ **Nombre del Curso:** PDSW - Procesos de Desarrollo de Software
+ **Nombre de los Integrantes:** Pedro José Mayorga Navarrete
+ **Nombre del Profesor:** Francisco José Cháves Alonso
+ **Roles Asignados:**
	- **Product Owner:** Francisco Cháves
	- **Scrum Master:** Pedro Mayorga
	- **Development Team:**
		* Pedro Mayorga
	- **Stakeholder:** Jorge Acero - PMO
	
## **Despliegue en Heroku**

[![Deployed to Heroku](https://www.herokucdn.com/deploy/button.png)](https://bancoiniciativas-escuelaing.herokuapp.com/)

**Enlace:** [`bancoiniciativas-escuelaing.herokuapp.com/`](https://bancoiniciativas-escuelaing.herokuapp.com/)

## Descripción del Producto
> Esta *Aplicacion Web* es un **Banco de Iniciativas de Proyectos** de la Escuela Colombiana de Ingeniería, que gestiona principalmente el registro, consulta e interacción de las ideas para nuevos proyectos propuestos por parte de toda la comunidad de la Escuela.

> El Aplicativo registra nuevas ideas, que podrás ser consultadas y revisadas posteriormente por el **Departamento de Proyectos de la Escuela - PMO**, quienes evaluarán como se puede dar solución a las distintas ideas propuestos por miembros de diferentes áreas de la escuela.

Como **Funcionalidades Básicas** encontramos:

### Poder Autenticarse en la página web mediante un Usuario y Contraseña creados.
----------------------
Para esto se dispone de los siguientes tipos de *Usuario* con los que se pueden probar las diferentes funcionalidades de la Aplicación dependiendo del acceso que tengan los mismos a las herrameintas de el aplicativo:
+ **Usuarios de Consulta:**
	- **_Consulta_** la información de las diferentes Iniciativas.
	- **_Muestra_** interés con el desarrollo de una Iniciativa de Proyecto que se encuentre en el banco mediante el Voto (dar like) sobre una Iniciativa.
	- **_Deja_** Comentarios u observaciones sobre las Iniciativas de Proyecto. 
	- **_Consulta_** las Iniciativas de acuerdo a Palabras Clave
	- **_Entrega_** Estadísticas de las Iniciativas con base en la información registrada.

+ **Proponente de Iniciativa de Proyecto:** (además de las opciones de "Usuarios de Consulta")
	- **_Registra_** una nueva idea o Iniciativa.
	- **_Consulta_** las Iniciativas que el Proponente ha realizado.
	- **_Modifica_** una Iniciativa siempre y cuando se encuentre en el estado "En Espera de Revisión".

+ **Personal PMO - ODI:** (además de las opciones de "Usuarios de Consulta" y "Proponente de Iniciativa de Proyecto")
	- **_Consulta_** las Iniciativas de Proyectos que los Proponentes han publicado.
	- **_Cambia_** el estado de las Iniciativas a:
		* **En Espera de Revisión:** La Iniciativa ha sido registrada y está a la espera de que alguien de la Oficina de Proyectos la revise. 
		* **En Revisión:** La Iniciativa se encuentra en Revisión por parte de alguien de la Oficina de Proyectos
		* **Proyecto:** La Iniciativa se ha considerado viable como proyecto y por lo tanto se encuentra en proceso de creación de Proyecto.
		* **Solucionado:** La Iniciativa ya se encontraba solucionada en la Escuela, o el Proyecto que se creó para dicha idea ya fue solucionado satisfactoriamente.

+ **Administrador:** (además de las opciones de "Usuarios de Consulta", "Proponente de Iniciativa de Proyecto" y "Personal PMO - ODI")
	- **_Modifica_** el Estado de las Iniciativas.
	- **_Modifica_** el Rol de los Usuarios.
	- **_Consulta_** toda la información relacionada con las ideas o Iniciativas.
	
![Alt text](testImages/Login_Imagen1.PNG?raw=true "Login")
Imagen 1: Página de Inicio de Sesión, donde los usuarios pueden Autenticarse con su respectivo *"Usuario"* y *"Contraseña"*

### Tener una Página de Inicio.
----------------------
Desde acá, el usuario puede acceder a todas las Funcionalidades de el aplicativo y revisar con que usuario se ha registrado a la derecha de las opciones principales, además como **Funcionalidades Principales** las podemos encontrar divididas por la sección a la cuál pertenecen, donde encontramos las siguientes secciones:
+ Iniciativas
+ Estadísticas
+ Usuarios

![Alt text](testImages/Index_Imagen2.PNG?raw=true "Index")
Imagen 2: Página de Inicio del Aplicativo, donde los usuarios pueden ingresar a todas las funcionalidades y herramientas del mismo.

### Iniciativas
----------------------
En **Iniciativas** podemos encontrar las siguientes funcionalidades:
+ Registrar Iniciativa
+ Consultar Iniciativas
+ Consultar Iniciativas del Proponente

![Alt text](testImages/Iniciativas_Imagen3.PNG?raw=true "Iniciativas")
Imagen 3: Página de Inicio de las Iniciativas, donde los usuarios pueden ver las funcionalidades que pueden realizar con las Iniciativas.

* ### Registrar Iniciativa
----------------------
En esta herramienta, los Proponentes pueden **Registrar** una nueva Iniciativa, ingresando:
+ Título
+ Descripción
+ Campo de Acción
+ Palabras Clave (Separadas por coma)

![Alt text](testImages/RegistrarIniciativa1_Imagen4.PNG?raw=true "Registrar Iniciativa")
![Alt text](testImages/RegistrarIniciativa2_Imagen5.PNG?raw=true "Registrar Iniciativa")
Imagen 4 y 5: Página para Registrar Iniciativas, donde los usuarios pueden agregar una nueva Iniciativa.

* ### Consultar Iniciativas
----------------------
En esta herramienta, se pueden **Consultar** todas las Iniciativas Registradas:

![Alt text](testImages/ConsultarIniciativas1_Imagen6.PNG?raw=true "Consultar Iniciativas")
![Alt text](testImages/ConsultarIniciativas2_Imagen7.PNG?raw=true "Consultar Iniciativas")
Imagen 6 y 7: Página para Consultar Iniciativas, donde los usuarios pueden ver todas las Iniciativas.

* ### Consultar Iniciativas del Proponente
----------------------
En esta herramienta, se pueden **Consultar** todas las Iniciativas Registradas por el Proponente que se encuentra loggeado:

![Alt text](testImages/ConsultarIniciativasProponente1_Imagen8.PNG?raw=true "Consultar Iniciativas Proponente")
![Alt text](testImages/ConsultarIniciativasProponente2_Imagen9.PNG?raw=true "Consultar Iniciativas Proponente")
Imagen 8 y 9: Página para Consultar Iniciativas del Proponente, donde se pueden ver todas las Iniciativas del Proponente registrado.

* ### Consultar Iniciativas por Palabras Clave
----------------------
En esta herramienta, se pueden **Consultar** todas las Iniciativas Registradas por las Palabras Clave que desee buscar:

![Alt text](testImages/ConsultarIniciativasPalabrasClave_Imagen10.PNG?raw=true "Consultar Iniciativas por Palabras Clave")
Imagen 10: Página para Consultar Iniciativas por Palabras Clave, donde se pueden ver todas las Iniciativas dada una Palabra Clave.

* ### Consultar Iniciativas por el Estado de la Iniciativa
----------------------
En esta herramienta, se pueden **Consultar** todas las Iniciativas Registradas por el Estado de la Iniciativa:

![Alt text](testImages/ConsultarIniciativasEstado_Imagen11.PNG?raw=true "Consultar Iniciativas Proponente")
Imagen 11: Página para Consultar Iniciativas por el Estado de la Iniciativa, donde se pueden ver todas las Iniciativas dado un Estado.

* ### Modificar el Estado de una Iniciativa
----------------------
En esta herramienta, se puede **Modificar** el Estado de la Iniciativa, seleccionando:
+ Iniciativa
+ Nuevo Estado de la Iniciativa

![Alt text](testImages/ModificarEstado1_Imagen12.PNG?raw=true "Modificar Estado Iniciativa")
![Alt text](testImages/ModificarEstado2_Imagen13.PNG?raw=true "Modificar Estado Iniciativa")
Imagen 12 y 13: Página para Modificar el Estado de una Iniciativa, seleccionandola junto con su nuevo estado.

### Estadísticas
----------------------
En **Estadísticas** podemos encontrar las siguientes funcionalidades:
+ Consultar Estadísticas de Iniciativas por Areas

![Alt text](testImages/Estadisticas_Imagen14.PNG?raw=true "Estadisticas")
Imagen 14: Página de Inicio de las Estadísticas, donde los usuarios pueden ver las funcionalidades que pueden realizar con las Estadisticas.


* ### Consultar Estadísticas de Iniciativas por Areas
----------------------
En esta herramienta, se puede **Consultar** las estadísticas de las Iniciativas existentes por Areas de las que son parte los proponentes:

![Alt text](testImages/EstadisticasArea_Imagen15.PNG?raw=true "Estadisticas de Iniciativas por Area")
Imagen 15: Página para mostrar las estadisticas de iniciativas realizadas por el area de los proponentes.

### Usuarios
----------------------
En **Usuarios** podemos encontrar las siguientes funcionalidades:
+ Asignar o cambiar el tipo de Perfil de un Usuario

![Alt text](testImages/Usuarios_Imagen16.PNG?raw=true "Usuarios")
Imagen 16: Página de Inicio de las Usuarios, donde los usuarios pueden ver las funcionalidades que pueden realizar con las Usuarios.


* ### Asignar o Cambiar el tipo de Perfil de un Usuario
----------------------
En esta herramienta, se puede **Asignar o Cambiar** el Rol (o Tipo de Perfil) de un Usuario, seleccioanndo:
+ Usuario
+ Nuevo Rol del Usuario

![Alt text](testImages/AsignarPerfil1_Imagen17.PNG?raw=true "Asignar Perfil")
![Alt text](testImages/AsignarPerfil2_Imagen18.PNG?raw=true "Asignar Perfil")
Imagen 17 y 18: Página para cambiar el Perfil de un Usuario.

## Arquitectura y Diseño Detallado
### Modelo E-R
![Alt text](model/E-R_Model.png?raw=true "Modelo E-R")
Imagen 19: Modelo Entidad-Relacion de la Base de Datos.

### Diagrama de Clases (Ingeniería Inversa)
![Alt text](model/Class_Diagram.png?raw=true "Diagrama de Clases")
Imagen 20: Diagrama de Clases usadas en la implementación Lógica en JAVA.

### Descripción de la Arquitectura (Capas)
![Alt text](model/Architecture_Model.png?raw=true "Modelo Arquitectura")
Imagen 21: Modelo de la Arquitectura usada en el Proyecto.

### Capas
Se utilizaron las siguientes capas:
+ **psdw.project.guice:** Inyector Guice, que permitió la conexion de los DAOs con la Base de Datos.
+ **psdw.project.services:** Acá se encuentran las funcionalidades del Banco de Inicitivas, es lo que cada Bean llama para ejecutar las funcionalidades.
+ **psdw.project.services.impl:** Metodos concretos de la interfaz Services.
+ **psdw.project.beans:** ManagedBeans para cada operación solicitada por la Aplicación Web.
+ **psdw.project.persistence.dao:** Interfaces para cada DAO.
+ **psdw.project.persistence.dao.mybatis:** Implementación de los metodos concretos para cada DAO.
+ **psdw.project.persistence.dao.mappers:** Conexión entre MyBatis con los Mappers.xml de la Base de Datos.
+ **psdw.project.entities:** Modelo que obtiene la información de las tablas de la base de datos mediante los Mappers.
+ **resources.mappers:** Mappers que permiten la conexión Base de Datos / Clases.
+ **Web Pages:** Vista Final del Aplicativo, FrontEnd.

### Stack de Tecnologías
En el proyecto se utilizaron las siguientes tecnologías:
+ **Construcción del Proyecto:**
	- Apache Maven
+ **Lenguajes de Programación:**
	- Java
	- CSS
+ **Componentes de Interfaz de Usuario:**
	- PrimeFaces
	- JavaServer Faces
+ **Framework de Inyección de Dependencias:**
	- Google Guice
+ **Gestor de Base de Datos:**
	- PostgreSQL
+ **Sistema de Control de Versiones:**
	- Github
+ **Sistema de Despliegue:**
	- Heroku

## Ejecutar Aplicación
### Enlace de la aplicación en Heroku

+ [Banco Iniciativas Heroku App](https://bancoiniciativas-escuelaing.herokuapp.com)


### Correr la Aplicación localmente mediante:

Compilar en maven:
```
mvn clean
mvn package
mvn tomcat7:run
```
Abrir localmente en el navegador, en la siguiente dirección:

+ [localhost:8080/project/login.xhtml](https://localhost:8080/project/login.xhtml)

+ **NOTA: En caso de que la aplicación no corra en Linux, ejecutar en Windows.

## Credenciales de Usuarios para usar la Aplicación
+ **Administrador:**
	- **Usuario:** admin@escuelaing.edu.co	
	- **Contraseña:** admin
+ **Personal PMO - ODI:**
	- **Usuario:** walter.blanco@escuelaing.edu.co	
	- **Contraseña:** password
+ **Proponente de Iniciativa de Proyecto:**
	- **Usuario:** kanye.west@escuelaing.edu.co	
	- **Contraseña:** password
+ **Usuarios de Consulta**
	- **Usuario:** bruno.flores@escuelaing.edu.co	
	- **Contraseña:** password

## Descripción del Proceso
### Metodología
Como metodología para el proyecto, me enfoque primero que todo en conseguir que la capa de persistencia del proyecto funcionara correctamente, que no hubiera ningún error en la comunicación entre la lógica del proyecto y la base de datos. Esto implicó hacer en primer lugar, todos los DAOs, MyBatis__DAOS, Mapppers.java, Mappers.xml y Entidades de mi Modelo para poder corroborar que estuvieran sirviendo perfectamente sin errores y que todos los registros de la base de datos lo estuviera obteniendo satisfactoriamente en mi proyecto JAVA. Cabe resaltar que antes de realizar esto se tuvo que crear la estructura del proyecto, además de la respectiva Base de Datos en PostgreSQL.

Luego de tener lo anterior listo, ya pude pasar a realizar las Historias de Usuario del proyecto, empezando logicamente por la autenticación de usuarios y posteriormente por las funcionalidades de Usuarios/Iniciativas/Estadisticas, en este punto, solo me concentré en realizar una funcionalidad a la vez y tenerla completa funcionando satisfactoriamente para después continuar con las demas funcionalidades. Sin embargo este punto las cosas se facilitaron un poco porque al ya haber hecho por ejemplo las consultas de usuarios, tenía entonces ya una base para construir las consultas de Iniciativas, aunque fueran distintas, ya tenía una especie de Plantilla para poder realizarla más rápidamente y así sucesivamente con las demás historias de usuario.

### Enlace a Trello

+ [Tablero en Trello](https://trello.com/b/lXYRirub)

### Release-Burndown Chart
-----------------------

+ [Release-Burndown Chart](https://BurndownForTrello.com/share/wwq7te8zof)

![Alt text](scrum/Release-Burndown.PNG?raw=true "Release Burndown Chart")
Imagen 22: Release Burndown Chart del Proyecto.

**Puntos Realizados:**
+ Autenticar Usuarios Basica
+ Asignar Perfil a Usuarios
+ Registrar Idea o Iniciativa
+ Modificar el estado de la Iniciativa
+ Consultar Iniciativas por Palabras Clave
+ Generar Estadisticas por Areas
+ Consultar todas las Ideas o Iniciativas
+ Consultar Ideas o Iniciativas por Estado
+ Consultar Ideas o Iniciativas del Proponente

**Puntos Faltantes:**
+ Mostrar Interes por una Iniciativa
+ Agrupar Iniciativas Relacionadas
+ Dar Like a una Iniciativa
+ Generar Estadisticas de la Información por Estado

### Único Sprint (Sprint 3)
--------------

**Sprint-Backlog**

![Alt text](scrum/Sprint-Backlog1.PNG?raw=true "Sprint Backlog")
![Alt text](scrum/Sprint-Backlog2.PNG?raw=true "Sprint Backlog")
Imagen 23 y 24: Sprint Backlog del Proyecto.

**Release Burndown Chart**

![Alt text](scrum/Release-Burndown.PNG?raw=true "Release Burndown Chart")
![Alt text](scrum/Github-Release-Burndown.PNG?raw=true "Release Burndown Chart")
Imagen 25 y 26: Release Burndown Chart del Proyecto de Trello y Github.

## Recursos del Proyecto
+ Repositorio de Github
	- [Repositorio Github](https://github.com/PMOProjectPDSW/InitiativeBank-UnknownProject)
+ Carpeta del Proyecto en Drive
	- [Carpeta Google Drive](https://drive.google.com/drive/folders/19PsS1FSDVDK46TC08_CDwVMzYOcyIlWx?usp=sharing)
+ Tablero en Trello
	- [Tablero de Trello](https://trello.com/b/lXYRirub)
+ Release Burndown Chart
	- [Release-Burndown Chart](https://BurndownForTrello.com/share/wwq7te8zof)
+ Modelo Base de Datos en Vertabelo
	- [Modelo DB Vertabelo](https://my.vertabelo.com/doc/POS6lhOYKZVcX1NFaRpJmN4lNoxZICAG)
+ Aplicación WEb en Heroku
	- [Heroku Web App](https://bancoiniciativas-escuelaing.herokuapp.com)
