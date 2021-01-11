package interfaces;

import modelos.Alumna;

import java.util.List;

public interface IEliminarClases {
    List<Alumna> eliminarAlumna(List<Alumna> alumnas, Alumna alumna);

    List<Alumna> eliminarAlumnaPorDni(List<Alumna> alumnas, int dni);

    List<Alumna> eliminarAlumnas(List<Alumna> alumnas, List<Alumna> alumnasABorrar);
}
