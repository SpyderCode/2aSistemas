package vehiculo.interfaz;

public abstract class Acuatico implements PlanContingencia,Vehiculo{
	private String nomAcuatico;
	private double velocidad;
	
	public Acuatico(String nomAcuatico,double velocidad) {
		this.nomAcuatico=nomAcuatico;
		this.velocidad=velocidad;
	}
	
	public String getNomAcuatico() {
		return nomAcuatico;
	}

	public void setNomAcuatico(String nomAcuatico) {
		this.nomAcuatico = nomAcuatico;
	}

	public double getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(double velocidad) {
		this.velocidad = velocidad;
	}

	public abstract String navegar();
	
	public String AplicaPlan() {
		return "Aplicar plan de contigencia";
	}
	public String Transportar() {
		return "Se esta transportando";
	}
}
