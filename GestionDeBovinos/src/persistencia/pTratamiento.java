package persistencia;

import clases.Padece;
import clases.Tratamiento;
import dominio.dControladora;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class pTratamiento {

    private static final String INSERT_TRATAMIENTO_FECHA_INICIO = "INSERT INTO TRATAMIENTO (IDBOVINO, IDENFERMEDAD, FECHAINICIOCONTAGIO, DETALLE, FECHAINICIO) "
            + " VALUES ( ?, ?, ?, ?, ? )";
    private static final String INSERT_TRATAMIENTO = "INSERT INTO TRATAMIENTO (IDBOVINO, IDENFERMEDAD,FECHAINICIOCONTAGIO, DETALLE, FECHAINICIO, FECHAFINALIZACION) "
            + " VALUES ( ?, ?, ?, ?, ?, ? )";
    private static final String DELETE_TRATAMIENTO = "DELETE FROM TRATAMIENTO WHERE IDTRATAMIENTO = ?";
    private static final String UPDATE_TRATAMIENTO = "UPDATE TRATAMIENTO SET IDBOVINO = ?, IDENFERMEDAD = ?, FECHAINICIOCONTAGIO = ?,  DETALLE = ?, FECHAINICIO = ?, FECHAFINALIZACION = ? "
            + " WHERE IDTRATAMIENTO = ? ";
    private static final String UPDATE_TRATAMIENTO_FECHA_FINALIZACION = "UPDATE TRATAMIENTO SET DETALLE = ?, FECHAINICIO = ?, FECHAFINALIZACION = ? "
            + " WHERE IDTRATAMIENTO = ? ";
    private static final String UPDATE_TRATAMIENTO_FECHAINICIO = "UPDATE TRATAMIENTO SET IDBOVINO = ?, IDENFERMEDAD = ?, FECHAINICIOCONTAGIO = ?, DETALLE = ?, FECHAINICIO = ? "
            + " WHERE IDTRATAMIENTO = ? ";
    private static final String BUSCAR_TRATAMIENTO = "SELECT * FROM TRATAMIENTO WHERE IDTRATAMIENTO = ? ";
    private static final String LISTAR_TRATAMIENTOS = "SELECT * FROM TRATAMIENTO";
    private static final String LISTAR_TRATAMIENTOS_ACTIVOS_BOVINO = "SELECT * FROM TRATAMIENTO "
            + " WHERE IDBOVINO = ? AND FECHAINICIO <= CURDATE() AND (FECHAFINALIZACION >= CURDATE() OR FECHAFINALIZACION IS NULL)";
    private static final String LISTAR_TRATAMIENTOS_ACTIVOS = "SELECT * FROM TRATAMINETO "
            + " WHERE FECHAINICIO <= CURDATE() AND (FECHAFINALIZACION >= CURDATE() OR FECHAFINALIZACION IS NULL)";

    public static boolean altaTratamientoFechaInicio(Tratamiento pTratamiento) {
        try {
            PreparedStatement statement = Conexion.getConnection().prepareStatement(INSERT_TRATAMIENTO_FECHA_INICIO);
            statement.setInt(1, pTratamiento.getPadece().getIdBovino());
            statement.setInt(2, pTratamiento.getPadece().getIdEnfermedad());
            java.sql.Date sqlDateP = new java.sql.Date(pTratamiento.getPadece().getFechaInicio().getTime());
            statement.setDate(3, sqlDateP);
            statement.setString(4, pTratamiento.getDetalle());
            java.sql.Date sqlDate = new java.sql.Date(pTratamiento.getFechaInicio().getTime());
            statement.setDate(5, sqlDate);

            int retorno = statement.executeUpdate();

            return retorno > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean altaTratamiento(Tratamiento pTratamiento) {
        try {
            PreparedStatement statement = Conexion.getConnection().prepareStatement(INSERT_TRATAMIENTO);
            statement.setInt(1, pTratamiento.getPadece().getIdBovino());
            statement.setInt(2, pTratamiento.getPadece().getIdEnfermedad());
            java.sql.Date sqlDate = new java.sql.Date(pTratamiento.getPadece().getFechaInicio().getTime());
            statement.setDate(3, sqlDate);
            statement.setString(4, pTratamiento.getDetalle());
            java.sql.Date sqlDateIT = new java.sql.Date(pTratamiento.getFechaInicio().getTime());
            statement.setDate(5, sqlDateIT);
            java.sql.Date sqlDateFinT = new java.sql.Date(pTratamiento.getFechaFinalizacion().getTime());
            statement.setDate(6, sqlDateFinT);

            int retorno = statement.executeUpdate();

            return retorno > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean bajaTratamiento(int idTratamiento) {
        try {
            PreparedStatement statement = Conexion.getConnection().prepareStatement(DELETE_TRATAMIENTO);
            statement.setInt(1, idTratamiento);

            int retorno = statement.executeUpdate();
            return retorno > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean modificarTratamiento(Tratamiento pTratamiento) {

        try {
            PreparedStatement statement = Conexion.getConnection().prepareStatement(UPDATE_TRATAMIENTO);

            statement.setInt(1, pTratamiento.getPadece().getIdBovino());
            statement.setInt(2, pTratamiento.getPadece().getIdEnfermedad());
            java.sql.Date sqlDate = new java.sql.Date(pTratamiento.getPadece().getFechaInicio().getTime());
            statement.setDate(3, sqlDate);
            statement.setString(4, pTratamiento.getDetalle());
            java.sql.Date sqlDateFI = new java.sql.Date(pTratamiento.getFechaInicio().getTime());
            statement.setDate(5, sqlDateFI);
            java.sql.Date sqlDateFF = new java.sql.Date(pTratamiento.getFechaFinalizacion().getTime());
            statement.setDate(6, sqlDateFF);
            statement.setInt(7, pTratamiento.getIdTratamiento());

            int retorno = statement.executeUpdate();
            return retorno > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean modificarTratamientoFechaFin(Tratamiento pTratamiento) {

        try {
            PreparedStatement statement = Conexion.getConnection().prepareStatement(UPDATE_TRATAMIENTO_FECHA_FINALIZACION);

            statement.setString(1, pTratamiento.getDetalle());
            java.sql.Date sqlDate = new java.sql.Date(pTratamiento.getFechaInicio().getTime());
            statement.setDate(2, sqlDate);
            java.sql.Date sqlDateFF = new java.sql.Date(pTratamiento.getFechaFinalizacion().getTime());
            statement.setDate(3, sqlDateFF);
            statement.setInt(4, pTratamiento.getIdTratamiento());

            int retorno = statement.executeUpdate();
            return retorno > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean modificarTratamientoFechaInicio(Tratamiento pTratamiento) {

        try {
            PreparedStatement statement = Conexion.getConnection().prepareStatement(UPDATE_TRATAMIENTO_FECHAINICIO);
            statement.setInt(1, pTratamiento.getPadece().getIdBovino());
            statement.setInt(2, pTratamiento.getPadece().getIdEnfermedad());
            java.sql.Date sqlDateFP = new java.sql.Date(pTratamiento.getPadece().getFechaInicio().getTime());
            statement.setDate(3, sqlDateFP);
            statement.setString(4, pTratamiento.getDetalle());
            java.sql.Date sqlDate = new java.sql.Date(pTratamiento.getFechaInicio().getTime());
            statement.setDate(5, sqlDate);
            statement.setInt(6, pTratamiento.getIdTratamiento());

            int retorno = statement.executeUpdate();
            return retorno > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static Tratamiento buscarTratamiento(int idTratamiento) {

        try {
            PreparedStatement statement = Conexion.getConnection().prepareStatement(BUSCAR_TRATAMIENTO);
            statement.setInt(1, idTratamiento);

            ResultSet resultado = statement.executeQuery();
            Tratamiento tratamiento = null;
            if (resultado.next()) {
                tratamiento = getTratamientoFromResultSet(resultado);
            }
            return tratamiento;

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }

    }

    public static ArrayList<Tratamiento> listarTratamientos() {

        ArrayList<Tratamiento> listaTratamientos = new ArrayList<>();
        try {
            PreparedStatement statement = Conexion.getConnection().prepareCall(LISTAR_TRATAMIENTOS);
            ResultSet resultado = statement.executeQuery();
            Tratamiento tratamiento;

            while (resultado.next()) {
                tratamiento = getTratamientoFromResultSet(resultado);
                listaTratamientos.add(tratamiento);
            }
            return listaTratamientos;

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static ArrayList<Tratamiento> listarTratamientosActivos() {

        ArrayList<Tratamiento> listaTratamientos = new ArrayList<>();
        try {
            PreparedStatement statement = Conexion.getConnection().prepareCall(LISTAR_TRATAMIENTOS_ACTIVOS);
            ResultSet resultado = statement.executeQuery();
            Tratamiento tratamiento;

            while (resultado.next()) {
                tratamiento = getTratamientoFromResultSet(resultado);
                listaTratamientos.add(tratamiento);
            }
            return listaTratamientos;

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static ArrayList<Tratamiento> listarTratamientosActivosBovino(int idBovino) {

        ArrayList<Tratamiento> listaTratamientos = new ArrayList<>();
        try {
            PreparedStatement statement = Conexion.getConnection().prepareCall(LISTAR_TRATAMIENTOS_ACTIVOS_BOVINO);
            statement.setInt(1, idBovino);
            ResultSet resultado = statement.executeQuery();
            Tratamiento tratamiento;

            while (resultado.next()) {
                tratamiento = getTratamientoFromResultSet(resultado);
                listaTratamientos.add(tratamiento);
            }
            return listaTratamientos;

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    private static Tratamiento getTratamientoFromResultSet(ResultSet resultado) throws SQLException {

        int idTratamiento = resultado.getInt("IDTRATAMIENTO");

        int idBovino = resultado.getInt("IDBOVINO");
        int idEnfermedad = resultado.getInt("IDENFERMEDAD");
        Date fechaInicioContagio = resultado.getDate("FECHAINICIOCONTAGIO");

        Padece padeceNuevo = new Padece(idEnfermedad, idBovino, fechaInicioContagio);
        Padece padece = dControladora.buscarPadece(padeceNuevo);

        String detalle = resultado.getString("DETALLE");
        Date fechaInicio = resultado.getDate("FECHAINICIO");
        Date fechaFinalizacion = resultado.getDate("FECHAFINALIZACION");

        Tratamiento tratamiento = new Tratamiento(idTratamiento, padece, detalle, fechaInicio, fechaFinalizacion);
        return tratamiento;
    }

}
