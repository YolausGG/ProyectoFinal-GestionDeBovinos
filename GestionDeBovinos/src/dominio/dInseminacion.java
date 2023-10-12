/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

import clases.Inseminacion;
import java.util.ArrayList;
import persistencia.pInseminacion;

public class dInseminacion {

    public static boolean altaInseminacion(Inseminacion pInseminacion) {

        return persistencia.pInseminacion.altaInseminacion(pInseminacion);
    }

    public static boolean bajaInseminacion(int idInseminacion) {

        return pInseminacion.bajaInseminacion(idInseminacion);
    }

    public static boolean modificarInseminacion(int idInseminacion, Inseminacion pInseminacion) {

        return persistencia.pInseminacion.modificarInseminacion(idInseminacion, pInseminacion);
    }

    public static Inseminacion buscarInseminacion(int idInseminacion) {

        return pInseminacion.buscarInseminacion(idInseminacion);
    }

    public static ArrayList<Inseminacion> listarInseminaciones() {

        return pInseminacion.listarInseminaciones();
    }

    public static ArrayList<Inseminacion> listarInseminacionesPorCaravana(String pCaravana) {

        return pInseminacion.listarInseminacionesPorCaravana(pCaravana);
    }

    public static ArrayList<Inseminacion> listarInseminacionesPorCaravanaHembraYMacho(String pCaravanaHembra, String pCaravanaMacho) {

        return pInseminacion.listarInseminacionesPorCaravanaHembraYMacho(pCaravanaHembra, pCaravanaMacho);
    }
}
