/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

import clases.EventoDeSanidad;
import java.util.ArrayList;

public class dEventoDeSanidad {

    public static boolean altaEventoDeSanidad(EventoDeSanidad pEventoDeSanidad) {

        return persistencia.pEventoDeSanidad.altaEventoDeSanidad(pEventoDeSanidad);
    }

    public static boolean bajaEventoDeSanidad(int idEventoDeSanidad) {

        return persistencia.pEventoDeSanidad.bajaEventoDeSanidad(idEventoDeSanidad);
    }

    public static boolean modificarEventoDeSanidad(int idEventoDesanidad, EventoDeSanidad pEventoDeSanidad) {

        return persistencia.pEventoDeSanidad.modificarEventoDeSanidad(idEventoDesanidad, pEventoDeSanidad);
    }

    public static EventoDeSanidad buscarEventoDeSanidadId(int idEventoDeSanidad) {

        return persistencia.pEventoDeSanidad.buscarEventoDeSanidadId(idEventoDeSanidad);
    }

    public static EventoDeSanidad buscarEventoDeSanidadUltimo() {

        return persistencia.pEventoDeSanidad.buscarEventoDeSanidadUltimo();
    }

    public static ArrayList<EventoDeSanidad> listarEventosDeSanidad() {

        return persistencia.pEventoDeSanidad.listarEventosDeSanidad();
    }

    public static ArrayList<EventoDeSanidad> listarEventosDeSanidadPorCaravana(String pCaravanaHembra) {

        return persistencia.pEventoDeSanidad.listarEventosDeSanidadPorCaravana(pCaravanaHembra);
    }

}
