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
    private Jugador jugador;
    private Tablero tablero;
    private int fila;
    private int columna;

    public Jugador getJugador() {
        return jugador;
    }

    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public int getColumna() {
        return columna;
    }

    public void setColumna(int columna) {
        this.columna = columna;
    }
    
    public boolean valido(){
        if (jugador.isTurno()==true) {
            if (tablero.isCuadroCompleto()==false) {
                if (tablero.puntos[getColumna()][getFila()]!=0) {
                    return true;
                }
            }
        }
        return false;
    }
}
