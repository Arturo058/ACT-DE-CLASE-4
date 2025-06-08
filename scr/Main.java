package scr;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Supermercado supermercado = new Supermercado();
        int opcion;

        do {
            System.out.println("\n--- LISTA DE COMPRAS ---");
            System.out.println("1. Ver productos");
            System.out.println("2. Agregar producto");
            System.out.println("3. Editar producto");
            System.out.println("4. Eliminar producto");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1:
                    supermercado.mostrarProductos();
                    break;
                case 2:
                    System.out.print("Nombre del producto: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Cantidad: ");
                    int cantidad = scanner.nextInt();
                    System.out.print("Precio: ");
                    double precio = scanner.nextDouble();
                    scanner.nextLine();
                    supermercado.agregarProducto(nombre, cantidad, precio);
                    break;
                case 3:
                    supermercado.mostrarProductos();
                    System.out.print("Índice del producto a editar: ");
                    int editar = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Nuevo nombre: ");
                    String nuevoNombre = scanner.nextLine();
                    System.out.print("Nueva cantidad: ");
                    int nuevaCantidad = scanner.nextInt();
                    System.out.print("Nuevo precio: ");
                    double nuevoPrecio = scanner.nextDouble();
                    scanner.nextLine();
                    supermercado.editarProducto(editar, nuevoNombre, nuevaCantidad, nuevoPrecio);
                    break;
                case 4:
                    supermercado.mostrarProductos();
                    System.out.print("Índice del producto a eliminar: ");
                    int eliminar = scanner.nextInt();
                    scanner.nextLine();
                    supermercado.eliminarProducto(eliminar);
                    break;
                case 0:
                    System.out.println("👋 Saliendo...");
                    break;
                default:
                    System.out.println("❌ Opción inválida.");
            }

        } while (opcion != 0);

        scanner.close();
    }
}
