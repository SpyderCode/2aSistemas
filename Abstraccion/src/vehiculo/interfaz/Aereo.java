package vehiculo.interfaz;

public abstract class Aereo implements Vehiculo{
	public abstract String volar();
	public abstract String despegar();
	public abstract String aterrizar();
	public String Transportar() {
		return "Se esta transportando";
	}
}
