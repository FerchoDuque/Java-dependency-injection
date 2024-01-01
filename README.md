Random Number Generator App

Esta aplicación en Java implementa un servicio de generación de números aleatorios con opciones de configuración. Utiliza el patrón de inyección de dependencias para proporcionar flexibilidad en la elección del generador de números aleatorios.
Descripción

La aplicación consta de las siguientes clases principales:

    RandApplication: Clase principal que inicia la aplicación Spring Boot.
    RandController: Controlador que maneja las solicitudes relacionadas con la generación de números aleatorios.
    Rand: Clase que representa la generación de números aleatorios y almacena el conjunto resultante en un array.

Características

    Generación de Números Aleatorios: El controlador proporciona un punto de acceso "/random" que genera números aleatorios con opciones de configuración como límite superior, valor de inicio y cantidad de números a generar.

    Inyección de Dependencias: La aplicación utiliza la inyección de dependencias para proporcionar flexibilidad en la elección del generador de números aleatorios. Se pueden seleccionar generadores seguros y no seguros.

Ejecución

Para ejecutar la aplicación, sigue estos pasos:

    Asegúrate de tener Java instalado en tu sistema.
    Clona este repositorio: git clone https://github.com/FerchoDuque/Java-dependency-injection.git
    Navega al directorio del proyecto: cd random-number-generator
    Ejecuta la aplicación: ./mvnw spring-boot:run

La aplicación estará disponible en http://localhost:8080.
Configuración

Puedes configurar la aplicación ajustando los parámetros en las solicitudes a la ruta "/random" y "/random_security_selection". Estos parámetros incluyen:

    bound: Límite superior para la generación de números aleatorios (por defecto: 100).
    origin: Valor de inicio para la generación de números aleatorios (por defecto: 50).
    size: Cantidad de números aleatorios a generar (por defecto: 50).
    secure: Indica si se debe utilizar un generador de números aleatorios seguro (por defecto: false).

Contribuciones

¡Las contribuciones son bienvenidas! Si encuentras un problema o tienes una mejora, por favor crea un "issue" o envía un "pull request".
Licencia

Este proyecto está bajo la Licencia MIT - consulta el archivo LICENSE.md para más detalles.
