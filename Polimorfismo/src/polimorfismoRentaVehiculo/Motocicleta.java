package polimorfismoRentaVehiculo;

public class Motocicleta extends Vehiculo{
	private int cc;
	
	public Motocicleta(int id,String marca,String modelo,String color,String tipo,double precio,int nVelocidades,int nAsientos,String tFrenos,int year,int cc) {
		super(id, marca, modelo, color, tipo, precio, nVelocidades, nAsientos, tFrenos, year);
		this.cc=cc;
	}

	public int getCc() {
		return cc;
	}

	public void setCc(int cc) {
		this.cc = cc;
	}
	public String toString() {
		return super.toString()+"\t"+this.cc+"\n";
	}
}
