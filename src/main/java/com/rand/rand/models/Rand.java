package com.rand.rand.models;

import java.util.Random;

/**
 * Clase que representa la generación de números aleatorios y almacena el
 * conjunto resultante en un array.
 */
public class Rand {

    /** Array que almacena los números aleatorios generados. */
    private int[] numArray;

    /** Generador de números aleatorios. */
    private Random random;

    /**
     * Constructor por defecto que no realiza ninguna inicialización.
     */
    public Rand() {
    }

    /**
     * Constructor que permite la inyección de dependencias para el generador de
     * números aleatorios
     * y realiza la generación de números aleatorios utilizando los parámetros
     * proporcionados.
     *
     * @param random Generador de números aleatorios a utilizar.
     * @param size   Cantidad de números aleatorios a generar.
     * @param origin Valor de inicio para la generación de números aleatorios.
     * @param bound  Límite superior para la generación de números aleatorios.
     */
    public Rand(Random random, String size, String origin, String bound) {
        this.random = random;
        randGen(size, origin, bound);
    }

    /**
     * Genera números aleatorios utilizando los parámetros proporcionados y los
     * almacena en el array.
     *
     * @param size   Cantidad de números aleatorios a generar.
     * @param origin Valor de inicio para la generación de números aleatorios.
     * @param bound  Límite superior para la generación de números aleatorios.
     */
    public void randGen(String size, String origin, String bound) {
        try {
            long sz = Long.parseLong(size);
            int or = Integer.parseInt(origin);
            int bnd = Integer.parseInt(bound);
            numArray = random.ints(sz, or, bnd).toArray();
        } catch (Exception e) {
            // En caso de error, se inicializa el array con longitud cero.
            numArray = new int[0];
        }
    }

    /**
     * Obtiene el array que almacena los números aleatorios generados.
     *
     * @return Array de números aleatorios.
     */
    public int[] getNumArray() {
        return numArray;
    }

    /**
     * Establece el array que almacena los números aleatorios generados.
     *
     * @param numArray Array de números aleatorios.
     */
    public void setNumArray(int[] numArray) {
        this.numArray = numArray;
    }

    // /**
    // * Obtiene el generador de números aleatorios.
    // *
    // * @return Generador de números aleatorios.
    // */
    // public Random getRandom() {
    // return random;
    // }

    /**
     * Establece el generador de números aleatorios.
     *
     * @param random Generador de números aleatorios a establecer.
     */
    public void setRandom(Random random) {
        this.random = random;
    }
}
