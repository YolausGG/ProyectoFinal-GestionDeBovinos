package persistencia;

import clases.Bovino;
import clases.Hembra;
import clases.Macho;
import clases.Parentesco;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class pParentesco {

    private static final String INSERT_PARENTESCO = "INSERT INTO PARENTESCO (IDBOVINO, IDBOVINOPADRE, TIPOPARENTESCO ) "
            + " VALUES ( ?, ?, ? )";
    private static final String UPDATE_PARENTESCO = "UPDATE PARENTESCO SET IDBOVINOPADRE = ? "
            + " WHERE IDBOVINO = ? AND TIPOPARENTESCO = ?";
    private static final String DELETE_PARENTESCO = "DELETE FROM PARENTESCO WHERE IDBOVINO = ? AND IDBOVINOPADRE = ?";
    private static final String DELETE_PARENTESCOS = "DELETE FROM PARENTESCO WHERE IDBOVINOPADRE = ?";
    private static final String BUSCAR_PARENTESCOS = "SELECT * FROM PARENTESCO WHERE IDBOVINO = ?";
    private static final String BUSCAR_PARENTESCOS_HIJOS = "SELECT * FROM PARENTESCO WHERE IDBOVINOPADRE = ?";
    private static final String BUSCAR_PARENTESCO = "SELECT * FROM PARENTESCO WHERE IDBOVINO = ? AND IDBOVINOPADRE = ?";
    private static final String BUSCAR_PARENTESCO_MADRE = "SELECT * FROM PARENTESCO WHERE IDBOVINO = ? AND TIPOPARENTESCO = 'MADRE'";
    private static final String BUSCAR_PARENTESCO_PADRE = "SELECT * FROM PARENTESCO WHERE IDBOVINO = ? AND TIPOPARENTESCO = 'PADRE'";

    public static boolean altaParentesco(int idBovinoHijo, int idBovinoPadre, String pParentesco) {

        try {
            PreparedStatement statement = Conexion.getConnection().prepareStatement(INSERT_PARENTESCO);
            statement.setInt(1, idBovinoHijo);
            statement.setInt(2, idBovinoPadre);
            statement.setString(3, pParentesco);
            int retorno = statement.executeUpdate();

            return retorno > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }

    }

    public static boolean bajaParentesco(int idBovinoHijo, int idBovinoPadre) {
        try {
            PreparedStatement statement = Conexion.getConnection().prepareStatement(DELETE_PARENTESCO);
            statement.setInt(1, idBovinoHijo);
            statement.setInt(2, idBovinoPadre);

            int retorno = statement.executeUpdate();

            return retorno > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean bajaParentescos(int idBovinoPadre) {
        try {
            PreparedStatement statement = Conexion.getConnection().prepareStatement(DELETE_PARENTESCOS);
            statement.setInt(1, idBovinoPadre);

            int retorno = statement.executeUpdate();

            return retorno > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean modificarParentesco(int idBovinoHijo, int idBovinoPadre, String pParentesco) {

        try {
            PreparedStatement statement = Conexion.getConnection().prepareStatement(UPDATE_PARENTESCO);

            statement.setInt(1, idBovinoPadre);
            statement.setInt(2, idBovinoHijo);
            statement.setString(3, pParentesco);

            int retorno = statement.executeUpdate();
            return retorno > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static Parentesco buscarParentesco(int idBovinoHijo, int idBovinoPadre) {

        try {
            PreparedStatement statement = Conexion.getConnection().prepareStatement(BUSCAR_PARENTESCO);
            statement.setInt(1, idBovinoHijo);
            statement.setInt(2, idBovinoPadre);

            ResultSet resultado = statement.executeQuery();
            Parentesco parentesco = null;
            if (resultado.next()) {
                parentesco = getParentescoFromResultSet(resultado);
            }
            return parentesco;

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static Parentesco buscarParentescoPadre(int idBovinoHijo) {

        try {
            PreparedStatement statement = Conexion.getConnection().prepareStatement(BUSCAR_PARENTESCO_PADRE);
            statement.setInt(1, idBovinoHijo);

            ResultSet resultado = statement.executeQuery();
            Parentesco parentesco = null;
            if (resultado.next()) {
                parentesco = getParentescoFromResultSet(resultado);
            }
            return parentesco;

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static Parentesco buscarParentescoMadre(int idBovinoHijo) {

        try {
            PreparedStatement statement = Conexion.getConnection().prepareStatement(BUSCAR_PARENTESCO_MADRE);
            statement.setInt(1, idBovinoHijo);

            ResultSet resultado = statement.executeQuery();
            Parentesco parentesco = null;
            if (resultado.next()) {
                parentesco = getParentescoFromResultSet(resultado);
            }
            return parentesco;

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static ArrayList<Bovino> buscarPadres(int pIdBovino) {

        ArrayList<Bovino> listaBovinos = new ArrayList<>();
        try {
            PreparedStatement statement = Conexion.getConnection().prepareCall(BUSCAR_PARENTESCOS);
            statement.setInt(1, pIdBovino);

            ResultSet resultado = statement.executeQuery();

            while (resultado.next()) {

                if (resultado.getString("TIPOPARENTESCO").equalsIgnoreCase("padre")) {
                    Macho padre = pMacho.buscarMachoPorId(resultado.getInt("IDBOVINOPADRE"));
                    listaBovinos.add(padre);
                } else if (resultado.getString("TIPOPARENTESCO").equalsIgnoreCase("madre")) {
                    Hembra madre = pHembra.buscarHembraPorId(resultado.getInt("IDBOVINOPADRE"));
                    listaBovinos.add(madre);
                }
            }
            return listaBovinos;

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static ArrayList<Bovino> buscarHijos(int pIdBovino) {

        ArrayList<Bovino> listaBovinos = new ArrayList<>();
        try {
            PreparedStatement statement = Conexion.getConnection().prepareCall(BUSCAR_PARENTESCOS_HIJOS);
            statement.setInt(1, pIdBovino);

            ResultSet resultado = statement.executeQuery();

            while (resultado.next()) {

                Bovino bovino = pBovino.buscarBovinoId(resultado.getInt("IDBOVINO"));
                listaBovinos.add(bovino);

            }
            return listaBovinos;

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    private static Parentesco getParentescoFromResultSet(ResultSet resultado) throws SQLException {

        int idBovinoHijo = resultado.getInt("IDBOVINO");
        int idBovinoPadre = resultado.getInt("IDBOVINOPADRE");
        String tipo = resultado.getString("TIPOPARENTESCO");

        Bovino bovinoHijo = pBovino.buscarBovinoId(idBovinoHijo);

        Bovino padre;
        if (tipo.equals("Padre")) {
            padre = pMacho.buscarMachoPorId(idBovinoPadre);
        } else {
            padre = pHembra.buscarHembraPorId(idBovinoPadre);
        }

        Parentesco parentesco = new Parentesco(bovinoHijo, padre, tipo);

        return parentesco;
    }

}
