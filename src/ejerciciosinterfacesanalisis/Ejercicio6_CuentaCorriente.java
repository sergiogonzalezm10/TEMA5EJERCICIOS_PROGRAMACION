package ejerciciosinterfacesanalisis;

//Subclase CuentaCorriente: gestiona transacciones con comisión
public class Ejercicio6_CuentaCorriente extends Ejercicio6_CuentaBancaria {

 private static final int MAX_TRANSACCIONES = 100;

 private double                  porcentajeComision;
 private int                     numTransacciones;
 private Ejercicio6_Transaccion[] transacciones;

 // Constructor completo
 public Ejercicio6_CuentaCorriente(String numeroCuenta,
                                    Ejercicio6_Titular titular,
                                    double porcentajeComision) {
     super(numeroCuenta, titular);
     this.porcentajeComision = porcentajeComision;
     this.numTransacciones   = 0;
     this.transacciones      = new Ejercicio6_Transaccion[MAX_TRANSACCIONES];
 }

 // Getters
 public double getPorcentajeComision()  { return porcentajeComision; }
 public int    getNumTransacciones()    { return numTransacciones; }

 // Realiza una transacción y aplica la comisión
 public void hacerTransaccion(Ejercicio6_Transaccion t) {
     double comision = Math.abs(t.getImporte()) * (porcentajeComision / 100);
     saldo += t.getImporte();
     saldo -= comision;
     transacciones[numTransacciones] = t;
     numTransacciones++;
     System.out.println("Transacción: " + t.getConcepto()
          + " | Importe: " + t.getImporte() + " €"
          + " | Comisión: -" + comision + " €"
          + " | Saldo: " + saldo + " €");
 }

 // Muestra todas las transacciones
 public void mostrarTransacciones() {
     System.out.println("--- Transacciones de " + numeroCuenta + " ---");
     for (int i = 0; i < numTransacciones; i++) {
         System.out.println(transacciones[i]);
     }
 }

 @Override
 public String toString() {
     return "Corriente | " + super.toString()
          + " | Comisión: "       + porcentajeComision + "%"
          + " | Transacciones: "  + numTransacciones;
 }
}