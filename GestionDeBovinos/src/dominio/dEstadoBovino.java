/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

import clases.EstadoBovino;
import java.util.ArrayList;

public class dEstadoBovino {

    public static boolean altaEstadoBovinoFechaInicio(EstadoBovino pEstadoBovino) {

        return persistencia.pEstadoBovino.altaEstadoBovinoFechaInicio(pEstadoBovino);
    }

    public static boolean altaEstadoBovino(EstadoBovino pEstadoBovino) {

        return persistencia.pEstadoBovino.altaEstadoBovino(pEstadoBovino);
    }

    public static boolean bajaEstadoBovino(EstadoBovino pEstadoBovino) {

        return persistencia.pEstadoBovino.bajaEstadoBovino(pEstadoBovino);
    }

    public static boolean deleteEstadoBovino(EstadoBovino pEstadoBovino) {

        return persistencia.pEstadoBovino.deleteEstadoBovino(pEstadoBovino);
    }

    public static boolean modificarEstadoBovino(EstadoBovino pEstadoBovinoNuevo, EstadoBovino pEstadoBovinoViejo) {

        return persistencia.pEstadoBovino.modificarEstadoBovino(pEstadoBovinoNuevo, pEstadoBovinoViejo);
    }

    public static boolean modificarEstadoBovinoFechaInicio(EstadoBovino pEstadoBovinoNuevo, EstadoBovino pEstadoBovinoViejo) {

        return persistencia.pEstadoBovino.modificarEstadoBovinoFechaInicio(pEstadoBovinoNuevo, pEstadoBovinoViejo);
    }

    public static EstadoBovino buscarEstadoBovino(EstadoBovino pEstadoBovino) {

        return persistencia.pEstadoBovino.buscarEstadoBovino(pEstadoBovino);
    }

    public static EstadoBovino buscarUltimoEstadoBovinoNombre(EstadoBovino pEstadoBovino) {

        return persistencia.pEstadoBovino.buscarUltimoEstadoBovinoNombre(pEstadoBovino);
    }

    public static ArrayList<EstadoBovino> listarEstadosBovino() {

        return persistencia.pEstadoBovino.listarEstadosBovino();
    }

    public static ArrayList<EstadoBovino> listarEstadosBovinoActivos() {

        return persistencia.pEstadoBovino.listarEstadosBovinoActivos();
    }

    public static ArrayList<EstadoBovino> listarEstadosBovinoPorBovino(int idBovino) {

        return persistencia.pEstadoBovino.listarEstadosBovinoPorBovino(idBovino);

    }

    public static ArrayList<EstadoBovino> listarEstadosBovinoActivosPorBovino(int idBovino) {

        return persistencia.pEstadoBovino.listarEstadosBovinoActivosPorBovino(idBovino);

    }

    public static ArrayList<EstadoBovino> listarEstadosBovinoPorEstado(int idEstadoDelBovino) {

        return persistencia.pEstadoBovino.listarEstadosBovinoPorEstado(idEstadoDelBovino);

    }

    public static ArrayList<EstadoBovino> listarEstadosBovinoActivosPorEstado(int idEstadoDelBovino) {

        return persistencia.pEstadoBovino.listarEstadosBovinoActivosPorEstado(idEstadoDelBovino);

    }

    public static ArrayList<EstadoBovino> listarEstadosBovinoPorBovinoPorEstado(int idBovino, int idEstadoDelBovino) {

        return persistencia.pEstadoBovino.listarEstadosBovinoPorBovinoPorEstado(idBovino, idEstadoDelBovino);

    }

    public static ArrayList<EstadoBovino> listarEstadosBovinoActivosPorBovinoPorEstado(int idBovino, int idEstadoDelBovino) {

        return persistencia.pEstadoBovino.listarEstadosBovinoActivosPorBovinoPorEstado(idBovino, idEstadoDelBovino);
    }

}
