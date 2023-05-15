/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.awt.Color;

/**
 *
 * @author Jesus
 */
public class Tablero {

    private int filas;
    private int columnas;
    private int[][] jugadas;
    boolean cuadroCompleto;

    public Tablero(int filas, int columnas) {
        this.filas = filas;
        this.columnas = columnas;
        jugadas = new int[filas][columnas];
    }


    public void realizarJugada(int fila, int columna, Jugador jugador) {
        jugadas[fila][columna] = jugador.getId();
    }

    public boolean hayJugadaEn(int fila, int columna) {
        return jugadas[fila][columna] != 0;
    }

    public Jugador obtenerJugadorJugada(int fila, int columna, Jugador[] jugadores) {
        int jugadorId = jugadas[fila][columna];
        return jugadores[jugadorId - 1];
    }

    // Otros métodos y atributos de la clase Tablero...
    public int getFilas() {
        return filas;
    }

    public int getColumnas() {
        return columnas;
    }
}
