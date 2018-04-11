# Configuración de entorno

##Herramientas
- Gradle
- MySql (podría estar corriendo en Docker de preferencia)
- JDK 1.8.X
- IDE (Preferencia Intellij IDEA)

### Configuración MySQL
Se debe inicializar MySQL y abrir con un software de gestión de bases de datos (MySQLWorkbench) y crear una conexión a la base de datos de Docker (que el contenedor ocupe el puerto 3306). Para crear la conexión utilizar 192.168.99.100:3306 y las credenciales de usario _root_ y la contraseña _password_.
### Configuración proyecto de Spring
Si se utiliza Intellij IDEA, este instalará las dependencias necesarias (estas se encuentran en _build.gradle_).
### Gradle
Para ejecutar el proyecto basta con abrir la carpeta alguna de ventana de comandos y ejecutar:

```
gradle bootrun
``` 

###Realizar peticiones
Con algun software, como _Postman_ o la extensión de Google Chrome _Advance Rest_, se puede hacer peticiones al servicio creado, ingresando la url:
```
http://localhost:8081/
``` 