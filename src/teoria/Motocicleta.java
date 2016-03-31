package teoria;

public class Motocicleta extends Vehiculo {
	private int cilindrada;

	public Motocicleta(String propietario, int numeroPasajeros, int cilindrada) {
		super(2, propietario, numeroPasajeros);
		this.cilindrada = cilindrada;
	}

	public int getCilindrada() {
		return cilindrada;
	}

	@Override
	public String toString() {
		return "Motocicleta [cilindrada=" + cilindrada + "]";
	}
	
	
}
