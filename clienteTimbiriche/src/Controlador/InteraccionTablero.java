/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Tablero;

/**
 *
 * @author Jesus
 */
public class InteraccionTablero {
    public int setTamTablero(int opcion){
        switch (opcion){
            case 0:
                return 10;
            case 1:
                return 20;
            case 2:
                return 30;
        }
        return 0;
                
    }
    
}
