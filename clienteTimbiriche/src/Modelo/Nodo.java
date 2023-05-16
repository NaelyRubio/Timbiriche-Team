/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author naely
 */
public class Nodo {
    
    private Punto posicion;
    private boolean ocupado;
    private Jugador jugador;

    public Nodo(Punto posicion) {
        this.posicion = posicion;
        this.ocupado = false;
        this.jugador = null;
    }

    public Punto getPosicion() {
        return posicion;
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }

    public Jugador getJugador() {
        return jugador;
    }

    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }
}

