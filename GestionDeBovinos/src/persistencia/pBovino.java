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

public class pBovino {

    private static final String INSERT_BOVINO = "INSERT INTO BOVINO (CARAVANABOVINO, FECHANACIMIENTO, IDRAZA ) "
            + " VALUES ( ?, ?, ? )";
    private static final String INSERT_BOVINO_FOTO = "INSERT INTO BOVINO (CARAVANABOVINO, FECHANACIMIENTO, IDRAZA, FOTO ) "
            + " VALUES ( ?, ?, ?, ? )";
    private static final String DELETE_BOVINO = "UPDATE BOVINO SET BAJALOGICA = 1 WHERE IDBOVINO = ?";
    private static final String DELETE_BOVINO_REAL = "DELETE FROM BOVINO WHERE IDBOVINO = ?";
    private static final String UPDATE_BOVINO_ALTA_LOGICA = "UPDATE BOVINO SET BAJALOGICA = 0 WHERE IDBOVINO = ?";
    private static final String UPDATE_BOVINO = "UPDATE BOVINO SET CARAVANABOVINO = ?, FECHANACIMIENTO = ?, IDRAZA = ?  WHERE IDBOVINO = ?";
    private static final String UPDATE_BOVINO_FOTO = "UPDATE BOVINO SET CARAVANABOVINO = ?, FECHANACIMIENTO = ?, IDRAZA = ?, FOTO = ?  WHERE IDBOVINO = ?";
    private static final String BUSCAR_BOVINO_CARAVANA = "SELECT * FROM BOVINO WHERE CARAVANABOVINO = ? ";
    private static final String BUSCAR_BOVINO_ID = "SELECT * FROM BOVINO WHERE IDBOVINO = ? ";
    private static final String LISTAR_BOVINOS = "SELECT * FROM BOVINO WHERE BAJALOGICA = 0 ";
    private static final String BUSCAR_BOVINO_BAJA_LOGICA = "SELECT * FROM BOVINO WHERE BAJALOGICA = 1 AND CARAVANABOVINO = ?";

    public static boolean altaBovino(Bovino pBovino) {

        try {
            PreparedStatement statement = Conexion.getConnection().prepareStatement(INSERT_BOVINO);
            statement.setString(1, pBovino.getCaravanaBovino());

            java.sql.Date sqlDate = new java.sql.Date(pBovino.getFechaNacimiento().getTime());
            statement.setDate(2, sqlDate);

            statement.setInt(3, pBovino.getRaza().getIdRaza());

            int retorno = statement.executeUpdate();

            if (retorno > 0) {

                Bovino bovinoIngresado = buscarBovinoCaravana(pBovino.getCaravanaBovino());

                if (pBovino.getPadre() != null) {
                    pParentesco.altaParentesco(bovinoIngresado.getIdBovino(), pBovino.getPadre().getIdBovino(), pBovino.getPadre().getClass().getSimpleName().toString().equals("Macho") ? "Padre" : "Madre");
                }
                if (pBovino.getMadre() != null) {
                    pParentesco.altaParentesco(bovinoIngresado.getIdBovino(), pBovino.getMadre().getIdBovino(), pBovino.getMadre().getClass().getSimpleName().toString().equals("Macho") ? "Padre" : "Madre");
                }
            }

            return retorno > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean altaBovinoFoto(Bovino pBovino) {

        try {
            PreparedStatement statement = Conexion.getConnection().prepareStatement(INSERT_BOVINO_FOTO);
            statement.setString(1, pBovino.getCaravanaBovino());

            java.sql.Date sqlDate = new java.sql.Date(pBovino.getFechaNacimiento().getTime());
            statement.setDate(2, sqlDate);

            statement.setInt(3, pBovino.getRaza().getIdRaza());

            statement.setBytes(4, pBovino.getFoto());

            int retorno = statement.executeUpdate();

            if (retorno > 0) {

                Bovino bovinoIngresado = buscarBovinoCaravana(pBovino.getCaravanaBovino());

                if (pBovino.getPadre() != null) {
                    pParentesco.altaParentesco(bovinoIngresado.getIdBovino(), pBovino.getPadre().getIdBovino(), pBovino.getPadre().getClass().getSimpleName().toString().equals("Macho") ? "Padre" : "Madre");
                }
                if (pBovino.getMadre() != null) {
                    pParentesco.altaParentesco(bovinoIngresado.getIdBovino(), pBovino.getMadre().getIdBovino(), pBovino.getMadre().getClass().getSimpleName().toString().equals("Macho") ? "Padre" : "Madre");
                }
            }

            return retorno > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean bajaBovino(int idBovino) {
        try {
            PreparedStatement statement = Conexion.getConnection().prepareStatement(DELETE_BOVINO);
            statement.setInt(1, idBovino);

            int retorno = statement.executeUpdate();
            return retorno > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean bajaRealBovino(int idBovino) {
        try {
            PreparedStatement statement = Conexion.getConnection().prepareStatement(DELETE_BOVINO_REAL);
            statement.setInt(1, idBovino);

            int retorno = statement.executeUpdate();
            return retorno > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean altaLogicaBovino(int idBovino) {
        try {
            PreparedStatement statement = Conexion.getConnection().prepareStatement(UPDATE_BOVINO_ALTA_LOGICA);
            statement.setInt(1, idBovino);

            int retorno = statement.executeUpdate();
            return retorno > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean modificarBovino(Bovino pBovino) {

        try {
            PreparedStatement statement = Conexion.getConnection().prepareStatement(UPDATE_BOVINO);

            statement.setString(1, pBovino.getCaravanaBovino());
            java.sql.Date sqlDate = new java.sql.Date(pBovino.getFechaNacimiento().getTime());
            statement.setDate(2, sqlDate);
            statement.setInt(3, pBovino.getRaza().getIdRaza());
            statement.setInt(4, pBovino.getIdBovino());

            int retorno = statement.executeUpdate();

            return retorno > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean modificarBovinoFoto(Bovino pBovino) {

        try {
            PreparedStatement statement = Conexion.getConnection().prepareStatement(UPDATE_BOVINO_FOTO);

            statement.setString(1, pBovino.getCaravanaBovino());
            java.sql.Date sqlDate = new java.sql.Date(pBovino.getFechaNacimiento().getTime());
            statement.setDate(2, sqlDate);
            statement.setInt(3, pBovino.getRaza().getIdRaza());
            statement.setBytes(4, pBovino.getFoto());
            statement.setInt(5, pBovino.getIdBovino());
            int retorno = statement.executeUpdate();

            return retorno > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static Bovino buscarBovinoCaravana(String pCaravanaBovino) {

        try {
            PreparedStatement statement = Conexion.getConnection().prepareStatement(BUSCAR_BOVINO_CARAVANA);
            statement.setString(1, pCaravanaBovino);

            ResultSet resultado = statement.executeQuery();
            Bovino bovino = null;
            if (resultado.next()) {
                bovino = getBovinoFromResultSet(resultado);
            }
            return bovino;

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static Bovino buscarBovinoBajaLogicaCaravana(String pCaravanaBovino) {

        try {
            PreparedStatement statement = Conexion.getConnection().prepareStatement(BUSCAR_BOVINO_BAJA_LOGICA);
            statement.setString(1, pCaravanaBovino);

            ResultSet resultado = statement.executeQuery();
            Bovino bovino = null;
            if (resultado.next()) {
                bovino = getBovinoFromResultSet(resultado);
            }
            return bovino;

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static Bovino buscarBovinoCaravanaCompleto(String pCaravanaBovino) {

        try {
            PreparedStatement statement = Conexion.getConnection().prepareStatement(BUSCAR_BOVINO_CARAVANA);
            statement.setString(1, pCaravanaBovino);

            ResultSet resultado = statement.executeQuery();
            Bovino bovino = null;
            if (resultado.next()) {
                bovino = getBovinoCompletoFromResultSet(resultado);
            }
            return bovino;

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static Bovino buscarBovinoId(int idBovino) {

        try {
            PreparedStatement statement = Conexion.getConnection().prepareStatement(BUSCAR_BOVINO_ID);
            statement.setInt(1, idBovino);

            ResultSet resultado = statement.executeQuery();
            Bovino bovino = null;
            if (resultado.next()) {
                bovino = getBovinoFromResultSet(resultado);
            }
            return bovino;

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static ArrayList<Bovino> buscarBovinoCaravanaLIKE(String pCaravana) {

        String consulta = "SELECT B.IDBOVINO,B.CARAVANABOVINO,B.FECHANACIMIENTO,B.IDRAZA,B.FOTO"
                + " FROM BOVINO B"
                + " WHERE CARAVANABOVINO LIKE '%" + pCaravana + "%' AND B.BAJALOGICA = 0 ";

        ArrayList<Bovino> listaBovinos = new ArrayList<>();
        try {
            PreparedStatement statement = Conexion.getConnection().prepareCall(consulta);

            ResultSet resultado = statement.executeQuery();
            Bovino bovino;

            while (resultado.next()) {
                bovino = getBovinoFromResultSet(resultado);
                listaBovinos.add(bovino);
            }
            return listaBovinos;

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static ArrayList<Bovino> buscarBovinoCaravanaLIKETodos(String pCaravana) {

        String consulta = "SELECT B.IDBOVINO,B.CARAVANABOVINO,B.FECHANACIMIENTO,B.IDRAZA,B.FOTO"
                + " FROM BOVINO B"
                + " WHERE CARAVANABOVINO LIKE '%" + pCaravana + "%'";

        ArrayList<Bovino> listaBovinos = new ArrayList<>();
        try {
            PreparedStatement statement = Conexion.getConnection().prepareCall(consulta);

            ResultSet resultado = statement.executeQuery();
            Bovino bovino;

            while (resultado.next()) {
                bovino = getBovinoFromResultSet(resultado);
                listaBovinos.add(bovino);
            }
            return listaBovinos;

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static ArrayList<Bovino> listarBovinos() {

        ArrayList<Bovino> listaBovinos = new ArrayList<>();
        try {
            PreparedStatement statement = Conexion.getConnection().prepareCall(LISTAR_BOVINOS);
            ResultSet resultado = statement.executeQuery();
            Bovino bovino;

            while (resultado.next()) {
                bovino = getBovinoFromResultSet(resultado);
                listaBovinos.add(bovino);
            }
            return listaBovinos;

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    private static Bovino getBovinoFromResultSet(ResultSet resultado) throws SQLException {

        int idBovino = resultado.getInt("IDBOVINO");
        String caravanaBovino = resultado.getString("CARAVANABOVINO");
        Date fechaNacimiento = (java.util.Date) resultado.getDate("FECHANACIMIENTO");

        int idRaza = resultado.getInt("IDRAZA");
        Raza raza = pRaza.buscarRaza(idRaza);

        Bovino bovino = new Bovino(idBovino, caravanaBovino, fechaNacimiento, raza);

        return bovino;
    }

    private static Bovino getBovinoCompletoFromResultSet(ResultSet resultado) throws SQLException {

        int idBovino = resultado.getInt("IDBOVINO");
        String caravanaBovino = resultado.getString("CARAVANABOVINO");
        Date fechaNacimiento = (java.util.Date) resultado.getDate("FECHANACIMIENTO");

        int idRaza = resultado.getInt("IDRAZA");
        Raza raza = pRaza.buscarRaza(idRaza);

        byte[] foto = resultado.getBytes("FOTO");

        //if(resultado.getBytes("FOTO") != null){
        //    foto = resultado.getBytes("FOTO");
        //}
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

        Bovino bovino = new Bovino(idBovino, caravanaBovino, fechaNacimiento, madre, padre, raza, foto);

        return bovino;
    }

}
