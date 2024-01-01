package com.rand.rand.controllers;

import java.security.SecureRandom;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.rand.rand.models.Rand;

/**
 * Controlador que maneja las solicitudes relacionadas con la generación de
 * números aleatorios.
 */
@RestController
public class RandController {

    /**
     * Maneja las solicitudes GET en la ruta "/random" para generar números
     * aleatorios.
     *
     * @param bound  Límite superior para la generación de números aleatorios (por
     *               defecto: 100).
     * @param origin Valor de inicio para la generación de números aleatorios (por
     *               defecto: 50).
     * @param size   Cantidad de números aleatorios a generar (por defecto: 50).
     * @return Un objeto Rand que contiene la lista de números aleatorios generados.
     */
    @GetMapping("/random")
    public Rand rand(
            @RequestParam(value = "bound", defaultValue = "100") String bound,
            @RequestParam(value = "origin", defaultValue = "50") String origin,
            @RequestParam(value = "size", defaultValue = "50") String size) {
        // Inyección de dependencias con getter y setter
        // Crea una instancia de Rand
        Rand randObj = new Rand();

        // Establece el generador de números aleatorios usando SecureRandom
        randObj.setRandom(new SecureRandom());

        // Genera números aleatorios y los asigna al objeto Rand
        randObj.randGen(size, origin, bound);

        // Devuelve el objeto Rand que contiene la lista de números aleatorios generados
        return randObj;
    }

    /**
     * Maneja las solicitudes GET en la ruta "/random_security_selection" para
     * generar
     * números aleatorios con la opción de seleccionar el generador de números
     * seguros.
     *
     * @param bound  Límite superior para la generación de números aleatorios (por
     *               defecto: 100).
     * @param origin Valor de inicio para la generación de números aleatorios (por
     *               defecto: 50).
     * @param size   Cantidad de números aleatorios a generar (por defecto: 50).
     * @param secure Indica si se debe utilizar un generador de números aleatorios
     *               seguro (por defecto: false).
     * @return Un objeto Rand que contiene la lista de números aleatorios generados.
     */
    @GetMapping("/random_security_selection")
    public Rand rand_security_selection(
            @RequestParam(value = "bound", defaultValue = "100") String bound,
            @RequestParam(value = "origin", defaultValue = "50") String origin,
            @RequestParam(value = "size", defaultValue = "50") String size,
            @RequestParam(value = "secure", defaultValue = "false") String secure) {
        // Inyección de dependencias por constructor
        return secure.equals("true") ? new Rand(new SecureRandom(), size, origin, bound)
                : new Rand(new java.util.Random(), size, origin, bound);
    }
}
