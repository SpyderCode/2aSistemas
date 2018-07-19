package animal;

public abstract class Oviparo extends AnimalAb{
	private String tamaño;
	private String especie;
	
	public Oviparo(String nombre, double peso, int edad, String sexo, String habitat,String tamaño,String especie) {
		super(nombre, peso, edad, sexo, habitat);
		this.tamaño=tamaño;
		this.especie=especie;
	}

	public String getTamaño() {
		return tamaño;
	}

	public String getEspecie() {
		return especie;
	}

	public void setTamaño(String tamaño) {
		this.tamaño = tamaño;
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
