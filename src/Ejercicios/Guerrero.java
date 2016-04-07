package Ejercicios;

public class Guerrero extends Personaje{
	private String arma;

	public Guerrero(String nombre, String nivelEnegia, String arma) {
		super(nombre);
		this.arma = arma;
	}
	
	public String combatir(int energia){
		setNivelEnegia(getNivelEnegia()-energia);
		return arma + " " + getNivelEnegia();
	}
	
}
