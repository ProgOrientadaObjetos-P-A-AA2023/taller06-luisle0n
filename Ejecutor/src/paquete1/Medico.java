
package paquete1;

public class Medico {
    private String nombreD;
    private String especialidad;
    private double sueldoM;
 public Medico(String nom, String esp, double s) {
        nombreD = nom;
        especialidad = esp;
        sueldoM = s;
    }
    public void establecerNombre(String n) {
        nombreD = n;
    }
    public void establecerEspecialidad(String n) {
        especialidad = n;
    }
    public void establecerSueldo(double n) {
        sueldoM = n;
    }
     public String obtenerNombre() {
        return nombreD;
    }
     public String obtenerEspecialidad() {
        return especialidad;
    }
      public double obtenerSueldo() {
        return sueldoM;
    }
     
}

