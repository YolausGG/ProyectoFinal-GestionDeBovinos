package persistencia;

import clases.Enfermedad;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class pEnfermedad {

    private static final String INSERT_ENFERMEDAD = " INSERT INTO ENFERMEDAD ( NOMBRE ) "
            + " VALUES ( ? )";
    private static final String DELETE_ENFERMEDAD = " DELETE FROM ENFERMEDAD WHERE IDENFERMEDAD = ?";
    private static final String UPDATE_ENFERMEDAD = "UPDATE ENFERMEDAD SET NOMBRE = ?  WHERE IDENFERMEDAD = ?";
    private static final String BUSCAR_ENFERMEDAD = "SELECT * FROM ENFERMEDAD WHERE IDENFERMEDAD = ? ";
    private static final String BUSCAR_ENFERMEDAD_NOMBRE = "SELECT * FROM ENFERMEDAD WHERE NOMBRE = ? ";
    private static final String BUSCAR_ENFERMEDAD_ULTIMO = "SELECT * FROM ENFERMEDAD "
            + " ORDER BY IDENFERMEDAD DESC "
            + " LIMIT 1";
    private static final String LISTAR_ENFERMEDADES = "SELECT * FROM ENFERMEDAD";

    public static boolean altaEnfermedad(Enfermedad pEnfermedad) {
        try {
            PreparedStatement statement = Conexion.getConnection().prepareStatement(INSERT_ENFERMEDAD);
            statement.setString(1, pEnfermedad.getNombre());

            int retorno = statement.executeUpdate();

            return retorno > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean bajaEnfermedad(int idEnfermedad) {
        try {
            PreparedStatement statement = Conexion.getConnection().prepareStatement(DELETE_ENFERMEDAD);
            statement.setInt(1, idEnfermedad);

            int retorno = statement.executeUpdate();
            return retorno > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean modificarEnfermedad(int idEnfermedad, Enfermedad pEnfermedad) {

        try {
            PreparedStatement statement = Conexion.getConnection().prepareStatement(UPDATE_ENFERMEDAD);

            statement.setString(1, pEnfermedad.getNombre());
            statement.setInt(2, idEnfermedad);

            int retorno = statement.executeUpdate();
            return retorno > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static Enfermedad buscarEnfermedad(int idEnfermedad) {

        try {
            PreparedStatement statement = Conexion.getConnection().prepareStatement(BUSCAR_ENFERMEDAD);
            statement.setInt(1, idEnfermedad);

            ResultSet resultado = statement.executeQuery();
            Enfermedad enfermedad = null;
            if (resultado.next()) {
                enfermedad = getEnfermedadFromResultSet(resultado);
            }
            return enfermedad;

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static Enfermedad buscarEnfermedadNombre(String pNombre) {

        try {
            PreparedStatement statement = Conexion.getConnection().prepareStatement(BUSCAR_ENFERMEDAD_NOMBRE);
            statement.setString(1, pNombre);

            ResultSet resultado = statement.executeQuery();
            Enfermedad enfermedad = null;
            if (resultado.next()) {
                enfermedad = getEnfermedadFromResultSet(resultado);
            }
            return enfermedad;

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static Enfermedad buscarUltimaEnfermedad() {

        try {
            PreparedStatement statement = Conexion.getConnection().prepareStatement(BUSCAR_ENFERMEDAD_ULTIMO);

            ResultSet resultado = statement.executeQuery();
            Enfermedad enfermedad = null;
            if (resultado.next()) {
                enfermedad = getEnfermedadFromResultSet(resultado);
            }
            return enfermedad;

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static ArrayList<Enfermedad> listarEnfermedades() {

        ArrayList<Enfermedad> listaEnfermedades = new ArrayList<>();
        try {
            PreparedStatement statement = Conexion.getConnection().prepareCall(LISTAR_ENFERMEDADES);
            ResultSet resultado = statement.executeQuery();
            Enfermedad enfermedad;

            while (resultado.next()) {
                enfermedad = getEnfermedadFromResultSet(resultado);
                listaEnfermedades.add(enfermedad);
            }
            return listaEnfermedades;

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    private static Enfermedad getEnfermedadFromResultSet(ResultSet resultado) throws SQLException {

        int idEnfermedad = resultado.getInt("IDENFERMEDAD");
        String nombre = resultado.getString("NOMBRE");

        Enfermedad enfermedad = new Enfermedad(idEnfermedad, nombre);
        return enfermedad;
    }

}
