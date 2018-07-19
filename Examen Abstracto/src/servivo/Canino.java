package servivo;

public class Canino extends Mascota{
	private String raza;
	private String color;

	

	public Canino(String nombre, int edad, String genero, String raza, String color) {
		super(nombre, edad, genero);
		this.raza = raza;
		this.color = color;
	}

	public String getRaza() {
		return raza;
	}

	public String getColor() {
		return color;
	}

	public String getColor() {
		return color;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String respirar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String enfermar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String duerme() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String come() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String reproduce() {
		// TODO Auto-generated method stub
		return null;
	}

}
