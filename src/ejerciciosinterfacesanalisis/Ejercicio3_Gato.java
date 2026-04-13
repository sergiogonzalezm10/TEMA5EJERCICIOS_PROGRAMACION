package ejerciciosinterfacesanalisis;

//Clase Gato: hereda de AnimalDomestico y añade su propio comportamiento
public class Ejercicio3_Gato extends Ejercicio3_AnimalDomestico {

 public Ejercicio3_Gato(String nombre, String raza, double peso, String color) {
     super(nombre, raza, peso, color);
 }

 // El gato maúlla
 @Override
 public void hacerRuido() {
     System.out.println(nombre + ": Miau...");
 }

 // El gato hace caso solo el 5% de las veces
 @Override
 public boolean hacerCaso() {
     boolean obedece = Math.random() < 0.05;
     System.out.println(nombre + (obedece ? " hace caso (¡sorpresa!)." : " te ignora olímpicamente."));
     return obedece;
 }

 // Método propio del gato
 public void toserBolaPelo() {
     System.out.println(nombre + " tose una bola de pelo. Qué asco.");
 }
}