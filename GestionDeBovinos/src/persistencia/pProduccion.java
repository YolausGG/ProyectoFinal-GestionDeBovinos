package persistencia;

import clases.Hembra;
import clases.Produccion;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

public class pProduccion {

    private static final String INSERT_PRODUCCION = " INSERT INTO PRODUCCION ( PRIMERAPRODUCCION, SEGUNDAPRODUCCION, PROTEINA, GRASA, CELULASOMATICA, FECHA , IDHEMBRA) "
            + " VALUES ( ?, ?, ?, ?, ?, ?, ? )";
    private static final String DELETE_PRODUCCION = " DELETE FROM PRODUCCION WHERE IDPRODUCCION = ?";
    private static final String UPDATE_PRODUCCION = "UPDATE PRODUCCION SET PRIMERAPRODUCCION = ?, SEGUNDAPRODUCCION = ?, PRODUCCIONTOTAL = ?, PROTEINA = ?, GRASA = ?, CELULASOMATICA = ?, FECHA = ?, IDHEMBRA = ?"
            + " WHERE IDPRODUCCION = ?";
    private static final String BUSCAR_PRODUCCION = "SELECT * FROM PRODUCCION WHERE IDPRODUCCION = ? ";
    private static final String BUSCAR_PRODUCCION_HEMBRA = "SELECT * FROM PRODUCCION WHERE IDHEMBRA = ? ";
    private static final String LISTAR_PRODUCCIONES = "SELECT * FROM PRODUCCION";
    private static final String LISTAR_PRODUCCIONES_HEMBRA = "SELECT * FROM PRODUCCION WHERE IDHEMBRA = ? ";
    private static final String LISTAR_ULTIMAS_PRODUCCIONES = "SELECT MAX(IDPRODUCCION) IDPRODUCCION,PRIMERAPRODUCCION,SEGUNDAPRODUCCION,PRODUCCIONTOTAL,PROTEINA,GRASA,CELULASOMATICA,MAX(FECHA) FECHA, IDHEMBRA "
            + " FROM PRODUCCION "
            + " GROUP BY IDHEMBRA";
    private static final String BUSCAR_ULTIMA_PRODUCCION_HEMBRA = "SELECT MAX(IDPRODUCCION) IDPRODUCCION,PRIMERAPRODUCCION,SEGUNDAPRODUCCION,PRODUCCIONTOTAL,PROTEINA,GRASA,CELULASOMATICA,MAX(FECHA) FECHA, IDHEMBRA "
            + " FROM PRODUCCION "
            + " WHERE IDHEMBRA = ? "
            + " GROUP BY IDHEMBRA";

    public static boolean altaProduccion(Produccion pProduccion) {
        try {
            PreparedStatement statement = Conexion.getConnection().prepareStatement(INSERT_PRODUCCION);
            statement.setDouble(1, pProduccion.getPrimeraProduccion());
            statement.setDouble(2, pProduccion.getSegundaProduccion());
            statement.setDouble(3, pProduccion.getProteina());
            statement.setDouble(4, pProduccion.getGrasa());
            statement.setInt(5, pProduccion.getCelulaSomatica());
            java.sql.Date sqlDate = new java.sql.Date(pProduccion.getFecha().getTime());
            statement.setDate(6, sqlDate);
            statement.setInt(7, pProduccion.getHembra().getIdBovino());

            int retorno = statement.executeUpdate();

            return retorno > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean bajaProduccion(int idProduccion) {
        try {
            PreparedStatement statement = Conexion.getConnection().prepareStatement(DELETE_PRODUCCION);
            statement.setInt(1, idProduccion);

            int retorno = statement.executeUpdate();
            return retorno > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean modificarProduccion(Produccion pProduccion) {

        try {
            PreparedStatement statement = Conexion.getConnection().prepareStatement(UPDATE_PRODUCCION);

            statement.setDouble(1, pProduccion.getPrimeraProduccion());
            statement.setDouble(2, pProduccion.getSegundaProduccion());
            statement.setDouble(3, pProduccion.calcularProduccionTotal());
            statement.setDouble(4, pProduccion.getProteina());
            statement.setDouble(5, pProduccion.getGrasa());
            statement.setInt(6, pProduccion.getCelulaSomatica());
            java.sql.Date sqlDate = new java.sql.Date(pProduccion.getFecha().getTime());
            statement.setDate(7, sqlDate);
            statement.setInt(8, pProduccion.getHembra().getIdBovino());
            statement.setInt(9, pProduccion.getIdProduccion());

            int retorno = statement.executeUpdate();
            return retorno > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static Produccion buscarProduccion(int idProduccion) {

        try {
            PreparedStatement statement = Conexion.getConnection().prepareStatement(BUSCAR_PRODUCCION);
            statement.setInt(1, idProduccion);

            ResultSet resultado = statement.executeQuery();
            Produccion produccion = null;
            if (resultado.next()) {
                produccion = getProduccionFromResultSet(resultado);
            }
            return produccion;

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static Produccion buscarProduccionHembra(int idHembra) {

        try {
            PreparedStatement statement = Conexion.getConnection().prepareStatement(BUSCAR_PRODUCCION_HEMBRA);
            statement.setInt(1, idHembra);

            ResultSet resultado = statement.executeQuery();
            Produccion produccion = null;
            if (resultado.next()) {
                produccion = getProduccionFromResultSet(resultado);
            }
            return produccion;

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static Produccion buscarUltimaProduccionHembra(int idHembra) {

        try {
            PreparedStatement statement = Conexion.getConnection().prepareStatement(BUSCAR_ULTIMA_PRODUCCION_HEMBRA);
            statement.setInt(1, idHembra);

            ResultSet resultado = statement.executeQuery();
            Produccion produccion = null;
            if (resultado.next()) {
                produccion = getProduccionFromResultSet(resultado);
            }
            return produccion;

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static ArrayList<Produccion> listarProducciones() {

        ArrayList<Produccion> listaProducciones = new ArrayList<>();
        try {
            PreparedStatement statement = Conexion.getConnection().prepareCall(LISTAR_PRODUCCIONES);
            ResultSet resultado = statement.executeQuery();
            Produccion produccion;

            while (resultado.next()) {
                produccion = getProduccionFromResultSet(resultado);
                listaProducciones.add(produccion);
            }
            return listaProducciones;

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static ArrayList<Produccion> listarUltimasProducciones() {

        ArrayList<Produccion> listaProducciones = new ArrayList<>();
        try {
            PreparedStatement statement = Conexion.getConnection().prepareCall(LISTAR_ULTIMAS_PRODUCCIONES);
            ResultSet resultado = statement.executeQuery();
            Produccion produccion;

            while (resultado.next()) {
                produccion = getProduccionFromResultSet(resultado);
                listaProducciones.add(produccion);
            }
            return listaProducciones;

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static ArrayList<Produccion> listarProduccionesHembra(int idHembra) {

        ArrayList<Produccion> listaProducciones = new ArrayList<>();
        try {
            PreparedStatement statement = Conexion.getConnection().prepareCall(LISTAR_PRODUCCIONES_HEMBRA);
            statement.setInt(1, idHembra);
            ResultSet resultado = statement.executeQuery();
            Produccion produccion;

            while (resultado.next()) {
                produccion = getProduccionFromResultSet(resultado);
                listaProducciones.add(produccion);
            }
            return listaProducciones;

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    private static Produccion getProduccionFromResultSet(ResultSet resultado) throws SQLException {

        int idproduccion = resultado.getInt("IDPRODUCCION");
        Double primeraProduccion = resultado.getDouble("PRIMERAPRODUCCION");
        Double segundaProduccion = resultado.getDouble("SEGUNDAPRODUCCION");
        Double produccionTotal = resultado.getDouble("PRODUCCIONTOTAL");
        Double proteina = resultado.getDouble("PROTEINA");
        Double grasa = resultado.getDouble("GRASA");
        int celulaSomatica = resultado.getInt("CELULASOMATICA");
        Date fecha = (java.util.Date) resultado.getDate("FECHA");

        int idHembra = resultado.getInt("IDHEMBRA");
        Hembra hembra = pHembra.buscarHembraPorId(idHembra);

        Produccion produccion = new Produccion(idproduccion, primeraProduccion, segundaProduccion, produccionTotal, proteina, grasa, celulaSomatica, fecha, hembra);
        return produccion;
    }
}
