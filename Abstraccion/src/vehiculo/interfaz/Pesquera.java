package vehiculo.interfaz;

public class Pesquera extends Acuatico{
	private double carga;
	private int botesalvavida;
	
	public Pesquera(String nomAcuatico,double velocidad,double carga,int botesalvavida) {
		super(nomAcuatico, velocidad);
		this.carga=carga;
		this.botesalvavida=botesalvavida;
	}
	
	public double getCarga() {
		return carga;
	}

	public int getBotesalvavida() {
		return botesalvavida;
	}

	public void setCarga(double carga) {
		this.carga = carga;
	}

	public void setBotesalvavida(int botesalvavida) {
		this.botesalvavida = botesalvavida;
	}

	public String pescar() {
		return "El bote pesco tiburones";
	}
	public String navegar() {
		return "el pesquero pesca por los pezes";
	}

}
