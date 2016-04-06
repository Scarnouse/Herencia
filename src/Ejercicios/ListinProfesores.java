package Ejercicios;

import java.util.HashSet;
import java.util.Set;

public class ListinProfesores {
	private Set<Profesor> sProfesor = new HashSet<Profesor>();
	
	public boolean addProfesor(Profesor profesor){
		return sProfesor.add(profesor);
	}
	
	public boolean removeProfesor(String apellido){
		//lógica
		return true;
	}
	
	public Set<Profesor> getLista(){
		return this.sProfesor;
	}
	
}
