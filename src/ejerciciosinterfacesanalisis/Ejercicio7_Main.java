package ejerciciosinterfacesanalisis;

//Clase principal para probar la agenda telefónica
public class Ejercicio7_Main {

 public static void main(String[] args) {

     Ejercicio7_Agenda agenda = new Ejercicio7_Agenda();

     // Añadimos personas y empresas
     agenda.addContacto(new Ejercicio7_Persona("Ana García",   "600111222", "15/03/1995"));
     agenda.addContacto(new Ejercicio7_Persona("Luis Martínez","611333444", "22/07/1988"));
     agenda.addContacto(new Ejercicio7_Empresa("Mercadona", "900200300", "www.mercadona.es"));
     agenda.addContacto(new Ejercicio7_Empresa("Apple", "900123456", "www.apple.com"));

     // Intentamos añadir uno duplicado
     agenda.addContacto(new Ejercicio7_Persona("Ana García", "999999999", "01/01/2000"));

     // Listamos todos los contactos
     System.out.println();
     agenda.listarContactos();

     // Buscamos un contacto
     System.out.println();
     Ejercicio7_Contacto encontrado = agenda.buscarContacto("Mercadona");
     if (encontrado != null) {
         System.out.println("Encontrado: " + encontrado);
     }

     // Borramos un contacto
     System.out.println();
     agenda.borrarContacto("Luis Martínez");
     agenda.listarContactos();
 }
}