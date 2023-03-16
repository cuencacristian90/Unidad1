/*
Dada una cantidad de grados centígrados se debe mostrar su
equivalente en grados Fahrenheit. La fórmula correspondiente es: F = 32
+ (9 * C / 5).
 */
package u1ej1;

import java.util.Scanner;

/**
 *
 * @author ccuenca
 */
public class ej4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese los grados centigrados");
        float grados=leer.nextFloat();
        grados= 32+(9* grados/5);
        System.out.println("los grados Farenheit son: "+grados);
        // TODO code application logic here
    }
    
}
