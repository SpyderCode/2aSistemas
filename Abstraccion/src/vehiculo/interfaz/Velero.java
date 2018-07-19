package vehiculo.interfaz;

public class Velero extends Acuatico{

	public Velero(String nomAcuatico, double velocidad) {
		super(nomAcuatico, velocidad);

	}
	public String impulsar() {
		return "El velero se impulsa con el viento";
	}
	public String dirigir() {
		return "El velero se dirige hacia el sur";
	}
	public String navegar() {
		return "el Velero navega por la playa";
	}
}
