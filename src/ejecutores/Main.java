package ejecutores;

import interfaces.IBuscarClases;
import interfaces.IEliminarClases;
import interfaces.IModificarClases;
import interfaces.IParaPacientes;
import interfaces.IPoblarClases;
import interfaces.implementaciones.BuscarClasesImpl;
import interfaces.implementaciones.EliminarAlumnasImpl;
import interfaces.implementaciones.ModificarClasesImpl;
import interfaces.implementaciones.ParaPacientesImpl;
import interfaces.implementaciones.PoblarClasesImpl;
import modelos.Administrativo;
import modelos.Alumna;
import modelos.Curso;
import modelos.Paciente;
import modelos.Profesor;
import modelos.Supervisor;
import modelos.Vendedor;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        //1. instancio la interfaz y la impl (Padre = new Hijo) - (Interfaz =  new Impl)
        IPoblarClases poblarClases = new PoblarClasesImpl();
        IBuscarClases buscarClases = new BuscarClasesImpl();
        IModificarClases modificarClases = new ModificarClasesImpl();
        IEliminarClases eliminarClases = new EliminarAlumnasImpl();
        IParaPacientes paraPacientes =  new ParaPacientesImpl();

        //List<Curso> cursosAda = poblarClases.crearCursos();
        //System.out.println(cursosAda);

        // List<Alumna> alumnas = poblarClases.crearAlumnas();
        //System.out.println(alumnas);

        //Búsquedas:

        // Busq x cod
        // System.out.println(buscarClases.buscarAlumnaPorCodEst(alumnas, 9));
        // Alumna alumnaABorrar9 = buscarClases.buscarAlumnaPorCodEst(alumnas, 9).get(0);
        // eliminarClases.eliminarAlumna(alumnas, alumnaABorrar9);

        //System.out.println(buscarClases.buscarAlumnaPorCodEst(alumnas, 0));
        //List<Alumna> alumnasABorrar0 = buscarClases.buscarAlumnaPorCodEst(alumnas, 0);

        //for (Alumna alumna : alumnasABorrar0) {
          //  eliminarClases.eliminarAlumna(alumnas, alumna);
        //}

        //eliminarClases.eliminarAlumnas(alumnas, alumnasABorrar0);

        //System.out.println(alumnas);

        //System.out.println(eliminarClases.eliminarAlumna(alumnas, alumnas.get(2)));

        //alumnas.clear();

        //System.out.println(alumnas);

        // System.out.println(eliminarClases.eliminarAlumnaPorDni(alumnas, 1235));

        // Busq x nombre
        // System.out.println(buscarClases.buscarAlumnaPorNombre(alumnas, "andrea"));
        // Busq x apellido
        // System.out.println(buscarClases.buscarAlumnaPorApellido(alumnas, "Castro"));
        // buscarClases.buscarAlumnaPorApellido(alumnas, "Castro").get(0).setDni(8888);


        // System.out.println(modificarClases.modificarApellidoAlumna(alumnas, "Vazquez", "Perez"));
        //System.out.println(modificarClases.modificarCodEstudiantilAlumna(alumnas, 0, 9990));
        // System.out.println(alumnas);

        // Busq x dni
        //System.out.println(buscarClases.buscarAlumnaPorDni(alumnas, 1236));

        //List<Administrativo> administrativos = poblarClases.crearAdministrativos();
        //System.out.println();

        // List<Profesor> profes = poblarClases.crearProfesores();
        //System.out.println(profes);
        //System.out.println(buscarClases.buscarProfesoresPorCurso(profes,"back"));
        //System.out.println("Los profes que no tienen curso son : "
        //        + buscarClases.buscarProfesoresPorCursoNull(profes));

        //List<Paciente> pacientes = poblarClases.crearPacientes();
        //System.out.println(pacientes);

        // System.out.println(buscarClases.buscarPacienteXCredencial(pacientes, 991));

        //Paciente paciente = buscarClases.buscarPacienteXCredencial(pacientes, 995);

        //System.out.println(paraPacientes.atenderPaciente(paciente));

        List<Vendedor> vendedors = poblarClases.crearVendedores();
        System.out.println(vendedors);
        // Vendedor evelin = vendedors.get(0);
        // evelin.setPorcentajeComision(2);
        // System.out.println(evelin.getSalario());

        List<Supervisor> supervisors = poblarClases.crearSupervisores();
        System.out.println(supervisors);

        Supervisor yuli = supervisors.get(0);
        yuli.setVendedoresACargo(vendedors);
        System.out.println(supervisors);




    }

}
