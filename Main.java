import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PilaPlatos pila = new PilaPlatos();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- Menú de Pila de Platos ---");
            System.out.println("1. Agregar plato");
            System.out.println("2. Lavar último plato");
            System.out.println("3. Ver plato en la cima");
            System.out.println("4. Mostrar pila completa");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.print("Nombre del plato: ");
                    String nombre = scanner.nextLine();
                    pila.agregarPlato(new Plato(nombre));
                    break;
                case 2:
                    pila.lavarUltimoPlato();
                    break;
                case 3:
                    pila.verPlatoSuperior();
                    break;
                case 4:
                    pila.mostrarPila();
                    break;
                case 0:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }

        } while (opcion != 0);

        scanner.close();
    }
}
