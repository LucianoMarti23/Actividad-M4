package Interfaces;

import Dao.Main;
import Personas.Tarea;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DAOTareaImplementacion implements DAOTarea {

    // Creamos una instancia de la clase Main para establecer la conexión a la base de datos.
    Main main = new Main();

    // Constructor de la clase.
    public DAOTareaImplementacion() {
    }

    @Override
    public void registrar(Tarea tarea) {
        try {
            // Establecemos una conexión a la base de datos utilizando el objeto Main.
            Connection conectar = this.main.establecerConeccion();

            // Preparamos una consulta SQL para insertar una nueva tarea en la base de datos.
            PreparedStatement insertar = conectar.prepareStatement("INSERT INTO tarea (tarea_id, nombre_tarea, descripcion_tarea) VALUES (?, ?, ?)");
            insertar.setInt(1, tarea.getId());
            insertar.setString(2, tarea.getNombre());
            insertar.setString(3, tarea.getDescripcion());

            // Ejecutamos la consulta de inserción.
            insertar.executeUpdate();

        } catch (Exception e) {
            System.out.println(e); // En caso de error, muestra el error en la consola.
        }
    }

    @Override
    public void modificar(Tarea tarea) {
        try {
            // Establecemos una conexión a la base de datos utilizando el objeto Main.
            Connection conectar = main.establecerConeccion();

            // Preparamos una consulta SQL para actualizar una tarea en la base de datos.
            PreparedStatement modificar = conectar.prepareStatement("UPDATE tarea SET nombre_tarea = ?, descripcion_tarea = ? WHERE tarea_id = ?");
            modificar.setString(1, tarea.getNombre());
            modificar.setString(2, tarea.getDescripcion());
            modificar.setInt(3, tarea.getId());

            // Ejecutamos la consulta de actualización.
            modificar.executeUpdate();

        } catch (Exception e) {
            System.out.println(e); // En caso de error, muestra el error en la consola.
        }
    }

    @Override
    public void eliminar(Tarea tarea) {
        try {
            // Establecemos una conexión a la base de datos utilizando el objeto Main.
            Connection conectar = main.establecerConeccion();

            // Preparamos una consulta SQL para eliminar una tarea de la base de datos.
            PreparedStatement eliminar = conectar.prepareStatement("DELETE FROM tarea WHERE tarea_id = ?");
            eliminar.setInt(1, tarea.getId());

            // Ejecutamos la consulta de eliminación.
            eliminar.executeUpdate();

        } catch (Exception e) {
            System.out.println(e); // En caso de error, muestra el error en la consola.
        }
    }

    @Override
    public void buscar(Tarea tarea) {
        try {
            // Establecemos una conexión a la base de datos utilizando el objeto Main.
            Connection conectar = main.establecerConeccion();

            // Preparamos una consulta SQL para buscar una tarea en la base de datos por su ID.
            PreparedStatement buscar = conectar.prepareStatement("SELECT * FROM tarea WHERE tarea_id = ?");
            buscar.setInt(1, tarea.getId());

            // Ejecutamos la consulta de búsqueda.
            ResultSet consulta = buscar.executeQuery();

            // Si se encuentra una tarea, se actualizan los datos de la tarea pasada como argumento.
            if (consulta.next()) {
                tarea.setNombre(consulta.getString("nombre_tarea"));
                tarea.setDescripcion(consulta.getString("descripcion_tarea"));
            }
        } catch (Exception e) {
            System.out.println(e); // En caso de error, muestra el error en la consola.
        }
    }
}
