package vehiculo.interfaz;

public class Avion extends Aereo{
	
	public String bajarTrenAterizaje() {
		return"El avion baja sus llantas";
	}

	@Override
	public String volar() {
		// TODO Auto-generated method stub
		return "El avion esta volando";
	}

	@Override
	public String despegar() {
		// TODO Auto-generated method stub
		return "El avion despega";
	}

	@Override
	public String aterrizar() {
		// TODO Auto-generated method stub
		return "el avion aterriza";
	}
}
