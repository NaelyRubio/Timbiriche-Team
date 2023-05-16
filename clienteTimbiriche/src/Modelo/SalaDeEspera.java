/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.ArrayList;
import java.util.List;

public class SalaDeEspera {
    private List<Jugador> jugadores;
    private boolean partidaIniciada;

    public SalaDeEspera() {
        this.jugadores = new ArrayList<>();
        this.partidaIniciada = false;
    }

    public synchronized void agregarJugador(Jugador jugador) {
        jugadores.add(jugador);
        if (jugadores.size() >= 2 && !partidaIniciada) {
            partidaIniciada = true;
            iniciarPartida();
        }
    }

    public synchronized void removerJugador(Jugador jugador) {
        jugadores.remove(jugador);
    }

    private void iniciarPartida() {
        // Lógica para iniciar la partida
        System.out.println("¡La partida ha comenzado!");
    }
}



    


