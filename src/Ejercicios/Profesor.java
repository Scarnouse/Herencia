package Ejercicios;

public class Profesor extends Persona{
	//Atributos
	private String especialidad;
	//Constructor
	public Profesor(String nombre, int edad, String dni,String especialidad) {
		super(nombre, dni, edad);
		this.especialidad = especialidad;
	}
	@Override
	public String toString() {
		return "Profesor [especialidad=" + especialidad + ", toString()=" + super.toString() + "]";
	}
	
}
