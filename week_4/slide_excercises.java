package clase4_ejercicios_slide;

import java.util.Scanner;

public class Clase4_Ejercicios_Slide {

    public static void main(String[] args) {
        
    /*Realizar un programa que muestre en pantalla los números del 1 al 35 (uno abajo del otro). Utilizar para esto alguna estructura repetitiva.*/

    int num = 0;
    while (num < 35) {
        num ++;
        System.out.println(num);
    }
    
    /*Realizar un programa que, dado por teclado un límite numérico (por ejemplo 100), muestre en pantalla todos los números hasa ese límite (empezando por 1).*/
    Scanner teclado = new Scanner(System.in);
    
    int numero = 1;
    System.out.println("Ingrese un límite para la cuenta: ");
    int limite = teclado.nextInt();
    while (numero < (limite + 1)) {
        System.out.println(numero);
        numero ++;
    }
    
    /*Realizar un programa que muestre por pantalla los números del 200 al 250, saltando de dos en dos. La secuencia debería ser: 200... 202... 204, etc.*/
    
    int inicial = 200;
    while (inicial < 251){
        System.out.println(inicial);
        inicial += 2;
    }
    
    /*Realizar un programa que lleve a cabo la cuenta regresiva para el año nuevo. La cuenta debe comenzar en 10 y terminar en 1.*/
    
    int nro = 10;
    while (nro > 0) {
        System.out.println(nro);
        nro--;
    }
        System.out.println("¡¡Y... finalmente, ceeeeero!!");
    
    /*Realizar un programa que muestre en pantalla palabras que se ingresen por teclado hasta que se ingrese la palabra "salir".*/
    
    String palabra = "";
   
    while (!palabra.equals("salir")) {
        System.out.println("Ingrese una palabra ('salir' para terminar):");
        palabra = teclado.next();
        
    }
    }
    
}
