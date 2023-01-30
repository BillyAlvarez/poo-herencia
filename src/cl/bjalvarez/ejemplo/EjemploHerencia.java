package cl.bjalvarez.ejemplo;

import cl.bjalvarez.pooherencia.Alumno;
import cl.bjalvarez.pooherencia.Profesor;

public class EjemploHerencia {
    public static void main(String[] args) {
        Alumno alumno = new Alumno();
        alumno.setNombre("Marcelita");
        alumno.setApellido("Oyarce ♥");

        Profesor profesor = new Profesor();
        profesor.setNombre("Billy");
        profesor.setApellido("Alvarez♠");
        profesor.setAsignatura("Kamasuttro");

        System.out.println("Profesor: " + profesor.getNombre()
                + " " +profesor.getApellido()
                + " Maestro nivel : "+ profesor.getAsignatura());

        System.out.println("Alumna: "+ alumno.getNombre()
                + " " + alumno.getApellido());

    }
}
