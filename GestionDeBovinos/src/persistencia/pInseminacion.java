/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import clases.Bovino;
import clases.Hembra;
import clases.Inseminacion;
import clases.Macho;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

public class pInseminacion {

    private static final String INSERT_INSEMINACION = " INSERT INTO INSEMINACION ( IDINSEMINACION, IDMACHO ) "
            + " VALUES ( ?, ? )";
    private static final String DELETE_INSEMINACION = "DELETE FROM INSEMINACION WHERE IDINSEMINACION = ?";
    private static final String UPDATE_INSEMINACION = "UPDATE INSEMINACION SET IDMACHO = ? WHERE IDINSEMINACION = ?";
    private static final String BUSCAR_INSEMINACION = "SELECT E.IDEVENTODESANIDAD, E.FECHA, E.DETALLE, E.IDHEMBRA, I.IDMACHO"
            + " FROM INSEMINACION I INNER JOIN EVENTOSDESANIDAD E ON I.IDINSEMINACION = E.IDEVENTODESANIDAD WHERE I.IDINSEMINACION = ? ";
    private static final String LISTAR_INSEMINACIONES = "SELECT E.IDEVENTODESANIDAD, E.FECHA, E.DETALLE, E.IDHEMBRA, I.IDMACHO"
            + " FROM INSEMINACION I INNER JOIN EVENTOSDESANIDAD E ON I.IDINSEMINACION = E.IDEVENTODESANIDAD";
    private static final String LISTAR_INSEMINACIONES_CARAVANA = "SELECT E.IDEVENTODESANIDAD, E.FECHA, E.DETALLE, E.IDHEMBRA, I.IDMACHO"
            + " FROM INSEMINACION I INNER JOIN EVENTOSDESANIDAD E ON I.IDINSEMINACION = E.IDEVENTODESANIDAD "
            + " WHERE E.IDHEMBRA = ? OR I.IDMACHO = ?";
    private static final String LISTAR_INSEMINACIONES_CARAVANA_JUNTOS = "SELECT E.IDEVENTODESANIDAD, E.FECHA, E.DETALLE, E.IDHEMBRA, I.IDMACHO"
            + " FROM INSEMINACION I INNER JOIN EVENTOSDESANIDAD E ON I.IDINSEMINACION = E.IDEVENTODESANIDAD "
            + " WHERE E.IDHEMBRA = ? AND I.IDMACHO = ?";

    public static boolean altaInseminacion(Inseminacion pInseminacion) {
        try {
            PreparedStatement statement = Conexion.getConnection().prepareStatement(INSERT_INSEMINACION);
            statement.setInt(1, pInseminacion.getIdEventoDeSanidad());
            statement.setInt(2, pInseminacion.getMacho().getIdBovino());

            int retorno = statement.executeUpdate();

            return retorno > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean bajaInseminacion(int idInseminacion) {
        try {
            PreparedStatement statement = Conexion.getConnection().prepareStatement(DELETE_INSEMINACION);
            statement.setInt(1, idInseminacion);

            int retorno = statement.executeUpdate();

            if (retorno > 0) {
                return pEventoDeSanidad.bajaEventoDeSanidad(idInseminacion);
            }
            return retorno > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean modificarInseminacion(int idInseminacion, Inseminacion pInseminacion) {

        try {
            PreparedStatement statement = Conexion.getConnection().prepareStatement(UPDATE_INSEMINACION);

            statement.setInt(1, pInseminacion.getMacho().getIdBovino());
            statement.setInt(2, idInseminacion);

            int retorno = statement.executeUpdate();

            if (retorno > 0) {
                return pEventoDeSanidad.modificarEventoDeSanidad(idInseminacion, pInseminacion);
            }

            return retorno > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static Inseminacion buscarInseminacion(int idInseminacion) {

        try {
            PreparedStatement statement = Conexion.getConnection().prepareStatement(BUSCAR_INSEMINACION);
            statement.setInt(1, idInseminacion);

            ResultSet resultado = statement.executeQuery();
            Inseminacion inseminacion = null;
            if (resultado.next()) {
                inseminacion = getInseminacionFromResultSet(resultado);
            }
            return inseminacion;

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static ArrayList<Inseminacion> listarInseminaciones() {

        ArrayList<Inseminacion> listaInseminaciones = new ArrayList<>();
        try {
            PreparedStatement statement = Conexion.getConnection().prepareCall(LISTAR_INSEMINACIONES);
            ResultSet resultado = statement.executeQuery();
            Inseminacion inseminacion;

            while (resultado.next()) {
                inseminacion = getInseminacionFromResultSet(resultado);
                listaInseminaciones.add(inseminacion);
            }
            return listaInseminaciones;

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static ArrayList<Inseminacion> listarInseminacionesPorCaravana(String pCaravana) {

        ArrayList<Inseminacion> listaInseminaciones = new ArrayList<>();
        try {
            PreparedStatement statement = Conexion.getConnection().prepareCall(LISTAR_INSEMINACIONES_CARAVANA);

            Bovino bovino = pBovino.buscarBovinoCaravana(pCaravana);
            statement.setInt(1, bovino.getIdBovino());
            statement.setInt(2, bovino.getIdBovino());

            ResultSet resultado = statement.executeQuery();
            Inseminacion inseminacion;

            while (resultado.next()) {
                inseminacion = getInseminacionFromResultSet(resultado);
                listaInseminaciones.add(inseminacion);
            }
            return listaInseminaciones;

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static ArrayList<Inseminacion> listarInseminacionesPorCaravanaHembraYMacho(String pCaravanaHembra, String pCaravanaMacho) {

        ArrayList<Inseminacion> listaInseminaciones = new ArrayList<>();
        try {
            PreparedStatement statement = Conexion.getConnection().prepareCall(LISTAR_INSEMINACIONES_CARAVANA_JUNTOS);

            Bovino hembra = pBovino.buscarBovinoCaravana(pCaravanaHembra);
            statement.setInt(1, hembra.getIdBovino());
            Bovino macho = pBovino.buscarBovinoCaravana(pCaravanaMacho);
            statement.setInt(2, macho.getIdBovino());

            ResultSet resultado = statement.executeQuery();
            Inseminacion inseminacion;

            while (resultado.next()) {
                inseminacion = getInseminacionFromResultSet(resultado);
                listaInseminaciones.add(inseminacion);
            }
            return listaInseminaciones;

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    private static Inseminacion getInseminacionFromResultSet(ResultSet resultado) throws SQLException {

        int idEventoDeSanidad = resultado.getInt("IDEVENTODESANIDAD");
        Date fecha = resultado.getDate("FECHA");
        String descripcion = resultado.getString("DETALLE");

        int idHembra = resultado.getInt("IDHEMBRA");
        Hembra hembra = pHembra.buscarHembraPorId(idHembra);

        int idMacho = resultado.getInt("IDMACHO");
        Macho macho = pMacho.buscarMachoPorId(idMacho);

        Inseminacion inseminacion = new Inseminacion(idEventoDeSanidad, fecha, descripcion, hembra, macho);
        return inseminacion;
    }

}
