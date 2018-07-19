package animal;

public class Aguila extends Oviparo{
	private String garras;
	private String vista;
	
	public Aguila(String nombre, double peso, int edad, String sexo, String habitat, 
			String tamaño, String especie,String garras,String vista) {
		super(nombre, peso, edad, sexo, habitat, tamaño, especie);
		this.garras=garras;
		this.vista=vista;
	}
	public String ponerHuevos() {
		// TODO Auto-generated method stub
		return "El "+super.getNombre()+" pone Huevos";
	}
	public String vuela() {
		return "El aguila vuela";
	}
	public String Caza() {
		return "El aguila caza";
	}

	

}
