package persistencia;

import clases.EstadoDelBovino;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class pEstadoDelBovino {

    private static final String INSERT_ESTADODELBOVINO = "INSERT INTO ESTADODELBOVINO ( ESTADO ) "
            + " VALUES ( ? )";
    private static final String DELETE_ESTADODELBOVINO = "DELETE FROM ESTADODELBOVINO WHERE IDESTADODELBOVINO = ?";
    private static final String UPDATE_ESTADODELBOVINO = "UPDATE ESTADODELBOVINO SET ESTADO = ?  WHERE IDESTADODELBOVINO = ?";
    private static final String BUSCAR_ESTADODELBOVINO = "SELECT * FROM ESTADODELBOVINO WHERE IDESTADODELBOVINO = ? ";
    private static final String BUSCAR_ESTADODELBOVINO_NOMBRE = "SELECT * FROM ESTADODELBOVINO WHERE ESTADO = ? ";
    private static final String LISTAR_ESTADOSDELBOVINO = "SELECT * FROM ESTADODELBOVINO";

    public static boolean altaEstadoDelBovino(EstadoDelBovino pEstadoDelBovino) {

        try {
            PreparedStatement statement = Conexion.getConnection().prepareStatement(INSERT_ESTADODELBOVINO);
            statement.setString(1, pEstadoDelBovino.getEstado());

            int retorno = statement.executeUpdate();

            return retorno > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean bajaEstadoDelBovino(int idEstadoDelBovino) {
        try {
            PreparedStatement statement = Conexion.getConnection().prepareStatement(DELETE_ESTADODELBOVINO);
            statement.setInt(1, idEstadoDelBovino);

            int retorno = statement.executeUpdate();
            return retorno > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean modificarEstadoDelBovino(int idEstadoDelBovino, EstadoDelBovino pEstadoDelBovino) {

        try {
            PreparedStatement statement = Conexion.getConnection().prepareStatement(UPDATE_ESTADODELBOVINO);
            statement.setString(1, pEstadoDelBovino.getEstado());
            statement.setInt(2, idEstadoDelBovino);

            int retorno = statement.executeUpdate();
            return retorno > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static EstadoDelBovino buscarEstadoDelBovino(int idEstadoDelBovino) {

        try {
            PreparedStatement statement = Conexion.getConnection().prepareStatement(BUSCAR_ESTADODELBOVINO);
            statement.setInt(1, idEstadoDelBovino);

            ResultSet resultado = statement.executeQuery();
            EstadoDelBovino estadoDelBovino = null;
            if (resultado.next()) {
                estadoDelBovino = getEstadoDelBovinoFromResultSet(resultado);
            }
            return estadoDelBovino;

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static EstadoDelBovino buscarEstadoDelBovinoNombre(String pEstadoDelBovino) {

        try {
            PreparedStatement statement = Conexion.getConnection().prepareStatement(BUSCAR_ESTADODELBOVINO_NOMBRE);
            statement.setString(1, pEstadoDelBovino);

            ResultSet resultado = statement.executeQuery();
            EstadoDelBovino estadoDelBovino = null;
            if (resultado.next()) {
                estadoDelBovino = getEstadoDelBovinoFromResultSet(resultado);
            }
            return estadoDelBovino;

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static ArrayList<EstadoDelBovino> listarEstadosDelBovino() {

        ArrayList<EstadoDelBovino> listaEstadosDelBovino = new ArrayList<>();
        try {
            PreparedStatement statement = Conexion.getConnection().prepareCall(LISTAR_ESTADOSDELBOVINO);
            ResultSet resultado = statement.executeQuery();
            EstadoDelBovino estadoDelBovino;

            while (resultado.next()) {
                estadoDelBovino = getEstadoDelBovinoFromResultSet(resultado);
                listaEstadosDelBovino.add(estadoDelBovino);
            }
            return listaEstadosDelBovino;

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    private static EstadoDelBovino getEstadoDelBovinoFromResultSet(ResultSet resultado) throws SQLException {

        int idEstadoDelBovino = resultado.getInt("IDESTADODELBOVINO");
        String tipo = resultado.getString("ESTADO");

        EstadoDelBovino estadoDelBovino = new EstadoDelBovino(idEstadoDelBovino, tipo);
        return estadoDelBovino;
    }

}
