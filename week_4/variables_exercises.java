package ejercicio3_variables;
import java.util.Scanner;

public class Ejercicio3_Variables {

      public static void main(String[] args) {
        /*a) Un chico de primaria necesita realizar un algoritmo para dar valores a tres
números. Decidió llamar a las variables num1, num2 y num3 y colocarles los
valores 5, 3 y 7. Sin embargo, no sabe de qué tipos de datos deberían ser
sus tres variables ni tampoco como asignar dichos valores. Realizar un
programa que declare las variables y les asigne los valores que el chico
necesita para cumplir con su tarea.*/
        int num1 = 5;
        int num2 = 3;
        int num3 = 7;
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
                
        /*b) Una estudiante está dando sus primeros pasos en la programación y quiere
realizar un programa que permita calcular cualquier porcentaje de un número.
Para ello necesita que el usuario ingrese por teclado el número a calcular
el porcentaje (por ejemplo 2500) y también el porcentaje que se desea
calcular (por ejemplo si quiere calcular 10% debería ingresar 0,10). A
partir de estos valores, necesita que el algoritmo calcule el porcentaje
(multiplicar el primer número por el valor del porcentaje), lo guarde en
una variable y se muestre por pantalla. ¿Podrías ayudarla a realizar el
programa?*/
          
        Scanner teclado = new Scanner(System.in);
          System.out.println("Ingrese un número: ");
        int num = teclado.nextInt();
          System.out.println("Ingrese un porcentaje (si quiere calcular 10% debería ingresar 0,10): ");
        float porcentaje = teclado.nextFloat();
        //float porcentaje = 0.10f; -Para ingresar directamente un valor float, probar si es necesario punto o coma y agregar la f al final.
        float resultado = num * porcentaje;
        System.out.println("El porcentaje " + porcentaje + " del número " + num + " es: " + resultado);
        
        
        /*c) Un comerciante realiza 5 ventas por día. Necesita de un programa que le
permita ingresar por teclado los montos de las 5 ventas y luego sumar el
total de todas ellas para mostrar por pantalla el resultado. ¿Podrías
ayudarlo a realizar el programa?*/
        
        float venta;
        float ventas_totales = 0.0f;
        int contador = 0;
        while (contador <5) {
            System.out.println("Ingrese el valor de la venta n.º " + (contador+1) + " con coma para los decimales");
            venta = teclado.nextFloat();
            ventas_totales += venta;
            contador++;
        }
          System.out.println("El total de ventas es: " + ventas_totales);
          
        /*d) Realizar un programa que calcule el IVA de un producto. Para esto, el
usuario debe poder ingresar por teclado el valor del producto y el programa
debe informarle por pantalla qué monto equivale al IVA. Recordar que el IVA
es igual al 21% (0,21).*/
        
        System.out.println("Ingrese el valor del producto (decimales con coma): ");
        float producto = teclado.nextFloat();
        float iva = 0.21f;
        float resultado_iva = producto * iva;
          System.out.println("El resultado es: " + resultado_iva);
          
          
        /*e) Realizar un programa que permita a un profesor calcular el promedio de un
alumno. Para esto, el algoritmo debe permitir ingresar las 4 notas del
mismo(por ejemplo, 8, 7, 9.50 y 10), luego calcular el promedio de las
mismas y mostrar el resultado por pantalla. Se recuerda que el promedio es
la suma de todas las notas dividido la cantidad, en el ejemplo sería:
(8+7+9.50+10)/4.*/
        
        float nota;
        int contador_e = 0;
        float suma_notas = 0;
        float nota_final;
        while (contador_e < 4) {
            System.out.println("Ingrese la nota n.º" + (contador_e + 1));
            nota = teclado.nextFloat();
            suma_notas += nota;
            contador_e++;
        }
        nota_final = suma_notas / 4;
          System.out.println("La nota final es " + nota_final);
          
        /*f) Realizar un programa que permita calcular el área de un triángulo. Se
recuerda que la fórmula para calcular el área de un triángulo es: (base *
altura) / 2. Se debe permitir al usuario ingresar la base y la altura,
mientras que el programa debe calcular el área y mostrar el resultado por
pantalla.*/
        
        System.out.println("Ingrese la base del triángulo:");
        int base = teclado.nextInt();
        System.out.println("Ingrese la altura del triángulo:");
        int altura = teclado.nextInt();
        int area = (base * altura) * 2;
        System.out.println("El área del triángulo es: " + area);
          
       /*g) Realizar un programa que permita intercambiar el valor de dos variables.
Por ejemplo, si la variable1 vale 5 y la variable2 vale 12, hacer que la
variable1 valga 12 y la variable2 valga 5. Tener en cuenta que al asignar
un valor a una variable se sobrescribe el valor anterior.*/ 
       
       int var1 = 5;
       System.out.println("Variable 1 = " + var1);
       int var2 = 12;
       System.out.println("Variable 2 = " + var2);
       int var_intermedia = 0;
       var_intermedia = var2;
       var2 = var1;
       var1 = var_intermedia;
       System.out.println("Nueva variable 1 = " + var1);
       System.out.println("Nueva variable 2 = " + var2);
              
    }
    
}
