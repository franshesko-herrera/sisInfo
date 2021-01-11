package interfaces.implementaciones;

import interfaces.IParaPacientes;
import modelos.Paciente;

public class ParaPacientesImpl implements IParaPacientes {
    @Override
    public String atenderPaciente(Paciente paciente) {
        String respuesta = "";

        if (paciente == null) {
            respuesta = "PACIENTE NO ENCONTRADO!";
        } else {
            if (paciente.getServicioSocial() == null) {
                respuesta = "NOOOO LO VOY A ATENDER!!!!";
            } else {
                respuesta = paciente.toString();
            }

        }

        return respuesta;
    }
}
