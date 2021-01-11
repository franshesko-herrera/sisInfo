package interfaces;

import modelos.Alumna;
import modelos.Paciente;
import modelos.Profesor;

import java.util.List;

public interface IBuscarClases {

    List<Alumna> buscarAlumnaPorCodEst(List<Alumna> alumnas, int codigoEstudiantil);

    List<Alumna> buscarAlumnaPorDni(List<Alumna> alumnas, int dni);

    List<Alumna> buscarAlumnaPorApellido(List<Alumna> alumnas, String apellido);

    List<Alumna> buscarAlumnaPorNombre(List<Alumna> alumnas, String nombre);

    int retornarNumeroDeAlumnas(List<Alumna> alumnas);

    List<Profesor> buscarProfesoresPorCurso(List<Profesor> profesores, String nombreCurso);

    List<Profesor> buscarProfesoresPorCursoNull(List<Profesor> profesores);

    Paciente buscarPacienteXCredencial(List<Paciente> tablaPacientes, int credencial);

}
    