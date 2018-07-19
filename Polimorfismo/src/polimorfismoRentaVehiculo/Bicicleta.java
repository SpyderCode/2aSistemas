package polimorfismoRentaVehiculo;

public class Bicicleta extends Vehiculo{
	private String material;
	public Bicicleta(int id,String marca,String modelo,String color,String tipo,double precio,int nVelocidades,int nAsientos,String tFrenos,int year,String material) {
		super(id, marca, modelo, color, tipo, precio, nVelocidades, nAsientos, tFrenos, year);
		this.material=material;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public String toString() {
		return super.toString()+"\t"+this.material+"\n";
	}
}
