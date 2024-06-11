package com.diegocayo.prg.utils;

import java.util.*;

/**
 * Clase utilitaria que proporciona métodos para operaciones comunes, incluyendo manejo de entradas de usuario,
 * y operaciones con pilas y colas.
 */
public class LibPersonal {

    /**
     * Lee una opción numérica del usuario y maneja InputMismatchException para entradas no numéricas.
     *
     * @param scanner el objeto Scanner utilizado para leer la entrada del usuario.
     * @return la opción numérica introducida por el usuario, o -1 si la entrada no es un número válido.
     */
    public static int obtenerOpcion(Scanner scanner) {
        int opcion = -1;
        try {
            opcion = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Por favor, introduce un número válido.");
            scanner.next(); // Limpiar el buffer
        }
        return opcion;
    }

    // Métodos para manejo de Pilas (Stacks)

    /**
     * Inserta un elemento en la pila.
     *
     * @param stack la pila donde se insertará el elemento.
     * @param elemento el elemento a insertar.
     * @param <T> el tipo del elemento.
     */
    public static <T> void push(Stack<T> stack, T elemento) {
        stack.push(elemento);
    }

    /**
     * Extrae y elimina el elemento superior de la pila.
     *
     * @param stack la pila de donde se extraerá el elemento.
     * @param <T> el tipo del elemento.
     * @return el elemento superior de la pila, o null si la pila está vacía.
     */
    public static <T> T pop(Stack<T> stack) {
        return stack.isEmpty() ? null : stack.pop();
    }

    /**
     * Obtiene el elemento superior de la pila sin eliminarlo.
     *
     * @param stack la pila de donde se obtendrá el elemento.
     * @param <T> el tipo del elemento.
     * @return el elemento superior de la pila, o null si la pila está vacía.
     */
    public static <T> T peek(Stack<T> stack) {
        return stack.isEmpty() ? null : stack.peek();
    }

    /**
     * Verifica si la pila está vacía.
     *
     * @param stack la pila a verificar.
     * @param <T> el tipo del elemento.
     * @return true si la pila está vacía, false en caso contrario.
     */
    public static <T> boolean isEmpty(Stack<T> stack) {
        return stack.isEmpty();
    }

    // Métodos para manejo de Colas (Queues)

    /**
     * Inserta un elemento en la cola.
     *
     * @param queue la cola donde se insertará el elemento.
     * @param elemento el elemento a insertar.
     * @param <T> el tipo del elemento.
     */
    public static <T> void enqueue(Queue<T> queue, T elemento) {
        queue.add(elemento);
    }

    /**
     * Extrae y elimina el primer elemento de la cola.
     *
     * @param queue la cola de donde se extraerá el elemento.
     * @param <T> el tipo del elemento.
     * @return el primer elemento de la cola, o null si la cola está vacía.
     */
    public static <T> T dequeue(Queue<T> queue) {
        return queue.poll();
    }

    /**
     * Obtiene el primer elemento de la cola sin eliminarlo.
     *
     * @param queue la cola de donde se obtendrá el elemento.
     * @param <T> el tipo del elemento.
     * @return el primer elemento de la cola, o null si la cola está vacía.
     */
    public static <T> T peek(Queue<T> queue) {
        return queue.peek();
    }

    /**
     * Verifica si la cola está vacía.
     *
     * @param queue la cola a verificar.
     * @param <T> el tipo del elemento.
     * @return true si la cola está vacía, false en caso contrario.
     */
    public static <T> boolean isEmpty(Queue<T> queue) {
        return queue.isEmpty();
    }
}
