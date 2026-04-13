package ejerciciosinterfacesanalisis;

//Clase auxiliar que representa una transacción bancaria
public class Ejercicio6_Transaccion {

 private int    dia;
 private int    mes;
 private int    año;
 private String concepto;
 private double importe;

 // Constructor con todos los datos de la transacción
 public Ejercicio6_Transaccion(int dia, int mes, int año,
                                String concepto, double importe) {
     this.dia      = dia;
     this.mes      = mes;
     this.año      = año;
     this.concepto = concepto;
     this.importe  = importe;
 }

 // Getters (no se modifican una vez creadas)
 public int    getDia()      { return dia; }
 public int    getMes()      { return mes; }
 public int    getAño()      { return año; }
 public String getConcepto() { return concepto; }
 public double getImporte()  { return importe; }

 @Override
 public String toString() {
     return dia + "/" + mes + "/" + año
          + " | " + concepto
          + " | " + importe + " €";
 }
}