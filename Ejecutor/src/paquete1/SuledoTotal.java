
package paquete1;

public class SuledoTotal {
   private String nombre;
    private Cuidad ciudad;
    private int numeroEspecialidades;
    private Medico[] medicos;
    private Enfermero[] enfermeros;
    private double sueldosPagar;

    public SuledoTotal(String nom, Cuidad ciuda, int numeroE, Medico[] medic, 
            Enfermero[] enfermer) {
        nombre = nom;
        ciudad = ciuda;
        numeroEspecialidades = numeroE;
        medicos = medic;
        enfermeros = enfermer;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public void establecerNombre(String n) {
        nombre = n;
    }

    public Cuidad obtenerCiudad() {
        return ciudad;
    }

    public void establecerCiudad(Cuidad n) {
        ciudad = n;
    }

    public int obtenerNumeroEspecialidades() {
        return numeroEspecialidades;
    }

    public void establecerNumeroEspecialidades(int n) {
        numeroEspecialidades = n;
    }

    public Medico[] obtenerMedicos() {
        return medicos;
    }

    public void establecerMedicos(Medico[] n) {
        medicos = n;
    }

    public Enfermero[] obtenerEnfermeros() {
        return enfermeros;
    }

    public void establecerEnfermeros(Enfermero[] n) {
        enfermeros = n;
    }

    public double obtenerSueldosPagar() {
        return sueldosPagar;
    }

    public void calcularSueldosPagar() {
        for (int i = 0; i < medicos.length; i++) {
            sueldosPagar += medicos[i].obtenerSueldo();
        }
        for (int i = 0; i < enfermeros.length; i++) {
            sueldosPagar += enfermeros[i].obtenerSueldo();
        }
    }
    @Override
    public String toString() {
        String Cadena = String.format("%s\nCiudad: %s\n"
                +"Direccion: %s\n"
                + "Provincia: %s\n"
                + "Número de especialidades: %d\n"
                + "Listado de médicos:",
                
                nombre,
                ciudad.obtenerDireccion(),
                ciudad.obtenerNombre(),
                ciudad.obtenerProvincia(),
                numeroEspecialidades);
        for (int i = 0; i < medicos.length; i++) {
            Cadena += String.format("\n- %s - sueldo: %.2f - %s",
                    medicos[i].obtenerNombre(),
                    medicos[i].obtenerSueldo(),
                    medicos[i].obtenerEspecialidad());
        }
        Cadena += "\nListado de enfermeros(as):\n";
        for (int i = 0; i < enfermeros.length; i++) {
            Cadena += String.format("- %s - sueldo: %.2f - %s\n",
                    enfermeros[i].obtenerNombre(),
                    enfermeros[i].obtenerSueldo(),
                    enfermeros[i].obtenerTipo());
        }
        Cadena += String.format("\nTotal de sueldos por mes: %.2f", 
                sueldosPagar);    
        return  Cadena;
    }
}