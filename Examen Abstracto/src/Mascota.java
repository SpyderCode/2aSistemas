
public abstract class Mascota implements servivo{
	private String name;
	private int edad;
	private String sexo;
	
	public Mascota(String name,int edad,String sexo) {
		this.name=name;
		this.edad=edad;
		this.sexo=sexo;
	}

	public String getName() {
		return name;
	}

	public int getEdad() {
		return edad;
	}

	public String getSexo() {
		return sexo;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	public abstract String Duerme();
	public abstract String Come();
	
	public String toString() {
		return this.name+"\t"+this.edad+"\t"+this.sexo+"\t";
	}
}
