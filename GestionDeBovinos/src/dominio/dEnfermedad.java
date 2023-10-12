package dominio;

import clases.Enfermedad;
import persistencia.pEnfermedad;

import java.util.ArrayList;

public class dEnfermedad {

    public static boolean altaEnfermedad(Enfermedad pEnfermedad) {

        return persistencia.pEnfermedad.altaEnfermedad(pEnfermedad);
    }

    public static boolean bajaEnfermedad(int idEnfermedad) {

        return pEnfermedad.bajaEnfermedad(idEnfermedad);
    }

    public static boolean modificarEnfermedad(int idEnfermedad, Enfermedad pEnfermedad) {

        return persistencia.pEnfermedad.modificarEnfermedad(idEnfermedad, pEnfermedad);
    }

    public static Enfermedad buscarEnfermedad(int idEnfermedad) {

        return pEnfermedad.buscarEnfermedad(idEnfermedad);
    }

    public static Enfermedad buscarEnfermedadNombre(String pNombre) {

        return pEnfermedad.buscarEnfermedadNombre(pNombre);
    }

    public static Enfermedad buscarUltimaEnfermedad() {

        return pEnfermedad.buscarUltimaEnfermedad();
    }

    public static ArrayList<Enfermedad> listarEnfermedades() {

        return pEnfermedad.listarEnfermedades();
    }

}
