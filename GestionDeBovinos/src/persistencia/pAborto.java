/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import clases.Aborto;
import clases.Hembra;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

public class pAborto {

    private static final String INSERT_ABORTO = "INSERT INTO ABORTO ( IDABORTO, CAUSA ) "
            + " VALUES ( ?, ? )";
    private static final String DELETE_ABORTO = "DELETE FROM ABORTO WHERE IDABORTO = ?";
    private static final String UPDATE_ABORTO = "UPDATE ABORTO SET CAUSA = ? WHERE IDABORTO = ?";
    private static final String BUSCAR_ABORTO = "SELECT E.IDEVENTODESANIDAD, E.FECHA, E.DETALLE, E.IDHEMBRA, A.CAUSA"
            + " FROM ABORTO A INNER JOIN EVENTOSDESANIDAD E ON A.IDABORTO = E.IDEVENTODESANIDAD  WHERE A.IDABORTO = ? ";
    private static final String LISTAR_ABORTOS = "SELECT E.IDEVENTODESANIDAD, E.FECHA, E.DETALLE, E.IDHEMBRA, A.CAUSA"
            + " FROM ABORTO A INNER JOIN EVENTOSDESANIDAD E ON A.IDABORTO = E.IDEVENTODESANIDAD";
    private static final String LISTAR_ABORTOS_CARAVANA = "SELECT E.IDEVENTODESANIDAD, E.FECHA, E.DETALLE, E.IDHEMBRA, A.CAUSA"
            + " FROM ABORTO A INNER JOIN EVENTOSDESANIDAD E ON A.IDABORTO = E.IDEVENTODESANIDAD "
            + " WHERE E.IDHEMBRA = ?";

    public static boolean altaAborto(Aborto pAborto) {
        try {
            PreparedStatement statement = Conexion.getConnection().prepareStatement(INSERT_ABORTO);
            statement.setInt(1, pAborto.getIdEventoDeSanidad());
            statement.setString(2, pAborto.getCausa());

            int retorno = statement.executeUpdate();

            return retorno > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean bajaAborto(int idAborto) {
        try {
            PreparedStatement statement = Conexion.getConnection().prepareStatement(DELETE_ABORTO);
            statement.setInt(1, idAborto);

            int retorno = statement.executeUpdate();

            if (retorno > 0) {
                return pEventoDeSanidad.bajaEventoDeSanidad(idAborto);
            }
            return retorno > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean modificarAborto(int idAborto, Aborto pAborto) {

        try {
            PreparedStatement statement = Conexion.getConnection().prepareStatement(UPDATE_ABORTO);

            statement.setString(1, pAborto.getCausa());
            statement.setInt(2, idAborto);

            int retorno = statement.executeUpdate();

            if (retorno > 0) {
                return pEventoDeSanidad.modificarEventoDeSanidad(idAborto, pAborto);
            }

            return retorno > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static Aborto buscarAborto(int idAborto) {

        try {
            PreparedStatement statement = Conexion.getConnection().prepareStatement(BUSCAR_ABORTO);
            statement.setInt(1, idAborto);

            ResultSet resultado = statement.executeQuery();
            Aborto aborto = null;
            if (resultado.next()) {
                aborto = getAbortoFromResultSet(resultado);
            }
            return aborto;

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static ArrayList<Aborto> listarAbortos() {

        ArrayList<Aborto> listaAbortos = new ArrayList<>();
        try {
            PreparedStatement statement = Conexion.getConnection().prepareCall(LISTAR_ABORTOS);
            ResultSet resultado = statement.executeQuery();
            Aborto aborto;

            while (resultado.next()) {
                aborto = getAbortoFromResultSet(resultado);
                listaAbortos.add(aborto);
            }
            return listaAbortos;

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static ArrayList<Aborto> listarAbortosPorCaravana(String pCaravanaHembra) {

        ArrayList<Aborto> listaAbortos = new ArrayList<>();
        try {
            PreparedStatement statement = Conexion.getConnection().prepareCall(LISTAR_ABORTOS_CARAVANA);

            Hembra hembra = pHembra.buscarHembraPorCaravana(pCaravanaHembra);
            statement.setInt(1, hembra.getIdBovino());

            ResultSet resultado = statement.executeQuery();
            Aborto aborto;

            while (resultado.next()) {
                aborto = getAbortoFromResultSet(resultado);
                listaAbortos.add(aborto);
            }
            return listaAbortos;

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    private static Aborto getAbortoFromResultSet(ResultSet resultado) throws SQLException {

        int idEventoDeSanidad = resultado.getInt("IDEVENTODESANIDAD");
        Date fecha = resultado.getDate("FECHA");
        String descripcion = resultado.getString("DETALLE");

        int idHembra = resultado.getInt("IDHEMBRA");
        Hembra hembra = pHembra.buscarHembraPorId(idHembra);

        String causa = resultado.getString("CAUSA");

        Aborto aborto = new Aborto(idEventoDeSanidad, fecha, descripcion, hembra, causa);
        return aborto;
    }

}
