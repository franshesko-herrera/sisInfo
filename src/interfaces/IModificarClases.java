package interfaces;

import modelos.Alumna;

import java.util.List;

public interface IModificarClases {

    List<Alumna> modificarApellidoAlumna(List<Alumna> alumnas, String apellido, String nuevoApellido);

    List<Alumna> modificarCodEstudiantilAlumna(List<Alumna> alumnas, int codEst, int nuevoCodEst);

    List<Alumna> modificarCodEstudiantilAlumna(List<Alumna> alumnas, int codEst, int dni, int nuevoCodEst);
}
