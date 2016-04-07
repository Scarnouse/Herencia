package Ejercicios;

public class ProfesorInterino extends Profesor {
	//Atributos
	private String fecha;
	public ProfesorInterino(String nombre, int edad, String dni, String especialidad, String fecha) {
		super(nombre, edad, dni, especialidad);
		this.fecha = fecha;
	}
	@Override
	public String toString() {
		return super.toString( )+ " Interino [ Fecha:" + fecha + "]";
	}
		
}
