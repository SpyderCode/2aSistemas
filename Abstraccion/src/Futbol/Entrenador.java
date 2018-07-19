package Futbol;

public class Entrenador extends SeleccionFutbol{
	private int idFederacion;
	public Entrenador(int id, String nombre, String apellidos, int edad,int idFederacion) {
		super(id, nombre, apellidos, edad);
		this.idFederacion=idFederacion;
	}
	
	public int getIdFederacion() {
		return idFederacion;
	}

	public void setIdFederacion(int idFederacion) {
		this.idFederacion = idFederacion;
	}

	public void planidicarEntrenamiento() {
		
	}

	@Override
	public void concentrarse() {
		// TODO Auto-generated method stub
		
	}





	@Override
	public void viajar() {
		// TODO Auto-generated method stub
		
	}





	@Override
	public void entrenar() {
		// TODO Auto-generated method stub
		
	}





	@Override
	public void jugarPartido() {
		// TODO Auto-generated method stub
		
	}

}
