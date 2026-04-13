package ejerciciosinterfacesanalisis;

//Clase principal para probar la jerarquía de animales domésticos
public class Ejercicio3_MainAnimales {

 public static void main(String[] args) {

     // Creamos un perro y un gato
     Ejercicio3_Perro perro = new Ejercicio3_Perro("Rex",   "Pastor Alemán", 30.0, "marrón");
     Ejercicio3_Gato  gato  = new Ejercicio3_Gato ("Michi", "Siamés",         4.5, "blanco");

     // Probamos los métodos del perro
     System.out.println("--- Perro ---");
     perro.comer();
     perro.dormir();
     perro.hacerRuido();
     perro.hacerCaso();
     perro.vacunar();
     perro.sacarPaseo();

     // Probamos los métodos del gato
     System.out.println("\n--- Gato ---");
     gato.comer();
     gato.dormir();
     gato.hacerRuido();
     gato.hacerCaso();
     gato.vacunar();
     gato.toserBolaPelo();

     // Polimorfismo: tratamos ambos como AnimalDomestico
     System.out.println("\n--- Polimorfismo ---");
     Ejercicio3_AnimalDomestico[] animales = {perro, gato};
     for (Ejercicio3_AnimalDomestico animal : animales) {
         animal.hacerRuido();
         animal.hacerCaso();
     }
 }
}