package PersonalAcademico;

public class Maestro implements Academicos {

    private int Id;
    private String Apellido1;
    private String Apellido2;
    private String Nombres;

    public Maestro(int Id,String Apellido1,String Apellido2, String Nombres) {
        this.Id = Id;
        this.Apellido1 = Apellido1;
        this.Apellido2 = Apellido2;
        this.Nombres = Nombres;
    }

    @Override
    public void setId(int Id) {
        this.Id = Id;
    }

    @Override
    public void setApellido1(String Apellido1) {
        this.Apellido1 = Apellido1;
    }

    @Override
    public void setApellido2(String Apellido2) {
        this.Apellido2 = Apellido2;
    }

    @Override
    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    @Override
    public void setLicenciatura(String Licenciatura) {
    }

    @Override
    public int getId() {
        return Id;
    }

    @Override
    public String getApellido1() {
        return Apellido1;
    }

    @Override
    public String getApellido2() {
        return Apellido2;
    }

    @Override
    public String getNombres() {
        return Nombres;
    }

    @Override
    public String getLicenciatura() {
        return null;
    }

}
