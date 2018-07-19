package vehiculo;

public class Submarino extends Acuatico{

	public Submarino(String nomAcuatico, double velocidad) {
		super(nomAcuatico, velocidad);
		// TODO Auto-generated constructor stub
	}
	public String sumerge() {
		return "El "+super.getNomAcuatico()+" sumerge";
	}
	public String emerge() {
		return "El "+super.getNomAcuatico()+" emerge";
	}

}
