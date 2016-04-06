package Ejercicios;

public class Analista extends InformaticoAbs {
	//Atributo
	public String especialidad;
	//Constructor
	public Analista(String empresa, String especialidad) {
		super(empresa);
		this.especialidad = especialidad;
	}
	//Método
	public double pagarSueldo(double horas){
		return getSueldo()*horas;
	}
	@Override
	public String toString() {
		return super.toString() + ", Analista : especialidad=" + especialidad + "]";
	}
	
}
