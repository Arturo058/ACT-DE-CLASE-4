package scr;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Menu menu = new Menu();
        int opcion;

        do {
            System.out.println("\n--- SISTEMA DEL MENÚ ---");
            System.out.println("1. Ver menú completo");
            System.out.println("2. Ver platillo por número");
            System.out.println("3. Editar platillo");
            System.out.println("4. Eliminar platillo");
            System.out.println("5. Agregar nuevo platillo");
            System.out.println("0. Salir");
            System.out.print("Selecciona una opción: ");
            while (!scanner.hasNextInt()) {
                System.out.print("Por favor ingresa un número: ");
                scanner.next();
            }
            opcion = scanner.nextInt();
            scanner.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1:
                    menu.mostrarMenu();
                    break;
                case 2:
                    System.out.print("Número del platillo: ");
                    int index = scanner.nextInt();
                    scanner.nextLine();
                    menu.mostrarPlatillo(index);
                    break;
                case 3:
                    menu.mostrarMenu();
                    System.out.print("Número del platillo a editar: ");
                    int editar = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Nuevo nombre: ");
                    String nuevoNombre = scanner.nextLine();
                    System.out.print("Nuevo precio: ");
                    double nuevoPrecio = scanner.nextDouble();
                    scanner.nextLine();
                    menu.editarPlatillo(editar, nuevoNombre, nuevoPrecio);
                    break;
                case 4:
                    menu.mostrarMenu();
                    System.out.print("Número del platillo a eliminar: ");
                    int eliminar = scanner.nextInt();
                    scanner.nextLine();
                    menu.eliminarPlatillo(eliminar);
                    break;
                case 5:
                    System.out.print("Nombre del nuevo platillo: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Precio del platillo: ");
                    double precio = scanner.nextDouble();
                    scanner.nextLine();
                    menu.agregarPlatillo(nombre, precio);
                    break;
                case 0:
                    System.out.println("👋 Saliendo del sistema...");
                    break;
                default:
                    System.out.println("❌ Opción inválida.");
            }

        } while (opcion != 0);

        scanner.close();
    }
}
