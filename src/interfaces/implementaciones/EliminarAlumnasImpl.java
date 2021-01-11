package interfaces.implementaciones;

import interfaces.IEliminarClases;
import modelos.Alumna;

import java.util.ArrayList;
import java.util.List;

public class EliminarAlumnasImpl implements IEliminarClases {

    @Override
    public List<Alumna> eliminarAlumna(List<Alumna> alumnas, Alumna alumna) {
        alumnas.remove(alumna);
        return alumnas;
    }

    @Override
    public List<Alumna> eliminarAlumnaPorDni(List<Alumna> alumnas, int dni) {
        Alumna alumnaABorrar = null;

        for (Alumna alumna : alumnas) {
            if (alumna.getDni() == dni) {
                alumnaABorrar = alumna;
            }
        }

        alumnas.remove(alumnaABorrar);
        return alumnas;
    }

    @Override
    public List<Alumna> eliminarAlumnas(List<Alumna> alumnas, List<Alumna> alumnasABorrar) {

        for (Alumna alumna : alumnasABorrar) {
            alumnas.remove(alumna);
        }
        return alumnas;
    }
}
