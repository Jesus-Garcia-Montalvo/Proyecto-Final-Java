package basedatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// Define la clase Conexion en el paquete basedatos
public class Conexion {

    // Define variables de configuración para la conexión
    String bd = "festividades";
    String URL = "jdbc:mysql://localhost:3306/" + bd;
    String USUARIO = "root";
    String CONTRASENA = "";
    String Driver = "com.mysql.cj.jdbc.Driver";
    Connection cx;  // Objeto de conexión

    // Constructor vacío
    public Conexion() {
    }

    // Método para establecer la conexión a la base de datos
    public Connection conectar() {
        try {

            Class.forName(Driver);

            cx = DriverManager.getConnection(URL, USUARIO, CONTRASENA);

            System.out.println("Conectado con la base de datos");
        } catch (Exception e) {

            e.printStackTrace();
            System.out.println("No se pudo conectar con la base de datos");

            
            return null;
        }

        // Retorna el objeto de conexión si la conexión fue exitosa
        return cx;
    }
    
    /*
    // Método para desconectar la base de datos
    public static void desconectar(Connection conexion) {
        try {
            // Cierra la conexión si no está cerrada
            if (conexion != null && !conexion.isClosed()) {
                conexion.close();
                System.out.println("Desconexión exitosa");
            }
        } catch (SQLException e) {
            // En caso de error al cerrar la conexión, imprime la traza de la excepción
            e.printStackTrace();
        }
    }
*/

    // Método de prueba para verificar la conexión
    public static void main(String[] args) {
        // Crea una instancia de la clase Conexion
        Conexion conexion = new Conexion();

        // Llama al método conectar para establecer la conexión
        Connection cx = conexion.conectar();

        // Realiza una prueba de conexión
        if (cx != null) {
            System.out.println("La conexión está funcionando correctamente");
        } else {
            System.out.println("La conexión no está funcionando correctamente");
        }
    }
}
