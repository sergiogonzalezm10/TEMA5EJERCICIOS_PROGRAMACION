public class Television extends Electrodomestico {

    private int resolucion;
    private boolean sintonizadorTDT;

    // Constructor con precio y peso
    public Television(double precioBase, double peso) {
        super(precioBase, peso);
        this.resolucion = 20;
        this.sintonizadorTDT = false;
    }

    // Constructor con todos los atributos
    public Television(double precioBase, String color, char consumoEnergetico,
                      double peso, int resolucion, boolean sintonizadorTDT) {
        super(precioBase, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }

    public void setSintonizadorTDT(boolean sintonizadorTDT) {
        this.sintonizadorTDT = sintonizadorTDT;
    }

    // Si resolución > 40 pulgadas se incrementa un 30%, y si tiene TDT se añaden 50€
    public double precioFinal() {
        double precio = super.precioFinal();
        if (resolucion > 40) {
            precio = precio * 1.30;
        }
        if (sintonizadorTDT) {
            precio += 50;
        }
        return precio;
    }

    public String toString() {
        return "Television [precioBase=" + precioBase + ", color=" + color
                + ", consumo=" + consumoEnergetico + ", peso=" + peso
                + ", resolucion=" + resolucion + ", TDT=" + sintonizadorTDT + "]";
    }
}
