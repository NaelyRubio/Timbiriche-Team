/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author Jesus
 */
public class Partida {
    private ArrayList<Jugador> jugadores;
    private int jugadoresListos;
    private Tablero tablero;
    
    public void iniciarJuego(){
        while(jugadoresListos<jugadores.size()){
            
        }
    }
    
    public void finalizarJuego(){
        if (tablero.cuadroCompleto==true) {
            
        }
    }
    
    public void agregarJugador(Jugador jugadorNuevo){
        boolean existe=false;
        for (int i = 0; i < jugadores.size(); i++) {
            if (jugadores.get(i).equals(jugadorNuevo)) {
                existe=true;
            }
        }
        if (existe==false) {
            jugadores.add(jugadorNuevo);
        }
    }
    
    public void removerJugador(Jugador jugador){
        for (int i = 0; i < jugadores.size(); i++) {
            if (jugadores.get(i).equals(jugador)) {
                jugadores.remove(i);
            }
        }
    }
}
