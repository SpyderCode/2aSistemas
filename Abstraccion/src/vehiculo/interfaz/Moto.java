package vehiculo.interfaz;

public class Moto extends Terrestre{
	private double cc;
	
	public Moto(String matricula,String modelo,String marca,
			double cc) {
		super(matricula, modelo, marca);
		this.cc=cc;
	}
	
	public double getCc() {
		return cc;
	}

	public void setCc(double cc) {
		this.cc = cc;
	}

	public String saltar() {
		return "La moto salta";
	}

	public String encender() {
		// TODO Auto-generated method stub
		return "La moto enciende";
	}

	@Override
	public String apagar() {
		// TODO Auto-generated method stub
		return "La moto se apaga";
	}

	@Override
	public String frenar() {
		// TODO Auto-generated method stub
		return "La moto frena";
	}

}
