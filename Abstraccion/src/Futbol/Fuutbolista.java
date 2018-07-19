package Futbol;

public class Fuutbolista extends SeleccionFutbol{
	private int dorsal;
	private String demarcacion;

	public Fuutbolista(int id, String nombre, String apellidos, int edad,int dorsal,String demarcacion) {
		super(id, nombre, apellidos, edad);
		this.dorsal=dorsal;
		this.demarcacion=demarcacion;

	}

	public int getDorsal() {
		return dorsal;
	}

	public String getDemarcacion() {
		return demarcacion;
	}

	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}

	public void setDemarcacion(String demarcacion) {
		this.demarcacion = demarcacion;
	}

	public void concentrarse() {

	}


	public void viajar() {

	}

	public void entrenar() {

		
	}

	public void jugarPartido() {

		
	}

}
