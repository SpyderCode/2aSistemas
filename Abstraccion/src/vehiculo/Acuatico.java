package vehiculo;

public abstract class Acuatico implements Vehiculo{
	private String nomAcuatico;
	private double velocidad;
	
	public Acuatico(String nomAcuatico,double velocidad) {
		this.nomAcuatico=nomAcuatico;
		this.velocidad=velocidad;
	}

	public String getNomAcuatico() {
		return nomAcuatico;
	}

	public double getVelocidad() {
		return velocidad;
	}
	
	public void setNomAcuatico(String nomAcuatico) {
		this.nomAcuatico = nomAcuatico;
	}

	public void setVelocidad(double velocidad) {
		this.velocidad = velocidad;
	}
	
}
