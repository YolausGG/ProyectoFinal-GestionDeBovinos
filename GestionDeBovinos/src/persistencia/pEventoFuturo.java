/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import clases.EventoFuturo;
import clases.Hembra;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

public class pEventoFuturo {

    private static final String INSERT_EVENTOFUTURO = "INSERT INTO EVENTOFUTURO ( IDHEMBRA, TIPO, FECHAPREVISTA ) "
            + " VALUES ( ?, ?, ? )";
    private static final String DELETE_EVENTOFUTURO = "DELETE FROM EVENTOFUTURO WHERE IDEVENTOFUTURO = ?";
    private static final String UPDATE_EVENTOFUTURO = "UPDATE EVENTOFUTURO SET IDHEMBRA = ?, TIPO = ?, FECHAPREVISTA = ? WHERE IDEVENTOFUTURO = ?";
    private static final String BUSCAR_EVENTOFUTURO = "SELECT IDEVENTOFUTURO, IDHEMBRA, TIPO, FECHAPREVISTA"
            + " FROM EVENTOFUTURO WHERE IDEVENTOFUTURO = ? ";
    private static final String LISTAR_EVENTOSFUTUROS = "SELECT IDEVENTOFUTURO, IDHEMBRA, TIPO, FECHAPREVISTA"
            + " FROM EVENTOFUTURO"
            + " WHERE FECHAPREVISTA >= CURDATE()";
    private static final String LISTAR_EVENTOSFUTUROS_CARAVANA = "SELECT IDEVENTOFUTURO, IDHEMBRA, TIPO, FECHAPREVISTA"
            + " FROM EVENTOFUTURO WHERE IDHEMBRA = ?";

    public static boolean altaEventoFuturo(EventoFuturo pEventoFuturo) {
        try {
            PreparedStatement statement = Conexion.getConnection().prepareStatement(INSERT_EVENTOFUTURO);
            statement.setInt(1, pEventoFuturo.getHembra().getIdBovino());
            statement.setString(2, pEventoFuturo.getTipo());
            java.sql.Date sqlDate = new java.sql.Date(pEventoFuturo.getFechaPrevista().getTime());
            statement.setDate(3, sqlDate);

            int retorno = statement.executeUpdate();

            return retorno > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean bajaEventoFuturo(int idEventoFuturo) {
        try {
            PreparedStatement statement = Conexion.getConnection().prepareStatement(DELETE_EVENTOFUTURO);
            statement.setInt(1, idEventoFuturo);

            int retorno = statement.executeUpdate();

            return retorno > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean modificarEventoFuturo(int idEventoFuturo, EventoFuturo pEventoFuturo) {

        try {
            PreparedStatement statement = Conexion.getConnection().prepareStatement(UPDATE_EVENTOFUTURO);

            statement.setInt(1, pEventoFuturo.getHembra().getIdBovino());
            statement.setString(2, pEventoFuturo.getTipo());
            java.sql.Date sqlDate = new java.sql.Date(pEventoFuturo.getFechaPrevista().getTime());
            statement.setDate(3, sqlDate);
            statement.setInt(4, idEventoFuturo);

            int retorno = statement.executeUpdate();

            return retorno > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static EventoFuturo buscarEventoFuturo(int idEventoFuturo) {

        try {
            PreparedStatement statement = Conexion.getConnection().prepareStatement(BUSCAR_EVENTOFUTURO);
            statement.setInt(1, idEventoFuturo);

            ResultSet resultado = statement.executeQuery();
            EventoFuturo eventoFuturo = null;
            if (resultado.next()) {
                eventoFuturo = getEventoFuturoFromResultSet(resultado);
            }
            return eventoFuturo;

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static ArrayList<EventoFuturo> listarEventosFuturos() {

        ArrayList<EventoFuturo> listaEventosFuturos = new ArrayList<>();
        try {
            PreparedStatement statement = Conexion.getConnection().prepareCall(LISTAR_EVENTOSFUTUROS);
            ResultSet resultado = statement.executeQuery();
            EventoFuturo eventoFuturo;

            while (resultado.next()) {
                eventoFuturo = getEventoFuturoFromResultSet(resultado);
                listaEventosFuturos.add(eventoFuturo);
            }
            return listaEventosFuturos;

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static ArrayList<EventoFuturo> listarEventosFuturosPorCaravana(String pCaravanaHembra) {

        ArrayList<EventoFuturo> listaEventosFuturos = new ArrayList<>();
        try {
            PreparedStatement statement = Conexion.getConnection().prepareCall(LISTAR_EVENTOSFUTUROS_CARAVANA);

            Hembra hembra = pHembra.buscarHembraPorCaravana(pCaravanaHembra);
            statement.setInt(1, hembra.getIdBovino());

            ResultSet resultado = statement.executeQuery();
            EventoFuturo eventoFuturo;

            while (resultado.next()) {
                eventoFuturo = getEventoFuturoFromResultSet(resultado);
                listaEventosFuturos.add(eventoFuturo);
            }
            return listaEventosFuturos;

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    private static EventoFuturo getEventoFuturoFromResultSet(ResultSet resultado) throws SQLException {

        int idEventoFuturo = resultado.getInt("IDEVENTOFUTURO");

        int idHembra = resultado.getInt("IDHEMBRA");
        Hembra hembra = pHembra.buscarHembraPorId(idHembra);

        String tipo = resultado.getString("TIPO");

        Date fechaPrevista = resultado.getDate("FECHAPREVISTA");

        EventoFuturo eventoFuturo = new EventoFuturo(idEventoFuturo, hembra, tipo, fechaPrevista);
        return eventoFuturo;
    }
}
