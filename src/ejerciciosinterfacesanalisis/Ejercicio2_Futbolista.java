package ejerciciosinterfacesanalisis;

//Clase Futbolista que implementa Comparable para ordenar por camiseta y nombre
public class Ejercicio2_Futbolista implements Comparable<Ejercicio2_Futbolista> {

 private int numeroCamiseta;
 private String nombre;
 private int edad;
 private int goles;

 // Constructor con parámetros
 public Ejercicio2_Futbolista(int numeroCamiseta, String nombre, int edad, int goles) {
     this.numeroCamiseta = numeroCamiseta;
     this.nombre = nombre;
     this.edad = edad;
     this.goles = goles;
 }

 // Dos futbolistas son iguales si tienen el mismo número de camiseta y nombre
 @Override
 public boolean equals(Object o) {
     if (this == o) return true;
     if (!(o instanceof Ejercicio2_Futbolista)) return false;
     Ejercicio2_Futbolista f = (Ejercicio2_Futbolista) o;
     return numeroCamiseta == f.numeroCamiseta && nombre.equals(f.nombre);
 }

 // Ordena primero por camiseta; si hay empate, por nombre alfabéticamente
 @Override
 public int compareTo(Ejercicio2_Futbolista otro) {
     int comparacionCamiseta = Integer.compare(this.numeroCamiseta, otro.numeroCamiseta);
     if (comparacionCamiseta != 0) {
         return comparacionCamiseta;
     }
     return this.nombre.compareTo(otro.nombre);
 }

 @Override
 public String toString() {
     return "Futbolista{#" + numeroCamiseta + ", " + nombre
             + ", edad=" + edad + ", goles=" + goles + "}";
 }
}