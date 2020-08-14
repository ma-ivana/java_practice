/*
 Un gerente de una empresa prestadora de servicios de internet necesita un 
algoritmo que permita realizar el cálculo del monto a pagar de la factura 
de consumo de internet de 5 clientes de una empresa. Para ello, el algoritmo 
debe solicitar por teclado dos datos: Dni del cliente y tipo de servicio. 
Los tipos de servicio son 3:
1.  Internet 30 megas (cuyo valor es de $750 – 10% de descuento)
2.  Internet 50 megas (Cuyo valor es de $930 – 5% de descuento) 
3.  Internet 100 megas (Cuyo valor fijo es de $1200)
El algoritmo debe poder calcular el monto a pagar (dependiendo del tipo de 
servicio con el que cuente el cliente) e informar por pantalla el dni del 
mismo junto con el monto a pagar y el número de servicio con el que cuenta.
 */
package guia3_ejercicio_e;

import java.util.Scanner;

public class Guia3_ejercicio_e {

    public static void main(String[] args) {
        int cont = 0;
        String tipo_de_servicio = "";
        int dni = 0;
        int tipo = 0;
        Double monto = 0.0;
        Scanner teclado = new Scanner(System.in);
                
        while (cont <5) {
            System.out.println("Ingrese el DNI del cliente: ");
            dni = teclado.nextInt();
            System.out.println("Ingrese el tipo de servicio del cliente ('1', '2' o '3': ");
            tipo = teclado.nextInt();
            switch (tipo) {
                case 1: 
                    tipo_de_servicio = "Internet 30 megas";
                    monto = 750.00 - ((750.00 * 10) / 100);
                    System.out.println("Este es el detalle del cliente con el DNI: " + dni + ": ");
                    System.out.println("- Tipo de servicio: " + tipo);
                    System.out.println("- Descripción del servicio: " + tipo_de_servicio);
                    System.out.println("- Importe que debe abonar: $" + monto);
                    break;
                case 2: 
                    tipo_de_servicio = "Internet 50 megas";
                    monto = 930.00 - ((930.00 * 5) / 100);
                    System.out.println("Este es el detalle del cliente con el DNI: " + dni + ": ");
                    System.out.println("- Tipo de servicio: " + tipo);
                    System.out.println("- Descripción del servicio: " + tipo_de_servicio);
                    System.out.println("- Importe que debe abonar: $" + monto);
                    break;
                case 3: 
                    tipo_de_servicio = "Internet 100 megas";
                    monto = 1200.00;
                    System.out.println("Este es el detalle del cliente con el DNI: " + dni + ": ");
                    System.out.println("- Tipo de servicio: " + tipo);
                    System.out.println("- Descripción del servicio: " + tipo_de_servicio);
                    System.out.println("- Importe que debe abonar: $" + monto);
                    break;
                default:
                    System.out.println("El número ingresado no es correcto.");
                    break;
            }
            cont ++;
        }       
    }    
}
