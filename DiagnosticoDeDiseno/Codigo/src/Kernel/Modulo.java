package Kernel;

import ArchivosCSV.CSVAlumnos;
import ArchivosCSV.CSVAsignaturas;
import ArchivosCSV.CSVMaestros;
import CreacionSalon.Creador;
import CreacionSalon.CreadorAbstracto;
import CreacionSalon.Salon;
import PersonalAcademico.Academicos;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Modulo {

    public static void main(String[] args) {

        Scanner EscanerCadena = new Scanner(System.in);
        String CSVAlumnos,CSVMaestros,CSVAsignaturas;
        FileReader ArchivoAlumnos,ArchivoMaestos,ArchivoAsignaturas;
        ArrayList<Academicos> Alumnos = new ArrayList<>(),Maestros = new ArrayList<>(),Asignaturas = new ArrayList<>();

        System.out.printf("Escriba la localizacion del archivo con la informacion de los alumnos:\t");
        CSVAlumnos = EscanerCadena.nextLine();

        try{

            ArchivoAlumnos = new FileReader(CSVAlumnos);
            Alumnos = new CSVAlumnos().getInfo(ArchivoAlumnos);

        }catch (IOException e) {
            System.out.println("Archivo de alumnos no encontrador.");
            System.exit(-1);
        }

        System.out.printf("Escriba la localizacion del archivo con la informacion de los maestros:\t");
        CSVMaestros = EscanerCadena.nextLine();

        try{

            ArchivoMaestos = new FileReader(CSVMaestros);
            Maestros = new CSVMaestros().getInfo(ArchivoMaestos);

        }catch(IOException e){
            System.out.println("Archivo de maestros no encontrador.");
            System.exit(-1);
        }

        System.out.println("Escriba la localizacion del archivo con la informacion de las asignaturas:\t");
        CSVAsignaturas = EscanerCadena.nextLine();

        try {

            ArchivoAsignaturas = new FileReader(CSVAsignaturas);
            Asignaturas = new CSVAsignaturas().getInfo(ArchivoAsignaturas);

        } catch (IOException e) {
            System.out.println("Archivo de asignaturas no encontrado.");
            System.exit(-1);
        }

        ArrayList<Salon> Salones = CrearSalones(Maestros,Asignaturas);
        ElegirSalones(Salones,Alumnos);
        CrearArchivos(Salones);


    }

    public static ArrayList<Salon> CrearSalones(ArrayList<Academicos> maestros,ArrayList<Academicos> asignaturas){

        Scanner nuevo = new Scanner(System.in);
        CreadorAbstracto creator = new Creador();
        String EleccionMaestro;
        ArrayList<Salon> Salones = new ArrayList<>();

        for(Academicos asignatura : asignaturas){

            System.out.printf("Seleccione un maestro para: "+ asignatura.getNombres() + "\n");

            for(Academicos maestro : maestros){
                System.out.println(maestro.getNombres()+ " " + maestro.getApellido1()+ " " +maestro.getApellido2());
            }

            EleccionMaestro = nuevo.nextLine();

            for(Academicos maestro : maestros){
                if(EleccionMaestro.equalsIgnoreCase(maestro.getNombres()+ " " + maestro.getApellido1()+ " " +maestro.getApellido2())){

                    Salones.add(creator.Crear(asignatura,maestro,asignatura.getLicenciatura()));

                }
            }

        }

        return Salones;
    }

    public static void ElegirSalones(ArrayList<Salon> Salones, ArrayList<Academicos> Alumnos){

        String Contador= "0";
        Scanner nuevo = new Scanner(System.in);

        for(Salon salon : Salones){

            do{

                System.out.println("Seleccione los alumnos para la asignatura: " + salon.Asignatura.getNombres() + ", escriba -1 cuando termine");

                for(Academicos alumno : Alumnos){
                    System.out.println(alumno.getNombres() + " " + alumno.getApellido1() + " " + alumno.getApellido2());
                }

                Contador =  nuevo.nextLine();

                for(Academicos alumno : Alumnos){
                    if(Contador.equalsIgnoreCase(alumno.getNombres() + " " + alumno.getApellido1() + " " + alumno.getApellido2())){
                        salon.getAlumnos().add(alumno);
                    }
                }

            }while(!Contador.equalsIgnoreCase("-1"));

        }

    }

    public static void CrearArchivos(ArrayList<Salon> Salones){
        try {

            FileWriter newfilewriter = new FileWriter("AlumnosMaestros.txt",true);
            BufferedWriter newbuffered = new BufferedWriter(newfilewriter);
            PrintWriter printer = new PrintWriter(newbuffered);

            for (Salon salon : Salones) {
                printer.println(salon.getAsignatura().getNombres() + "," + salon.getMaestro().getNombres() + " " + salon.getMaestro().getApellido1());
                printer.flush();
            }

            printer.close();

            newfilewriter = new FileWriter("ClasesAlumnos.txt",true);
            newbuffered = new BufferedWriter(newfilewriter);
            printer = new PrintWriter(newbuffered);

            for (Salon salon : Salones) {
                printer.print(salon.getAsignatura() + ",");

                for(Academicos alumnos: salon.getAlumnos()){
                    printer.print(alumnos.getNombres() + ",");
                }
                printer.flush();
                printer.print("\n");
            }

            printer.close();

        }catch(Exception e){
            e.printStackTrace();
        }
    }

}