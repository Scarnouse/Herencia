package Ejercicios;

public class Programador extends InformaticoAbs{
	//Atributos
	private String lenguaje;
	//Constructor
	public Programador(String empresa, String lenguaje) {
		super(empresa);
		this.lenguaje = lenguaje;
	}
	@Override
	public double pagarSueldo(double horas) {
		return super.pagarSueldo(horas)*1.5;
	}
	@Override
	public String toString() {
		return super.toString() + ", Programador: lenguaje=" + lenguaje + "]";
	}
	
	
}
