package Interfaces;

import Personas.Tarea;

public interface DAOTarea {
    
    /**
     * Registra una tarea en el sistema.
     * @param tarea La tarea que se va a registrar.
     */
    public void registrar(Tarea tarea);
    
    /**
     * Modifica una tarea en el sistema.
     * @param tarea La tarea que se va a modificar.
     */
    public void modificar(Tarea tarea);
    
    /**
     * Elimina una tarea del sistema.
     * @param tarea La tarea que se va a eliminar.
     */
    public void eliminar(Tarea tarea);
    
    /**
     * Busca una tarea en el sistema.
     * @param tarea La tarea que se va a buscar.
     */
    public void buscar(Tarea tarea);
}
