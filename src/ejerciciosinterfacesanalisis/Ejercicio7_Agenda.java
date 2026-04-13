package ejerciciosinterfacesanalisis;

import java.util.ArrayList;

//Clase que gestiona la lista de contactos de la agenda
public class Ejercicio7_Agenda {

 private ArrayList<Ejercicio7_Contacto> contactos;

 // Constructor: agenda vacía
 public Ejercicio7_Agenda() {
     this.contactos = new ArrayList<>();
 }

 // Añade un contacto si no existe ya uno con el mismo nombre
 public void addContacto(Ejercicio7_Contacto c) {
     if (contactos.contains(c)) {
         System.out.println("Ya existe un contacto con el nombre: " + c.getNombre());
     } else {
         contactos.add(c);
         System.out.println("Contacto añadido: " + c.getNombre());
     }
 }

 // Elimina un contacto por nombre
 public void borrarContacto(String nombre) {
     for (int i = 0; i < contactos.size(); i++) {
         if (contactos.get(i).getNombre().equalsIgnoreCase(nombre)) {
             contactos.remove(i);
             System.out.println("Contacto eliminado: " + nombre);
             return;
         }
     }
     System.out.println("No se encontró ningún contacto con ese nombre.");
 }

 // Busca y devuelve un contacto por nombre, o null si no existe
 public Ejercicio7_Contacto buscarContacto(String nombre) {
     for (Ejercicio7_Contacto c : contactos) {
         if (c.getNombre().equalsIgnoreCase(nombre)) {
             return c;
         }
     }
     return null;
 }

 // Muestra todos los contactos de la agenda
 public void listarContactos() {
     if (contactos.isEmpty()) {
         System.out.println("La agenda está vacía.");
     } else {
         System.out.println("--- Agenda (" + contactos.size() + " contactos) ---");
         for (Ejercicio7_Contacto c : contactos) {
             System.out.println(c);
         }
     }
 }

 @Override
 public String toString() {
     return "Agenda con " + contactos.size() + " contacto(s).";
 }
}