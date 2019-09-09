package ArchivosCSV;

import PersonalAcademico.Academicos;
import PersonalAcademico.Alumno;
import java.io.*;
import java.util.ArrayList;

public class CSVAlumnos extends ArchivoCSV {

    @Override
    public ArrayList<Academicos> getInfo(FileReader Url)throws IOException {

        ArrayList<Academicos> Alumnos = new ArrayList<>();
        BufferedReader Lector = new BufferedReader(Url);
        String Linea;

        Lector.readLine();

        while((Linea = Lector.readLine()) != null){

            String[] data = Linea.split(",");

            Alumnos.add(new Alumno(Integer.parseInt(data[0]),data[1],data[2],data[3],data[4]));

        }

        return Alumnos;
    }
}
