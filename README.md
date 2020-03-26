# Sistema-ventas-spring-boot
 Un sistema de ventas usando Java, Spring MVC, MySQL y Bootstrap
# POS con Spring Boot
![Punto de venta con Spring Boot](https://parzibyte.me/blog/wp-content/uploads/2019/09/Punto-de-venta-con-Spring-Boot-MySQL-y-Bootstrap-4.gif)

# Tutorial
Aquí: https://parzibyte.me/blog/2019/09/04/sistema-ventas-spring-mvc-mysql-bootstrap/

## Descargar código del sistema de ventas Spring Boot y compilar

Si quieres puedes clonar el repositorio, he usado gradle para todo así que puedes usar incluso el bloc de notas para programar.

Lo que tienes que hacer es [instalar gradle](https://parzibyte.me/blog/2019/07/27/instalar-configurar-gradle/), [MySQL](https://parzibyte.me/blog/2017/12/11/configurar-instalar-php-7-apache-server-mysql-windows/) y [Java](https://parzibyte.me/blog/2017/12/26/instalar-configurar-jdk-compilador-java-windows/); es decir, todo lo necesario para programar con Spring Boot y MySQL.

Después ejecuta el programa con:

`gradlew bootRun`

Y crea el jar usando:

`gradlew build`

También puedes importar el proyecto usando [IntelliJ IDEA](https://parzibyte.me/blog/2019/09/03/spring-intellij-idea-iniciar-proyecto/).

Después ejecuta el jar con:

`java -jar nombre-del-jar.jar`

En ambos casos (ya sea que estés ejecutando el sistema para programar, o ejecutes el jar) visita _http://localhost:8080/productos/mostrar_.

No olvides que dejo el código fuente en [GitHub](https://github.com/parzibyte/sistema-ventas-spring-boot).

Más información sobre [Spring Boot y Gradle aquí](https://parzibyte.me/blog/2019/08/22/iniciar-spring-boot-gradle/).

## Tu propio application.properties para mi sistema de ventas con Spring Boot

Si mi contraseña, usuario o configuración no son acorde a tus requisitos recuerda que siempre puedes crear un archivo llamado `application.properties` en el **mismo directorio** en donde está el jar, así, será tomado en cuenta ese archivo en lugar del mío.

## Esquema de base de datos
No es necesario proporcionar el esquema de la base de datos pues la migración se hace automáticamente al ejecutar el proyecto; sin embargo
se puede encontrar un esquema en src/main/resources/

Te aviso que probablemente cause algunos errores si la base de datos del proyecto no está limpia
