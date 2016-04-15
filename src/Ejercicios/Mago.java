package Ejercicios;

public class Mago extends Personaje{
	private String poder;

	public Mago(String nombre, String poder) {
		super(nombre, 100);
		this.poder = poder;
	}

	public String encantar(){
		if (this.getNivelEnergia()>=2){
			this.setNivelEnergia(this.getNivelEnergia()-2);
			return getNivelEnergia()+"";
		} else return "No es posible encantar";
	}

}
