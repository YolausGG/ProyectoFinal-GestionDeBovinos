/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import clases.Celo;
import clases.Hembra;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

public class pCelo {

    private static final String INSERT_CELO = " INSERT INTO CELO ( IDCELO, CAUSA ) "
            + " VALUES ( ?, ? )";
    private static final String DELETE_CELO = "DELETE FROM CELO WHERE IDCELO = ?";
    private static final String UPDATE_CELO = "UPDATE CELO SET CAUSA = ?  WHERE IDCELO = ?";
    private static final String BUSCAR_CELO = "SELECT E.IDEVENTODESANIDAD, E.FECHA, E.DETALLE, E.IDHEMBRA, C.CAUSA"
            + " FROM CELO C INNER JOIN EVENTOSDESANIDAD E ON C.IDCELO = E.IDEVENTODESANIDAD WHERE C.IDCELO = ? ";
    private static final String LISTAR_CELOS = "SELECT E.IDEVENTODESANIDAD, E.FECHA, E.DETALLE, E.IDHEMBRA, C.CAUSA"
            + " FROM CELO C INNER JOIN EVENTOSDESANIDAD E ON C.IDCELO = E.IDEVENTODESANIDAD";
    private static final String LISTAR_CELOS_CARAVANA = "SELECT E.IDEVENTODESANIDAD, E.FECHA, E.DETALLE, E.IDHEMBRA, C.CAUSA"
            + " FROM CELO C INNER JOIN EVENTOSDESANIDAD E ON C.IDCELO = E.IDEVENTODESANIDAD "
            + " WHERE E.IDHEMBRA = ?";

    public static boolean altaCelo(Celo pCelo) {
        try {
            PreparedStatement statement = Conexion.getConnection().prepareStatement(INSERT_CELO);
            statement.setInt(1, pCelo.getIdEventoDeSanidad());
            statement.setString(2, pCelo.getCausa());

            int retorno = statement.executeUpdate();

            return retorno > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean bajaCelo(int idCelo) {
        try {
            PreparedStatement statement = Conexion.getConnection().prepareStatement(DELETE_CELO);
            statement.setInt(1, idCelo);

            int retorno = statement.executeUpdate();

            if (retorno > 0) {
                return pEventoDeSanidad.bajaEventoDeSanidad(idCelo);
            }
            return retorno > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean modificarCelo(int idCelo, Celo pCelo) {

        try {
            PreparedStatement statement = Conexion.getConnection().prepareStatement(UPDATE_CELO);

            statement.setString(1, pCelo.getCausa());
            statement.setInt(2, idCelo);

            int retorno = statement.executeUpdate();

            if (retorno > 0) {
                return pEventoDeSanidad.modificarEventoDeSanidad(idCelo, pCelo);
            }

            return retorno > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static Celo buscarCelo(int idCelo) {

        try {
            PreparedStatement statement = Conexion.getConnection().prepareStatement(BUSCAR_CELO);
            statement.setInt(1, idCelo);

            ResultSet resultado = statement.executeQuery();
            Celo celo = null;
            if (resultado.next()) {
                celo = getCeloFromResultSet(resultado);
            }
            return celo;

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static ArrayList<Celo> listarCelos() {

        ArrayList<Celo> listaCelos = new ArrayList<>();
        try {
            PreparedStatement statement = Conexion.getConnection().prepareCall(LISTAR_CELOS);
            ResultSet resultado = statement.executeQuery();
            Celo celo;

            while (resultado.next()) {
                celo = getCeloFromResultSet(resultado);
                listaCelos.add(celo);
            }
            return listaCelos;

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static ArrayList<Celo> listarCelosPorCaravana(String pCaravanaHembra) {

        ArrayList<Celo> listaCelos = new ArrayList<>();
        try {
            PreparedStatement statement = Conexion.getConnection().prepareCall(LISTAR_CELOS_CARAVANA);

            Hembra hembra = pHembra.buscarHembraPorCaravana(pCaravanaHembra);
            statement.setInt(1, hembra.getIdBovino());

            ResultSet resultado = statement.executeQuery();
            Celo celo;

            while (resultado.next()) {
                celo = getCeloFromResultSet(resultado);
                listaCelos.add(celo);
            }
            return listaCelos;

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    private static Celo getCeloFromResultSet(ResultSet resultado) throws SQLException {

        int idEventoDeSanidad = resultado.getInt("IDEVENTODESANIDAD");
        Date fecha = resultado.getDate("FECHA");
        String descripcion = resultado.getString("DETALLE");

        int idHembra = resultado.getInt("IDHEMBRA");
        Hembra hembra = pHembra.buscarHembraPorId(idHembra);

        String causa = resultado.getString("CAUSA");

        Celo celo = new Celo(idEventoDeSanidad, fecha, descripcion, hembra, causa);
        return celo;
    }
}
