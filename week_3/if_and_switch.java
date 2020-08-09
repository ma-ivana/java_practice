package pruebaif;
public class PruebaIF {
    public static void main(String[] args) {
    //prueba de la estructura if con dos bloques
    
        int suma = 0;
        int num = 1;
        int resta = 0;
        String bloqueif = "NINGUNO";

        //pregunto si mi nro es mayor a 3

        if (num > 3) {
            suma = num + num;
            System.out.println("El número es mayor a 3");
           bloqueif = "IF";
        }
        else {
            
            if (num == 1) {
                System.out.println("El número ingresado es un 1");
            }
            else {
                System.out.println("El número ingresado es menor a 3, pero NO es un 1");
            }
        }
        
        
    //caso switch
    int dia = 99;
    String nombreDia;
    
    switch (dia) {    
    case 1: nombreDia = "Lunes";
    break;
    case 2: nombreDia = "Martes";
    break;
    case 3: nombreDia = "Miércoles";
    break;
    case 4: nombreDia = "Jueves";
    break;
    case 5: nombreDia = "Viernes";
    break;
    case 6: nombreDia = "Sábado";
    break;
    case 7: nombreDia = "Domingo";
    break;
    default: nombreDia = "Día ingresado incorrecto";
    break;
   
}
    System.out.println("El día de la semana seleccionado es el: " + nombreDia);
}

}
