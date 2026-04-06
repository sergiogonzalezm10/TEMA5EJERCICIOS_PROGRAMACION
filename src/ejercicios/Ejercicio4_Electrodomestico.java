public class Ejercicio4_Electrodomestico {

    protected double precioBase;
    protected String color;
    protected char consumoEnergetico;
    protected double peso;

    // Constructor con precio y peso
    public Ejercicio4_Electrodomestico(double precioBase, double peso) {
        this.precioBase = precioBase;
        this.peso = peso;
        this.color = "blanco";
        this.consumoEnergetico = 'F';
    }

    // Constructor con todos los atributos
    public Ejercicio4_Electrodomestico(double precioBase, String color, char consumoEnergetico, double peso) {
        this.precioBase = precioBase;
        this.peso = peso;
        this.color = comprobarColor(color);
        this.consumoEnergetico = comprobarConsumoEnergetico(consumoEnergetico);
    }

    // Getters y Setters
    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = comprobarColor(color);
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = comprobarConsumoEnergetico(consumoEnergetico);
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    // Comprueba que la letra de consumo es válida (A-F), si no usa F por defecto
    private char comprobarConsumoEnergetico(char letra) {
        letra = Character.toUpperCase(letra);
        if (letra == 'A' || letra == 'B' || letra == 'C' || letra == 'D' || letra == 'E' || letra == 'F') {
            return letra;
        }
        return 'F';
    }

    // Comprueba que el color es válido, si no usa blanco por defecto
    private String comprobarColor(String color) {
        if (color == null) {
            return "blanco";
        }
        String c = color.toLowerCase();
        if (c.equals("blanco") || c.equals("negro") || c.equals("rojo") || c.equals("azul") || c.equals("gris")) {
            return c;
        }
        return "blanco";
    }

    // Calcula el precio final según consumo energético y peso
    public double precioFinal() {
        double precio = precioBase;

        // Incremento por consumo energético
        if (consumoEnergetico == 'A') {
            precio += 100;
        } else if (consumoEnergetico == 'B') {
            precio += 80;
        } else if (consumoEnergetico == 'C') {
            precio += 60;
        } else if (consumoEnergetico == 'D') {
            precio += 50;
        } else if (consumoEnergetico == 'E') {
            precio += 30;
        } else if (consumoEnergetico == 'F') {
            precio += 10;
        }

        // Incremento por tamaño (peso)
        if (peso >= 80) {
            precio += 100;
        } else if (peso >= 50) {
            precio += 80;
        } else if (peso >= 20) {
            precio += 50;
        } else {
            precio += 10;
        }

        return precio;
    }

    public String toString() {
        return "Electrodomestico [precioBase=" + precioBase + ", color=" + color
                + ", consumo=" + consumoEnergetico + ", peso=" + peso + "]";
    }
}
