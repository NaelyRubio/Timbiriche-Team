/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.awt.Color;
import java.awt.List;

/**
 *
 * @author naely
 * */

 public class Juego {
     
    private Tablero tablero;
    private Jugador jugador1;
    private Jugador jugador2;
    private Jugador jugadorActual;

    public Juego() {
        jugador1 = new Jugador("Jugador 1");
        jugador2 = new Jugador("Jugador 2");
        jugadorActual = jugador1;
    }

    public Juego(Tablero tablero, Jugador jugador1, Jugador jugador2, Jugador jugadorActual) {
        this.tablero = tablero;
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
        this.jugadorActual = jugadorActual;
    }

    
    public void realizarJugada(int fila, int columna) {
        if (tablero.hayJugadaEn(fila, columna)) {
            // Si ya hay una jugada en la posición seleccionada, no hacer nada
            return;
        }

        tablero.realizarJugada(fila, columna, jugadorActual);
        cambiarJugador();
    }

    private void cambiarJugador() {
        jugadorActual = (jugadorActual == jugador1) ? jugador2 : jugador1;
    }

    public Tablero getTablero() {
        return tablero;
    }

    public Jugador getJugador1() {
        return jugador1;
    }

    public Jugador getJugador2() {
        return jugador2;
    }

    public Jugador getJugadorActual() {
        return jugadorActual;
    }
}


