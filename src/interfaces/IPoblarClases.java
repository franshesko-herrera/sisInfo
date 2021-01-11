package interfaces;

import modelos.Administrativo;
import modelos.Alumna;
import modelos.Curso;
import modelos.Paciente;
import modelos.Profesor;
import modelos.Supervisor;
import modelos.Vendedor;

import java.util.List;

public interface IPoblarClases {

    List<Alumna> crearAlumnas();

    List<Profesor> crearProfesores();

    List<Administrativo> crearAdministrativos();

    List<Curso> crearCursos();

    List<Paciente> crearPacientes();

    List<Vendedor> crearVendedores();

    List<Supervisor> crearSupervisores();

}
