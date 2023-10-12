/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

import clases.EventoFuturo;
import java.util.ArrayList;

public class dEventoFuturo {

    public static boolean altaEventoFuturo(EventoFuturo pEventoFuturo) {

        return persistencia.pEventoFuturo.altaEventoFuturo(pEventoFuturo);
    }

    public static boolean bajaEventoFuturo(int idEventoFuturo) {

        return persistencia.pEventoFuturo.bajaEventoFuturo(idEventoFuturo);
    }

    public static boolean modificarEventoFuturo(int idEventoFuturo, EventoFuturo pEventoFuturo) {

        return persistencia.pEventoFuturo.modificarEventoFuturo(idEventoFuturo, pEventoFuturo);
    }

    public static EventoFuturo buscarEventoFuturo(int idEventoFuturo) {

        return persistencia.pEventoFuturo.buscarEventoFuturo(idEventoFuturo);
    }

    public static ArrayList<EventoFuturo> listarEventosFuturos() {

        return persistencia.pEventoFuturo.listarEventosFuturos();
    }

    public static ArrayList<EventoFuturo> listarEventosFuturosPorCaravana(String pCaravanaHembra) {

        return persistencia.pEventoFuturo.listarEventosFuturosPorCaravana(pCaravanaHembra);
    }

}
