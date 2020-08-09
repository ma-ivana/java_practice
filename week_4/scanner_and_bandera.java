package clase_4;

import java.util.Scanner;

public class Clase_4 {

    public static void main(String[] args) {
        
        /*int contador = 0;
        while (contador <10) {
            System.out.println("Estoy en la vuelta n.º " + contador);
            
            contador = contador + 1;
        }*/
        
        //ejercicio con centinela
        boolean bandera = true;
        
        while (bandera == true) {
            System.out.println("El valor de la variable es " + bandera);
            
            //vamos a ingresar número por teclado
            
            System.out.println("Ingrese un número por teclado");
            
            Scanner teclado = new Scanner(System.in); //creo mi "scanneador"
            int tecla = teclado.nextInt(); //acá guardo el número que ingresó el usuario
            
            if (tecla == 1) {
                bandera = false; //acá cambió el valor de mi bandera si el usuario ingresa un 1
            }
            
        }
        
        System.out.println("Salimos del while porque la bandera vale " + bandera) ;
    }
    
}
