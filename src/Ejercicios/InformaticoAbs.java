package Ejercicios;

public class InformaticoAbs {
	//Atributos
	private String empresa;
	private double sueldo;
	//Constructor
	public InformaticoAbs(String empresa){
		this.empresa = empresa;
	}
	//Getters & Setters
	public String getEmpresa(){
		return empresa;
	}
	public void setEmpresa(String nueva){
		this.empresa = nueva;
	}
	public double getSueldo(){
		return this.sueldo;
	}
	public void setSueldo(double euros){
		this.sueldo = euros;
	}
	//Métodos
	public double pagarSueldo(double horas){
		return this.sueldo*horas;
	}
	@Override
	public String toString() {
		return "InformaticoAbs [empresa=" + empresa + ", sueldo=" + sueldo;
	}
	
}
