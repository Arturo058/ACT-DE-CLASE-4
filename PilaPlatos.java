import java.util.Stack;

public class PilaPlatos {
    private Stack<Plato> pila;

    public PilaPlatos() {
        pila = new Stack<>();
    }

    public void agregarPlato(Plato plato) {
        pila.push(plato);
        System.out.println("Plato agregado: " + plato.getNombre());
    }

    public void lavarUltimoPlato() {
        if (pila.isEmpty()) {
            System.out.println("No hay platos para lavar.");
        } else {
            Plato platoLavado = pila.pop();
            System.out.println("Lavaste el plato: " + platoLavado.getNombre());
        }
    }

    public void verPlatoSuperior() {
        if (pila.isEmpty()) {
            System.out.println("No hay platos en la pila.");
        } else {
            Plato platoSuperior = pila.peek();
            System.out.println("El plato en la cima es: " + platoSuperior.getNombre());
        }
    }

    public void mostrarPila() {
        if (pila.isEmpty()) {
            System.out.println("La pila está vacía.");
        } else {
            System.out.println("\nPila de platos:");
            for (int i = pila.size() - 1; i >= 0; i--) {
                System.out.println("[" + (i + 1) + "] " + pila.get(i).getNombre());
            }
        }
    }
}
