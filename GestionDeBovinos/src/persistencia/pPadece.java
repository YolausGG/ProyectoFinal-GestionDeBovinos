package persistencia;

import clases.Padece;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

public class pPadece {

    private static final String INSERT_PADECE_FECHA_INICIO = " INSERT INTO PADECE (IDENFERMEDAD, IDBOVINO, FECHAINICIO ) "
            + " VALUES ( ?, ?, ? )";
    private static final String INSERT_PADECE = " INSERT INTO PADECE (IDENFERMEDAD, IDBOVINO, FECHAINICIO, FECHAFINALIZACION ) "
            + " VALUES ( ?, ?, ?, ? )";
    private static final String DELETE_PADECE = "DELETE FROM PADECE WHERE IDENFERMEDAD = ? AND IDBOVINO = ? AND FECHAINICIO = ? ";
    private static final String BAJA_PADECE = "UPDATE PADECE SET FECHAFINALIZACION = CURDATE() "
            + " WHERE IDENFERMEDAD = ? AND IDBOVINO = ? AND FECHAINICIO = ?";
    private static final String UPDATE_PADECE_FECHAINICIO = "UPDATE PADECE SET IDENFERMEDAD = ?, IDBOVINO = ?, FECHAINICIO = ? "
            + " WHERE IDENFERMEDAD = ? AND IDBOVINO = ? AND FECHAINICIO = ?";
    private static final String UPDATE_PADECE = "UPDATE PADECE SET IDENFERMEDAD = ?, IDBOVINO = ?, FECHAINICIO = ?, FECHAFINALIZACION = ? "
            + " WHERE IDENFERMEDAD = ? AND IDBOVINO = ? AND FECHAINICIO = ?";
    private static final String BUSCAR_PADECE = "SELECT * FROM PADECE WHERE IDENFERMEDAD = ? AND IDBOVINO = ? AND FECHAINICIO = ?";

    private static final String LISTAR_CONTAGIOS = "SELECT * FROM PADECE";
    private static final String LISTAR_CONTAGIOS_ACTIVOS = "SELECT * FROM PADECE "
            + " WHERE FECHAINICIO <= CURDATE() AND (FECHAFINALIZACION >= CURDATE() OR FECHAFINALIZACION IS NULL)";

    private static final String LISTAR_CONTAGIOS_BOVINO = "SELECT * FROM PADECE "
            + " WHERE IDBOVINO = ?";
    private static final String LISTAR_CONTAGIOS_ACTIVOS_BOVINO = "SELECT * FROM PADECE "
            + " WHERE IDBOVINO = ? AND FECHAINICIO <= CURDATE() AND (FECHAFINALIZACION >= CURDATE() OR FECHAFINALIZACION IS NULL)";

    private static final String LISTAR_CONTAGIOS_ENFERMEDAD = "SELECT * FROM PADECE "
            + " WHERE IDENFERMEDAD = ?";
    private static final String LISTAR_CONTAGIOS_ACTIVOS_ENFERMEDAD = "SELECT * FROM PADECE "
            + " WHERE IDENFERMEDAD = ? AND FECHAINICIO <= CURDATE() AND (FECHAFINALIZACION >= CURDATE() OR FECHAFINALIZACION IS NULL)";

    private static final String LISTAR_CONTAGIOS_BOVINO_ENFERMEDAD = "SELECT * FROM PADECE "
            + " WHERE IDBOVINO = ? AND IDENFERMEDAD = ? ";
    private static final String LISTAR_CONTAGIOS_ACTIVOS_BOVINO_ENFERMEDAD = "SELECT * FROM PADECE "
            + " WHERE IDBOVINO = ? AND IDENFERMEDAD = ? AND FECHAINICIO <= CURDATE() AND (FECHAFINALIZACION >= CURDATE() OR FECHAFINALIZACION IS NULL)";

    public static boolean altaPadeceFechaInicio(Padece pPadece) {
        try {
            PreparedStatement statement = Conexion.getConnection().prepareStatement(INSERT_PADECE_FECHA_INICIO);
            statement.setInt(1, pPadece.getIdEnfermedad());
            statement.setInt(2, pPadece.getIdBovino());
            java.sql.Date sqlDate = new java.sql.Date(pPadece.getFechaInicio().getTime());
            statement.setDate(3, sqlDate);

            int retorno = statement.executeUpdate();

            return retorno > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean altaPadece(Padece pPadece) {
        try {
            PreparedStatement statement = Conexion.getConnection().prepareStatement(INSERT_PADECE);
            statement.setInt(1, pPadece.getIdEnfermedad());
            statement.setInt(2, pPadece.getIdBovino());
            java.sql.Date sqlDate = new java.sql.Date(pPadece.getFechaInicio().getTime());
            statement.setDate(3, sqlDate);
            java.sql.Date sqlDateF = new java.sql.Date(pPadece.getFechaFinalizacion().getTime());
            statement.setDate(4, sqlDateF);
            int retorno = statement.executeUpdate();

            return retorno > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean deletePadece(Padece pPadece) {
        try {
            PreparedStatement statement = Conexion.getConnection().prepareStatement(DELETE_PADECE);
            statement.setInt(1, pPadece.getIdEnfermedad());
            statement.setInt(2, pPadece.getIdBovino());
            java.sql.Date sqlDate = new java.sql.Date(pPadece.getFechaInicio().getTime());
            statement.setDate(3, sqlDate);

            int retorno = statement.executeUpdate();
            return retorno > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean bajaPadece(Padece pPadece) {
        try {
            PreparedStatement statement = Conexion.getConnection().prepareStatement(BAJA_PADECE);
            statement.setInt(1, pPadece.getIdEnfermedad());
            statement.setInt(2, pPadece.getIdBovino());
            statement.setDate(3, (java.sql.Date) pPadece.getFechaInicio());

            int retorno = statement.executeUpdate();
            return retorno > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean modificarPadece(Padece pPadeceNuevo, Padece pPadeceViejo) {
        try {
            PreparedStatement statement = Conexion.getConnection().prepareStatement(UPDATE_PADECE);
            statement.setInt(1, pPadeceNuevo.getIdEnfermedad());
            statement.setInt(2, pPadeceNuevo.getIdBovino());
            java.sql.Date sqlDate = new java.sql.Date(pPadeceNuevo.getFechaInicio().getTime());
            statement.setDate(3, sqlDate);
            java.sql.Date sqlDateF = new java.sql.Date(pPadeceNuevo.getFechaFinalizacion().getTime());
            statement.setDate(4, sqlDateF);
            statement.setInt(5, pPadeceViejo.getIdEnfermedad());
            statement.setInt(6, pPadeceViejo.getIdBovino());
            java.sql.Date sqlDateFI = new java.sql.Date(pPadeceViejo.getFechaInicio().getTime());
            statement.setDate(7, sqlDateFI);

            int retorno = statement.executeUpdate();
            return retorno > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean modificarPadeceFechaInicio(Padece pPadeceNuevo, Padece pPadeceViejo) {
        try {
            PreparedStatement statement = Conexion.getConnection().prepareStatement(UPDATE_PADECE_FECHAINICIO);
            statement.setInt(1, pPadeceNuevo.getIdEnfermedad());
            statement.setInt(2, pPadeceNuevo.getIdBovino());
            java.sql.Date sqlDate = new java.sql.Date(pPadeceNuevo.getFechaInicio().getTime());
            statement.setDate(3, sqlDate);
            statement.setInt(4, pPadeceViejo.getIdEnfermedad());
            statement.setInt(5, pPadeceViejo.getIdBovino());
            java.sql.Date sqlDateFI = new java.sql.Date(pPadeceViejo.getFechaInicio().getTime());
            statement.setDate(6, sqlDateFI);

            int retorno = statement.executeUpdate();
            return retorno > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static Padece buscarPadece(Padece pPadece) {

        try {
            PreparedStatement statement = Conexion.getConnection().prepareStatement(BUSCAR_PADECE);
            statement.setInt(1, pPadece.getIdEnfermedad());
            statement.setInt(2, pPadece.getIdBovino());
            java.sql.Date sqlDateFI = new java.sql.Date(pPadece.getFechaInicio().getTime());
            statement.setDate(3, sqlDateFI);

            ResultSet resultado = statement.executeQuery();
            Padece padece = null;
            if (resultado.next()) {
                padece = getPadeceFromResultSet(resultado);
            }
            return padece;

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static ArrayList<Padece> listarContagios() {

        ArrayList<Padece> listaContagios = new ArrayList<>();
        try {
            PreparedStatement statement = Conexion.getConnection().prepareCall(LISTAR_CONTAGIOS);
            ResultSet resultado = statement.executeQuery();
            Padece padece = null;

            while (resultado.next()) {
                padece = getPadeceFromResultSet(resultado);
                listaContagios.add(padece);
            }
            return listaContagios;

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static ArrayList<Padece> listarContagiosActivos() {

        ArrayList<Padece> listaContagios = new ArrayList<>();
        try {
            PreparedStatement statement = Conexion.getConnection().prepareCall(LISTAR_CONTAGIOS_ACTIVOS);
            ResultSet resultado = statement.executeQuery();
            Padece padece = null;

            while (resultado.next()) {
                padece = getPadeceFromResultSet(resultado);
                listaContagios.add(padece);
            }
            return listaContagios;

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }

    }

    public static ArrayList<Padece> listarContagiosPorBovino(int idBovino) {

        ArrayList<Padece> listaContagios = new ArrayList<>();
        try {

            PreparedStatement statement = Conexion.getConnection().prepareCall(LISTAR_CONTAGIOS_BOVINO);
            statement.setInt(1, idBovino);
            ResultSet resultado = statement.executeQuery();
            Padece padece = null;

            while (resultado.next()) {
                padece = getPadeceFromResultSet(resultado);
                listaContagios.add(padece);
            }
            return listaContagios;

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }

    }

    public static ArrayList<Padece> listarContagiosActivosPorBovino(int idBovino) {

        ArrayList<Padece> listaContagios = new ArrayList<>();
        try {

            PreparedStatement statement = Conexion.getConnection().prepareCall(LISTAR_CONTAGIOS_ACTIVOS_BOVINO);
            statement.setInt(1, idBovino);
            ResultSet resultado = statement.executeQuery();
            Padece padece = null;

            while (resultado.next()) {
                padece = getPadeceFromResultSet(resultado);
                listaContagios.add(padece);
            }
            return listaContagios;

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }

    }

    public static ArrayList<Padece> listarContagiosPorEnfermedad(int idEnfermedad) {

        ArrayList<Padece> listaContagios = new ArrayList<>();
        try {

            PreparedStatement statement = Conexion.getConnection().prepareCall(LISTAR_CONTAGIOS_ENFERMEDAD);
            statement.setInt(1, idEnfermedad);
            ResultSet resultado = statement.executeQuery();
            Padece padece = null;

            while (resultado.next()) {
                padece = getPadeceFromResultSet(resultado);
                listaContagios.add(padece);
            }
            return listaContagios;

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }

    }

    public static ArrayList<Padece> listarContagiosActivosPorEnfermedad(int idEnfermedad) {

        ArrayList<Padece> listaContagios = new ArrayList<>();
        try {

            PreparedStatement statement = Conexion.getConnection().prepareCall(LISTAR_CONTAGIOS_ACTIVOS_ENFERMEDAD);
            statement.setInt(1, idEnfermedad);
            ResultSet resultado = statement.executeQuery();
            Padece padece = null;

            while (resultado.next()) {
                padece = getPadeceFromResultSet(resultado);
                listaContagios.add(padece);
            }
            return listaContagios;

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }

    }

    public static ArrayList<Padece> listarContagiosPorBovinoPorEnfermedad(int idEnfermedad, int idBovino) {

        ArrayList<Padece> listaContagios = new ArrayList<>();
        try {

            PreparedStatement statement = Conexion.getConnection().prepareCall(LISTAR_CONTAGIOS_BOVINO_ENFERMEDAD);
            statement.setInt(1, idBovino);
            statement.setInt(2, idEnfermedad);
            ResultSet resultado = statement.executeQuery();
            Padece padece = null;

            while (resultado.next()) {
                padece = getPadeceFromResultSet(resultado);
                listaContagios.add(padece);
            }
            return listaContagios;

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }

    }

    public static ArrayList<Padece> listarContagiosActivosPorBovinoPorEnfermedad(int idEnfermedad, int idBovino) {

        ArrayList<Padece> listaContagios = new ArrayList<>();
        try {

            PreparedStatement statement = Conexion.getConnection().prepareCall(LISTAR_CONTAGIOS_ACTIVOS_BOVINO_ENFERMEDAD);
            statement.setInt(1, idBovino);
            statement.setInt(2, idEnfermedad);

            ResultSet resultado = statement.executeQuery();
            Padece padece = null;

            while (resultado.next()) {
                padece = getPadeceFromResultSet(resultado);
                listaContagios.add(padece);
            }
            return listaContagios;

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }

    }

    private static Padece getPadeceFromResultSet(ResultSet resultado) throws SQLException {

        int idEnfermedad = resultado.getInt("IDENFERMEDAD");
        int idBovino = resultado.getInt("IDBOVINO");
        Date fechaInicio = (java.util.Date) resultado.getDate("FECHAINICIO");
        Date fechaFinalizacion = (java.util.Date) resultado.getDate("FECHAFINALIZACION");

        Padece padece = new Padece(idEnfermedad, idBovino, fechaInicio, fechaFinalizacion);
        return padece;
    }

}
