package scr;

import java.util.ArrayList;

public class Menu {
    private ArrayList<Platillo> platillos;

    public Menu() {
        platillos = new ArrayList<>();
        // Agregamos 15 platillos predefinidos
        platillos.add(new Platillo("Tacos al pastor", 25.0));
        platillos.add(new Platillo("Enchiladas verdes", 40.0));
        platillos.add(new Platillo("Pozole rojo", 55.0));
        platillos.add(new Platillo("Tamal de rajas", 20.0));
        platillos.add(new Platillo("Quesadillas de huitlacoche", 30.0));
        platillos.add(new Platillo("Sopa azteca", 35.0));
        platillos.add(new Platillo("Chiles en nogada", 70.0));
        platillos.add(new Platillo("Mole poblano", 60.0));
        platillos.add(new Platillo("Carnitas michoacanas", 45.0));
        platillos.add(new Platillo("Cochinita pibil", 50.0));
        platillos.add(new Platillo("Tortas ahogadas", 38.0));
        platillos.add(new Platillo("Flautas doradas", 28.0));
        platillos.add(new Platillo("Pambazos", 30.0));
        platillos.add(new Platillo("Tlayudas", 45.0));
        platillos.add(new Platillo("Gorditas de chicharrón", 22.0));
    }

    public void mostrarMenu() {
        System.out.println("\n--- MENÚ COMPLETO ---");
        for (int i = 0; i < platillos.size(); i++) {
            System.out.println(i + ". " + platillos.get(i));
        }
    }

    public void mostrarPlatillo(int index) {
        if (index >= 0 && index < platillos.size()) {
            System.out.println(platillos.get(index));
        } else {
            System.out.println("❌ Índice inválido.");
        }
    }

    public void editarPlatillo(int index, String nuevoNombre, double nuevoPrecio) {
        if (index >= 0 && index < platillos.size()) {
            Platillo platillo = platillos.get(index);
            platillo.setNombre(nuevoNombre);
            platillo.setPrecio(nuevoPrecio);
            System.out.println("✏️ Platillo editado.");
        } else {
            System.out.println("❌ Índice inválido.");
        }
    }

    public void eliminarPlatillo(int index) {
        if (index >= 0 && index < platillos.size()) {
            platillos.remove(index);
            System.out.println("🗑️ Platillo eliminado.");
        } else {
            System.out.println("❌ Índice inválido.");
        }
    }

    public void agregarPlatillo(String nombre, double precio) {
        platillos.add(new Platillo(nombre, precio));
        System.out.println("✅ Platillo agregado al menú.");
    }
}
