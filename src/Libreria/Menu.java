package Libreria;

import java.util.*;
import Libros.*;
import Reservas.*;
import Usuarios.*;

public class Menu {

	public static ArrayList<Usuarios> listaUsuarios = new ArrayList<Usuarios>();


	public static void main(String[] args) {

		GestionUsuarios gestionUsu = new GestionUsuarios();
		GestorLibros gestionLibro = new GestorLibros();
		GestorPrestamos gestionReservas = new GestorPrestamos();
		Scanner entrada = new Scanner(System.in);

		int opcion = 0;
		do {


			System.out.println("Bienvenido/a a nuestra libreria");
			System.out.println("¿Que desea hacer?");
			System.out.println("1. Editar Usuarios");
			System.out.println("2. Editar Libros");
			System.out.println("3. Editar Reservas");
			System.out.println("4. Salir");

			try {
				opcion = Integer.parseInt(entrada.nextLine());
			} catch (NumberFormatException ex) {
				System.out.println("Error, formato invalido");
			}

			switch (opcion) {

			case 1 : 
				Usuarios(entrada,gestionUsu);
				break;

			case 2 : 
				Libros(entrada,gestionLibro);
				break;

			case 3 :
				Reservas(entrada,gestionReservas);



			}

		} while (opcion !=4);

	}


	private static void Reservas(Scanner entrada, GestorPrestamos gestionReservas) {

		int opcion = 0;

		do {
			System.out.println("¿Que desea Hacer?");
			System.out.println("1. Prestar libro");
			System.out.println("2. Devolver libro");
			System.out.println("3. Mostrar prestamos");
			System.out.println("4. Mostrar prestamos activos");
			System.out.println("5. Salir");

			try {
				opcion = Integer.parseInt(entrada.nextLine());
			} catch (NumberFormatException ex) {
				System.out.println("Error, formato invalido");
			}
			
			switch (opcion) {
				
			case 1 :
				System.out.println("Introduce el isbn del libro");
				String isbn = entrada.nextLine();
				System.out.println("Introduce el id de usuario");
				String id = entrada.nextLine();
				gestionReservas.prestarLibro(isbn, id);
				System.out.println("Libro prestado correctamente");
				break;
				
			case 2:
				System.out.println("Introduce el isbn del libro a devolver");
				String isbn2 = entrada.nextLine();
				System.out.println("Introduce el id del usuario que a reservado el libro");
				String id2 = entrada.nextLine();
				gestionReservas.devolverLibro(isbn2, id2);
				break;
				
			case 3:
				gestionReservas.mostrarPrestamos();
				break;
				
			case 4:
				gestionReservas.mostrarPrestamosActivos();
				break;
				
			default:
				System.out.println("Error, intentalo de nuevo");
				
				
			}
			
		}while (opcion !=5);
	}


	public static void Usuarios(Scanner entrada, GestionUsuarios gestion) {
		int opcion = 0;

		do {
			System.out.println("¿Que desea hacer?");
			System.out.println("1. Añadir Usuarios");
			System.out.println("2. Lista Usuarios");
			System.out.println("3. Eliminar Usuarios");
			System.out.println("4. Salir");

			try {
				opcion = Integer.parseInt(entrada.nextLine());
			} catch (NumberFormatException ex) {
				System.out.println("Error, formato invalido");
			}
			switch (opcion) {
			case 1: 
				System.out.println("Ingrese dni-nombre-apellidos-telefono");
				gestion.añadirUsuarios(listaUsuarios, entrada);
				break;

			case 2: 
				System.out.println("Lista de Usuarios \n");
				gestion.listarUsuario(listaUsuarios);
				break;

			case 3: 
				gestion.eliminarUsuario(listaUsuarios, entrada);
				break;

			case 4:
				break;

			default: 
				System.out.println("Intentalo de nuevo");

			}


		} while (opcion !=4);
	}

	public static void Libros(Scanner entrada,GestorLibros gestion) {

		int opcion = 0;

		do {

			System.out.println("¿Que desea Hacer?");
			System.out.println("1. Añadir libro");
			System.out.println("2. Lista de libros");
			System.out.println("3. Busqueda por titulo");
			System.out.println("4. Busqueda por isbn");
			System.out.println("5. Salir");

			try {
				opcion = Integer.parseInt(entrada.nextLine());
			} catch (NumberFormatException ex) {
				System.out.println("Error, formato invalido");
			}


			switch (opcion) {

			case 1:
				System.out.println("titulo-autor-isbn");
				Libros libro = new Libros(entrada.nextLine(), entrada.nextLine(), entrada.nextLine());
				gestion.agregarLibro(libro);
				System.out.println("Libro agregado correctamente");
				break;

			case 2:
				System.out.println("Listado de Libros");
				gestion.listarLibros();
				break;

			case 3:
				System.out.println("Introduce el titulo del libro a buscar");
				String titulo = entrada.nextLine();
				Libros l = gestion.buscarPorTitulo(titulo);
				if (l != null) {
					System.out.println("Libro encontrado ");
					System.out.println(l);
				} else {
					System.out.println("Libro no encontrado");
				}
				break;

			case 4:
				System.out.println("Introduce el titulo del libro a buscar");
				String isbn = entrada.nextLine();
				Libros li = gestion.buscarPorIsbn(isbn);
				if (li != null) {
					System.out.println("Libro encontrado ");
					System.out.println(li);
				} else {
					System.out.println("Libro no encontrado");
				}
				break;

			case 5:
				break;

			default:
				System.out.println("Error, intentalo de nuevo");
				break;

			}

		} while (opcion !=5);



	}
}
