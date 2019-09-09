package CreacionSalon;

import PersonalAcademico.Academicos;

public abstract class CreadorAbstracto {

    public static final String Lis = "LIS";
    public static final String Lic = "LIC";
    public static final String Lcc = "LCC";

    public abstract Salon Crear(Academicos asignatura,Academicos maestro,String licenciatura);
}