package ejerciciosinterfacesanalisis;

//Subclase Libro: añade autor y editorial
public class Ejercicio5_Libro extends Ejercicio5_Ficha {

 private static final int DIAS_PRESTAMO = 15;

 private String autor;
 private String editorial;

 // Constructor completo
 public Ejercicio5_Libro(int id, String titulo,
                          String autor, String editorial) {
     super(id, titulo);
     this.autor     = autor;
     this.editorial = editorial;
 }

 // Getters y setters
 public String getAutor()           { return autor; }
 public String getEditorial()       { return editorial; }
 public void   setAutor(String a)   { this.autor = a; }
 public void   setEditorial(String e) { this.editorial = e; }

 // Los libros se prestan 15 días
 @Override
 public int prestar() {
     return DIAS_PRESTAMO;
 }

 @Override
 public String toString() {
     return "Libro | " + super.toString()
          + " | Autor: "     + autor
          + " | Editorial: " + editorial;
 }
}
