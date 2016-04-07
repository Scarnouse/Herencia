package Ejercicios;

import java.util.Random;

public class Personaje {
	Random aleatorio = new Random();
	private String nombre;
	private int nivelEnegia;
	public Personaje(String nombre) {
		this.nombre = nombre;
		this.nivelEnegia = aleatorio.nextInt(100)+1;
	}
	public int getNivelEnegia() {
		return nivelEnegia;
	}
	public void setNivelEnegia(int nivelEnegia) {
		this.nivelEnegia = nivelEnegia;
	}
	public void alimentar(int comida){
		this.nivelEnegia += comida;
	}
	
}
