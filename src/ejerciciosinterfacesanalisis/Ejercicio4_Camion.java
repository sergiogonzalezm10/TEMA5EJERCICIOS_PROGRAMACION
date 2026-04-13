package ejerciciosinterfacesanalisis;

//Subclase Camion: añade peso máximo y si transporta mercancía peligrosa
public class Ejercicio4_Camion extends Ejercicio4_Vehiculo {

 // Valores por defecto
 private static final double  PESO_MAX_DEFAULT      = 1000.0;
 private static final boolean PELIGROSA_DEFAULT     = false;

 private double  pesoMaxAutorizado;
 private boolean mercanciaPeligrosa;

 // Constructor básico (peso y mercancía por defecto)
 public Ejercicio4_Camion(String marca, String modelo,
                           String color, String matricula) {
     super(marca, modelo, color, matricula);
     this.pesoMaxAutorizado  = PESO_MAX_DEFAULT;
     this.mercanciaPeligrosa = PELIGROSA_DEFAULT;
 }

 // Constructor completo
 public Ejercicio4_Camion(String marca, String modelo, String color,
                           String matricula, double pesoMaxAutorizado,
                           boolean mercanciaPeligrosa) {
     super(marca, modelo, color, matricula);
     this.pesoMaxAutorizado  = pesoMaxAutorizado;
     this.mercanciaPeligrosa = mercanciaPeligrosa;
 }

 // Getters y setters
 public double  getPesoMaxAutorizado()             { return pesoMaxAutorizado; }
 public boolean isMercanciaPeligrosa()             { return mercanciaPeligrosa; }
 public void    setPesoMaxAutorizado(double peso)  { this.pesoMaxAutorizado = peso; }
 public void    setMercanciaPeligrosa(boolean v)   { this.mercanciaPeligrosa = v; }

 @Override
 public String toString() {
     return "Camión | " + super.toString()
          + " | Peso máx.: "          + pesoMaxAutorizado + " kg"
          + " | Mercancía peligrosa: " + (mercanciaPeligrosa ? "Sí" : "No");
 }
}