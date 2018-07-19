package vehiculo;

public class BarcoPesqueo extends Acuatico{
	private double cargo;
	private int botesalvavida;
	public BarcoPesqueo(String nomAcuatico, double velocidad,double cargo,int botesalvavida) {
		super(nomAcuatico, velocidad);
		this.botesalvavida=botesalvavida;
		this.cargo=cargo;
	}
	public double getCargo() {
		return cargo;
	}
	public int getBotesalvavida() {
		return botesalvavida;
	}
	public void setCargo(double cargo) {
		this.cargo = cargo;
	}
	public void setBotesalvavida(int botesalvavida) {
		this.botesalvavida = botesalvavida;
	}
	public String pescar() {
		return"El barco "+super.getNomAcuatico()+" pesca";
	}

}
