package animal;

public class Delfin extends Mamifero{

	private int longitud;
	
	public Delfin(String nombre, double peso, int edad, String sexo, String habitat,int longitud) {
		super(nombre, peso, edad, sexo, habitat);
		this.longitud=longitud;
	}

	public String Amamantar() {
		// TODO Auto-generated method stub
		return "El delfin amamanta";
	}
	public String sumergir() {
		return "EL delfin sumerge";
	}
	public String Saltar() {
		return "El delfin Salta";
	}

}
