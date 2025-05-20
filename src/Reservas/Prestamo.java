package Reservas;

import java.time.LocalDate;

public class Prestamo {
    //Atributos
    private String isbnLibro;
    private String idUsuario;
    private LocalDate fechaPrestamo;
    private boolean devuelto;

    //Constructores
    public Prestamo(String isbnLibro, String idUsuario) {
        this.isbnLibro = isbnLibro;
        this.idUsuario = idUsuario;
        this.fechaPrestamo = LocalDate.now();
        this.devuelto = false;
    }

    //Getters y Setters
    public String getIsbnLibro() { return isbnLibro; }
    public String getIdUsuario() { return idUsuario; }
    public LocalDate getFechaPrestamo() { return fechaPrestamo; }
    public boolean isDevuelto() { return devuelto; }

    public void setDevuelto(boolean devuelto) {
        this.devuelto = devuelto;
    }

    @Override
    public String toString() {
        return "Libro ISBN: " + isbnLibro + ", Usuario: " + idUsuario +
               ", Fecha: " + fechaPrestamo + ", Devuelto: " + (devuelto ? "Sí" : "No");
}

	public Object getIdUsuario1() {
		return null;
	}

	public void setDevuelto1(boolean devuelto2) {
		// TODO Auto-generated method stub
		
	}

	public boolean isDevuelto1() {
		// TODO Auto-generated method stub
		return false;
	}
    }
