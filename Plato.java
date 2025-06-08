public class Plato {
    private String nombre;

    public Plato(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "🍽️ Plato: " + nombre;
    }
}
