package Ejercicios;

import java.util.Random;

public class Personaje {
	Random aleatorio = new Random();
	private String nombre;
	private int nivelEnegia;
	public Personaje(String nombre, int nivelEnergia) {
		this.nombre = nombre;
		this.nivelEnegia = nivelEnergia;
	}
	public int getNivelEnergia() {
		return nivelEnegia;
	}
	public void setNivelEnergia(int nivelEnegia) {
		this.nivelEnegia = nivelEnegia;
	}
	public void alimentar(int comida){
		this.nivelEnegia += comida;
	}
	
	@Override
	public String toString() {
		return "Personaje [Nombre=" + this.nombre + ", Enegia=" + nivelEnegia + "]";
	}
	
	
}
