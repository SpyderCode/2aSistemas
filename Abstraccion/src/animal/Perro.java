package animal;

public class Perro extends Mamifero{
	
	private String CPelo;
	public Perro(String nombre, double peso, int edad, String sexo, String habitat,String CPelo) {
		super(nombre, peso, edad, sexo, habitat);
		this.CPelo=CPelo;

	}

	public String Amamantar() {
		// TODO Auto-generated method stub
		return "El "+super.getNombre()+" Amamanta";
	}
	public String Ladra() {
		return "El perro ladra";
	}
	public String juega() {
		return "El perro juega";
	}
	public String corre() {
		return "El perro corre";
	}

}
