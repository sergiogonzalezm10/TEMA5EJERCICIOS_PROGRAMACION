package ejerciciosinterfacesanalisis;

//Superclase abstracta que representa una cuenta bancaria genérica
public abstract class Ejercicio6_CuentaBancaria {

 private static final int MAX_TITULARES = 3;

 protected String              numeroCuenta;
 protected double              saldo;
 protected Ejercicio6_Titular[] titulares;
 protected int                 numTitulares;

 // Al crear la cuenta se necesita obligatoriamente un titular
 public Ejercicio6_CuentaBancaria(String numeroCuenta,
                                   Ejercicio6_Titular titularInicial) {
     this.numeroCuenta = numeroCuenta;
     this.saldo        = 0;
     this.titulares    = new Ejercicio6_Titular[MAX_TITULARES];
     this.numTitulares = 0;
     addTitular(titularInicial);
 }

 // Ingresa dinero en la cuenta
 public void ingresar(double cantidad) {
     if (cantidad > 0) {
         saldo += cantidad;
         System.out.println("Ingreso: +" + cantidad + " € | Saldo: " + saldo + " €");
     } else {
         System.out.println("La cantidad debe ser positiva.");
     }
 }

 // Retira dinero si hay saldo suficiente
 public void retirar(double cantidad) {
     if (cantidad > 0 && cantidad <= saldo) {
         saldo -= cantidad;
         System.out.println("Retirada: -" + cantidad + " € | Saldo: " + saldo + " €");
     } else {
         System.out.println("Saldo insuficiente o cantidad incorrecta.");
     }
 }

 // Añade un titular si hay hueco (máximo 3)
 public void addTitular(Ejercicio6_Titular titular) {
     if (numTitulares < MAX_TITULARES) {
         titulares[numTitulares] = titular;
         numTitulares++;
         System.out.println("Titular añadido: " + titular.getNombre());
     } else {
         System.out.println("No se pueden añadir más titulares (máximo " + MAX_TITULARES + ").");
     }
 }

 // Borra un titular por DNI, siempre que quede al menos uno
 public void borrarTitular(String dni) {
     if (numTitulares <= 1) {
         System.out.println("No se puede borrar el único titular.");
         return;
     }
     for (int i = 0; i < numTitulares; i++) {
         if (titulares[i].getDni().equals(dni)) {
             // Desplazamos los titulares hacia la izquierda
             for (int j = i; j < numTitulares - 1; j++) {
                 titulares[j] = titulares[j + 1];
             }
             titulares[numTitulares - 1] = null;
             numTitulares--;
             System.out.println("Titular eliminado.");
             return;
         }
     }
     System.out.println("No se encontró ningún titular con ese DNI.");
 }

 // Getters
 public String getNumeroCuenta() { return numeroCuenta; }
 public double getSaldo()        { return saldo; }

 @Override
 public String toString() {
     StringBuilder sb = new StringBuilder();
     sb.append("Cuenta: ").append(numeroCuenta)
       .append(" | Saldo: ").append(saldo).append(" €")
       .append(" | Titulares: ");
     for (int i = 0; i < numTitulares; i++) {
         sb.append(titulares[i].getNombre());
         if (i < numTitulares - 1) sb.append(", ");
     }
     return sb.toString();
 }
}