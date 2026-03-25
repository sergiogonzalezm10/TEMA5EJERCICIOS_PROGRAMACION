package ejercicios;

// Clase base con nombre y precio del producto
public class Ejercicio3_Producto {
    private String nombre;
    private double precio;

    public Ejercicio3_Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public double getPrecio() { return precio; }
    public void setPrecio(double precio) { this.precio = precio; }

    // Devuelve el precio total sin descuentos
    public double calcular(int cantidad) {
        return precio * cantidad;
    }

    @Override
    public String toString() {
        return "Producto{nombre='" + nombre + "', precio=" + precio + "}";
    }
}


// Producto con fecha de caducidad; aplica descuento según los días restantes
class Perecedero extends Ejercicio3_Producto {
    private int diasACaducar;

    public Perecedero(String nombre, double precio, int diasACaducar) {
        super(nombre, precio);
        this.diasACaducar = diasACaducar;
    }

    public int getDiasACaducar() { return diasACaducar; }
    public void setDiasACaducar(int diasACaducar) { this.diasACaducar = diasACaducar; }

    // Aplica el descuento sobre el total calculado por la superclase
    @Override
    public double calcular(int cantidad) {
        double total = super.calcular(cantidad);
        if (diasACaducar == 1)      total /= 4; // queda 1 día: precio entre 4
        else if (diasACaducar == 2) total /= 3; // quedan 2 días: precio entre 3
        else if (diasACaducar == 3) total /= 2; // quedan 3 días: precio entre 2
        return total;
    }

    @Override
    public String toString() {
        return "Perecedero{nombre='" + getNombre() + "', precio=" + getPrecio()
                + ", diasACaducar=" + diasACaducar + "}";
    }
}


// Producto sin caducidad con un tipo descriptivo; calcular() es igual que Producto
class NoPerecedero extends Ejercicio3_Producto {
    private String tipo;

    public NoPerecedero(String nombre, double precio, String tipo) {
        super(nombre, precio);
        this.tipo = tipo;
    }

    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }

    @Override
    public String toString() {
        return "NoPerecedero{nombre='" + getNombre() + "', precio=" + getPrecio()
                + ", tipo='" + tipo + "'}";
    }
}


class MainProducto {
    public static void main(String[] args) {
        Ejercicio3_Producto p1 = new Ejercicio3_Producto("Arroz", 2.0);
        Perecedero p2 = new Perecedero("Yogur", 1.2, 1);
        Perecedero p3 = new Perecedero("Leche", 0.9, 3);
        NoPerecedero p4 = new NoPerecedero("Lata atún", 1.5, "conserva");

        System.out.println(p1 + " -> calcular(5) = " + p1.calcular(5));
        System.out.println(p2 + " -> calcular(4) = " + p2.calcular(4));
        System.out.println(p3 + " -> calcular(4) = " + p3.calcular(4));
        System.out.println(p4 + " -> calcular(3) = " + p4.calcular(3));
    }
}