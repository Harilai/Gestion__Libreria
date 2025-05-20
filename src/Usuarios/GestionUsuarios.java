package Usuarios;

import java.util.ArrayList;
import java.util.Scanner;

public class GestionUsuarios {
	
	public void añadirUsuarios(ArrayList<Usuarios> lista, Scanner ent) {
		
		Usuarios nuevo = new Usuarios(ent.nextLine(), ent.nextLine(), 
				ent.nextLine(), ent.nextLine());
		lista.add(nuevo);
		System.out.println("Usuario añadido " + nuevo);
	}
	
	public void listarUsuario(ArrayList<Usuarios> lista) {
		
		for(Usuarios u : lista) {
			System.out.println(u);
		}
		
	}
	
	public boolean eliminarUsuario(ArrayList<Usuarios> lista,Scanner ent) {
		String dni = "";
		System.out.println("Dime el dni del usuario que quiere eliminar");
		dni = ent.nextLine();
		
		for(int i=0; i<lista.size();i++) {
			if(lista.get(i).getDni().equals(dni)) {
				lista.remove(i);
				System.out.println("Usuario con dni: " + dni + "eliminado");
				return true;
			}
		}
		System.out.println("Usuario con dni " + dni + "no encontrado");
		return false;
		
	}
}

