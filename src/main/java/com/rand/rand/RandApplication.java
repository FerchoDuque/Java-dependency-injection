package com.rand.rand;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Clase principal que inicia la aplicación Spring Boot para la generación de
 * números aleatorios.
 */
@SpringBootApplication
public class RandApplication {

	/**
	 * Punto de entrada principal para la aplicación.
	 *
	 * @param args Argumentos de línea de comandos pasados a la aplicación.
	 */
	public static void main(String[] args) {
		SpringApplication.run(RandApplication.class, args);
	}

}
