package ejerciciosinterfacesanalisis;

//Subclase Revista: añade número y año de publicación
public class Ejercicio5_Revista extends Ejercicio5_Ficha {

 private static final int DIAS_PRESTAMO = 10;

 private int numero;
 private int año;

 // Constructor completo
 public Ejercicio5_Revista(int id, String titulo, int numero, int año) {
     super(id, titulo);
     this.numero = numero;
     this.año    = año;
 }

 // Getters y setters
 public int  getNumero()      { return numero; }
 public int  getAño()         { return año; }
 public void setNumero(int n) { this.numero = n; }
 public void setAño(int a)    { this.año = a; }

 // Las revistas se prestan 10 días
 @Override
 public int prestar() {
     return DIAS_PRESTAMO;
 }

 @Override
 public String toString() {
     return "Revista | " + super.toString()
          + " | Nº: "  + numero
          + " | Año: " + año;
 }
}