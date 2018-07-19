package vehiculo.interfaz;

public class Submarino extends Acuatico{
	
	public Submarino(String nomAcuatico, double velocidad) {
		super(nomAcuatico, velocidad);
	}
	public String sumerge() {
		return "El submarino se submerge";
	}
	public String emerge() {
		return "El submarino se emerge";
	}
	public String navegar() {
		return "El submarino esta navegando";
	}
}
