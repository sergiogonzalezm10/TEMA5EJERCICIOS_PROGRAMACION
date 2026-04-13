package ejerciciosinterfacesanalisis;

//Superclase abstracta para todos los objetos de la biblioteca
public abstract class Ejercicio5_Ficha {

 protected int    id;
 protected String titulo;

 // Constructor con identificador y título
 public Ejercicio5_Ficha(int id, String titulo) {
     this.id     = id;
     this.titulo = titulo;
 }

 // Getters y setters
 public int    getId()              { return id; }
 public String getTitulo()          { return titulo; }
 public void   setTitulo(String t)  { this.titulo = t; }

 // Cada subclase indica cuántos días se puede prestar
 public abstract int prestar();

 @Override
 public String toString() {
     return "[ID: " + id + "] " + titulo
          + " | Días de préstamo: " + prestar();
 }
}
