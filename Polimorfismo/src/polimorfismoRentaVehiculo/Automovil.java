package polimorfismoRentaVehiculo;

public class Automovil extends Vehiculo{
	private int cilindros;
	private int nPuertas;
	private String rendimiento;
	
	public Automovil(int id,String marca,String modelo,String color,String tipo,double precio,int nVelocidades,int nAsientos,String tFrenos,int year
			,int cilindros,int nPuertas,String rendimiento) {
		super(id, marca, modelo, color, tipo, precio, nVelocidades, nAsientos, tFrenos, year);
		this.cilindros=cilindros;
		this.nPuertas=nPuertas;
		this.rendimiento=rendimiento;
	}

	public int getCilindros() {
		return cilindros;
	}

	public void setCilindros(int cilindros) {
		this.cilindros = cilindros;
	}

	public int getnPuertas() {
		return nPuertas;
	}

	public void setnPuertas(int nPuertas) {
		this.nPuertas = nPuertas;
	}

	public String getRendimiento() {
		return rendimiento;
	}

	public void setRendimiento(String rendimiento) {
		this.rendimiento = rendimiento;
	}
	
	public String toString() {
		return super.toString()+"\t"+this.cilindros+"\t"+this.nPuertas+"\t"+this.rendimiento+"\n";
	}
}
