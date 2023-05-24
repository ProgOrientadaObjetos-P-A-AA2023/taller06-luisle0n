
package paquete1;
public class Enfermero {
    private String nombre;
    private String tipo;
    private double sueldo;
    public Enfermero(String nom, String t, double s) {
        nombre = nom;
        tipo = t;
        sueldo = s;
    }
    public void establecerNombre(String n) {
        nombre = n;
    }   
    public void establecerTipo(String n) {
        tipo = n;
    }
    public void establecerSueldo(double n) {
        sueldo = n;
    }
    public String obtenerNombre() {
        return nombre;
    }
     public String obtenerTipo() {
        return tipo;
    }
     public double obtenerSueldo() {
        return sueldo;
    }
}

