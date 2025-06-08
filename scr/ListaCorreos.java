package scr;

public class ListaCorreos {
    private NodoCorreo cabeza;

    public void agregarCorreo(Correo nuevoCorreo) {
        NodoCorreo nuevoNodo = new NodoCorreo(nuevoCorreo);
        if (cabeza == null) {
            cabeza = nuevoNodo;
        } else {
            NodoCorreo actual = cabeza;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevoNodo;
        }
        System.out.println("Correo agregado con éxito.");
    }

    public void mostrarCorreos() {
        if (cabeza == null) {
            System.out.println("La cadena de reenvíos está vacía.");
            return;
        }

        NodoCorreo actual = cabeza;
        int contador = 1;
        while (actual != null) {
            System.out.println("----- Correo #" + contador + " -----");
            System.out.println(actual.correo);
            actual = actual.siguiente;
            contador++;
        }
    }

    public void eliminarCorreo(String direccion) {
        if (cabeza == null) {
            System.out.println("No hay correos para eliminar.");
            return;
        }

        if (cabeza.correo.getDireccion().equalsIgnoreCase(direccion)) {
            cabeza = cabeza.siguiente;
            System.out.println("Correo eliminado con éxito.");
            return;
        }

        NodoCorreo actual = cabeza;
        while (actual.siguiente != null && 
               !actual.siguiente.correo.getDireccion().equalsIgnoreCase(direccion)) {
            actual = actual.siguiente;
        }

        if (actual.siguiente != null) {
            actual.siguiente = actual.siguiente.siguiente;
            System.out.println("Correo eliminado con éxito.");
        } else {
            System.out.println("No se encontró un correo con esa dirección.");
        }
    }

    public void editarCorreo(String direccion, String nuevoAsunto, String nuevoContenido) {
        NodoCorreo actual = cabeza;
        while (actual != null) {
            if (actual.correo.getDireccion().equalsIgnoreCase(direccion)) {
                actual.correo.setAsunto(nuevoAsunto);
                actual.correo.setContenido(nuevoContenido);
                System.out.println("Correo editado con éxito.");
                return;
            }
            actual = actual.siguiente;
        }
        System.out.println("No se encontró un correo con esa dirección.");
    }
}
