/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Jesus
 */
public class Movimiento {
    

    private int fila;
    private int columna;
    private Jugador jugador;

    public Movimiento(int fila, int columna, Jugador jugador) {
        this.fila = fila;
        this.columna = columna;
        this.jugador = jugador;
    }

    public int getFila() {
        return fila;
    }

    public int getColumna() {
        return columna;
    }

    public Jugador getJugador() {
        return jugador;
    }
}

    
    
