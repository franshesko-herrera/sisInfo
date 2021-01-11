package interfaces.implementaciones;

import interfaces.IBuscarClases;
import modelos.Alumna;
import modelos.Paciente;
import modelos.Profesor;

import java.util.ArrayList;
import java.util.List;

public class BuscarClasesImpl implements IBuscarClases {

    @Override
    public List<Alumna> buscarAlumnaPorCodEst(List<Alumna> alumnas, int codigoEstudiantil) {
        List<Alumna> resultadoBusqueda = new ArrayList<>();
        for (Alumna alumna : alumnas) {
            if (alumna.getCodEstudiantil() == codigoEstudiantil) {
                resultadoBusqueda.add(alumna);
            }
        }

        return resultadoBusqueda;
    }

    @Override
    public List<Alumna> buscarAlumnaPorDni(List<Alumna> alumnas, int dni) {
        List<Alumna> alumnasQueTienenDni = new ArrayList<>();

        for (Alumna alumna : alumnas) {
            if (alumna.getDni() == dni) {
                alumnasQueTienenDni.add(alumna);
            }
        }

        return alumnasQueTienenDni;
    }

    @Override
    public List<Alumna> buscarAlumnaPorApellido(List<Alumna> alumnas, String apellido) {
        List<Alumna> alumnasQueTenganElApellido = new ArrayList<>();

        for (Alumna alumna : alumnas) {
            if (alumna.getApellido().equals(apellido)) {
                alumnasQueTenganElApellido.add(alumna);
            }
        }

        return alumnasQueTenganElApellido;
    }

    @Override
    public List<Alumna> buscarAlumnaPorNombre(List<Alumna> alumnas, String nombre) {
        List<Alumna> alumnasQueSeLlamen = new ArrayList<>();

        for (Alumna alumna : alumnas) {
            if (alumna.getNombre().toUpperCase().equals(nombre.toUpperCase())) {
                alumnasQueSeLlamen.add(alumna);
            }
        }

        return alumnasQueSeLlamen;
    }

    @Override
    public int retornarNumeroDeAlumnas(List<Alumna> alumnas) {
        return alumnas.size();
    }

    @Override
    public List<Profesor> buscarProfesoresPorCurso(List<Profesor> listaDeProfDondeBusco, String nombreCurso) {
        List<Profesor> profesoresEncontrados = new ArrayList<>();

        for (Profesor profesorIterador : listaDeProfDondeBusco) {
            // if (profesorIterador.getCurso() != null) {
            System.out.println(profesorIterador);
                if (profesorIterador.getCurso().getNombre().contains(nombreCurso)) {
                    profesoresEncontrados.add(profesorIterador);
                }
            // }

        }

        return profesoresEncontrados;
    }

    @Override
    public List<Profesor> buscarProfesoresPorCursoNull(List<Profesor> profesores) {
        List<Profesor> profesoresEncontrados = new ArrayList<>();

        for (Profesor profesor : profesores) {
            if (profesor.getCurso() == null) {
                profesoresEncontrados.add(profesor);
            }
        }

        return profesoresEncontrados;
    }

    @Override
    public Paciente buscarPacienteXCredencial(List<Paciente> tablaPacientes, int credencial) {
        Paciente pacienteEncontrado = null;

        for (Paciente pacienteIterador : tablaPacientes) {

            if (pacienteIterador.getCredencial() == credencial) {
                pacienteEncontrado = pacienteIterador;
            }

        }

        return pacienteEncontrado;
    }
}
