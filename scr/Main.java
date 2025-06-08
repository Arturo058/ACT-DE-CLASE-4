package scr;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ListaCorreos lista = new ListaCorreos();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        // Correos precargados
        lista.agregarCorreo(new Correo("juan@example.com", "Reunión", "Nos vemos el lunes a las 10."));
        lista.agregarCorreo(new Correo("maria@example.com", "Informe", "Adjunto el informe solicitado."));
        lista.agregarCorreo(new Correo("luis@example.com", "Vacaciones", "Solicito vacaciones para julio."));

        do {
            System.out.println("\n----- Menú -----");
            System.out.println("1. Agregar correo");
            System.out.println("2. Mostrar cadena de correos reenviados");
            System.out.println("3. Eliminar correo por dirección");
            System.out.println("4. Editar correo");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.print("Dirección: ");
                    String dir = scanner.nextLine();
                    System.out.print("Asunto: ");
                    String asunto = scanner.nextLine();
                    System.out.print("Contenido: ");
                    String cont = scanner.nextLine();
                    lista.agregarCorreo(new Correo(dir, asunto, cont));
                    break;
                case 2:
                    lista.mostrarCorreos();
                    break;
                case 3:
                    System.out.print("Dirección a eliminar: ");
                    String dirEliminar = scanner.nextLine();
                    lista.eliminarCorreo(dirEliminar);
                    break;
                case 4:
                    System.out.print("Dirección a editar: ");
                    String dirEditar = scanner.nextLine();
                    System.out.print("Nuevo asunto: ");
                    String nuevoAsunto = scanner.nextLine();
                    System.out.print("Nuevo contenido: ");
                    String nuevoContenido = scanner.nextLine();
                    lista.editarCorreo(dirEditar, nuevoAsunto, nuevoContenido);
                    break;
                case 0:
                    System.out.println("Programa finalizado.");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }

        } while (opcion != 0);

        scanner.close();
    }
}
