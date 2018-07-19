package vehiculo.interfaz;

public class Helicoptero extends Aereo{
	
	public String girarHelices() {
		return "El helicoptero encendio las helices";
	}

	@Override
	public String volar() {
		// TODO Auto-generated method stub
		return "El helicopter vuela";
	}

	@Override
	public String despegar() {
		// TODO Auto-generated method stub
		return "El helicoptero despega";
	}

	@Override
	public String aterrizar() {
		// TODO Auto-generated method stub
		return "El helicoptero aterriza";
	}
}
