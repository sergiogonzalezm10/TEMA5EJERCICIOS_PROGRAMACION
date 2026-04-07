package ejercicios;

//Clase Triangulo
class Ejercicio5_Triangulo extends Ejercicio5_Poligono {

 private double lado1;
 private double lado2;
 private double lado3;

 // Constructor por defecto
 public Ejercicio5_Triangulo() {
     super(3);
     this.lado1 = 1;
     this.lado2 = 1;
     this.lado3 = 1;
 }

 // Constructor con parametros
 public Ejercicio5_Triangulo(double l1, double l2, double l3) {
     super(3);
     this.lado1 = l1;
     this.lado2 = l2;
     this.lado3 = l3;
 }

 // Getters y setters
 public double getLado1() { 
	 return lado1; 
 }
 
 public void setLado1(double lado1) {
	 this.lado1 = lado1; 
 }

 public double getLado2() {
	 return lado2; 
 }
 public void setLado2(double lado2) { 
	 this.lado2 = lado2; 
 }

 public double getLado3() { 
	 return lado3; 
 }
 public void setLado3(double lado3) { 
	 this.lado3 = lado3; 
 }

 // Formula de Heron
 public double area() {
     double s = (lado1 + lado2 + lado3) / 2;
     return Math.sqrt(s * (s - lado1) * (s - lado2) * (s - lado3));
 }

 // toString
 public String toString() {
     return "Triangulo -> lado1: " + lado1 + ", lado2: " + lado2 + ", lado3: " + lado3;
 }
}