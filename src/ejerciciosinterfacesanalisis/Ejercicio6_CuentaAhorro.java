package ejerciciosinterfacesanalisis;

//Subclase CuentaAhorro: añade cuota de mantenimiento e interés anual
public class Ejercicio6_CuentaAhorro extends Ejercicio6_CuentaBancaria {

 private double cuotaMantenimiento;
 private double interes; // porcentaje anual (ej: 2.5 → 2,5%)

 // Constructor completo
 public Ejercicio6_CuentaAhorro(String numeroCuenta,
                                 Ejercicio6_Titular titular,
                                 double cuotaMantenimiento,
                                 double interes) {
     super(numeroCuenta, titular);
     this.cuotaMantenimiento = cuotaMantenimiento;
     this.interes            = interes;
 }

 // Getters y setters
 public double getCuotaMantenimiento()        { return cuotaMantenimiento; }
 public double getInteres()                   { return interes; }
 public void   setCuotaMantenimiento(double c){ this.cuotaMantenimiento = c; }
 public void   setInteres(double i)           { this.interes = i; }

 // Aplica el interés anual al saldo y devuelve el nuevo saldo
 public double aplicarInteres() {
     double ganancia = saldo * (interes / 100);
     saldo += ganancia;
     System.out.println("Interés (" + interes + "%): +" + ganancia + " € | Saldo: " + saldo + " €");
     return saldo;
 }

 // Resta la cuota de mantenimiento del saldo
 public void cobrarMantenimiento() {
     saldo -= cuotaMantenimiento;
     System.out.println("Cuota mantenimiento: -" + cuotaMantenimiento + " € | Saldo: " + saldo + " €");
 }

 @Override
 public String toString() {
     return "Ahorro | " + super.toString()
          + " | Cuota: "    + cuotaMantenimiento + " €"
          + " | Interés: "  + interes + "%";
 }
}