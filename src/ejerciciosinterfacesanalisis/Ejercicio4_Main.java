package ejerciciosinterfacesanalisis;

import java.util.Scanner;

//Clase principal con la simulación del turismo
public class Ejercicio4_Main {

 public static void main(String[] args) {

     Scanner teclado = new Scanner(System.in);

     System.out.print("Introduce la velocidad objetivo (km/h): ");
     int velocidadObjetivo = teclado.nextInt();

     System.out.print("Introduce el tiempo de espera en esa velocidad (segundos): ");
     int tiempoEspera = teclado.nextInt();

     // Creamos el turismo en reposo
     Ejercicio4_Turismo coche = new Ejercicio4_Turismo(
             "Seat", "Ibiza", "Rojo", "1234ABC", 5, "particular");

     System.out.println("\n--- Estado inicial ---");
     System.out.println(coche);

     // Arrancamos y metemos 1ª
     System.out.println("\n--- Arrancando ---");
     coche.arrancar();
     coche.subirMarcha();

     // Subimos velocidad y ajustamos marcha hasta llegar al objetivo
     System.out.println("\n--- Acelerando hasta " + velocidadObjetivo + " km/h ---");
     int velocidad = 0;
     while (velocidad < velocidadObjetivo) {
         velocidad += 10;
         if (velocidad > velocidadObjetivo) velocidad = velocidadObjetivo;
         coche.setVelocidadActual(velocidad);
         ajustarMarcha(coche);
         System.out.println("Velocidad: " + velocidad + " km/h | Marcha: " + coche.getMarchaActual() + "ª");
     }

     // Esperamos el tiempo indicado
     System.out.println("\n--- Manteniendo " + velocidadObjetivo + " km/h durante " + tiempoEspera + " segundos ---");
     try {
         Thread.sleep(tiempoEspera * 1000L);
     } catch (InterruptedException e) {
         System.out.println("Espera interrumpida.");
     }
     System.out.println("Tiempo finalizado.");

     // Desaceleramos bajando velocidad y marchas
     System.out.println("\n--- Desacelerando ---");
     while (velocidad > 0) {
         velocidad -= 10;
         if (velocidad < 0) velocidad = 0;
         coche.setVelocidadActual(velocidad);
         ajustarMarcha(coche);
         System.out.println("Velocidad: " + velocidad + " km/h | Marcha: " + coche.getMarchaActual() + "ª");
     }

     // Punto muerto y motor apagado
     System.out.println("\n--- Punto muerto y apagando motor ---");
     coche.parar();

     System.out.println("\n--- Estado final ---");
     System.out.println(coche);

     teclado.close();
 }

 // Ajusta la marcha según la velocidad actual
 // Rangos: 1ª 0-30 | 2ª 30-50 | 3ª 50-70 | 4ª 70-100 | 5ª 100+
 private static void ajustarMarcha(Ejercicio4_Turismo coche) {
     int vel = coche.getVelocidadActual();
     int marchaCorrecta;

     if      (vel <= 0)   marchaCorrecta = 0;
     else if (vel <= 30)  marchaCorrecta = 1;
     else if (vel <= 50)  marchaCorrecta = 2;
     else if (vel <= 70)  marchaCorrecta = 3;
     else if (vel <= 100) marchaCorrecta = 4;
     else                 marchaCorrecta = 5;

     while (coche.getMarchaActual() < marchaCorrecta) coche.subirMarcha();
     while (coche.getMarchaActual() > marchaCorrecta && marchaCorrecta > 0) coche.bajarMarcha();
 }
}