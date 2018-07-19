package vehiculo.interfaz;

public abstract class Terrestre implements Vehiculo{
	private String matricula;
	private String modelo;
	private String marca;
	
	public Terrestre(String matricula,String modelo,String marca) {
		this.matricula=matricula;
		this.modelo=modelo;
		this.marca=marca;
	}
	
	public String getMatricula() {
		return matricula;
	}

	public String getModelo() {
		return modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public abstract String encender();
	public abstract String apagar();
	public abstract String frenar();
	public String Transportar() {
		return "Se esta transportando";
	}

}
