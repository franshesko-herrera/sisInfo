package interfaces.implementaciones;

import interfaces.IModificarClases;
import modelos.Alumna;

import java.util.ArrayList;
import java.util.List;

public class ModificarClasesImpl implements IModificarClases {

    @Override
    public List<Alumna> modificarApellidoAlumna(List<Alumna> alumnas, String apellido, String nuevoApellido) {
        List<Alumna> alumnasModificadas = new ArrayList<>();

        for (Alumna alumna : alumnas) {
            if (alumna.getApellido().equals(apellido)) {
                alumna.setApellido(nuevoApellido);
                alumnasModificadas.add(alumna);
            }
        }

        return alumnasModificadas;
    }

    @Override
    public List<Alumna> modificarCodEstudiantilAlumna(List<Alumna> listaDeAlumnasDondeBusco, int codEst, int nuevoCodEst) {
        List<Alumna> alumnasModificadas = new ArrayList<>();

        int digito = 0;
        for (Alumna alumnaIterador : listaDeAlumnasDondeBusco) {
            if (alumnaIterador.getCodEstudiantil() == codEst) {
                digito = digito + 1;
                alumnaIterador.setCodEstudiantil(nuevoCodEst + digito);
                alumnasModificadas.add(alumnaIterador);
            }
        }

        return alumnasModificadas;
    }

    @Override
    public List<Alumna> modificarCodEstudiantilAlumna(List<Alumna> listaDeAlumnasDondeBusco, int codEst, int dni, int nuevoCodEst) {

        List<Alumna> alumnasModificadas = new ArrayList<>();

        // int digito = 0;

        for (Alumna alumnaIterador : listaDeAlumnasDondeBusco) {

            if (alumnaIterador.getCodEstudiantil() == codEst && alumnaIterador.getDni() == dni) {
                // digito++;
                alumnaIterador.setCodEstudiantil(nuevoCodEst);
                alumnasModificadas.add(alumnaIterador);
            }
        }

        return alumnasModificadas;
    }
}
