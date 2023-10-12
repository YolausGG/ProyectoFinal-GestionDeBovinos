package persistencia;

import clases.Bovino;
import clases.Hembra;
import clases.Macho;
import clases.Raza;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

public class pMacho {

    private static final String INSERT_MACHO = "INSERT INTO MACHO ( IDMACHO, TIPO ) "
            + " VALUES ( ?, ? )";
    private static final String DELETE_MACHO = "DELETE FROM MACHO WHERE IDMACHO = ?";
    private static final String UPDATE_MACHO = "UPDATE MACHO SET TIPO = ? "
            + " WHERE IDMACHO = ?";
    private static final String BUSCAR_MACHO_CARAVANA = "SELECT B.IDBOVINO,B.CARAVANABOVINO,B.FECHANACIMIENTO,B.IDRAZA,B.FOTO,M.TIPO"
            + " FROM BOVINO B INNER JOIN MACHO M ON B.IDBOVINO = M.IDMACHO "
            + " WHERE B.CARAVANABOVINO = ? ";
    private static final String BUSCAR_MACHO_ID = "SELECT B.IDBOVINO,B.CARAVANABOVINO,B.FECHANACIMIENTO,B.IDRAZA,B.FOTO,M.TIPO"
            + " FROM BOVINO B INNER JOIN MACHO M ON B.IDBOVINO= M.IDMACHO"
            + " WHERE B.IDBOVINO = ? ";
    private static final String BUSCAR_MACHO_ULTIMO = "SELECT B.IDBOVINO,B.CARAVANABOVINO,B.FECHANACIMIENTO,B.IDRAZA,B.FOTO,M.TIPO"
            + " FROM BOVINO B INNER JOIN MACHO M ON B.IDBOVINO= M.IDMACHO"
            + " ORDER BY IDBOVINO DESC"
            + " LIMIT 1";
    private static final String LISTAR_MACHOS = "SELECT * "
            + " FROM BOVINO B INNER JOIN MACHO M ON B.IDBOVINO = M.IDMACHO"
            + " WHERE B.BAJALOGICA = 0";

    public static boolean altaMacho(Macho pMacho) {

        try {

            PreparedStatement statement = Conexion.getConnection().prepareStatement(INSERT_MACHO);
            statement.setInt(1, pMacho.getIdBovino());
            statement.setString(2, pMacho.getTipo());

            int retorno = statement.executeUpdate();
            return retorno > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static Macho buscarMachoPorCaravana(String pCaravanaMacho) {

        try {
            PreparedStatement statement = Conexion.getConnection().prepareStatement(BUSCAR_MACHO_CARAVANA);
            statement.setString(1, pCaravanaMacho);

            ResultSet resultado = statement.executeQuery();
            Macho macho = null;
            if (resultado.next()) {
                macho = getMachoFromResultSet(resultado);
            }
            return macho;

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static Macho buscarMachoPorCaravanaCompleto(String pCaravanaMacho) {

        try {
            PreparedStatement statement = Conexion.getConnection().prepareStatement(BUSCAR_MACHO_CARAVANA);
            statement.setString(1, pCaravanaMacho);

            ResultSet resultado = statement.executeQuery();
            Macho macho = null;
            if (resultado.next()) {
                macho = getMachoCompletoFromResultSet(resultado);
            }
            return macho;

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static Macho buscarMachoPorId(int idMacho) {

        try {
            PreparedStatement statement = Conexion.getConnection().prepareStatement(BUSCAR_MACHO_ID);
            statement.setInt(1, idMacho);

            ResultSet resultado = statement.executeQuery();
            Macho macho = null;
            if (resultado.next()) {
                macho = getMachoFromResultSet(resultado);
            }
            return macho;

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static Macho buscarUltimoMacho() {

        try {
            PreparedStatement statement = Conexion.getConnection().prepareStatement(BUSCAR_MACHO_ULTIMO);

            ResultSet resultado = statement.executeQuery();
            Macho macho = null;
            if (resultado.next()) {
                macho = getMachoFromResultSet(resultado);
            }
            return macho;

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static ArrayList<Macho> buscarMachosCaravanaLIKE(String pCaravana) {

        String consulta = "SELECT *"
                + " FROM BOVINO B INNER JOIN MACHO M ON B.IDBOVINO = M.IDMACHO"
                + " WHERE CARAVANABOVINO LIKE '%" + pCaravana + "%' AND B.BAJALOGICA = 0 ";

        ArrayList<Macho> listaMachos = new ArrayList<>();
        try {
            PreparedStatement statement = Conexion.getConnection().prepareCall(consulta);

            ResultSet resultado = statement.executeQuery();
            Macho macho;

            while (resultado.next()) {
                macho = getMachoFromResultSet(resultado);
                listaMachos.add(macho);
            }
            return listaMachos;

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static boolean modificarMacho(Macho pMacho) {

        try {
            PreparedStatement statement = Conexion.getConnection().prepareStatement(UPDATE_MACHO);

            statement.setString(1, pMacho.getTipo());
            statement.setInt(2, pMacho.getIdBovino());

            int retorno = statement.executeUpdate();

            return retorno > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean bajaMacho(int idMacho) {
        try {
            PreparedStatement statement = Conexion.getConnection().prepareStatement(DELETE_MACHO);
            statement.setInt(1, idMacho);

            int retorno = statement.executeUpdate();
            return retorno > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static ArrayList<Macho> listarMachos() {

        ArrayList<Macho> listaMachos = new ArrayList<>();
        try {
            PreparedStatement statement = Conexion.getConnection().prepareCall(LISTAR_MACHOS);
            ResultSet resultado = statement.executeQuery();
            Macho macho;

            while (resultado.next()) {
                macho = getMachoFromResultSet(resultado);
                listaMachos.add(macho);
            }
            return listaMachos;

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    private static Macho getMachoFromResultSet(ResultSet resultado) throws SQLException {

        int idBovino = resultado.getInt("IDBOVINO");
        String caravanaBovino = resultado.getString("CARAVANABOVINO");
        Date fechaNacimiento = (java.util.Date) resultado.getDate("FECHANACIMIENTO");

        int idRaza = resultado.getInt("IDRAZA");
        Raza raza = pRaza.buscarRaza(idRaza);

        String tipo = resultado.getString("TIPO");

        byte[] foto = resultado.getBytes("FOTO");

        Macho macho = new Macho(tipo, idBovino, caravanaBovino, fechaNacimiento, raza, foto);

        return macho;
    }

    private static Macho getMachoCompletoFromResultSet(ResultSet resultado) throws SQLException {

        int idBovino = resultado.getInt("IDBOVINO");
        String caravanaBovino = resultado.getString("CARAVANABOVINO");
        Date fechaNacimiento = (java.util.Date) resultado.getDate("FECHANACIMIENTO");

        int idRaza = resultado.getInt("IDRAZA");
        Raza raza = pRaza.buscarRaza(idRaza);

        String tipo = resultado.getString("TIPO");

        byte[] foto = resultado.getBytes("FOTO");

        ArrayList<Bovino> padres = pParentesco.buscarPadres(idBovino);

        Macho padre = null;
        Hembra madre = null;

        if (padres.size() > 0) {

            for (Bovino p : padres) {
                if (p.getClass().getSimpleName().toString().equals("Macho")) {
                    padre = (Macho) p;
                } else {
                    madre = (Hembra) p;
                }
            }
        }

        Macho macho = new Macho(tipo, idBovino, caravanaBovino, fechaNacimiento, madre, padre, raza, foto);

        return macho;
    }

}
