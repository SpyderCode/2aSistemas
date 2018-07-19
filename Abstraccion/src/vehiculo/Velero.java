package vehiculo;

public class Velero extends Acuatico{

	public Velero(String nomAcuatico, double velocidad) {
		super(nomAcuatico, velocidad);
		// TODO Auto-generated constructor stub
	}
	public String impulsor() {
		return "El "+super.getNomAcuatico()+" se impulsa";
	}
	public String dirigir() {
		return "El "+super.getNomAcuatico()+" se dirige";
	}
}
