package Ejercicios;

public class ProfesorTitular extends Profesor {
	//Atributos
	private String materia;
	private int curso;
	static public int numeroProfesoresTitulares = 0;
	//constructor
	public ProfesorTitular(String nombre, String apellido, String dni, int identificador, String especialidad,
			String materia, int curso) {
		super(nombre, apellido, dni, identificador, especialidad);
		this.materia = materia;
		this.curso = curso;
		numeroProfesoresTitulares++;
	}

	@Override
	public String toString() {
		return super.toString() + ", materia: " + materia + ", curso: " + curso + " ESO, Profesor Titular\n";
	}
	
	
}
