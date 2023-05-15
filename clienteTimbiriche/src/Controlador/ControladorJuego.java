/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import java.net.*;
import java.io.*;import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ControladorJuego {
    private Socket socket;
    private BufferedReader entrada;
    private PrintWriter salida;

    public ControladorJuego(String direccionServidor, int puerto) {
        try {
            // Conexión al servidor
            socket = new Socket(direccionServidor, puerto);

            // Obtener flujos de entrada y salida
            entrada = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            salida = new PrintWriter(socket.getOutputStream(), true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void iniciarJuego() {
        try {
            // Envío de mensaje al servidor
            salida.println("INICIAR_JUEGO");

            // Recepción de respuesta del servidor
            String respuesta = entrada.readLine();
            System.out.println("Respuesta del servidor: " + respuesta);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void realizarJugada(int fila, int columna) {
        try {
            // Envío de mensaje al servidor con la jugada
            salida.println("REALIZAR_JUGADA " + fila + " " + columna);

            // Recepción de respuesta del servidor
            String respuesta = entrada.readLine();
            System.out.println("Respuesta del servidor: " + respuesta);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void cerrarConexion() {
        try {
            // Cierre de los flujos y el socket
            entrada.close();
            salida.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


