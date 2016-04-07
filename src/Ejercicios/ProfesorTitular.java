package Ejercicios;

public class ProfesorTitular extends Profesor {
	//Atributos
	private int antiguedad;
	//constructor

	public ProfesorTitular(String nombre, int edad, String dni, String especialidad, String antiguedad) {
		super(nombre, edad, dni, especialidad);
		this.antiguedad = antiguedad;
	}
	
}
