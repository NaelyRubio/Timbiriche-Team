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
    protected int[][] puntos;
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
    
    
}
