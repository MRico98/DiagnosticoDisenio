package CreacionSalon;

import PersonalAcademico.Academicos;
import PersonalAcademico.Alumno;
import PersonalAcademico.Asignatura;
import PersonalAcademico.Maestro;

import java.util.ArrayList;

public abstract class Salon {

    public Academicos Asignatura;
    public Academicos Maestro;
    public ArrayList<Academicos> Alumnos;
    public String Licenciatura;

    public Salon(Academicos asignatura, Academicos maestro, String licenciatura) {
        Asignatura = asignatura;
        Maestro = maestro;
        Alumnos = new ArrayList<>();
        Licenciatura = licenciatura;
    }

    public Academicos getAsignatura() {
        return Asignatura;
    }

    public void setAsignatura(Academicos asignatura) {
        Asignatura = asignatura;
    }

    public Academicos getMaestro() {
        return Maestro;
    }

    public void setMaestro(Academicos maestro) {
        Maestro = maestro;
    }

    public ArrayList<Academicos> getAlumnos() {
        return Alumnos;
    }

    public void setAlumnos(ArrayList<Academicos> alumnos) {
        Alumnos = alumnos;
    }

    public String getLicenciatura() {
        return Licenciatura;
    }

    public void setLicenciatura(String licenciatura) {
        Licenciatura = licenciatura;
    }
}
