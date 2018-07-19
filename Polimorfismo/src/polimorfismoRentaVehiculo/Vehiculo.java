package polimorfismoRentaVehiculo;

public abstract class Vehiculo {
	private int id;
	private String marca;
	private String modelo;
	private String color;
	private String tipo;
	private double precio;
	private int nVelocidades;
	private int nAsientos;
	private String tFrenos;
	private int year;
	
	public Vehiculo(int id,String marca,String modelo,String color,String tipo,double precio,int nVelocidades,int nAsientos,String tFrenos,int year) {
		this.id=id;
		this.marca=marca;
		this.modelo=modelo;
		this.color=color;
		this.tipo=tipo;
		this.precio=precio;
		this.nVelocidades=nVelocidades;
		this.nAsientos=nAsientos;
		this.tFrenos=tFrenos;
		this.year=year;
		
	}
	public Vehiculo() {
		
	}
	public int getId() {
		return id;
	}
	public String getMarca() {
		return marca;
	}
	public String getModelo() {
		return modelo;
	}
	public String getColor() {
		return color;
	}
	public String getTipo() {
		return tipo;
	}
	public double getPrecio() {
		return precio;
	}
	public int getNVelocidades() {
		return nVelocidades;
	}
	public int getNAsientos() {
		return nAsientos;
	}
	public String getTFrenos() {
		return tFrenos;
	}
	public int getYear() {
		return year;
	}
	
	
	//Sets
	public void setId(int id) {
		this.id=id;
	}
	public void setMarca(String marca) {
		this.marca=marca;
	}
	public void setModelo(String modelo) {
		this.modelo=modelo;
	}
	public void setColor(String color) {
		this.color=color;
	}
	public void setTipo(String tipo) {
		this.tipo=tipo;
	}
	public void setPrecio(double precio) {
		this.precio=precio;
	}
	public void setNVelocidades(int nVelocidades) {
		this.nVelocidades=nVelocidades;
	}
	public void setNAsientos(int n) {
		this.nAsientos=n;
	}
	public void setTFrenos(String TF) {
		this.tFrenos=TF;
	}
	public void setYear(int year) {
		this.year=year;
		
	}
	
	public String toString() {
		return this.id+"\t"+this.marca+"\t"+this.modelo+"\t"+this.color+"\t"+this.tipo+"\t"+this.precio+"\t"+
				this.nVelocidades+"\t"+this.nAsientos+"\t"+this.tFrenos+"\t"+this.year;
	}
	

}
