package Ejercicios;

public class Analista extends InformaticoAbs {
	//Atributo
	private String especialidad;
	//Constructor
	public Analista(String empresa, String especialidad) {
		super(empresa);
		this.especialidad = especialidad;
	}
	//Método
	public double pagarSueldo(double horas){
		return super.getSueldo()*horas*1.25;
	}
	
	@Override
	public String toString() {
		return super.toString() + ", Analista : especialidad=" + especialidad + "]";
	}
	
}
