package Dao;

import Personas.Disenio;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Main {

    private Connection conectar = null;  // Objeto para la conexión a la base de datos

    private final String usuario = "root";  // Nombre de usuario de la base de datos

    private final String contrasena = "root";  // Contraseña de la base de datos

    private final Statement st = null;  // Objeto para ejecutar consultas SQL

    private final ResultSet rs = null;  // Objeto para almacenar resultados de consultas

    private final String cadena = "jdbc:mysql://localhost:3306/tareas";  // URL de la base de datos

    /**
     * Método para establecer la conexión con la base de datos.
     * @return Objeto Connection que representa la conexión.
     */
    public Connection establecerConeccion() {
        try {
            this.conectar = DriverManager.getConnection(cadena, usuario, contrasena);
            JOptionPane.showMessageDialog(null, "Se conectó correctamente"); // Muestra un mensaje de conexión exitosa
        } catch (Exception e) {
            System.out.println(e); // En caso de error, muestra el error en la consola
        }
        return this.conectar; // Devuelve el objeto de conexión
    }

    public static void main(String[] args) {
        Main app = new Main();
        app.establecerConeccion(); // Llama al método para establecer la conexión
        Disenio nw = new Disenio(); // Crea una instancia de la clase Disenio
        nw.setVisible(true); // Hace visible la ventana de la interfaz gráfica
    }
}