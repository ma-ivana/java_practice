/*Una mercería vende canutillos y mostacillas al por mayor mediante su página 
web. Como se trata de una mercería mayorista, solicita la cantidad de paquetes 
en cada venta y dependiendo de esta realiza los siguientes controles:
a)  Si la cantidad de productos es menor a 5: Se debe emitir un mensaje indicando 
que no se permiten compras inferiores a 5 productos.
b)  Si la cantidad de productos es mayor o igual a 5 pero menor o igual a 15: 
Se debe emitir un mensaje que el costo de envío es de $200.
c)  Si la cantidad de productos es mayor o igual a 5 y es mayor a 15: Se debe 
emitir un mensaje de que el envío es gratuito.
Realizar un programa para llevar a cabo los 3 controles citados. 
 */
package guia2.ej_2_2;

import java.util.Scanner;

public class Guia2Ej_2_2 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        int paquetes = 1;
        
        while (paquetes != 0) {
            System.out.println("Ingrese la cantidad de paquetes que desea comprar ('0' para finalizar):");
            paquetes = teclado.nextInt();
            if (paquetes > 0 && paquetes < 5) {
                System.out.println("No se permiten compras inferiores a 5 productos.");
            }
            else {
                if (paquetes >= 5 && paquetes <= 15) {
                    System.out.println("El costo de envío es igual a $200.");        
                }
                else {
                    if (paquetes >= 5 && paquetes > 15) {
                    System.out.println("El envío es gratuito.");
                    }
                    else {
                        if (paquetes != 0) {                    
                        System.out.println("El valor ingresado es incorrecto. Vuelva a intentar.");
                        }
                    }
                }
            }
        }            
    }    
}
