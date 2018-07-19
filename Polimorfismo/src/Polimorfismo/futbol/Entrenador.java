package Polimorfismo.futbol;

public class Entrenador extends SeleccionFutbol{
	private int idEntrenador;
	
	public Entrenador(int id,String nombre,String apellido,int edad,int idEntrenador) {
		super(id,nombre,apellido, edad);
		this.idEntrenador=idEntrenador;
	}
	public Entrenador() {
	
	}
	
	public int getIdEntrenador() {
		return idEntrenador;
	}
	public void setIdEntrenador(int idEntrenador) {
		this.idEntrenador=idEntrenador;
	}
	public String toString() {
		return super.toString()+this.idEntrenador+"\n";
	}
}
