/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author naely
 */
public class Linea {
    
    private Punto puntoInicial;
    private Punto puntoFinal;
    private boolean completada;

    public Linea(Punto puntoInicial, Punto puntoFinal) {
        this.puntoInicial = puntoInicial;
        this.puntoFinal = puntoFinal;
        this.completada = false;
    }

    public Punto getPuntoInicial() {
        return puntoInicial;
    }

    public void setPuntoInicial(Punto puntoInicial) {
        this.puntoInicial = puntoInicial;
    }

    public Punto getPuntoFinal() {
        return puntoFinal;
    }

    public void setPuntoFinal(Punto puntoFinal) {
        this.puntoFinal = puntoFinal;
    }

    public boolean isCompletada() {
        return completada;
    }

    public void setCompletada(boolean completada) {
        this.completada = completada;
    }
}

