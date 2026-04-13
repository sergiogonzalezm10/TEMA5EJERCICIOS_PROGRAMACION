package ejerciciosinterfacesanalisis;

//Subclase DVD: añade director, año y tipo
public class Ejercicio5_DVD extends Ejercicio5_Ficha {

 private static final int DIAS_PRESTAMO = 5;

 private String director;
 private int    año;
 private String tipo; // "película", "documental" o "serie"

 // Constructor completo
 public Ejercicio5_DVD(int id, String titulo,
                       String director, int año, String tipo) {
     super(id, titulo);
     this.director = director;
     this.año      = año;
     this.tipo     = tipo;
 }

 // Getters y setters
 public String getDirector()          { return director; }
 public int    getAño()               { return año; }
 public String getTipo()              { return tipo; }
 public void   setDirector(String d)  { this.director = d; }
 public void   setAño(int a)          { this.año = a; }
 public void   setTipo(String t)      { this.tipo = t; }

 // Los DVD se prestan 5 días
 @Override
 public int prestar() {
     return DIAS_PRESTAMO;
 }

 @Override
 public String toString() {
     return "DVD | " + super.toString()
          + " | Director: " + director
          + " | Año: "      + año
          + " | Tipo: "     + tipo;
 }
}