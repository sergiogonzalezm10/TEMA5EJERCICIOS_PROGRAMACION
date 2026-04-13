package ejerciciosinterfacesanalisis;

import java.util.Arrays;

//Clase principal para probar la clase Futbolista
public class Ejercicio2_MainFutbolista {

 public static void main(String[] args) {

     // Tabla con 5 futbolistas (dos con la misma camiseta para probar el desempate)
     Ejercicio2_Futbolista[] tabla = {
         new Ejercicio2_Futbolista(10, "Messi",   36, 820),
         new Ejercicio2_Futbolista( 7, "Ronaldo", 39, 900),
         new Ejercicio2_Futbolista( 9, "Benzema", 36, 400),
         new Ejercicio2_Futbolista( 7, "Hazard",  33, 110),
         new Ejercicio2_Futbolista(11, "Salah",   32, 210)
     };

     // Ordenamos y mostramos
     Arrays.sort(tabla);
     System.out.println("--- Futbolistas ordenados ---");
     for (Ejercicio2_Futbolista f : tabla) {
         System.out.println(f);
     }
     // Camiseta 7 → Hazard antes que Ronaldo (orden alfabético)
 }
}