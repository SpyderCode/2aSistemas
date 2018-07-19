package animal;

public abstract class Mamifero extends AnimalAb{

	public Mamifero(String nombre, double peso, int edad, String sexo, String habitat) {
		super(nombre, peso, edad, sexo, habitat);
		// TODO Auto-generated constructor stub
	}

	public String reproducirse() {
		// TODO Auto-generated method stub
		return "El"+super.getNombre()+" reproduce";
	}

	
	public String Morir() {
		// TODO Auto-generated method stub
		return "El"+super.getNombre()+" muere";
	}

	
	public String Come() {
		// TODO Auto-generated method stub
		return "El"+super.getNombre()+" come";
	}

	
	public String Duerme() {
		// TODO Auto-generated method stub
		return "El"+super.getNombre()+" duerme";
	}
	public String Parir() {
		return "El"+super.getNombre()+" Pare";
	}
	public abstract String Amamantar();

}
