package ejerciciosinterfacesanalisis;

//Subclase Motocicleta: añade cilindrada y si requiere carnet
public class Ejercicio4_Motocicleta extends Ejercicio4_Vehiculo {

 // Las motos de 125 CC o más requieren carnet
 private static final int LIMITE_CARNET = 125;

 private int cilindrada; // en CC

 // Constructor básico
 public Ejercicio4_Motocicleta(String marca, String modelo,
                                String color, String matricula) {
     super(marca, modelo, color, matricula);
     this.cilindrada = 50; // valor por defecto: 50 CC (sin carnet)
 }

 // Constructor completo
 public Ejercicio4_Motocicleta(String marca, String modelo, String color,
                                String matricula, int cilindrada) {
     super(marca, modelo, color, matricula);
     this.cilindrada = cilindrada;
 }

 // Getters y setters
 public int  getCilindrada()        { return cilindrada; }
 public void setCilindrada(int cc)  { this.cilindrada = cc; }

 // Devuelve true si la moto necesita carnet (>= 125 CC)
 public boolean requiereCarnet() {
     return cilindrada >= LIMITE_CARNET;
 }

 @Override
 public String toString() {
     return "Moto | " + super.toString()
          + " | Cilindrada: "    + cilindrada + " CC"
          + " | Requiere carnet: " + (requiereCarnet() ? "Sí" : "No");
 }
}