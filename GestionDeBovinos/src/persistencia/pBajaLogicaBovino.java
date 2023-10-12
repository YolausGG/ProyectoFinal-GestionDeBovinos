/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import clases.BajaLogicaBovino;
import clases.Bovino;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

public class pBajaLogicaBovino {

    private static final String INSERT_BAJALOGICABOVINO = " INSERT INTO BAJALOGICABOVINO ( IDBOVINO, FECHABAJA, MOTIVO ) "
            + " VALUES ( ?, ?, ? )";

    private static final String BUSCAR_BAJALOGICABOVINO = "SELECT * FROM BAJALOGICABOVINO WHERE IDBAJALOGICABOVINO = ? ";

    private static final String LISTAR_BAJASLOGICABOVINOS = "SELECT * FROM BAJALOGICABOVINO";

    public static boolean altaBajaLogicaBovino(BajaLogicaBovino pBajaLogicaBovino) {
        try {
            PreparedStatement statement = Conexion.getConnection().prepareStatement(INSERT_BAJALOGICABOVINO);
            statement.setInt(1, pBajaLogicaBovino.getBovino().getIdBovino());

            java.sql.Date sqlDate = new java.sql.Date(pBajaLogicaBovino.getFechaBaja().getTime());
            statement.setDate(2, sqlDate);

            statement.setString(3, pBajaLogicaBovino.getMotivo());

            int retorno = statement.executeUpdate();

            return retorno > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static BajaLogicaBovino buscarBajaLogicaBovino(int idBajaLogicaBovino) {

        try {
            PreparedStatement statement = Conexion.getConnection().prepareStatement(BUSCAR_BAJALOGICABOVINO);
            statement.setInt(1, idBajaLogicaBovino);

            ResultSet resultado = statement.executeQuery();
            BajaLogicaBovino bajaLogicaBovino = null;
            if (resultado.next()) {
                bajaLogicaBovino = getBajaLogicaBovinoFromResultSet(resultado);
            }
            return bajaLogicaBovino;

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static ArrayList<BajaLogicaBovino> listarBajasLogicaBovinos() {

        ArrayList<BajaLogicaBovino> listaBajasLogicaBovinos = new ArrayList<>();
        try {
            PreparedStatement statement = Conexion.getConnection().prepareCall(LISTAR_BAJASLOGICABOVINOS);
            ResultSet resultado = statement.executeQuery();
            BajaLogicaBovino bajaLogicaBovino;

            while (resultado.next()) {
                bajaLogicaBovino = getBajaLogicaBovinoFromResultSet(resultado);
                listaBajasLogicaBovinos.add(bajaLogicaBovino);
            }
            return listaBajasLogicaBovinos;

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    private static BajaLogicaBovino getBajaLogicaBovinoFromResultSet(ResultSet resultado) throws SQLException {

        int idBajaLogicaBovino = resultado.getInt("IDBAJALOGICABOVINO");

        int idBovino = resultado.getInt("IDBOVINO");
        Bovino bovino = pBovino.buscarBovinoId(idBovino);

        Date fecha = (java.util.Date) resultado.getDate("FECHABAJA");
        String motivo = resultado.getString("MOTIVO");

        BajaLogicaBovino bajaLogicaBovino = new BajaLogicaBovino(idBajaLogicaBovino, bovino, fecha, motivo);
        return bajaLogicaBovino;
    }
}
