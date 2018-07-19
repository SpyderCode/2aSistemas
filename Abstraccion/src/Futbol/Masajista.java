package Futbol;

public class Masajista extends SeleccionFutbol{
	private String titulacion;
	private int aniosExperiencia;
	public Masajista(int id, String nombre, String apellidos, int edad,String titulacion,int aniosExperiencia) {
		super(id, nombre, apellidos, edad);
		this.titulacion=titulacion;
		this.aniosExperiencia=aniosExperiencia;
	}
	
	public void darMasaje() {
		
	}

	public String getTitulacion() {
		return titulacion;
	}

	public int getAniosExperiencia() {
		return aniosExperiencia;
	}

	public void setTitulacion(String titulacion) {
		this.titulacion = titulacion;
	}

	public void setAniosExperiencia(int aniosExperiencia) {
		this.aniosExperiencia = aniosExperiencia;
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
