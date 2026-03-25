package ejercicios;

public class Ejercicio1_HoraExacta extends Ejercicio1_Hora {
    private int segundo;
 
    // Constructor: inicializa hora y minuto con la superclase, valida los segundos
    public Ejercicio1_HoraExacta(int hora, int minuto, int segundo) {
        super(hora, minuto);
        if (!setSegundo(segundo)) this.segundo = 0;
    }
 
    // Asigna los segundos solo si el valor está entre 0 y 59
    public boolean setSegundo(int valor) {
        if (valor >= 0 && valor <= 59) {
            this.segundo = valor;
            return true;
        }
        return false;
    }
 
    // Incrementa en un segundo; si llega a 60 reinicia y delega en Hora para avanzar el minuto
    @Override
    public void inc() {
        segundo++;
        if (segundo == 60) {
            segundo = 0;
            super.inc();
        }
    }
 
    public int getSegundo() { return segundo; }
 
    // Formato hh:mm:ss con dos dígitos en cada campo (ej: 03:05:58)
    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", getHora(), getMinuto(), segundo);
    }
}