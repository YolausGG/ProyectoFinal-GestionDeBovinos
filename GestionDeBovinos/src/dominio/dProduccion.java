/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

import clases.Produccion;
import java.util.ArrayList;

public class dProduccion {

    public static boolean altaProduccion(Produccion pProduccion) {

        return persistencia.pProduccion.altaProduccion(pProduccion);
    }

    public static boolean bajaProduccion(int idProduccion) {

        return persistencia.pProduccion.bajaProduccion(idProduccion);
    }

    public static boolean modificarProduccion(Produccion pProduccion) {

        return persistencia.pProduccion.modificarProduccion(pProduccion);
    }

    public static Produccion buscarProduccion(int idProduccion) {

        return persistencia.pProduccion.buscarProduccion(idProduccion);
    }

    public static Produccion buscarProduccionHembra(int idHembra) {

        return persistencia.pProduccion.buscarProduccionHembra(idHembra);
    }

    public static Produccion buscarUltimaProduccionHembra(int idHembra) {

        return persistencia.pProduccion.buscarUltimaProduccionHembra(idHembra);
    }

    public static ArrayList<Produccion> listarProducciones() {

        return persistencia.pProduccion.listarProducciones();
    }

    public static ArrayList<Produccion> listarProduccionesHembra(int idHembra) {

        return persistencia.pProduccion.listarProduccionesHembra(idHembra);
    }

    public static ArrayList<Produccion> listarUltimasProducciones() {

        return persistencia.pProduccion.listarUltimasProducciones();
    }

}
