package persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    //MySQL

    private static Connection databaseConnection;
    private static String CONNECTION_STRING = "jdbc:mysql://localhost:3306/db_gestiondebovinos";
    private static String USUARIO="root";
    private static String CLAVE="yola";

    static{
        databaseConnection=null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");

            System.out.println("Driver encontrado");
            try {
                databaseConnection = DriverManager.getConnection(CONNECTION_STRING, USUARIO, CLAVE);
                System.out.println("Conexión creada");
            }catch(SQLException e){
                System.out.println("No se pudo establecer la conexión");
                e.printStackTrace();
            }
        }catch(ClassNotFoundException e){
            System.out.println("No encuentro el driver");
            e.printStackTrace();
        }
    }

    public static Connection getConnection(){
        return databaseConnection;
    }
}
