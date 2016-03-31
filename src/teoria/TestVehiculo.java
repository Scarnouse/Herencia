package teoria;

public class TestVehiculo {

	public static void main(String[] args) {
		Coche c = new Coche("Joaquin", 5, false, false);
		Coche c1 = new Coche("Lolo", 9, false, false);
		Motocicleta m = new Motocicleta("Pepa", 2, 250);
		System.out.println(c);
		System.out.println(c1);
		System.out.println(m);
		System.out.println("Propietario " +c.getPropietario());
		System.out.println("Fecha Compra "+c1.getFechaCompra());
		System.out.println("Numero de pasajeros "+c1.getNumeroPasajeros());
	}

}
