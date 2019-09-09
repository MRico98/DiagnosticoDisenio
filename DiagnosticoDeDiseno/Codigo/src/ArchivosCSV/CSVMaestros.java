package ArchivosCSV;

import PersonalAcademico.Academicos;
import PersonalAcademico.Asignatura;
import PersonalAcademico.Maestro;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class CSVMaestros extends ArchivoCSV {

    @Override
    public ArrayList<Academicos> getInfo(FileReader Url) throws IOException {

        ArrayList<Academicos> Maestros = new ArrayList<>();
        BufferedReader Lector = new BufferedReader(Url);
        String Linea;

        Lector.readLine();

        while((Linea = Lector.readLine()) != null){

            String[] data = Linea.split(",");

            Maestros.add(new Maestro(Integer.parseInt(data[0]),data[1],data[2],data[3]));

        }

        return Maestros;
    }

}
