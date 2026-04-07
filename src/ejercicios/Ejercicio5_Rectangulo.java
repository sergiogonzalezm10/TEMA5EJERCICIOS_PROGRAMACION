package ejercicios;

// Clase Rectangulo
class Ejercicio5_Rectangulo extends Ejercicio5_Poligono {

    private double lado1;
    private double lado2;

    // Constructor por defecto
    public Ejercicio5_Rectangulo() {
        super(4);
        this.lado1 = 1;
        this.lado2 = 1;
    }

    // Constructor con parametros
    public Ejercicio5_Rectangulo(double lado1, double lado2) {
        super(4);
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    // Getters y setters
    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    // Calculo del area
    public double area() {
        return lado1 * lado2;
    }

    // toString
    public String toString() {
        return "Rectangulo -> lado1: " + lado1 + ", lado2: " + lado2;
    }
}