package ejerciciosinterfacesanalisis;

//Clase principal para probar las cuentas bancarias
public class Ejercicio6_Main {

 public static void main(String[] args) {

     Ejercicio6_Titular t1 = new Ejercicio6_Titular("12345678A", "Ana",  "García López",   "600111222");
     Ejercicio6_Titular t2 = new Ejercicio6_Titular("87654321B", "Luis", "Martínez Ruiz",  "611333444");

     // Cuenta de ahorro
     System.out.println("=== Cuenta de Ahorro ===");
     Ejercicio6_CuentaAhorro ahorro = new Ejercicio6_CuentaAhorro("ES001", t1, 5.0, 2.5);
     ahorro.ingresar(1000);
     ahorro.addTitular(t2);
     ahorro.aplicarInteres();
     ahorro.cobrarMantenimiento();
     System.out.println(ahorro);

     System.out.println();

     // Cuenta corriente
     System.out.println("=== Cuenta Corriente ===");
     Ejercicio6_CuentaCorriente corriente = new Ejercicio6_CuentaCorriente("ES002", t1, 1.0);
     corriente.ingresar(500);
     corriente.hacerTransaccion(new Ejercicio6_Transaccion(10, 4, 2025, "Recibo luz",       -80.0));
     corriente.hacerTransaccion(new Ejercicio6_Transaccion(15, 4, 2025, "Domiciliación gym", -30.0));
     corriente.mostrarTransacciones();
     System.out.println(corriente);
 }
}