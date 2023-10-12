/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import clases.Hembra;
import clases.Tacto;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

public class pTacto {

    private static final String INSERT_TACTO = "INSERT INTO TACTO ( IDTACTO, RESULTADO, DIAGNOSTICO ) "
            + " VALUES ( ?, ?, ? )";
    private static final String DELETE_TACTO = "DELETE FROM TACTO WHERE IDTACTO = ?";
    private static final String UPDATE_TACTO = "UPDATE TACTO SET RESULTADO = ?, DIAGNOSTICO = ? WHERE IDTACTO = ?";
    private static final String BUSCAR_TACTO = "SELECT E.IDEVENTODESANIDAD, E.FECHA, E.DETALLE, E.IDHEMBRA, T.RESULTADO, T.DIAGNOSTICO"
            + " FROM TACTO T INNER JOIN EVENTOSDESANIDAD E ON T.IDTACTO = E.IDEVENTODESANIDAD WHERE T.IDTACTO = ? ";
    private static final String LISTAR_TACTOS = "SELECT E.IDEVENTODESANIDAD, E.FECHA, E.DETALLE, E.IDHEMBRA, T.RESULTADO, T.DIAGNOSTICO"
            + " FROM TACTO T INNER JOIN EVENTOSDESANIDAD E ON T.IDTACTO = E.IDEVENTODESANIDAD";
    private static final String LISTAR_TACTOS_CARAVANA = "SELECT E.IDEVENTODESANIDAD, E.FECHA, E.DETALLE, E.IDHEMBRA, T.RESULTADO, T.DIAGNOSTICO"
            + " FROM TACTO T INNER JOIN EVENTOSDESANIDAD E ON T.IDTACTO = E.IDEVENTODESANIDAD "
            + " WHERE E.IDHEMBRA = ?";

    public static boolean altaTacto(Tacto pTacto) {
        try {
            PreparedStatement statement = Conexion.getConnection().prepareStatement(INSERT_TACTO);
            statement.setInt(1, pTacto.getIdEventoDeSanidad());
            statement.setString(2, pTacto.getResultado());
            statement.setString(3, pTacto.getDiagnostico());

            int retorno = statement.executeUpdate();

            return retorno > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean bajaTacto(int idTacto) {
        try {
            PreparedStatement statement = Conexion.getConnection().prepareStatement(DELETE_TACTO);
            statement.setInt(1, idTacto);

            int retorno = statement.executeUpdate();

            if (retorno > 0) {
                return pEventoDeSanidad.bajaEventoDeSanidad(idTacto);
            }
            return retorno > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean modificarTacto(int idTacto, Tacto pTacto) {

        try {
            PreparedStatement statement = Conexion.getConnection().prepareStatement(UPDATE_TACTO);

            statement.setString(1, pTacto.getResultado());
            statement.setString(2, pTacto.getDiagnostico());
            statement.setInt(3, idTacto);

            int retorno = statement.executeUpdate();

            if (retorno > 0) {
                return pEventoDeSanidad.modificarEventoDeSanidad(idTacto, pTacto);
            }

            return retorno > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static Tacto buscarTacto(int idTacto) {

        try {
            PreparedStatement statement = Conexion.getConnection().prepareStatement(BUSCAR_TACTO);
            statement.setInt(1, idTacto);

            ResultSet resultado = statement.executeQuery();
            Tacto tacto = null;
            if (resultado.next()) {
                tacto = getTactoFromResultSet(resultado);
            }
            return tacto;

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static ArrayList<Tacto> listarTactos() {

        ArrayList<Tacto> listaTactos = new ArrayList<>();
        try {
            PreparedStatement statement = Conexion.getConnection().prepareCall(LISTAR_TACTOS);
            ResultSet resultado = statement.executeQuery();
            Tacto tacto;

            while (resultado.next()) {
                tacto = getTactoFromResultSet(resultado);
                listaTactos.add(tacto);
            }
            return listaTactos;

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static ArrayList<Tacto> listarTactosPorCaravana(String pCaravanaHembra) {

        ArrayList<Tacto> listaTactos = new ArrayList<>();
        try {
            PreparedStatement statement = Conexion.getConnection().prepareCall(LISTAR_TACTOS_CARAVANA);

            Hembra hembra = pHembra.buscarHembraPorCaravana(pCaravanaHembra);
            statement.setInt(1, hembra.getIdBovino());

            ResultSet resultado = statement.executeQuery();
            Tacto tacto;

            while (resultado.next()) {
                tacto = getTactoFromResultSet(resultado);
                listaTactos.add(tacto);
            }
            return listaTactos;

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    private static Tacto getTactoFromResultSet(ResultSet resultado) throws SQLException {

        int idEventoDeSanidad = resultado.getInt("IDEVENTODESANIDAD");
        Date fecha = resultado.getDate("FECHA");
        String descripcion = resultado.getString("DETALLE");

        int idHembra = resultado.getInt("IDHEMBRA");
        Hembra hembra = pHembra.buscarHembraPorId(idHembra);

        String vResultado = resultado.getString("RESULTADO");
        String diagnostico = resultado.getString("DIAGNOSTICO");

        Tacto tacto = new Tacto(idEventoDeSanidad, fecha, descripcion, hembra, vResultado, diagnostico);
        return tacto;
    }

}
