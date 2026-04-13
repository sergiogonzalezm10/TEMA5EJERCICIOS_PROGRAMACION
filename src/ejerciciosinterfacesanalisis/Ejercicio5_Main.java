package ejerciciosinterfacesanalisis;

//Clase principal para probar la biblioteca
public class Ejercicio5_Main {

 public static void main(String[] args) {

     Ejercicio5_Libro   libro   = new Ejercicio5_Libro(1, "El Quijote", "Miguel de Cervantes", "Planeta");
     Ejercicio5_Revista revista = new Ejercicio5_Revista(2, "National Geographic", 320, 2024);
     Ejercicio5_DVD     dvd     = new Ejercicio5_DVD(3, "Interstellar", "Christopher Nolan", 2014, "película");

     System.out.println("--- Objetos de la biblioteca ---");
     System.out.println(libro);
     System.out.println(revista);
     System.out.println(dvd);

     // Polimorfismo: recorremos todo como Ficha
     System.out.println("\n--- Días de préstamo ---");
     Ejercicio5_Ficha[] fichas = {libro, revista, dvd};
     for (Ejercicio5_Ficha f : fichas) {
         System.out.println(f.getTitulo() + " → " + f.prestar() + " días");
     }
 }
}
