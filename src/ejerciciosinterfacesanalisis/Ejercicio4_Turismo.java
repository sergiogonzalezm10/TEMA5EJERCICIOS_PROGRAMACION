package ejerciciosinterfacesanalisis;

//Subclase Turismo: añade número de plazas y tipo de uso
public class Ejercicio4_Turismo extends Ejercicio4_Vehiculo {

 // Valores por defecto
 private static final int    PLAZAS_DEFAULT   = 5;
 private static final String TIPO_USO_DEFAULT = "particular";

 private int    numPlazas;
 private String tipoUso; // "particular" o "profesional"

 // Constructor básico (plazas y tipo de uso por defecto)
 public Ejercicio4_Turismo(String marca, String modelo,
                            String color, String matricula) {
     super(marca, modelo, color, matricula);
     this.numPlazas = PLAZAS_DEFAULT;
     this.tipoUso   = TIPO_USO_DEFAULT;
 }

 // Constructor completo
 public Ejercicio4_Turismo(String marca, String modelo, String color,
                            String matricula, int numPlazas, String tipoUso) {
     super(marca, modelo, color, matricula);
     this.numPlazas = numPlazas;
     this.tipoUso   = tipoUso;
 }

 // Getters y setters
 public int    getNumPlazas()           { return numPlazas; }
 public String getTipoUso()             { return tipoUso; }
 public void   setNumPlazas(int n)      { this.numPlazas = n; }
 public void   setTipoUso(String tipo)  { this.tipoUso = tipo; }

 @Override
 public String toString() {
     return "Turismo | " + super.toString()
          + " | Plazas: " + numPlazas
          + " | Uso: "    + tipoUso;
 }
}