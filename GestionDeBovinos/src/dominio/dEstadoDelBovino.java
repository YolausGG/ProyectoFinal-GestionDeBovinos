package dominio;

import clases.EstadoDelBovino;
import persistencia.pEstadoDelBovino;

import java.util.ArrayList;

public class dEstadoDelBovino {

    public static boolean altaEstadoDelBovino(EstadoDelBovino pEstadoDelBovino) {

        return persistencia.pEstadoDelBovino.altaEstadoDelBovino(pEstadoDelBovino);
    }

    public static boolean bajaEstadoDelBovino(int idEstadoDelBovino) {

        return pEstadoDelBovino.bajaEstadoDelBovino(idEstadoDelBovino);
    }

    public static boolean modificarEstadoDelBovino(int idEstadoDelBovino, EstadoDelBovino pEstadoDelBovino) {

        return persistencia.pEstadoDelBovino.modificarEstadoDelBovino(idEstadoDelBovino, pEstadoDelBovino);
    }

    public static EstadoDelBovino buscarEstadoDelBovino(int idEstadoDelBovino) {

        return pEstadoDelBovino.buscarEstadoDelBovino(idEstadoDelBovino);
    }

    public static EstadoDelBovino buscarEstadoDelBovinoNombre(String estadoDelBovino) {

        return pEstadoDelBovino.buscarEstadoDelBovinoNombre(estadoDelBovino);
    }

    public static ArrayList<EstadoDelBovino> listarEstadosDelBovino() {

        return pEstadoDelBovino.listarEstadosDelBovino();
    }

}
