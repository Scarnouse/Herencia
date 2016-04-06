package Ejercicios;

public class Persona {
	//Atributos
	private String nombre;
	private String apellido;
	private String dni;
	//constructor
	public Persona(String nombre, String apellido, String dni) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
	}
	//métodos
	@Override
	public String toString() {
		return "Nombre: " + nombre + ", apellido: " + apellido + ", dni: " + dni;
	}
	
}
