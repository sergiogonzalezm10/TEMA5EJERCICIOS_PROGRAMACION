package ejerciciosinterfacesanalisis;

//Clase Perro: hereda de AnimalDomestico y añade su propio comportamiento
public class Ejercicio3_Perro extends Ejercicio3_AnimalDomestico {

 public Ejercicio3_Perro(String nombre, String raza, double peso, String color) {
     super(nombre, raza, peso, color);
 }

 // El perro ladra
 @Override
 public void hacerRuido() {
     System.out.println(nombre + ": ¡Guau guau!");
 }

 // El perro hace caso el 90% de las veces
 @Override
 public boolean hacerCaso() {
     boolean obedece = Math.random() < 0.90;
     System.out.println(nombre + (obedece ? " hace caso." : " no hace caso."));
     return obedece;
 }

 // Método propio del perro
 public void sacarPaseo() {
     System.out.println(nombre + " sale a pasear. ¡Qué feliz!");
 }
}