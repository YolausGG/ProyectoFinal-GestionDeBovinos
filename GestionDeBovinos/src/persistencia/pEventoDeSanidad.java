/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import clases.EventoDeSanidad;
import clases.Hembra;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

public class pEventoDeSanidad {

    private static final String INSERT_EVENTO_DE_SANIDAD = "INSERT INTO EVENTOSDESANIDAD (FECHA, DETALLE, IDHEMBRA ) "
            + " VALUES ( ?, ?, ? )";
    private static final String DELETE_EVENTO_DE_SANIDAD = "DELETE FROM EVENTOSDESANIDAD WHERE IDEVENTODESANIDAD = ?";
    private static final String UPDATE_EVENTO_DE_SANIDAD = "UPDATE EVENTOSDESANIDAD SET FECHA = ?, DETALLE = ?, IDHEMBRA = ? WHERE IDEVENTODESANIDAD = ?";
    private static final String BUSCAR_EVENTO_DE_SANIDAD_ID = "SELECT * FROM EVENTOSDESANIDAD WHERE IDEVENTODESANIDAD = ? ";
    private static final String BUSCAR_EVENTO_DE_SANIDAD_ULTIMO = "SELECT * FROM EVENTOSDESANIDAD ORDER BY IDEVENTODESANIDAD DESC LIMIT 1";
    private static final String LISTAR_EVENTOS_DE_SANIDAD = "SELECT * FROM EVENTOSDESANIDAD";
    private static final String LISTAR_EVENTOS_DE_SANIDAD_CARAVANA = "SELECT * FROM EVENTOSDESANIDAD WHERE IDHEMBRA = ?";

    public static boolean altaEventoDeSanidad(EventoDeSanidad pEventoDeSanidad) {

        try {
            PreparedStatement statement = Conexion.getConnection().prepareStatement(INSERT_EVENTO_DE_SANIDAD);
            java.sql.Date sqlDate = new java.sql.Date(pEventoDeSanidad.getFecha().getTime());
            statement.setDate(1, sqlDate);
            statement.setString(2, pEventoDeSanidad.getDetalle());
            statement.setInt(3, pEventoDeSanidad.getHembra().getIdBovino());
            int retorno = statement.executeUpdate();

            return retorno > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean bajaEventoDeSanidad(int idEventoDeSanidad) {
        try {
            PreparedStatement statement = Conexion.getConnection().prepareStatement(DELETE_EVENTO_DE_SANIDAD);
            statement.setInt(1, idEventoDeSanidad);

            int retorno = statement.executeUpdate();
            return retorno > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean modificarEventoDeSanidad(int idEventoDesanidad, EventoDeSanidad pEventoDeSanidad) {

        try {
            PreparedStatement statement = Conexion.getConnection().prepareStatement(UPDATE_EVENTO_DE_SANIDAD);

            java.sql.Date sqlDate = new java.sql.Date(pEventoDeSanidad.getFecha().getTime());
            statement.setDate(1, sqlDate);
            statement.setString(2, pEventoDeSanidad.getDetalle());
            statement.setInt(3, pEventoDeSanidad.getHembra().getIdBovino());
            statement.setInt(4, idEventoDesanidad);

            int retorno = statement.executeUpdate();
            return retorno > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static EventoDeSanidad buscarEventoDeSanidadId(int idEventoDeSanidad) {

        try {
            PreparedStatement statement = Conexion.getConnection().prepareStatement(BUSCAR_EVENTO_DE_SANIDAD_ID);
            statement.setInt(1, idEventoDeSanidad);

            ResultSet resultado = statement.executeQuery();
            EventoDeSanidad eventoDeSanidad = null;
            if (resultado.next()) {
                eventoDeSanidad = getEventoDeSanidadFromResultSet(resultado);
            }
            return eventoDeSanidad;

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static EventoDeSanidad buscarEventoDeSanidadUltimo() {

        try {
            PreparedStatement statement = Conexion.getConnection().prepareStatement(BUSCAR_EVENTO_DE_SANIDAD_ULTIMO);

            ResultSet resultado = statement.executeQuery();
            EventoDeSanidad eventoDeSanidad = null;
            if (resultado.next()) {
                eventoDeSanidad = getEventoDeSanidadFromResultSet(resultado);
            }
            return eventoDeSanidad;

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static ArrayList<EventoDeSanidad> listarEventosDeSanidad() {

        ArrayList<EventoDeSanidad> listaEventosDeSanidad = new ArrayList<>();
        try {
            PreparedStatement statement = Conexion.getConnection().prepareCall(LISTAR_EVENTOS_DE_SANIDAD);
            ResultSet resultado = statement.executeQuery();
            EventoDeSanidad eventoDeSanidad;

            while (resultado.next()) {
                eventoDeSanidad = getEventoDeSanidadFromResultSet(resultado);
                listaEventosDeSanidad.add(eventoDeSanidad);
            }
            return listaEventosDeSanidad;

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static ArrayList<EventoDeSanidad> listarEventosDeSanidadPorCaravana(String pCaravanaHembra) {

        ArrayList<EventoDeSanidad> listaEventosDeSanidad = new ArrayList<>();
        try {
            PreparedStatement statement = Conexion.getConnection().prepareCall(LISTAR_EVENTOS_DE_SANIDAD_CARAVANA);

            Hembra hembra = pHembra.buscarHembraPorCaravana(pCaravanaHembra);
            statement.setInt(1, hembra.getIdBovino());

            ResultSet resultado = statement.executeQuery();
            EventoDeSanidad eventoDeSanidad;

            while (resultado.next()) {
                eventoDeSanidad = getEventoDeSanidadFromResultSet(resultado);
                listaEventosDeSanidad.add(eventoDeSanidad);
            }
            return listaEventosDeSanidad;

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    private static EventoDeSanidad getEventoDeSanidadFromResultSet(ResultSet resultado) throws SQLException {

        int idEventoDeSanidad = resultado.getInt("IDEVENTODESANIDAD");
        Date fecha = (java.util.Date) resultado.getDate("FECHA");
        String detalle = resultado.getString("DETALLE");

        int idHembra = resultado.getInt("IDHEMBRA");
        Hembra hembra = pHembra.buscarHembraPorId(idHembra);

        EventoDeSanidad eventoDeSanidad = new EventoDeSanidad(idEventoDeSanidad, fecha, detalle, hembra);

        return eventoDeSanidad;
    }

}
