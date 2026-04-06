public class Ejercicio4_Lavadora extends Ejercicio4_Electrodomestico {

    private double carga;

    // Constructor con precio y peso
    public Ejercicio4_Lavadora(double precioBase, double peso) {
        super(precioBase, peso);
        this.carga = 5;
    }

    // Constructor con todos los atributos
    public Ejercicio4_Lavadora(double precioBase, String color, char consumoEnergetico, double peso, double carga) {
        super(precioBase, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public double getCarga() {
        return carga;
    }

    public void setCarga(double carga) {
        this.carga = carga;
    }

    // Si la carga es mayor de 30 kg se añaden 50€, además de lo que calcule el padre
    public double precioFinal() {
        double precio = super.precioFinal();
        if (carga > 30) {
            precio += 50;
        }
        return precio;
    }

    public String toString() {
        return "Lavadora [precioBase=" + precioBase + ", color=" + color
                + ", consumo=" + consumoEnergetico + ", peso=" + peso
                + ", carga=" + carga + "]";
    }
}
