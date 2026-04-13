package ejerciciosinterfacesanalisis;

//Clase abstracta que implementa Vivir y define el comportamiento común
//de todos los animales domésticos
public abstract class Ejercicio3_AnimalDomestico implements Ejercicio3_Vivir {

 protected String nombre;
 protected String raza;
 protected double peso;
 protected String color;

 // Constructor con parámetros
 public Ejercicio3_AnimalDomestico(String nombre, String raza, double peso, String color) {
     this.nombre = nombre;
     this.raza   = raza;
     this.peso   = peso;
     this.color  = color;
 }

 // Comportamiento igual para todos los animales domésticos
 @Override
 public void comer() {
     System.out.println(nombre + " está comiendo.");
 }

 @Override
 public void dormir() {
     System.out.println(nombre + " está durmiendo.");
 }

 public void vacunar() {
     System.out.println(nombre + " ha sido vacunado/a.");
 }

 // Cada subclase define su propia versión de estos métodos
 @Override
 public abstract void hacerRuido();

 public abstract boolean hacerCaso();
}