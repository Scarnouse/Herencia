package Ejercicios;

import java.time.LocalDate;

public class ProfesorInterino extends Profesor {
	//Atributos
		private String materia;
		private int curso;
		private LocalDate fechaCese;
		static public int numeroProfesoresInterinos = 0;
		//constructor
		public ProfesorInterino(String nombre, String apellido, String dni, int identificador, String especialidad,
				String materia, int curso) {
			super(nombre, apellido, dni, identificador, especialidad);
			this.materia = materia;
			this.curso = curso;
			this.fechaCese = LocalDate.now().plusYears(1);
			numeroProfesoresInterinos ++;
		}

		@Override
		public String toString() {
			return super.toString() + ", materia: " + materia + ", curso: " + curso + " ESO, Profesor Interino, fecha de cese: " + this.fechaCese+"\n";
		}
}
