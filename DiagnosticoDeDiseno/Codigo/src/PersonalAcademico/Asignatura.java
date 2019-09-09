package PersonalAcademico;

public class Asignatura implements Academicos {

    private int Id;
    private String Nombres;
    private String Licenciatura;

    public Asignatura(int Id, String Nombres,String Licenciatura) {
        this.Id = Id;
        this.Nombres = Nombres;
        this.Licenciatura = Licenciatura;
    }

    @Override
    public void setId(int Id) {
        this.Id = Id;
    }

    @Override
    public void setApellido1(String Apellido1) {
    }

    @Override
    public void setApellido2(String Apellido2) {
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
    public String getApellido1() { return null; }

    @Override
    public String getApellido2() { return null; }

    @Override
    public String getNombres() {
        return Nombres;
    }

    @Override
    public String getLicenciatura() {
        return Licenciatura;
    }

}