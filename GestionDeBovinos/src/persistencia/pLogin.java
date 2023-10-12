/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import presentacion.frmInicio;
import presentacion.frmLogin;

public class pLogin {

    public static void validarUsuario(String pNombreUsuario, String pPassword) {

        int resultado = 0;

        String BUSCAR_USUARIO = "select * from usuario where nombreUsuario='" + pNombreUsuario + "' and passwordUsuario= '" + pPassword + "' ";

        try {

            PreparedStatement statement = Conexion.getConnection().prepareStatement(BUSCAR_USUARIO);
            ResultSet rs = statement.executeQuery();

            if (rs.next()) {

                resultado = 1;

                if (resultado == 1) {

                    frmInicio Home = new frmInicio();
                    Home.setVisible(true); // Abre el formulario de la Pagina de Inicio

                }
            } else {

                JOptionPane.showMessageDialog(null, "Error de Acceso Usuario o Constraseña Incorrecta!");
                frmLogin Login = new frmLogin();
                Login.setVisible(true);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error " + e.getMessage());
        }
    }

}
