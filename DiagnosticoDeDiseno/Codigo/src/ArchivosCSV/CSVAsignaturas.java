package ArchivosCSV;

import PersonalAcademico.Academicos;
import PersonalAcademico.Asignatura;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class CSVAsignaturas extends ArchivoCSV{

    @Override
    public ArrayList<Academicos> getInfo(FileReader Url)throws IOException {

        ArrayList<Academicos> Asignaturas = new ArrayList<>();
        BufferedReader Lector = new BufferedReader(Url);
        String Linea;

        Lector.readLine();

        while((Linea = Lector.readLine()) != null){

            String[] data = Linea.split(",");

            Asignaturas.add(new Asignatura(Integer.parseInt(data[0]),data[1],data[2]));

        }

        return Asignaturas;

    }

}
