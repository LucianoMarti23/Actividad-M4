package Personas;

public class Tarea {
    
    private int id;  // Identificador único de la tarea.
    private String nombre;  // Nombre de la tarea.
    private String descripcion;  // Descripción detallada de la tarea.

    // Constructor por defecto de la clase Tarea.
    public Tarea() {
        // Puedes inicializar valores predeterminados u omitir esta sección si no es necesario.
    }
    
    // Método para obtener el ID de la tarea.
    public int getId(){
        return this.id;
    }
    
    // Método para establecer el ID de la tarea.
    public void setId(int id){
        this.id = id;
    }
    
    // Método para obtener el nombre de la tarea.
    public String getNombre(){
        return this.nombre;
    }
    
    // Método para establecer el nombre de la tarea.
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    // Método para obtener la descripción de la tarea.
    public String getDescripcion() {
        return descripcion;
    }

    // Método para establecer la descripción de la tarea.
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
