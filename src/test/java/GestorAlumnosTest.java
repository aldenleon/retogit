import org.example.GestorAlumnos;
import org.junit.Test;

import static org.junit.Assert.*;

public class GestorAlumnosTest {

    @Test
    public void agregarAlumnoTest() {
        GestorAlumnos gestorAlumnos = new GestorAlumnos();
        gestorAlumnos.agregarAlumno("Roberto");
        gestorAlumnos.agregarAlumno("Paco");
        assertEquals("Roberto", gestorAlumnos.obtenerListaAlumnos().get(0));
        assertEquals("Paco", gestorAlumnos.obtenerListaAlumnos().get(1));
    }

    private GestorAlumnos poblarGestor() {
        GestorAlumnos gestorAlumnos = new GestorAlumnos();
        gestorAlumnos.agregarAlumno("Roberto");
        gestorAlumnos.agregarAlumno("Paco");
        return gestorAlumnos;
    }

    @Test
    public void eliminarAlumnoTest() {
        GestorAlumnos gestorAlumnos = poblarGestor();
        assertTrue(gestorAlumnos.eliminarAlumno("Roberto"));
        assertFalse(gestorAlumnos.eliminarAlumno("María"));
        assertEquals("Paco", gestorAlumnos.obtenerListaAlumnos().get(0));
    }

    @Test
    public void cantidadAlumnosTest() {
        GestorAlumnos gestorAlumnos = poblarGestor();
        assertEquals(2, gestorAlumnos.cantidadAlumnos());
        gestorAlumnos.agregarAlumno("María");
        assertEquals(3, gestorAlumnos.cantidadAlumnos());
    }

    @Test
    public void buscarAlumnoTest() {
        GestorAlumnos gestorAlumnos = poblarGestor();
        assertTrue(gestorAlumnos.buscarAlumno("Paco"));
        assertFalse(gestorAlumnos.buscarAlumno("Rodolfo"));
    }

    @Test
    public void obtenerListaAlumnosTest() {
        GestorAlumnos gestorAlumnos = poblarGestor();
        assertNotNull(gestorAlumnos.obtenerListaAlumnos());
    }

}
