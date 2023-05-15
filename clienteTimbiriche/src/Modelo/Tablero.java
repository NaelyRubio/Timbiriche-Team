/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Jesus
 */
public class Tablero {
    protected int tamanioTablero;
    protected int puntos[][];
    protected boolean cuadroCompleto;

    public int getTamanioTablero() {
        return tamanioTablero;
    }

    public void setTamanioTablero(int tamanioTablero) {
        this.tamanioTablero = tamanioTablero;
    }

    public int[][] getPuntos() {
        return puntos;
    }

    public void setPuntos(int[][] puntos) {
        this.puntos = puntos;
    }

    public boolean isCuadroCompleto() {
        return cuadroCompleto;
    }

    public void setCuadroCompleto(boolean cuadroCompleto) {
        this.cuadroCompleto = cuadroCompleto;
    }

    boolean hayJugadaEn(int fila, int columna) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void realizarJugada(int fila, int columna, Jugador jugadorActual) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
