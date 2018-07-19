package Polimorfismo.futbol;

public class Futbolista extends SeleccionFutbol{
	private int numero;
	private String posicion;
	
	public Futbolista(int id,String nombre,String apellido,int edad,int numero,String posicion) {
		super(id, nombre, apellido, edad);
		this.numero=numero;
		this.posicion=posicion;
	}
	 public String getPosicion() {
	        return posicion;
	    }
	 public int getNumero() {
	        return numero;
	    }
	    
	 public void setPosicion(String posicion) {
	        this.posicion=posicion;
	    }
	    
	 public void setNumero(int numero) {
	        this.numero=numero;
	    }
	 public String toString() {
	        return super.toString()+this.getPosicion()+"\t"+this.numero+"\n";
	    }
	 public String Entrevista() {
		 return "El futbolista es entrevistado al final del partido";
	 }

}
