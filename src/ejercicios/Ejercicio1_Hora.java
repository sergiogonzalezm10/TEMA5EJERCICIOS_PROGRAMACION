package ejercicios;

public class Ejercicio1_Hora {
    private int hora;
    private int minuto;
 
    // Constructor: valida los valores y usa 0 si son incorrectos
    public Ejercicio1_Hora(int hora, int minuto) {
        if (!setHora(hora)) this.hora = 0;
        if (!setMinutos(minuto)) this.minuto = 0;
    }
 
    // Incrementa la hora en un minuto; si llega a 60 reinicia y avanza la hora
    public void inc() {
        minuto++;
        if (minuto == 60) {
            minuto = 0;
            hora = (hora + 1) % 24; // % 24 para que vuelva a 0 tras las 23h
        }
    }
 
    // Asigna los minutos solo si el valor está entre 0 y 59
    public boolean setMinutos(int valor) {
        if (valor >= 0 && valor <= 59) {
            this.minuto = valor;
            return true;
        }
        return false;
    }
 
    // Asigna la hora solo si el valor está entre 0 y 23
    public boolean setHora(int valor) {
        if (valor >= 0 && valor <= 23) {
            this.hora = valor;
            return true;
        }
        return false;
    }
 
    public int getHora() { return hora; }
    public int getMinuto() { return minuto; }
 
    // Formato hora:minutos, con dos dígitos en los minutos (ej: 3:05)
    @Override
    public String toString() {
        return String.format("%d:%02d", hora, minuto);
    }
}
 