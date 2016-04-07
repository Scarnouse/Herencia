package Ejercicios;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;



public class TestHerencia4 {

	public static void main(String[] args) {
		
		File file = new File("recursos/profesores.csv");
		try (Scanner sc = new Scanner(file);){
			String linea = sc.nextLine();
			while (sc.hasNextLine()){
				linea = sc.nextLine();
				String[] array = linea.split(";");
				ListinProfesores lista = new ListinProfesores();
				if (array[4].contains("SI")){
					lista.addProfesor(new ProfesorTitular(array[0], Integer.parseInt(array[1]), array[2], array[3], Integer.parseInt(array[5])));
				} else {
					lista.addProfesor(new ProfesorInterino(array[0], Integer.parseInt(array[1]), array[2], array[3], array[6]));
				}
				/*for(Profesor profesor : lProfesores.getListin()){
					System.out.println(profesor);
				}*/
			}
		} catch (FileNotFoundException e) {
			System.out.format("No se encuentra el archivo %s%n", file);
		}
		
	}
}
