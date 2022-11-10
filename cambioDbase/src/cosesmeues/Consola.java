/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cosesmeues;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author user
 */
public class Consola {

    public static void main(String[] args) {

    }

    /**
     * lee una cadena de texto de teclado.
     *
     * @returnla cadena leída
     * @throwsIOException
     */
    public static String lligText() throws IOException {
        BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
        return lector.readLine();
    }

    /**
     * lee un entero de teclado. el proceso de lectura se repite mientras el
     * valor no sea un entero
     * @returnel número leído
     * @throwsIOException
     */
    public static int lligEnter() throws IOException {
        BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
        boolean incorrecto = true;
        do {
            try {
                int valor = Integer.parseInt(lector.readLine());
                return valor;
            } catch (NumberFormatException ex) {
            }
        } while (incorrecto);
        return -1;

    }
}
