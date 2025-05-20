package Libros;

import java.util.ArrayList;

public class GestorLibros {
	
	private ArrayList<Libros> listaLibros = new ArrayList<>();

	public void agregarLibro(Libros libro) {
		listaLibros.add(libro);
	}

	public void listarLibros() {
		for (Libros l : listaLibros) {
			System.out.println(l);
		}
	}

	public Libros buscarPorTitulo(String titulo) {
		for (Libros l : listaLibros) {
			if (l.getTitulo().equalsIgnoreCase(titulo)) {
				return l;
			}
		}
		return null;
	}

	public Libros buscarPorIsbn(String isbn) {
		for (Libros l : listaLibros) {
			if (l.getIsbn().equals(isbn)) {
				return l;
			}
		}
		return null;
	}
}

