package polimorfismoRentaVehiculo;

public class Camion extends Vehiculo{
	private int ventilacion;
	public Camion(int id,String marca,String modelo,String color,String tipo,double precio,int nVelocidades,int nAsientos,String tFrenos,int year,int ventilacion) {
		super(id, marca, modelo, color, tipo, precio, nVelocidades, nAsientos, tFrenos, year);
		this.ventilacion=ventilacion;
	}
	public int getVentilacion() {
		return ventilacion;
	}
	public void setVentilacion(int ventilacion) {
		this.ventilacion = ventilacion;
	}
	public String toString() {
		return super.toString()+"\t"+this.ventilacion+"\n";
	}

}
