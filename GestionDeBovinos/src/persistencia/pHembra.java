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


public class pHembra {

    private static final String INSERT_HEMBRA = "INSERT INTO HEMBRA ( IDHEMBRA ) "
            + " VALUES ( ? )";
    private static final String DELETE_HEMBRA = "DELETE FROM HEMBRA WHERE IDHEMBRA = ? ";
    private static final String BUSCAR_HEMBRA_CARAVANA = "SELECT B.IDBOVINO,B.CARAVANABOVINO,B.FECHANACIMIENTO,B.IDRAZA,B.FOTO"
            + " FROM BOVINO B INNER JOIN HEMBRA H ON B.IDBOVINO= H.IDHEMBRA"
            + " WHERE B.CARAVANABOVINO = ? ";   
    private static final String BUSCAR_HEMBRA_ID = "SELECT B.IDBOVINO,B.CARAVANABOVINO,B.FECHANACIMIENTO,B.IDRAZA,B.FOTO"
            + " FROM BOVINO B INNER JOIN HEMBRA H ON B.IDBOVINO= H.IDHEMBRA"
            + " WHERE B.IDBOVINO = ? ";
    private static final String BUSCAR_HEMBRA_ULTIMO = "SELECT B.IDBOVINO,B.CARAVANABOVINO,B.FECHANACIMIENTO,B.IDRAZA,B.FOTO"
            + " FROM BOVINO B INNER JOIN HEMBRA H ON B.IDBOVINO= H.IDHEMBRA"
            + " ORDER BY B.IDBOVINO DESC "
            + " LIMIT 1";
    private static final String LISTAR_HEMBRAS = "SELECT * "
            + "FROM BOVINO B INNER JOIN HEMBRA H ON B.IDBOVINO = H.IDHEMBRA "
            + "WHERE B.BAJALOGICA = 0 ";

    public static boolean altaHembra(Hembra pHembra) {

        try {

            PreparedStatement statement = Conexion.getConnection().prepareStatement(INSERT_HEMBRA);
            
            statement.setInt(1, pHembra.getIdBovino());
            
            int retorno = statement.executeUpdate();
            
            return retorno > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean bajaHembra(int idHembra) {
        try {
            PreparedStatement statement = Conexion.getConnection().prepareStatement(DELETE_HEMBRA);
            statement.setInt(1, idHembra);

            int retorno = statement.executeUpdate();
            return retorno > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static ArrayList<Hembra> listarHembras() {

        ArrayList<Hembra> listaHembras = new ArrayList<>();
        try {
            PreparedStatement statement = Conexion.getConnection().prepareCall(LISTAR_HEMBRAS);
            ResultSet resultado = statement.executeQuery();
            Hembra hemrba;

            while (resultado.next()) {
                hemrba = getHembraFromResultSet(resultado);
                listaHembras.add(hemrba);
            }
            return listaHembras;

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static ArrayList<Hembra> buscarHembrasCaravanaLIKE(String pCaravana) {
        
        String consulta = "SELECT B.IDBOVINO,B.CARAVANABOVINO,B.FECHANACIMIENTO,B.IDRAZA, B.FOTO"
            + " FROM BOVINO B INNER JOIN HEMBRA H ON B.IDBOVINO= H.IDHEMBRA"
            + " WHERE CARAVANABOVINO LIKE '%"+pCaravana+"%' AND B.BAJALOGICA = 0 ";
        
        ArrayList<Hembra> listaHembras = new ArrayList<>();
        try {
            PreparedStatement statement = Conexion.getConnection().prepareCall(consulta);
           
            ResultSet resultado = statement.executeQuery();
            Hembra hemrba;
            
            while (resultado.next()) {
                hemrba = getHembraFromResultSet(resultado);
                listaHembras.add(hemrba);
            }
            return listaHembras;

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static Hembra buscarHembraPorCaravana(String pCaravanaHembra) {

        try {
            PreparedStatement statement = Conexion.getConnection().prepareStatement(BUSCAR_HEMBRA_CARAVANA);
            statement.setString(1, pCaravanaHembra);

            ResultSet resultado = statement.executeQuery();
            Hembra hembra = null;
            if (resultado.next()) {
                hembra = getHembraFromResultSet(resultado);
            }
            return hembra;

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public static Hembra buscarHembraPorCaravanaCompleta(String pCaravanaHembra) {

        try {
            PreparedStatement statement = Conexion.getConnection().prepareStatement(BUSCAR_HEMBRA_CARAVANA);
            statement.setString(1, pCaravanaHembra);

            ResultSet resultado = statement.executeQuery();
            Hembra hembra = null;
            if (resultado.next()) {
                hembra = getHembraCompletaFromResultSet(resultado);
            }
            return hembra;

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static Hembra buscarHembraPorId(int idHembra) {

        try {
            PreparedStatement statement = Conexion.getConnection().prepareStatement(BUSCAR_HEMBRA_ID);
            statement.setInt(1, idHembra);

            ResultSet resultado = statement.executeQuery();
            Hembra hembra = null;
            if (resultado.next()) {
                hembra = getHembraFromResultSet(resultado);
            }
            return hembra;

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static Hembra buscarUltimaHembra() {

        try {
            PreparedStatement statement = Conexion.getConnection().prepareStatement(BUSCAR_HEMBRA_ULTIMO);

            ResultSet resultado = statement.executeQuery();
            Hembra hembra = null;
            if (resultado.next()) {
                hembra = getHembraFromResultSet(resultado);
            }
            return hembra;

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    private static Hembra getHembraFromResultSet(ResultSet resultado) throws SQLException {

        int idBovino = resultado.getInt("IDBOVINO");
        String caravanaBovino = resultado.getString("CARAVANABOVINO");
        Date fechaNacimiento = (java.util.Date) resultado.getDate("FECHANACIMIENTO");

        int idRaza = resultado.getInt("IDRAZA");
        Raza raza = pRaza.buscarRaza(idRaza);

        byte[] foto = resultado.getBytes("FOTO");
        
        Hembra hembra = new Hembra(idBovino, caravanaBovino, fechaNacimiento, raza, foto);

        return hembra;
    }
    
    private static Hembra getHembraCompletaFromResultSet(ResultSet resultado) throws SQLException {

        int idBovino = resultado.getInt("IDBOVINO");
        String caravanaBovino = resultado.getString("CARAVANABOVINO");
        Date fechaNacimiento = (java.util.Date) resultado.getDate("FECHANACIMIENTO");

        int idRaza = resultado.getInt("IDRAZA");
        Raza raza = pRaza.buscarRaza(idRaza);

        ArrayList<Bovino> padres = pParentesco.buscarPadres(idBovino);
        
        byte[] foto = resultado.getBytes("FOTO");
        
        Macho padre = null;
        Hembra madre = null;
        
        if(padres.size() > 0){
            
            for (Bovino p : padres) {
                if(p.getClass().getSimpleName().toString().equals("Macho")){
                    padre =(Macho) p;
                }else{
                    madre = (Hembra) p;
                }
            }
        }
        
        Hembra hembra = new Hembra(idBovino, caravanaBovino, fechaNacimiento, madre, padre,raza, foto);

        return hembra;
    }
}
