package ArchivosCSV;

import PersonalAcademico.Academicos;

import java.io.*;
import java.util.ArrayList;

public abstract class ArchivoCSV {

    public abstract ArrayList<Academicos> getInfo(FileReader Url) throws IOException;

}