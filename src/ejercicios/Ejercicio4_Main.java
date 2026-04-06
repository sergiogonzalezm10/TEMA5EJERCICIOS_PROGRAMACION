import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Electrodomestico> lista = new ArrayList<Electrodomestico>();

        // Electrodomésticos genéricos
        lista.add(new Electrodomestico(100, 8));
        lista.add(new Electrodomestico(150, "rojo", 'A', 25));

        // Lavadoras
        lista.add(new Lavadora(200, 30));
        lista.add(new Lavadora(250, "negro", 'B', 35, 40));

        // Televisiones
        lista.add(new Television(300, 10));
        lista.add(new Television(400, "gris", 'C', 15, 55, true));

        double totalElectrodomesticos = 0;
        double totalLavadoras = 0;
        double totalTelevisiones = 0;

        System.out.println("=== PRECIOS FINALES ===");

        for (int i = 0; i < lista.size(); i++) {
            Electrodomestico e = lista.get(i);
            double precio = e.precioFinal();
            System.out.println(e.toString() + " => Precio final: " + precio + " euros");

            totalElectrodomesticos += precio;

            if (e instanceof Lavadora) {
                totalLavadoras += precio;
            } else if (e instanceof Television) {
                totalTelevisiones += precio;
            }
        }

        System.out.println("\n=== RESUMEN ===");
        System.out.println("Total todos los electrodomesticos: " + totalElectrodomesticos + " euros");
        System.out.println("Total lavadoras: " + totalLavadoras + " euros");
        System.out.println("Total televisiones: " + totalTelevisiones + " euros");
    }
}
