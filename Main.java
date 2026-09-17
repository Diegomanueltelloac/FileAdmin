/*Facultad de Ingeniería
 ISC
 Administracion de Archivos
Diego Manuel tello Ac
Sergio A Noh Puch
11/09/2026
*/ 

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;



public class Main {
    public static void main(String[] args) {
        Practica_01.ejecutar();
        try {
            Act_Stream.leer();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}