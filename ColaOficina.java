import java.util.LinkedList;
import java.util.Queue;

public class ColaOficina {
    private Queue<Persona> fila;

    public ColaOficina() {
        fila = new LinkedList<>();
    }

    public void agregarPersona(Persona persona) {
        fila.add(persona);
        System.out.println("Se agregó a la fila: " + persona.getNombre());
    }

    public void atenderPrimero() {
        if (fila.isEmpty()) {
            System.out.println("No hay personas en la fila.");
        } else {
            Persona atendido = fila.poll();
            System.out.println("Se atendió a: " + atendido.getNombre());
        }
    }

    public void verQuienSigue() {
        if (fila.isEmpty()) {
            System.out.println("No hay personas esperando.");
        } else {
            Persona siguiente = fila.peek();
            System.out.println("Siguiente en la fila: " + siguiente.getNombre());
        }
    }

    public void mostrarFila() {
        if (fila.isEmpty()) {
            System.out.println("La fila está vacía.");
        } else {
            System.out.println("\nFila de personas:");
            for (Persona p : fila) {
                System.out.println(p.getNombre());
            }
        }
    }
}
