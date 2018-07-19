package animal;

public class Tortuga extends Oviparo{
	private int longevidad;
	
	public Tortuga(String nombre, double peso, int edad, String sexo, String habitat, 
			String tama�o, String especie,int longevidad) {
		super(nombre, peso, edad, sexo, habitat, tama�o, especie);
		this.longevidad=longevidad;
	}

	public int getLongevidad() {
		return longevidad;
	}

	public void setLongevidad(int longevidad) {
		this.longevidad = longevidad;
	}

	public String ponerHuevos() {
		// TODO Auto-generated method stub
		return "La tortuga pone huevos";
	}

}
