package Polimorfismo.futbol;

public class Masajista extends SeleccionFutbol{
	private String especialidad;
	private int experiencia;
	
	public Masajista(int id,String nombre,String apellido,int edad,String especialidad,int experiencia) {
		super(id, nombre, apellido, edad);
		this.especialidad=especialidad;
		this.experiencia=experiencia;
	}
	 public String getEspecialidad() {
	        return especialidad;
	    }
	 public int getExperiencia() {
	        return experiencia;
	    }
	    
	 public void setEspecialidad(String especialidad) {
	        this.especialidad=especialidad;
	    }
	 public void setExperiencia(int experiencia) {
	        this.experiencia=experiencia;
	    }
	 public String toString() {
	        return super.toString()+
	     		   this.especialidad+
	                "\t"+this.experiencia+"\n";
	    }
}
