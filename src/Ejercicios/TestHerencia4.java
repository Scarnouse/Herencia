package Ejercicios;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//import java.util.Random;

public class TestHerencia4 {
	//static public Random aleatorio = new Random();
	public static void main(String[] args) {
		/*ListinProfesores lP = new ListinProfesores();
		for (int i=0;i<50;i++) {
			lP.addProfesor(crearProfesorAleatorio());
		}
		
		for(Profesor profesor : lP.getLista()){
			System.out.println(profesor);
		}
		System.out.println(ProfesorInterino.numeroProfesoresInterinos);
		System.out.println(ProfesorTitular.numeroProfesoresTitulares);
		System.out.println(lP.getLista().size());*/
		File file = new File("recursos/profesores.csv");
		try (Scanner sc = new Scanner(file);){
			String linea = sc.nextLine();
			while (sc.hasNextLine()){
				linea = sc.nextLine();
				String[] array = new String[6];
				
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	/*static private Profesor crearProfesorAleatorio(){
		String[] nombre = {"Jose", "David", "Diana", "María", "Carolina", "Keith", "Francisco", "Jorge", "Angelica"};
		String[] apellido = {"Herrería", "Roqueo", "Plaza", "Vázquez", "Canarias", "Valodouro", "Encina", "Sotelo"};
		String[] especialidad = {"Inglés", "Educación Física", "Música", "Geografía e Historia", "Ciencias Naturales", "Matemáicas", "Lengua y Literatura"};
		Profesor profesor = null;
		String nombreProfesor = nombre[aleatorio.nextInt(nombre.length)];
		String apellidoProfesor = apellido[aleatorio.nextInt(apellido.length)];
		int identificador = Integer.parseInt(crearDni().substring(5, 8));
		String especialidadProfesor = especialidad[aleatorio.nextInt(especialidad.length)];
		String materia = especialidad[aleatorio.nextInt(especialidad.length)];
		if (aleatorio.nextInt(2)%2==0){
			profesor = new ProfesorTitular(nombreProfesor, apellidoProfesor, crearDni(), identificador, especialidadProfesor, materia, aleatorio.nextInt(4)+1);
		} else {
			profesor = new ProfesorInterino(nombreProfesor, apellidoProfesor, crearDni(), identificador, especialidadProfesor, materia, aleatorio.nextInt(4)+1);
		}
		return profesor;
	}
	
	static private String crearDni(){
		final String NIF_STRING_ASOCIATION = "TRWAGMYFPDXBNJZSQVHLCKE";
		String dni = "";
		for(int i=0; i<8; i++){
			dni += aleatorio.nextInt(10);
		}
		dni += NIF_STRING_ASOCIATION.charAt(Integer.parseInt(dni) % 23);
		return dni;
	}*/

}
