/*
Escribir un programa que pida una frase y la muestre toda en mayúsculas
y después toda en minúsculas.
Nota: investigar la función toUpperCase() y toLowerCase() en Java.
 */
package u1ej1;

import java.util.Scanner;

/**
 *
 * @author ccuenca
 */
public class ej3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        String frase;
        System.out.println("Ingrese una frase que contenga minusculas");
        frase=leer.nextLine();
        System.out.println("a Mayuscula:");
        //frase = frase.toUpperCase();
        System.out.println(frase.toUpperCase());
        System.out.println("la frase en minuscula es: "+frase.toLowerCase());
    }
    
}
/*//Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda en minúsculas. 


package primer_y_segundo_encuentro;

import java.util.Scanner;

public class Tercer_ejercicio {
    
    public static void main(String[] args) {
        
        // creamos una variable de entrada de dato.
        Scanner entrada = new Scanner(System.in);
        
        // Creamos una variable de tipo String para alojar una frase.
        String frase ="";
        
        System.out.println("Por favor, ingrese una frase: ");
        frase = (entrada.nextLine());
        //  Mostramos la frase original.
        System.out.println(frase);
        
        // a traves de un metodo .sdjkldfkla() vamos a cambiar la funcionalidad de la variable.
        
        
        // Pasamos toda la frase a mayusculas. 
        frase = frase.toUpperCase();
        System.out.println(frase);
        // pasamos toda la frase a minusculas. 
        frase = frase.toLowerCase();
        System.out.println(frase);
        
        
        
    }
}
*/
