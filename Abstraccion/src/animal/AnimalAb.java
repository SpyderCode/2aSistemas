package animal;

public abstract class AnimalAb implements Animal{
	private String nombre;
	private double peso;
	private int edad;
	private String sexo;//Yes please 7u7
	private String habitat;
	public AnimalAb(String nombre,double peso,int edad,String sexo,String habitat) {
		this.nombre=nombre;
		this.peso=peso;
		this.edad=edad;
		this.sexo=sexo;
		this.habitat=habitat;
	}
	public String getNombre() {
		return nombre;
	}
	public double getPeso() {
		return peso;
	}
	public int getEdad() {
		return edad;
	}
	public String getSexo() {
		return sexo;
	}
	public String getHabitat() {
		return habitat;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}
	
	public abstract String Come();
	public abstract String Duerme();
		
	
}
