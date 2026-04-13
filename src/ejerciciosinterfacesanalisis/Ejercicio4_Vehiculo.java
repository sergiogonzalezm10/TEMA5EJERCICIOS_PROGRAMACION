package ejerciciosinterfacesanalisis;

//Superclase que representa cualquier vehículo
public abstract class Ejercicio4_Vehiculo {

 // Valores por defecto
 private static final boolean MOTOR_DEFAULT    = false;
 private static final int     MARCHA_DEFAULT   = 0;
 private static final int     VELOCIDAD_DEFAULT = 0;

 // Atributos comunes a todos los vehículos
 protected String  marca;
 protected String  modelo;
 protected String  color;
 protected String  matricula;
 protected boolean motorEncendido;
 protected int     marchaActual;
 protected int     velocidadActual;

 // Constructor con los datos básicos
 public Ejercicio4_Vehiculo(String marca, String modelo,
                             String color, String matricula) {
     this.marca           = marca;
     this.modelo          = modelo;
     this.color           = color;
     this.matricula       = matricula;
     this.motorEncendido  = MOTOR_DEFAULT;
     this.marchaActual    = MARCHA_DEFAULT;
     this.velocidadActual = VELOCIDAD_DEFAULT;
 }

 // Enciende el motor si estaba apagado
 public void arrancar() {
     if (!motorEncendido) {
         motorEncendido = true;
         System.out.println("Motor encendido.");
     } else {
         System.out.println("El motor ya estaba encendido.");
     }
 }

 // Para el vehículo y apaga el motor
 public void parar() {
     velocidadActual = 0;
     marchaActual    = 0;
     motorEncendido  = false;
     System.out.println("Vehículo parado y motor apagado.");
 }

 // Sube una marcha (máximo 5ª)
 public void subirMarcha() {
     if (!motorEncendido) {
         System.out.println("Motor apagado, no se puede cambiar de marcha.");
         return;
     }
     if (marchaActual < 5) {
         marchaActual++;
         System.out.println("Marcha subida → " + marchaActual + "ª");
     } else {
         System.out.println("Ya estás en 5ª marcha.");
     }
 }

 // Baja una marcha (mínimo 1ª)
 public void bajarMarcha() {
     if (!motorEncendido) {
         System.out.println("Motor apagado, no se puede cambiar de marcha.");
         return;
     }
     if (marchaActual > 1) {
         marchaActual--;
         System.out.println("Marcha bajada → " + marchaActual + "ª");
     } else {
         System.out.println("Ya estás en 1ª marcha.");
     }
 }

 // Getters
 public String  getMarca()           { return marca; }
 public String  getModelo()          { return modelo; }
 public String  getColor()           { return color; }
 public String  getMatricula()       { return matricula; }
 public boolean isMotorEncendido()   { return motorEncendido; }
 public int     getMarchaActual()    { return marchaActual; }
 public int     getVelocidadActual() { return velocidadActual; }

 // Setters
 public void setColor(String color)       { this.color = color; }
 public void setVelocidadActual(int vel)  { this.velocidadActual = vel; }
 public void setMarchaActual(int marcha)  { this.marchaActual = marcha; }

 @Override
 public String toString() {
     return marca + " " + modelo
          + " | Color: "     + color
          + " | Matrícula: " + matricula
          + " | Motor: "     + (motorEncendido ? "encendido" : "apagado")
          + " | Marcha: "    + marchaActual + "ª"
          + " | Velocidad: " + velocidadActual + " km/h";
 }
}