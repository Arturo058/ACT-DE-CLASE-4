import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ColaOficina cola = new ColaOficina();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        // Personas precargadas
        cola.agregarPersona(new Persona("Ana"));
        cola.agregarPersona(new Persona("Luis"));
        cola.agregarPersona(new Persona("María"));

        do {
            System.out.println("\n--- Menú Oficina ---");
            System.out.println("1. Agregar persona a la fila");
            System.out.println("2. Atender al primero");
            System.out.println("3. Ver quién sigue");
            System.out.println("4. Mostrar fila completa");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.print("Nombre de la persona: ");
                    String nombre = scanner.nextLine();
                    cola.agregarPersona(new Persona(nombre));
                    break;
                case 2:
                    cola.atenderPrimero();
                    break;
                case 3:
                    cola.verQuienSigue();
                    break;
                case 4:
                    cola.mostrarFila();
                    break;
                case 0:
                    System.out.println("Cerrando ventanilla.");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }

        } while (opcion != 0);

        scanner.close();
    }
}
