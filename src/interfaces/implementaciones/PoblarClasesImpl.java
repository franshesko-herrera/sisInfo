package interfaces.implementaciones;

import interfaces.IPoblarClases;
import modelos.Administrativo;
import modelos.Alumna;
import modelos.Curso;
import modelos.Paciente;
import modelos.Profesor;
import modelos.ServicioSocial;
import modelos.Supervisor;
import modelos.Vendedor;

import java.util.ArrayList;
import java.util.List;

public class PoblarClasesImpl implements IPoblarClases {

    @Override
    public List<Alumna> crearAlumnas() {

        //1. cree una lista vacía de alumnas
        List<Alumna> alumnas = new ArrayList<>();

        //2. cree objetos de ese tipo (alumna)
        Alumna yanet = new Alumna("Yanet", "Vazquez", 1234, 0);
        Alumna pili = new Alumna("Pili", "Castro", 1235, 2);
        Alumna gaby = new Alumna("Gaby", "Vazquez", 1236, 3);
        Alumna jezz = new Alumna("Jezz", "Diaz", 1237, 4);
        Alumna yuli = new Alumna("Yuli", "Quinteros", 1238, 5);
        Alumna sofia = new Alumna("Sofia", "Gonzalez", 31235, 6);
        Alumna aurora = new Alumna("Aurora", "Canales", 12356, 0);
        Alumna andreaL = new Alumna("ANdrea", "Leiva", 12637, 0);
        Alumna andreaC = new Alumna("AndRea", "Chacin", 120037, 9);
        Alumna sol = new Alumna("Sol", "Vazquez", 1200333, 19);

        //3. agregue los objetos a la lista
        alumnas.add(sol);
        alumnas.add(yanet);
        alumnas.add(pili);
        alumnas.add(gaby);
        alumnas.add(jezz);
        alumnas.add(yuli);
        alumnas.add(sofia);
        alumnas.add(aurora);
        alumnas.add(andreaC);
        alumnas.add(andreaL);


        //4. retorne la lista
        return alumnas;
    }

    @Override
    public List<Profesor> crearProfesores() {
        //1. lista vacía
        List<Profesor> profesores = new ArrayList<>();

        //2. creo objetos
        Curso backend = new Curso("backend 4ta gen.");
        Curso frontend = new Curso("frontend 2da gen.");
        Curso js = new Curso("JS 1ra gen.");

        Profesor fran = new Profesor("Fran", "Herrera", 3333, backend);

        Profesor pedro = new Profesor("Pedro", "Perez", 3334, frontend);

        Profesor carlos = new Profesor("Carlos", "Sanchez", 3335, js);

        Profesor fran2 = new Profesor("Fran2", "Herrera", 3333, js);

        Profesor fran3 = new Profesor("Fran3", "Herrera", 3333, backend);

        Profesor fran4 = new Profesor("Fran4", "Herrera", 3333, null);

        Profesor fran5 = new Profesor("Fran5", "Herrera", 3333, null);

        //3. agrego obj a la lista
        profesores.add(fran);
        profesores.add(pedro);
        profesores.add(carlos);
        profesores.add(fran2);
        profesores.add(fran3);
        profesores.add(fran4);
        profesores.add(fran5);

        //4. retorno la lista
        return profesores;
    }

    @Override
    public List<Administrativo> crearAdministrativos() {
        //1. crear lista vacía
        List<Administrativo> administrativos = new ArrayList<>();

        //2. crear objetos
        Administrativo eze = new Administrativo("Ezequiel", "Gonzalez", 2222, "Ger. Admin.");
        Administrativo pablo = new Administrativo("Pablo", "Hoc", 2223, "Ger. Contenido");
        Administrativo meli = new Administrativo("Meli", "Oleo", 2224, "Ger. RRHH.");

        //3. agregar objetos a la lista
        administrativos.add(eze);
        administrativos.add(pablo);
        administrativos.add(meli);

        //4. retornar lista
        return administrativos;
    }

    @Override
    public List<Curso> crearCursos() {

        List<Curso> cursos = new ArrayList<>();

        Curso backend = new Curso("backend 4ta gen.");
        Curso frontend = new Curso("frontend 6ta gen.");
        Curso javascript = new Curso("javascript 1ra gen.");

        cursos.add(backend);
        cursos.add(frontend);
        cursos.add(javascript);

        return cursos;
    }

    @Override
    public List<Paciente> crearPacientes() {
        List<Paciente> pacientes = new ArrayList<>();

        ServicioSocial servicioSocial1 = new ServicioSocial("platinum", 200);
        ServicioSocial servicioSocial2 = new ServicioSocial("premium", 450);

        Paciente paciente = new Paciente("Sofia", "Gonzalez", 990, 990, servicioSocial1);
        Paciente paciente2 = new Paciente("Andrea", "Gonzalez", 991, 991, servicioSocial2);
        Paciente paciente3 = new Paciente("Pili", "Gonzalez", 992, 992, null);
        Paciente paciente4 = new Paciente("Yanet", "Gonzalez", 993, 993, servicioSocial1);
        Paciente paciente5 = new Paciente("Aurora", "Gonzalez", 994, 994, servicioSocial2);
        Paciente paciente6 = new Paciente("Claudia", "Gonzalez", 995, 995, null);
        Paciente paciente7 = new Paciente("Romi", "Gonzalez", 996, 996, servicioSocial2);

        pacientes.add(paciente);
        pacientes.add(paciente2);
        pacientes.add(paciente3);
        pacientes.add(paciente4);
        pacientes.add(paciente5);
        pacientes.add(paciente6);
        pacientes.add(paciente7);

        return pacientes;
    }

    @Override
    public List<Vendedor> crearVendedores() {
        List<Vendedor> vendedores = new ArrayList<>();

        Vendedor vendedor1 = new Vendedor("Evelin", "Esquivel", 4444, 1, 2, 2000, 1000);
        Vendedor vendedor2 = new Vendedor("Gaston", "Perez", 4445, 2, 2, 1000, 1000);
        Vendedor vendedor3 = new Vendedor("Carla", "Pietri", 4446, 3, 2, 2500, 1000);

        vendedores.add(vendedor1);
        vendedores.add(vendedor2);
        vendedores.add(vendedor3);

        return vendedores;
    }

    @Override
    public List<Supervisor> crearSupervisores() {
        List<Supervisor> supervisores = new ArrayList<>();

        Supervisor supervisor = new Supervisor("Yuli", "Quinteros",
                5666, 1, 2000, null, 5000, 1);

        supervisores.add(supervisor);

        return supervisores;
    }
}
