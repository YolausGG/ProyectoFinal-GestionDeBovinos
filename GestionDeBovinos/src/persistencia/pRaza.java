package persistencia;

import clases.Raza;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class pRaza {

    private static final String LISTAR_RAZAS = "SELECT * FROM RAZA";
    private static final String BUSCAR_RAZA = "SELECT * FROM RAZA WHERE IDRAZA = ?";

    public static Raza buscarRaza(int idRaza) {
        try {
            PreparedStatement statement = Conexion.getConnection().prepareStatement(BUSCAR_RAZA);
            statement.setInt(1, idRaza);

            ResultSet resultado = statement.executeQuery();
            Raza raza = null;
            if (resultado.next()) {
                raza = getRazaFromResultSet(resultado);
            }
            return raza;

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static ArrayList<Raza> buscarRazas() {

        ArrayList<Raza> listaRazas = new ArrayList<>();
        try {
            PreparedStatement statement = Conexion.getConnection().prepareCall(LISTAR_RAZAS);
            ResultSet resultado = statement.executeQuery();
            Raza raza;

            while (resultado.next()) {
                raza = getRazaFromResultSet(resultado);
                listaRazas.add(raza);
            }
            return listaRazas;

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    private static Raza getRazaFromResultSet(ResultSet resultado) throws SQLException {

        int idRaza = resultado.getInt("IDRAZA");
        String tipo = resultado.getString("TIPO");

        Raza raza = new Raza(idRaza, tipo);
        return raza;

    }
}
