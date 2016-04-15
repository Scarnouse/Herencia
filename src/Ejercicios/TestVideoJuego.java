package Ejercicios;

public class TestVideoJuego {

	public static void main(String[] args) {
		Personaje m1 = new Mago("Merlin","Bola de Fuego");
		Mago m2 = new Mago("Gandalf", "Llama de Udun");
		
		System.out.println(m2.encantar());
		System.out.println(((Mago) m1).encantar());
		
		Personaje g1 = new Guerrero("Conan", 300, "Mandoble");
		Guerrero g2 = new Guerrero("Thor", 155, "Martillo");
		
		
	}

}
