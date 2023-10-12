/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

import clases.Tratamiento;
import java.util.ArrayList;

public class dTratamiento {

    public static boolean altaTratamientoFechaInicio(Tratamiento pTratamiento) {

        return persistencia.pTratamiento.altaTratamientoFechaInicio(pTratamiento);
    }

    public static boolean altaTratamiento(Tratamiento pTratamiento) {

        return persistencia.pTratamiento.altaTratamiento(pTratamiento);
    }

    public static boolean bajaTratamiento(int idTratamiento) {

        return persistencia.pTratamiento.bajaTratamiento(idTratamiento);
    }

    public static boolean modificarTratamiento(Tratamiento pTratamiento) {

        return persistencia.pTratamiento.modificarTratamiento(pTratamiento);
    }

    public static boolean modificarTratamientoFechaFin(Tratamiento pTratamiento) {

        return persistencia.pTratamiento.modificarTratamientoFechaFin(pTratamiento);
    }

    public static boolean modificarTratamientoFechaInicio(Tratamiento pTratamiento) {

        return persistencia.pTratamiento.modificarTratamientoFechaInicio(pTratamiento);
    }

    public static Tratamiento buscarTratamiento(int idTratamiento) {

        return persistencia.pTratamiento.buscarTratamiento(idTratamiento);
    }

    public static ArrayList<Tratamiento> listarTratamientos() {

        return persistencia.pTratamiento.listarTratamientos();
    }

    public static ArrayList<Tratamiento> listarTratamientosActivos() {

        return persistencia.pTratamiento.listarTratamientosActivos();
    }

    public static ArrayList<Tratamiento> listarTratamientosActivosBovino(int idBovino) {

        return persistencia.pTratamiento.listarTratamientosActivosBovino(idBovino);
    }

}
