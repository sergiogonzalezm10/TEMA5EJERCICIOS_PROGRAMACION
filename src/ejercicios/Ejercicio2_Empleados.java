package ejercicios;

//Clase base con el nombre del empleado
public class Ejercicio2_Empleados {
 private String nombre;

 public Ejercicio2_Empleados(String nombre) { this.nombre = nombre; }

 public void setNombre(String nombre) { this.nombre = nombre; }
 public String getNombre() { return nombre; }

 @Override
 public String toString() { return "Empleado " + nombre; }
}


//Directivo extiende Empleado y añade su rol al toString
class Directivo extends Ejercicio2_Empleados {
 public Directivo(String nombre) { super(nombre); }

 @Override
 public String toString() { return super.toString() + " -> Directivo"; }
}


//Operario extiende Empleado y añade su rol al toString
class Operario extends Ejercicio2_Empleados {
 public Operario(String nombre) { super(nombre); }

 @Override
 public String toString() { return super.toString() + " -> Operario"; }
}


//Oficial extiende Operario, heredando su toString y añadiendo el suyo
class Oficial extends Operario {
 public Oficial(String nombre) { super(nombre); }

 @Override
 public String toString() { return super.toString() + " -> Oficial"; }
}


//Tecnico extiende Operario, heredando su toString y añadiendo el suyo
class Tecnico extends Operario {
 public Tecnico(String nombre) { super(nombre); }

 @Override
 public String toString() { return super.toString() + " -> Tecnico"; }
}


class MainEmpleado {
 public static void main(String[] args) {
     Ejercicio2_Empleados  E1  = new Ejercicio2_Empleados("Rafa");
     Directivo D1  = new Directivo("Mario");
     Operario  OP1 = new Operario("Alfonso");
     Oficial   OF1 = new Oficial("Luis");
     Tecnico   T1  = new Tecnico("Pablo");

     System.out.println(E1);
     System.out.println(D1);
     System.out.println(OP1);
     System.out.println(OF1);
     System.out.println(T1);
 }
}