package org.example;

import java.util.ArrayList;
import java.util.List;

public class GestorAlumnos {

    private List<String> listaAlumnos;

    public GestorAlumnos() {
        this.listaAlumnos = new ArrayList<>();
    }


    /**
     * Agrega un alumno al gestor
     * @param nombre el nombre del nuevo alumno
     */
    public void agregarAlumno(String nombre) {
        listaAlumnos.add(nombre);
    }

    /**
     * Elimina el primer alumno que coincida con el nombre
     * @param nombre el nombre del alumno a eliminar
     * @return true si el gestor contenía el alumno especificado y ha sido eliminado
     */
    public boolean eliminarAlumno(String nombre) {
        return listaAlumnos.remove(nombre);
    }

    /**
     * @return el número de alumnos contenidos en el gestor
     */
    public int cantidadAlumnos() {
        return listaAlumnos.size();
    }

    /**
     * busca un alumno que coincida con nombre en el gestor
     * @param nombre el nombre del alumno a buscar
     * @return true si encuentra al menos una coincidencia
     */
    public boolean buscarAlumno(String nombre) {
        return listaAlumnos.contains(nombre);
    }

    /**
     * @return la lista de alumnos como una List &lt;String&gt;
     */
    public List<String> obtenerListaAlumnos() {
        return listaAlumnos;
    }

}
