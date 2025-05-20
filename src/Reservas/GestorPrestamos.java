package Reservas;

import java.util.ArrayList;

public class GestorPrestamos {
    private ArrayList<Prestamo> listaPrestamos = new ArrayList<>();

    // Registrar un préstamo
    public void prestarLibro(String isbn, String idUsuario) {
        Prestamo nuevo = new Prestamo(idUsuario, idUsuario);
        listaPrestamos.add(nuevo);
        System.out.println("Préstamo registrado con éxito.");
    }

    // Marcar como devuelto
    public void devolverLibro(String isbn, String idUsuario) {
        for (Prestamo p : listaPrestamos) {
            if (p.getIsbnLibro().equals(isbn) && p.getIdUsuario().equals(idUsuario) && !p.isDevuelto()) {
                p.setDevuelto(true);
                System.out.println("Libro devuelto con éxito.");
                return;
            }
        }
        System.out.println("No se encontró préstamo activo con esos datos.");
    }

    // Mostrar todos los préstamos
    public void mostrarPrestamos() {
        for (Prestamo p : listaPrestamos) {
            System.out.println(p);
        }
    }

    // Mostrar préstamos activos
    public void mostrarPrestamosActivos() {
        for (Prestamo p : listaPrestamos) {
            if (!p.isDevuelto()) {
                System.out.println(p);
            }
        }
    }
}
