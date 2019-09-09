package CreacionSalon;

import PersonalAcademico.Academicos;

public class Creador extends CreadorAbstracto {

    @Override
    public Salon Crear(Academicos asignatura,Academicos maestro,String licenciatura) {

        Salon NuevoSalon;

        switch(licenciatura){

            case Lis:
                NuevoSalon = new SalonLis(asignatura, maestro, licenciatura);
                break;
            case Lic:
                NuevoSalon = new SalonLic(asignatura, maestro, licenciatura);
                break;
            case Lcc:
                NuevoSalon = new SalonLcc(asignatura, maestro, licenciatura);
                break;
            default:
                NuevoSalon = null;

        }

        return NuevoSalon;
    }
}
