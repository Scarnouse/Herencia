package Ejercicios;

public class Guerrero extends Personaje{
	private String arma;
	
	public Guerrero(String nombre, int energia, String arma){
		super(nombre, energia);
		this.arma = arma;
	}

	/*public Guerrero(String nombre, String arma) {
		super(nombre, 200);
		this.arma = arma;
	}*/
	
	public String combatir(int energia){
		if (this.getNivelEnergia()-energia > 0){
			this.setNivelEnergia(this.getNivelEnergia()-energia);
			return arma + " " + energia;
		
		} else return "No puedes atacar";
	}
	
}
