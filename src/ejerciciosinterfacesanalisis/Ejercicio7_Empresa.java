package ejerciciosinterfacesanalisis;

//Subclase Empresa: añade página web
public class Ejercicio7_Empresa extends Ejercicio7_Contacto {

 private String paginaWeb;

 // Constructor completo
 public Ejercicio7_Empresa(String nombre, String telefono, String paginaWeb) {
     super(nombre, telefono);
     this.paginaWeb = paginaWeb;
 }

 // Getters y setters
 public String getPaginaWeb()          { return paginaWeb; }
 public void   setPaginaWeb(String w)  { this.paginaWeb = w; }

 @Override
 public String toString() {
     return "Empresa | " + super.toString()
          + " | Web: " + paginaWeb;
 }
}