
package paquete1;

public class Cuidad {
    
 private String nombreC;
    private String direccion;
    private String nombreP;
     public Cuidad(String nomC,String d, String nomP) {
        nombreC = nomC;
        direccion= d;
        nombreP = nomP;
    }
  
    public void establecerNombre(String n) {
        nombreC = n;
    }
    
    public void establecerDirrecion(String n) {
        direccion = n;
    }
    public void establecerProvincia(String n) {
        nombreP = n;
    }
    public String obtenerNombre() {
        return nombreC;
    }
    public String obtenerDireccion() {
        return direccion;
    }
     public String obtenerProvincia() {
        return nombreP;
    }
}

