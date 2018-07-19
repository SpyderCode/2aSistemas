package Futbol;

public abstract class SeleccionFutbol implements integranteSeleccionFutbol{
	
	private int id;
	private String nombre;
	private String apellidos;
	private int edad;
	
	public SeleccionFutbol(int id,String nombre,String apellidos,int edad) {
		this.edad=edad;
		this.nombre=nombre;
		this.apellidos=apellidos;
		this.id=id;
	}

	public int getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public int getEdad() {
		return edad;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
}
