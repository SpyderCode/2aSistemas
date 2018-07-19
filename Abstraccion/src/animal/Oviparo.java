package animal;

public abstract class Oviparo extends AnimalAb{
	private String tama�o;
	private String especie;
	
	public Oviparo(String nombre, double peso, int edad, String sexo, String habitat,String tama�o,String especie) {
		super(nombre, peso, edad, sexo, habitat);
		this.tama�o=tama�o;
		this.especie=especie;
	}

	public String getTama�o() {
		return tama�o;
	}

	public String getEspecie() {
		return especie;
	}

	public void setTama�o(String tama�o) {
		this.tama�o = tama�o;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}


	public String reproducirse() {
		// TODO Auto-generated method stub
		return "El"+super.getNombre()+ " se reproduce";
	}

	public String Morir() {
		// TODO Auto-generated method stub
		return "El"+super.getNombre()+ " muere";
	}


	public String Come() {
		// TODO Auto-generated method stub
		return "El"+super.getNombre()+ " come";
	}

	public String Duerme() {
		// TODO Auto-generated method stub
		return "El"+super.getNombre()+ " duerme";
	}
	public abstract String ponerHuevos();

}
