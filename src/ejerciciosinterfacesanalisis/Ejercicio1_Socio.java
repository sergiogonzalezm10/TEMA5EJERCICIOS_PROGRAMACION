package ejerciciosinterfacesanalisis;

//Clase Socio que implementa Comparable para ordenar por id
public class Ejercicio1_Socio implements Comparable<Ejercicio1_Socio> {

 private int id;
 private String nombre;
 private int edad;

 // Constructor con parámetros
 public Ejercicio1_Socio(int id, String nombre, int edad) {
     this.id = id;
     this.nombre = nombre;
     this.edad = edad;
 }

 // Compara socios por id de forma creciente
 @Override
 public int compareTo(Ejercicio1_Socio otro) {
     return Integer.compare(this.id, otro.id);
 }

 @Override
 public String toString() {
     return "Socio{id=" + id + ", nombre='" + nombre + "', edad=" + edad + "}";
 }
}