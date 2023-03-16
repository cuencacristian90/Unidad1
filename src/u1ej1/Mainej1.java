/*
Escribir un programa que pida dos números enteros por teclado y calcule
la suma de los dos. El programa deberá después mostrar el resultado de
la suma
 */
package u1ej1;

import java.util.Scanner;

/**
 *
 * @author ccuenca
 */
public class Mainej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1,num2,suma;
        Scanner leer= new Scanner(System.in);
        System.out.println("Ingrese dos nros");
        num1= leer.nextInt();
        num2= leer. nextInt();
        suma= num1 + num2;
        System.out.println("Su resultado es: " + suma);
    }
    
}
