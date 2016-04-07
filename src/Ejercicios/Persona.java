package Ejercicios;

public class Persona {
	//Atributos
	private String nombre;
	private String dni;
	private int edad;
	//constructor
	public Persona(String nombre, String dni, int edad) {
		this.nombre = nombre;
		this.dni = dni;
		this.edad = edad;
	}
	
	public String getDni() {
		return dni;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dni == null) ? 0 : dni.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		if (dni == null) {
			if (other.dni != null)
				return false;
		} else if (!dni.equals(other.dni))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", dni=" + dni + ", edad=" + edad + "]";
	}
	
}
