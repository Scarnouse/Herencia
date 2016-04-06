package Ejercicios;

import java.time.LocalDate;

public class Profesor extends Persona{
	//Atributos
	private int identificador;
	private LocalDate fechaIncorporacion;
	private String especialidad;
	static public int numeroProfesores = 0;
	//Constructor
	public Profesor(String nombre, String apellido, String dni, int identificador,
			String especialidad) {
		super(nombre, apellido, dni);
		this.identificador = identificador;
		this.fechaIncorporacion = LocalDate.now();
		this.especialidad = especialidad;
		numeroProfesores ++;
	}
	//Metodos
	@Override
	public String toString() {
		return super.toString() + ", especialidad: " + especialidad + ", identificador: " + identificador + ", fecha de incorporacion: " + fechaIncorporacion;
	}
	
}
