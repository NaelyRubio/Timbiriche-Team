/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Jesus
 */
public class Sala {
    public Jugador jugadores[];
    public Partida partida;
    
    public void seleccionarListo(Jugador jugador,int opcion){
        if (opcion==1) {
          jugador.setEstado("Listo");  
        }
        
    }
}
