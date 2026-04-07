package ejercicios;

// Clase abstracta Poligono
abstract class Ejercicio5_Poligono {

    protected int numeroLados;

    // Constructor con parametros
    public Ejercicio5_Poligono(int numeroLados) {
        this.numeroLados = numeroLados;
    }

    // Getter
    public int getNumeroLados() {
        return numeroLados;
    }

    // Metodo abstracto para el area
    public abstract double area();

    // Metodo toString basico
    public String toString() {
        return "Numero de lados: " + numeroLados;
    }
}