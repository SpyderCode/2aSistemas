package servivo;

public abstract class Mascota implements Servivo{
	private String nombre;
	private int edad;
	private String genero;
	
	public abstract String duerme();
	public abstract String come();
	public abstract String reproduce();
	
	public Mascota(String nombre, int edad, String genero) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.genero = genero;
	}
	public String getNombre() {
		return nombre;
	}
	public int getEdad() {
		return edad;
	}
	public String getGenero() {
		return genero;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	

	public String respira() {
		return "El ser respirar";
	}
	public String enferma() {
		return "El ser respirar";
	}
	@Override
	public String toString() {
		return "Mascota [nombre=" + nombre + ", edad=" + edad + ", genero=" + genero + ", respira()=" + respira()
				+ ", enferma()=" + enferma() + "]";
	}

}
