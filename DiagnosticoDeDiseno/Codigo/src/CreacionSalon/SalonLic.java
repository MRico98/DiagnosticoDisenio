package CreacionSalon;

import PersonalAcademico.Academicos;
import PersonalAcademico.Alumno;
import PersonalAcademico.Asignatura;
import PersonalAcademico.Maestro;

import java.util.ArrayList;

public class SalonLic extends Salon {


    public SalonLic(Academicos asignatura, Academicos maestro, String licenciatura) {
        super(asignatura, maestro, licenciatura);
    }
}