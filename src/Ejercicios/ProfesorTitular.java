package Ejercicios;

public class ProfesorTitular extends Profesor {
	//Atributos
	private int antiguedad;
	//constructor

	public ProfesorTitular(String nombre, int edad, String dni, String especialidad, int antiguedad) {
		super(nombre, edad, dni, especialidad);
		this.antiguedad = antiguedad;
	}

	@Override
	public String toString() {
		return "ProfesorTitular [antiguedad=" + antiguedad + ", toString()=" + super.toString() + "]";
	}
	
}
