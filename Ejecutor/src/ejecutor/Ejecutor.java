package ejecutor;

import java.util.Scanner;
import paquete1.Cuidad;
import paquete1.Enfermero;
import paquete1.Medico;
import paquete1.SuledoTotal;

public class Ejecutor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String nombreHospital;
        String direccion;
        String nombreCiudad;
        String provincia;
        int numeroEspecialidad;
        String nombreMedico;
        String especialidadMedico;
        double salarioMedico;
        String nombreEnfermero;
        String tipoEnfermero;
        double salarioEnfermero;
        int numeroMedicos;
        int numeroEnfermeros;
        Medico[] medicos;
        Enfermero[] enfermeros;
        System.out.println("Ingrese el nombre del hospital:");
        nombreHospital = sc.nextLine();
        System.out.println("Ingrese la direccion: ");
        direccion=sc.nextLine();
        System.out.println("Ingrese el nombre de la ciudad:");
        nombreCiudad = sc.nextLine();
        System.out.println("Ingrese el nombre de la provincia:");
        provincia = sc.nextLine();
        System.out.println("Ingrese el número de especialidades:");
        numeroEspecialidad = sc.nextInt();
        System.out.println("Ingrese el número de médicos:");
        numeroMedicos = sc.nextInt();
        medicos = new Medico[numeroMedicos];
        for (int i = 0; i < numeroMedicos; i++) {
            sc.nextLine();
            System.out.println("Ingrese el nombre del médico:");
            nombreMedico = sc.nextLine();
            System.out.println("Ingrese la especialidad del médico:");
            especialidadMedico = sc.nextLine();
            System.out.println("Ingrese el salario del médico:");
            salarioMedico = sc.nextDouble();
            medicos[i] = new Medico(nombreMedico, especialidadMedico,
                    salarioMedico);
        }
        System.out.println("Ingrese el número de enfermeros:");
        numeroEnfermeros = sc.nextInt();
        enfermeros = new Enfermero[numeroEnfermeros];
        for (int i = 0; i < numeroEnfermeros; i++) {
            sc.nextLine();
            System.out.println("Ingrese el nombre del enfermero:");
            nombreEnfermero = sc.nextLine();
            System.out.println("Ingrese el tipo de enfermero (Nombramiento - contrato):");
            tipoEnfermero = sc.nextLine();
            System.out.println("Ingrese el salario del enfermero:");
            salarioEnfermero = sc.nextDouble();
            enfermeros[i] = new Enfermero(nombreEnfermero, tipoEnfermero,
                    salarioEnfermero);
        }
        Cuidad ciudad = new Cuidad(nombreCiudad,direccion, provincia);
        SuledoTotal sueldo = new SuledoTotal(nombreHospital, ciudad,
                numeroEspecialidad, medicos, enfermeros);
        sueldo.calcularSueldosPagar();
        System.out.printf("%s\n", sueldo);
    }
}
