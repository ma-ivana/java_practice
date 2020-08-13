package guia2.ej_2_1;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;


/*Una pequeña despensa desea calcular los sueldos de sus empleados. Los puestos
de los mismos pueden tener 3 categorías: 1- repositor, 2-cajero y 3-supervisor.
a) Los repositores cobran $15.890 + un bono de 10%.
b) Los cajeros cobran $25.630,89 fijos.
c) Los supervisores cobran $35.560,20 en bruto al cual se les descuenta un 11%
de jubilación.
Se necesita un programa que, dependiendo el tipo de empleado del que se trate,
calcule y muestre en pantalla el correspondiente sueldo.*/


public class Guia2Ej_2_1 {

    public static void main(String[] args) {
                
        int categoria = 0;
        String tipo = "";
        Double sueldo = 0.0;
             
                        
        Scanner teclado = new Scanner(System.in);
        
        while (categoria != 4) {
            System.out.println("Ingrese el tipo de empleado (1, 2, 3 o '4' para salir");
            categoria = teclado.nextInt();
            
            switch (categoria){
                case 1: tipo = "repositor";
                        sueldo = 15890.0 + ((15890.0 * 10) / 100);
                        BigDecimal formatSueldo = new BigDecimal(sueldo);
                        formatSueldo = formatSueldo.setScale(2, RoundingMode.UP);
                        System.out.println("El empleado es de categoría: " + tipo + " y su sueldo es de: $" + formatSueldo);
                        break;
                case 2: tipo = "cajero";
                        sueldo = 25630.89;
                        BigDecimal formatSueldo2 = new BigDecimal(sueldo);
                        formatSueldo2 = formatSueldo2.setScale(2, RoundingMode.UP);
                        System.out.println("El empleado es de categoría: " + tipo + " y su sueldo es de: $" + formatSueldo2);
                        break;
                case 3: tipo = "supervisor";
                        sueldo = 35560.20 - ((35560.20 * 11) / 100);
                        BigDecimal formatSueldo3 = new BigDecimal(sueldo);
                        formatSueldo3 = formatSueldo3.setScale(2, RoundingMode.UP);
                        System.out.println("El empleado es de categoría: " + tipo + " y su sueldo es de: $" + formatSueldo3);
                        break;
                case 4: break;
                default: 
                    System.out.println("El número ingresado no es correcto. Inténtelo otra vez.");
            }            
        }       
    } 
}
