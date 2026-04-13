package ejerciciosinterfacesanalisis;

import java.util.Arrays;

//Clase principal para probar la clase Socio
public class Ejercicio1_MainSocio {

 public static void main(String[] args) {

     // Creamos tres socios en orden desordenado
     Ejercicio1_Socio s1 = new Ejercicio1_Socio(3, "Ana",  30);
     Ejercicio1_Socio s2 = new Ejercicio1_Socio(1, "Luis", 25);
     Ejercicio1_Socio s3 = new Ejercicio1_Socio(2, "Eva",  28);

     // Comprobamos compareTo manualmente
     System.out.println("--- Comparaciones ---");
     System.out.println("s1 vs s2 (id 3 vs 1): " + s1.compareTo(s2)); // positivo
     System.out.println("s2 vs s3 (id 1 vs 2): " + s2.compareTo(s3)); // negativo
     System.out.println("s1 vs s1 (id 3 vs 3): " + s1.compareTo(s1)); // cero

     // Creamos un array y lo ordenamos
     Ejercicio1_Socio[] socios = {s1, s2, s3};
     Arrays.sort(socios);

     // Mostramos el resultado ordenado por id
     System.out.println("\n--- Array ordenado por id ---");
     for (Ejercicio1_Socio s : socios) {
         System.out.println(s);
     }
 }
}