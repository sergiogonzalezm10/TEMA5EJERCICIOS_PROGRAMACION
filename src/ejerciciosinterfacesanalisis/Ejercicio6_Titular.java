package ejerciciosinterfacesanalisis;

//Clase auxiliar que representa a un titular de cuenta bancaria
public class Ejercicio6_Titular {

 private String dni;
 private String nombre;
 private String apellidos;
 private String telefono;

 // Constructor con todos los datos del titular
 public Ejercicio6_Titular(String dni, String nombre,
                            String apellidos, String telefono) {
     this.dni       = dni;
     this.nombre    = nombre;
     this.apellidos = apellidos;
     this.telefono  = telefono;
 }

 // Getters y setters
 public String getDni()              { return dni; }
 public String getNombre()           { return nombre; }
 public String getApellidos()        { return apellidos; }
 public String getTelefono()         { return telefono; }
 public void   setTelefono(String t) { this.telefono = t; }

 @Override
 public String toString() {
     return nombre + " " + apellidos
          + " (DNI: " + dni + ", Tel: " + telefono + ")";
 }
}