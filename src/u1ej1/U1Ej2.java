/*
Escribir un programa que pida tu nombre, lo guarde en una variable y lo
muestre por pantalla.
 */
package u1ej1;

import java.util.Scanner;

/**
 *
 * @author ccuenca
 */
public class U1Ej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombre;
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese su nombre");
        nombre=leer.next();
        System.out.println("Su nombre es: "+ nombre);
    }
    
}
