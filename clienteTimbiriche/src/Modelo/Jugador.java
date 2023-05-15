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
public class Jugador {

    private String nombre;
    private Color color;
    private int puntuacion;

    public Jugador(String nombre) {
        this.nombre = nombre;
        this.color = color;
        this.puntuacion = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public Color getColor() {
        return color;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void aumentarPuntuacion() {
        puntuacion++;
    }

    int getId() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
