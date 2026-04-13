package ejerciciosinterfacesanalisis;

//Superclase abstracta que representa cualquier contacto de la agenda
public abstract class Ejercicio7_Contacto {

 protected String nombre;
 protected String telefono;

 // Constructor con nombre y teléfono
 public Ejercicio7_Contacto(String nombre, String telefono) {
     this.nombre   = nombre;
     this.telefono = telefono;
 }

 // Getters y setters
 public String getNombre()           { return nombre; }
 public String getTelefono()         { return telefono; }
 public void   setTelefono(String t) { this.telefono = t; }

 // Dos contactos son iguales si tienen el mismo nombre (sin distinguir mayúsculas)
 @Override
 public boolean equals(Object o) {
     if (this == o) return true;
     if (!(o instanceof Ejercicio7_Contacto)) return false;
     Ejercicio7_Contacto otro = (Ejercicio7_Contacto) o;
     return this.nombre.equalsIgnoreCase(otro.nombre);
 }

 @Override
 public int hashCode() {
     return nombre.toLowerCase().hashCode();
 }

 @Override
 public String toString() {
     return nombre + " | Tel: " + telefono;
 }
}
