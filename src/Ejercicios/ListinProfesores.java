package Ejercicios;

import java.util.HashSet;
import java.util.Set;

public class ListinProfesores {
	private Set<Profesor> sProfesor = new HashSet<Profesor>();
	
	public boolean addProfesor(Profesor profesor){
		return sProfesor.add(profesor);
	}

	public Set<Profesor> getListin(){
		return sProfesor;
	}
	

}
