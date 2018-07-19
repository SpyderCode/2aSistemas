package vehiculo.interfaz;

public class Automovil extends Terrestre{
	private int nPuertas;
	private double rendimiento;
	
	public Automovil(String matricula,String modelo,String marca,
			int nPuertas,double rendimiento) {
		super(matricula, modelo, marca);
		this.nPuertas=nPuertas;
		this.rendimiento=rendimiento;
	}

	public int getnPuertas() {
		return nPuertas;
	}

	public double getRendimiento() {
		return rendimiento;
	}

	public void setnPuertas(int nPuertas) {
		this.nPuertas = nPuertas;
	}

	public void setRendimiento(double rendimiento) {
		this.rendimiento = rendimiento;
	}

	public String encender() {
		// TODO Auto-generated method stub
		return "El Auto se encendio";
	}

	public String apagar() {
		// TODO Auto-generated method stub
		return "El auto se apago";
	}

	public String frenar() {
		// TODO Auto-generated method stub
		return "El Auto freno";
	}
	
}
