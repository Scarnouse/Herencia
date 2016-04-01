package teoria;

public class Alumno extends Persona{
	private String numeroMatricula;
	public Alumno(){
		this.numeroMatricula = super.getApellidos().substring(0, 2)+super.getNombre().substring(0,2)+Math.round(super.getEdad()*Math.random()*100);
	}
}
