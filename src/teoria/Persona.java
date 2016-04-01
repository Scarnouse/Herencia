package teoria;

public class Persona {
	
	//Atributos
	private String nombre;
	private String apellidos;
	private int edad;
	public Persona() {}
	
	
	//constructor
	public Persona(String nombre, String apellidos, int edad) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
	}
	
	//getters & setter
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos(){
		return apellidos;
	}
	public void setApellidos(String apellidos){
		this.apellidos = apellidos;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + getNombreCompleto() + ", edad=" + edad + "]";
	}
	
	public String getNombreCompleto(){
		return this.nombre+" "+this.apellidos;
	}
	
}
