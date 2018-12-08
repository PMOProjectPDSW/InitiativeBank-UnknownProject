# Proyecto Banco de Iniciativas
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

![Alt text](testImages/RegistrarIniciativa_Imagen4.PNG?raw=true "Registrar Iniciativa")
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









> De igual manera, dicho sistema autentica a los usuarios 

## Credenciales de Usuarios para usar la Aplicación
+ **Administrador:**
	- **Usuario:** admin@escuelaing.edu.co	
	- **Contraseña:** admin
+ **Personal PMO - ODI:**
	- **Usuario:** walter.blanco@escuelaing.edu.co	
	- **Contraseña:** password
+ **Proponente de Iniciativa de Proyecto:**
	- **Usuario:** kanye.west.busto@escuelaing.edu.co	
	- **Contraseña:** password
+ **Usuarios de Consulta**
	- **Usuario:** bruno.flores@escuelaing.edu.co	
	- **Contraseña:** password








## Model
Modelación del proyecto

## Run
This WebApp runs through the localhost port:
```
8080
```
With the main page on the resource:
```
/faces/index
```
In the location:
[localhost:8080/faces/index](localhost:8080/project/login.xhtml)

## How To Use
	+ Nothing 1.
		- Blas blas
	+ Nothing 2.
	+ Nothing 3.
	+ Nothing 4.

## Restrictions
* Restiction 1.
* Restiction 2.
