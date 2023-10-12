/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import clases.Hembra;
import clases.Secado;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

public class pSecado {

    private static final String INSERT_SECADO = "INSERT INTO SECADO ( IDSECADO, CAUSA ) "
            + " VALUES ( ?, ? )";
    private static final String DELETE_SECADO = "DELETE FROM SECADO WHERE IDSECADO = ?";
    private static final String UPDATE_SECADO = "UPDATE SECADO SET CAUSA = ? WHERE IDSECADO = ?";
    private static final String BUSCAR_SECADO = "SELECT E.IDEVENTODESANIDAD, E.FECHA, E.DETALLE, E.IDHEMBRA, S.CAUSA"
            + " FROM SECADO S INNER JOIN EVENTOSDESANIDAD E ON S.IDSECADO = E.IDEVENTODESANIDAD WHERE S.IDSECADO = ? ";
    private static final String LISTAR_SECADOS = "SELECT E.IDEVENTODESANIDAD, E.FECHA, E.DETALLE, E.IDHEMBRA, S.CAUSA"
            + " FROM SECADO S INNER JOIN EVENTOSDESANIDAD E ON S.IDSECADO = E.IDEVENTODESANIDAD";
    private static final String LISTAR_SECADOS_CARAVANA = "SELECT E.IDEVENTODESANIDAD, E.FECHA, E.DETALLE, E.IDHEMBRA, S.CAUSA"
            + " FROM SECADO S INNER JOIN EVENTOSDESANIDAD E ON S.IDSECADO = E.IDEVENTODESANIDAD "
            + " WHERE E.IDHEMBRA = ?";

    public static boolean altaSecado(Secado pSecado) {
        try {
            PreparedStatement statement = Conexion.getConnection().prepareStatement(INSERT_SECADO);
            statement.setInt(1, pSecado.getIdEventoDeSanidad());
            statement.setString(2, pSecado.getCausa());

            int retorno = statement.executeUpdate();

            return retorno > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean bajaSecado(int idSecado) {
        try {
            PreparedStatement statement = Conexion.getConnection().prepareStatement(DELETE_SECADO);
            statement.setInt(1, idSecado);

            int retorno = statement.executeUpdate();

            if (retorno > 0) {
                return pEventoDeSanidad.bajaEventoDeSanidad(idSecado);
            }
            return retorno > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean modificarSecado(int idSecado, Secado pSecado) {

        try {
            PreparedStatement statement = Conexion.getConnection().prepareStatement(UPDATE_SECADO);

            statement.setString(1, pSecado.getCausa());
            statement.setInt(2, idSecado);

            int retorno = statement.executeUpdate();

            if (retorno > 0) {
                return pEventoDeSanidad.modificarEventoDeSanidad(idSecado, pSecado);
            }

            return retorno > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static Secado buscarSecado(int idSecado) {

        try {
            PreparedStatement statement = Conexion.getConnection().prepareStatement(BUSCAR_SECADO);
            statement.setInt(1, idSecado);

            ResultSet resultado = statement.executeQuery();
            Secado secado = null;
            if (resultado.next()) {
                secado = getSecadoFromResultSet(resultado);
            }
            return secado;

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static ArrayList<Secado> listarSecados() {

        ArrayList<Secado> listaSecados = new ArrayList<>();
        try {
            PreparedStatement statement = Conexion.getConnection().prepareCall(LISTAR_SECADOS);
            ResultSet resultado = statement.executeQuery();
            Secado secado;

            while (resultado.next()) {
                secado = getSecadoFromResultSet(resultado);
                listaSecados.add(secado);
            }
            return listaSecados;

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static ArrayList<Secado> listarSecadosPorCaravana(String pCaravanaHembra) {

        ArrayList<Secado> listaSecados = new ArrayList<>();
        try {
            PreparedStatement statement = Conexion.getConnection().prepareCall(LISTAR_SECADOS_CARAVANA);

            Hembra hembra = pHembra.buscarHembraPorCaravana(pCaravanaHembra);
            statement.setInt(1, hembra.getIdBovino());

            ResultSet resultado = statement.executeQuery();
            Secado secado;

            while (resultado.next()) {
                secado = getSecadoFromResultSet(resultado);
                listaSecados.add(secado);
            }
            return listaSecados;

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    private static Secado getSecadoFromResultSet(ResultSet resultado) throws SQLException {

        int idEventoDeSanidad = resultado.getInt("IDEVENTODESANIDAD");
        Date fecha = resultado.getDate("FECHA");
        String descripcion = resultado.getString("DETALLE");

        int idHembra = resultado.getInt("IDHEMBRA");
        Hembra hembra = pHembra.buscarHembraPorId(idHembra);

        String causa = resultado.getString("CAUSA");

        Secado secado = new Secado(idEventoDeSanidad, fecha, descripcion, hembra, causa);
        return secado;
    }

}
