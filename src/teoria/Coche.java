package teoria;

public class Coche  extends Vehiculo{
	private boolean diesel;
	private boolean descapotable;
	
	public Coche(String propietario, int numeroPasajeros, boolean esDiesel, boolean esDescapotable) {
		super(4, propietario, numeroPasajeros);
		this.diesel = esDiesel;
		this.descapotable = esDescapotable;
	}

	public boolean isDiesel() {
		return diesel;
	}

	public boolean isDescapotable() {
		return descapotable;
	}

	@Override
	public String toString() {
		return "Coche [diesel=" + diesel + ", descapotable=" + descapotable + "]";
	}
	
}
