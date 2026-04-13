package ejerciciosinterfacesanalisis;

//Subclase Persona: añade fecha de cumpleaños
public class Ejercicio7_Persona extends Ejercicio7_Contacto {

 private String cumpleaños; // formato "dd/mm/aaaa"

 // Constructor completo
 public Ejercicio7_Persona(String nombre, String telefono, String cumpleaños) {
     super(nombre, telefono);
     this.cumpleaños = cumpleaños;
 }

 // Getters y setters
 public String getCumpleaños()           { return cumpleaños; }
 public void   setCumpleaños(String f)   { this.cumpleaños = f; }

 @Override
 public String toString() {
     return "Persona | " + super.toString()
          + " | Cumpleaños: " + cumpleaños;
 }
}