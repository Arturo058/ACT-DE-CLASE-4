package scr;

import java.util.ArrayList;

public class Supermercado {
    private ArrayList<Producto> lista;

    public Supermercado() {
        lista = new ArrayList<>();
    }

    public void agregarProducto(String nombre, int cantidad, double precio) {
        lista.add(new Producto(nombre, cantidad, precio));
        System.out.println("✅ Producto agregado.");
    }

    public void mostrarProductos() {
        if (lista.isEmpty()) {
            System.out.println("🛒 La lista está vacía.");
        } else {
            System.out.println("\n--- LISTA DE COMPRAS ---");
            for (int i = 0; i < lista.size(); i++) {
                System.out.println(i + ". " + lista.get(i));
            }
        }
    }

    public void eliminarProducto(int index) {
        if (index >= 0 && index < lista.size()) {
            lista.remove(index);
            System.out.println("🗑️ Producto eliminado.");
        } else {
            System.out.println("❌ Índice inválido.");
        }
    }

    public void editarProducto(int index, String nuevoNombre, int nuevaCantidad, double nuevoPrecio) {
        if (index >= 0 && index < lista.size()) {
            Producto p = lista.get(index);
            p.setNombre(nuevoNombre);
            p.setCantidad(nuevaCantidad);
            p.setPrecio(nuevoPrecio);
            System.out.println("✏️ Producto editado.");
        } else {
            System.out.println("❌ Índice inválido.");
        }
    }
}
