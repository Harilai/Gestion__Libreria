package Libros;

import java.util.ArrayList;

public class Libros {

	//Atributos
	private String titulo;
	private String autor;
	private String isbn;
	private boolean prestado;

	//Constructores
	public Libros(String titulo, String autor, String isbn) {
		this.titulo = titulo;
		this.autor = autor;
		this.isbn = isbn;
		this.prestado = false;
	}

	//Getters y Setters
	public String getTitulo() { return titulo; }
	public String getAutor() { return autor; }
	public String getIsbn() { return isbn; }
	public boolean isPrestado() { return prestado; }

	public void setPrestado(boolean prestado) {
		this.prestado = prestado;
	}

	@Override
	public String toString() {
		return "Título: " + titulo + ", Autor: " + autor + ", ISBN: " + isbn + ", Prestado: " + (prestado ? "Sí" : "No");
	}
}//FIN CLASS Libros

