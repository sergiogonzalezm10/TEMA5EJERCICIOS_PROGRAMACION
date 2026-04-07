package ejercicios;

import java.util.ArrayList;
import java.util.Scanner;

// Clase principal
public class Ejercicio5_Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        ArrayList<Ejercicio5_Poligono> lista = new ArrayList<>();
        int opcion = 0;

        // Bucle del menu
        while (opcion != 3) {

            System.out.println("\n1. Introducir triangulo");
            System.out.println("2. Introducir rectangulo");
            System.out.println("3. Mostrar poligonos");

            opcion = sc.nextInt();

            if (opcion == 1) {
                introducirTriangulo(lista);
            }

            if (opcion == 2) {
                introducirRectangulo(lista);
            }

            if (opcion == 3) {
                mostrar(lista);
            }
        }
    }

    // Funcion para crear triangulo
    public static void introducirTriangulo(ArrayList<Ejercicio5_Poligono> lista) {

        System.out.println("Lado 1:");
        double l1 = sc.nextDouble();

        System.out.println("Lado 2:");
        double l2 = sc.nextDouble();

        System.out.println("Lado 3:");
        double l3 = sc.nextDouble();

        Ejercicio5_Triangulo t = new Ejercicio5_Triangulo(l1, l2, l3);
        lista.add(t);
    }

    // Funcion para crear rectangulo
    public static void introducirRectangulo(ArrayList<Ejercicio5_Poligono> lista) {

        System.out.println("Lado 1:");
        double l1 = sc.nextDouble();

        System.out.println("Lado 2:");
        double l2 = sc.nextDouble();

        Ejercicio5_Rectangulo r = new Ejercicio5_Rectangulo(l1, l2);
        lista.add(r);
    }

    // Funcion para mostrar datos
    public static void mostrar(ArrayList<Ejercicio5_Poligono> lista) {

        int i = 0;

        while (i < lista.size()) {
            System.out.println(lista.get(i).toString());
            System.out.println("Area: " + lista.get(i).area());
            i++;
        }
    }
}