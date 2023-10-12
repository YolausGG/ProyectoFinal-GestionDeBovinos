/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import clases.Hembra;
import clases.Parto;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

public class pParto {

    private static final String INSERT_PARTO = "INSERT INTO PARTO ( IDPARTO, TIPO ) "
            + " VALUES ( ?, ? )";
    private static final String DELETE_PARTO = "DELETE FROM PARTO WHERE IDPARTO = ?";
    private static final String UPDATE_PARTO = "UPDATE PARTO SET TIPO = ? WHERE IDPARTO = ?";
    private static final String BUSCAR_PARTO = "SELECT E.IDEVENTODESANIDAD, E.FECHA, E.DETALLE, E.IDHEMBRA, P.TIPO"
            + " FROM PARTO P INNER JOIN EVENTOSDESANIDAD E ON P.IDPARTO = E.IDEVENTODESANIDAD WHERE P.IDPARTO = ? ";
    private static final String LISTAR_PARTOS = "SELECT E.IDEVENTODESANIDAD, E.FECHA, E.DETALLE, E.IDHEMBRA, P.TIPO"
            + " FROM PARTO P INNER JOIN EVENTOSDESANIDAD E ON P.IDPARTO = E.IDEVENTODESANIDAD";
    private static final String LISTAR_PARTOS_CARAVANA = "SELECT E.IDEVENTODESANIDAD, E.FECHA, E.DETALLE, E.IDHEMBRA, P.TIPO"
            + " FROM PARTO P INNER JOIN EVENTOSDESANIDAD E ON P.IDPARTO = E.IDEVENTODESANIDAD "
            + " WHERE E.IDHEMBRA = ?";

    public static boolean altaParto(Parto pParto) {
        try {
            PreparedStatement statement = Conexion.getConnection().prepareStatement(INSERT_PARTO);
            statement.setInt(1, pParto.getIdEventoDeSanidad());
            statement.setString(2, pParto.getTipo());

            int retorno = statement.executeUpdate();

            return retorno > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean bajaParto(int idParto) {
        try {
            PreparedStatement statement = Conexion.getConnection().prepareStatement(DELETE_PARTO);
            statement.setInt(1, idParto);

            int retorno = statement.executeUpdate();

            if (retorno > 0) {
                return pEventoDeSanidad.bajaEventoDeSanidad(idParto);
            }
            return retorno > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean modificarParto(int idParto, Parto pParto) {

        try {
            PreparedStatement statement = Conexion.getConnection().prepareStatement(UPDATE_PARTO);

            statement.setString(1, pParto.getTipo());
            statement.setInt(2, idParto);

            int retorno = statement.executeUpdate();

            if (retorno > 0) {
                return pEventoDeSanidad.modificarEventoDeSanidad(idParto, pParto);
            }

            return retorno > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static Parto buscarParto(int idParto) {

        try {
            PreparedStatement statement = Conexion.getConnection().prepareStatement(BUSCAR_PARTO);
            statement.setInt(1, idParto);

            ResultSet resultado = statement.executeQuery();
            Parto parto = null;
            if (resultado.next()) {
                parto = getPartoFromResultSet(resultado);
            }
            return parto;

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static ArrayList<Parto> listarPartos() {

        ArrayList<Parto> listaPartos = new ArrayList<>();
        try {
            PreparedStatement statement = Conexion.getConnection().prepareCall(LISTAR_PARTOS);
            ResultSet resultado = statement.executeQuery();
            Parto parto;

            while (resultado.next()) {
                parto = getPartoFromResultSet(resultado);
                listaPartos.add(parto);
            }
            return listaPartos;

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static ArrayList<Parto> listarPartosPorCaravana(String pCaravanaHembra) {

        ArrayList<Parto> listaPartos = new ArrayList<>();
        try {
            PreparedStatement statement = Conexion.getConnection().prepareCall(LISTAR_PARTOS_CARAVANA);

            Hembra hembra = pHembra.buscarHembraPorCaravana(pCaravanaHembra);
            statement.setInt(1, hembra.getIdBovino());

            ResultSet resultado = statement.executeQuery();
            Parto parto;

            while (resultado.next()) {
                parto = getPartoFromResultSet(resultado);
                listaPartos.add(parto);
            }
            return listaPartos;

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    private static Parto getPartoFromResultSet(ResultSet resultado) throws SQLException {

        int idEventoDeSanidad = resultado.getInt("IDEVENTODESANIDAD");
        Date fecha = resultado.getDate("FECHA");
        String descripcion = resultado.getString("DETALLE");

        int idHembra = resultado.getInt("IDHEMBRA");
        Hembra hembra = pHembra.buscarHembraPorId(idHembra);

        String tipo = resultado.getString("TIPO");

        Parto parto = new Parto(idEventoDeSanidad, fecha, descripcion, hembra, tipo);
        return parto;
    }

}
