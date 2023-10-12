/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import clases.Pedigree;
import clases.Bovino;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class pPedigree {

    private static final String INSERT_PEDIGREE = " INSERT INTO PEDIGREE ( IDBOVINO, NUMEROPEDIGREE ) "
            + " VALUES ( ?, ? )";
    private static final String DELETE_PEDIGREE = "DELETE FROM PEDIGREE WHERE IDBOVINO = ?";
    private static final String UPDATE_PEDIGREE = "UPDATE PEDIGREE SET NUMEROPEDIGREE = ? WHERE IDBOVINO = ?";
    private static final String BUSCAR_PEDIGREE_IDBOVINO = "SELECT * FROM PEDIGREE WHERE IDBOVINO = ? ";
    private static final String BUSCAR_PEDIGREE_NUMEROPEDIGREE = "SELECT * FROM PEDIGREE WHERE NUMEROPEDIGREE = ? ";

    private static final String LISTAR_PEDIGREES = "SELECT * FROM PEDIGREE";

    public static boolean altaPedigree(Pedigree pPedigree) {
        try {
            PreparedStatement statement = Conexion.getConnection().prepareStatement(INSERT_PEDIGREE);
            statement.setInt(1, pPedigree.getBovino().getIdBovino());
            statement.setString(2, pPedigree.getNumeroPedigree());

            int retorno = statement.executeUpdate();

            return retorno > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean bajaPedigree(int idBovino) {
        try {
            PreparedStatement statement = Conexion.getConnection().prepareStatement(DELETE_PEDIGREE);
            statement.setInt(1, idBovino);

            int retorno = statement.executeUpdate();
            return retorno > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean modificarPedigree(Pedigree pPedigree) {

        try {
            PreparedStatement statement = Conexion.getConnection().prepareStatement(UPDATE_PEDIGREE);

            statement.setString(1, pPedigree.getNumeroPedigree());
            statement.setInt(2, pPedigree.getBovino().getIdBovino());
            int retorno = statement.executeUpdate();
            return retorno > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static Pedigree buscarPedigreeIdBovino(int idBovino) {

        try {
            PreparedStatement statement = Conexion.getConnection().prepareStatement(BUSCAR_PEDIGREE_IDBOVINO);
            statement.setInt(1, idBovino);

            ResultSet resultado = statement.executeQuery();
            Pedigree pedigree = null;
            if (resultado.next()) {
                pedigree = getPedigreeFromResultSet(resultado);
            }
            return pedigree;

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static Pedigree buscarPedigreeNumeroPedigree(String numeroPedigree) {

        try {
            PreparedStatement statement = Conexion.getConnection().prepareStatement(BUSCAR_PEDIGREE_NUMEROPEDIGREE);
            statement.setString(1, numeroPedigree);

            ResultSet resultado = statement.executeQuery();
            Pedigree pedigree = null;
            if (resultado.next()) {
                pedigree = getPedigreeFromResultSet(resultado);
            }
            return pedigree;

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static ArrayList<Pedigree> listarPedigrees() {

        ArrayList<Pedigree> listaPedigrees = new ArrayList<>();
        try {
            PreparedStatement statement = Conexion.getConnection().prepareCall(LISTAR_PEDIGREES);
            ResultSet resultado = statement.executeQuery();
            Pedigree pedigree;

            while (resultado.next()) {
                pedigree = getPedigreeFromResultSet(resultado);
                listaPedigrees.add(pedigree);
            }
            return listaPedigrees;

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    private static Pedigree getPedigreeFromResultSet(ResultSet resultado) throws SQLException {

        int idBovino = resultado.getInt("IDBOVINO");
        Bovino bovino = pBovino.buscarBovinoId(idBovino);

        String numeroPedigree = resultado.getString("NUMEROPEDIGREE");

        Pedigree pedigree = new Pedigree(bovino, numeroPedigree);
        return pedigree;
    }

}
