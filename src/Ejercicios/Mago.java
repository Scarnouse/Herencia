package Ejercicios;

public class Mago extends Personaje{
	private Poder poder;

	public Mago(String nombre, Poder poder) {
		super(nombre);
		this.poder = poder;
		setNivelEnegia(100);
	}
	
	public int encantar(){
		setNivelEnegia(getNivelEnegia()-this.poder.getEnergia());
		return this.poder.getDamage();
	}

}
